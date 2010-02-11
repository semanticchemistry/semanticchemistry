/* Copyright (C) 2010  Egon Willighagen <egonw@users.sf.net>
 */
package com.google.code.semanticchemistry.cdk.io;

import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.ResourceFactory;

public class CHEMINF {

    public static final String URI =
        "http://semanticscience.org/resource/";

    private static final Resource resource(String local) {
        return ResourceFactory.createResource(URI + local);
    }

    private static final Property property(String local) {
        return ResourceFactory.createProperty(URI, local);
    }

    public static final Resource Algorithm = resource("CHEMINF_000301");
    public static final Resource Implementation = resource("CHEMINF_000302");
    public static final Resource Descriptor = resource("CHEMINF_000303");
    public static final Resource DescriptorValue = resource("CHEMINF_000304");
    public static final Resource MolecularDescriptor = resource("CHEMINF_000305");
    public static final Resource DescriptorAlgorithm = resource("CHEMINF_000309");
    public static final Resource DescriptorValuePoint = resource("CHEMINF_000311");
    public static final Resource DescriptorImplementation = resource("CHEMINF_000320");
    public static final Resource Parameter = resource("CHEMINF_000328");
    public static final Resource ParameterValue = resource("CHEMINF_000329");

    public static final Property isA = property("CHEMINF_000306");
    public static final Property isAModificationOf = property("CHEMINF_000307");
    public static final Property isAParameterizationOf = property("CHEMINF_000308");
    public static final Property instanceOf = property("CHEMINF_000321");
    public static final Property hasTitle = property("CHEMINF_000335");
    public static final Property hasVendor = property("CHEMINF_000333");
    public static final Property hasIdentifier = property("CHEMINF_000334");
    public static final Property hasPart = property("CHEMINF_000326");
    public static final Property hasValue = property("CHEMINF_000336");
    public static final Property valuePointFor = property("CHEMINF_000325");
    public static final Property isCalculatedBy = property("CHEMINF_000327");
    public static final Property isCalculatedWithParameter = property("CHEMINF_000332");
    public static final Property valueFor = property("CHEMINF_000331");
    public static final Property hasParameter = property("CHEMINF_000330");

    public static final Property hasDescriptorValue = property("CHEMINF_000337");
    
}