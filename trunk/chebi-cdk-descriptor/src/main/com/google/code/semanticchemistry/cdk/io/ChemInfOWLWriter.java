/* Copyright (C) 2010  Egon Willighagen <egonw@users.sf.net>
 */
package com.google.code.semanticchemistry.cdk.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.openscience.cdk.annotations.TestMethod;
import org.openscience.cdk.exception.CDKException;
import org.openscience.cdk.interfaces.IChemObject;
import org.openscience.cdk.interfaces.IMolecule;
import org.openscience.cdk.io.DefaultChemObjectWriter;
import org.openscience.cdk.io.formats.CDKOWLFormat;
import org.openscience.cdk.io.formats.IResourceFormat;

import com.hp.hpl.jena.rdf.model.Model;

/**
 * Serializes the data model into CHEMINF OWL.
 */
public class ChemInfOWLWriter extends DefaultChemObjectWriter {

    private Writer output;

    public ChemInfOWLWriter(Writer output) {
        this.output = output;
    }

    public ChemInfOWLWriter() {
        this.output = null;
    }

    public IResourceFormat getFormat() {
        return CDKOWLFormat.getInstance();
    }

    public void setWriter(Writer out) throws CDKException {
        this.output = out;
    }

    public void setWriter(OutputStream output) throws CDKException {
        this.output = new OutputStreamWriter(output);
    }

    public void close() throws IOException {
        if (output != null) output.close();
    }

    @TestMethod("testAccepts")
    public boolean accepts(Class classObject) {
        Class[] interfaces = classObject.getInterfaces();
        for (int i = 0; i < interfaces.length; i++) {
            if (IMolecule.class.equals(interfaces[i])) return true;
        }
        Class superClass = classObject.getSuperclass();
        if (superClass != null) return this.accepts(superClass);
            return false;
    }

    public void write(IChemObject object) throws CDKException {
        if (object instanceof IMolecule) {
            try {
                writeMolecule((IMolecule)object);
            } catch (Exception ex) {
                throw new CDKException(
                    "Error while writing CHEMINF RDF file: " + ex.getMessage(), ex
                );
            }
        } else {
            throw new CDKException(
                "CHEMINFOWLWriter only supports output of IMolecule classes."
            );
        }
    }

    private void writeMolecule(IMolecule mol) {
        Model model = Convertor.molecule2Model(mol);
        model.write(output, "N3");
    }

}
