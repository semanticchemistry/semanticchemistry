import org.openscience.cdk.interfaces.*;
import org.openscience.cdk.io.iterator.*;
import org.openscience.cdk.nonotify.NoNotificationChemObjectBuilder;
import org.openscience.cdk.qsar.DescriptorValue;
import org.openscience.cdk.qsar.DescriptorSpecification;
import org.openscience.cdk.qsar.IMolecularDescriptor;
import org.openscience.cdk.qsar.descriptors.molecular.*;
import org.openscience.cdk.tools.manipulator.*;
import org.openscience.cdk.atomtype.CDKAtomTypeMatcher;

import com.google.code.semanticchemistry.cdk.io.ChemInfOWLWriter;

demo = true;
builder = NoNotificationChemObjectBuilder.getInstance();

public String zeroPad(int intVal) {
  StringBuffer buffer = new StringBuffer();
  String value = "" + intVal;
  for (int i=1; i<(7-value.length()); i++) {
    buffer.append('0');
  }
  buffer.append(value);
  return buffer.toString();
}

CDK_VERSION = "1.3.1";

println "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>.";
println "@prefix rdf:     <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .";
println "@prefix owl:     <http://www.w3.org/2002/07/owl#> .";
println "@prefix xsd:     <http://www.w3.org/2001/XMLSchema#> .";
println "";
println "@prefix obo: <http://purl.obolibrary.org/obo/>.";
println "@prefix cheminf: <http://www.semanticweb.org/ontologies/cheminf.owl#>.";
println "@prefix xsd:     <http://www.w3.org/2001/XMLSchema#> .";
println "@prefix : <http://cdk.sf.net/org/openscience/cdk/qsar/>.";
println "@prefix cdk:     <http://cdk.sourceforge.net/model.owl#> .";
println "@prefix elem:     <http://cdk.sf.net/ontologies/elements#> .";
println "";
println ":cdk-v" + CDK_VERSION + " a obo:IAO_0000010 ;";
println "  ci:CHEMINF_000333 \"The Chemistry Development Kit\" ;";
println "  ci:CHEMINF_000338 \"" + CDK_VERSION + "\" .";
println "";

List<IMolecularDescriptor> descriptors = new ArrayList();
descriptors.add(new TPSADescriptor());
if (!demo) {
  descriptors.add(new BCUTDescriptor());
  descriptors.add(new XLogPDescriptor());
  descriptors.add(new HBondAcceptorCountDescriptor());
  descriptors.add(new HBondDonorCountDescriptor());
  descriptors.add(new RotatableBondsCountDescriptor());
}

i = 0
Map<String, String> specs = new HashMap();
for (IMolecularDescriptor descriptor : descriptors) {
  i++
  spec = descriptor.getSpecification();
  specs.put(spec.getImplementationTitle(), ":CDK_" + zeroPad(i));
  System.out.println(specs.get(spec.getImplementationTitle()) + " a :CHEMINF_000302");
  System.out.println(
    "  rdfs:label \"CDK " + 
    spec.getImplementationTitle().substring(47) + 
    " Implementation\" ;"
  );
  System.out.println("  cheminf:CHEMINF_000321 <" + spec.getSpecificationReference() + "> ;");
  System.out.println("  :distributedWith :cdk-v" + CDK_VERSION + " .");
}
println "";

iterator = new IteratingMDLReader(
  new File("ChEBI_complete.sdf").newReader(),
  builder
)

i = 0
matcher = CDKAtomTypeMatcher.getInstance(builder);
iterator.each { mol ->
  i++

  // do atom type perception
  allOK = true
  mol.atoms().each { atom ->
    type = matcher.findMatchingAtomType(mol, atom)
    if (type == null) {
      allOK = false;
      List<String> fails = mol.getProperty("AT_FAILS");
      if (fails == null) {
        fails = new ArrayList();
        mol.setProperty("AT_FAILS", fails);
        System.err.println(
          "Atom typing fail in " +
          mol.getProperty("ChEBI ID")
        ); 
      }
      fails.add(atom.getSymbol());
    }
  }

  if (allOK) {
    for (IMolecularDescriptor descriptor : descriptors) {
      try {
        DescriptorValue value = descriptor.calculate(mol);
        mol.setProperty(value.getSpecification(), value);
      } catch (Exception exception) {
        System.err.println(
          "Could not calculate descriptor for: " +
          mol.getProperty("ChEBI ID")
        );
        exception.printStackTrace(System.err);
      }
    }
  }

  StringWriter output = new StringWriter();
  ChemInfOWLWriter writer = new ChemInfOWLWriter(output, specs);

  try {
    writer.write(mol);
  } catch (Exception exception) {
    System.err.println "\nFailed to convert to RDF: " + mol.getProperty("ChEBI ID");
  }

  String outputString = output.toString();
  outputString.eachLine { line ->
    if (!line.contains("@prefix"))
      System.out.println(line);      
  }
  if (demo && i == 10) System.exit(0);
}
