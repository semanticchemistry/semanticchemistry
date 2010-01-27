/* Copyright (C) 2010  Egon Willighagen <egonw@users.sf.net>
 */
package com.google.code.semanticchemistry.cdk.io;

import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.ResourceFactory;

public class CHEMINF {

    public static final String URI =
        "http://www.blueobelisk.org/ontologies/chemoinformatics-algorithms/#";

    private static final Resource resource(String local) {
        return ResourceFactory.createResource(URI + local);
    }

    private static final Property property(String local) {
        return ResourceFactory.createProperty(URI, local);
    }

    public static final Resource Algorithm = resource("Algorithm");
    public static final Resource Descriptor = resource("Descriptor");
    public static final Resource DescriptorAlgorithm = resource("DescriptorAlgorithm");
    public static final Resource DescriptorValue = resource("DescriptorValue");
    public static final Resource DescriptorValuePoint = resource("DescriptorValuePoint");
    public static final Resource DescriptorImplementation = resource("DescriptorImplementation");
    public static final Resource Implementation = resource("Implementation");
    public static final Resource Parameter = resource("Parameter");
    public static final Resource ParameterValue = resource("ParameterValue");

    public static final Property instanceOf = property("instanceOf");
    public static final Property hasTitle = property("hasTitle");
    public static final Property hasVendor = property("hasVendor");
    public static final Property hasIdentifier = property("hasIdentifier");
    public static final Property hasPart = property("hasPart");
    public static final Property hasValue = property("hasValue");
    public static final Property valuePointFor = property("valuePointFor");
    public static final Property isCalculatedBy = property("isCalculatedBy");
    public static final Property isCalculatedWithParameter = property("isCalculatedWithParameter");
    public static final Property valueFor = property("valueFor");
    public static final Property hasParameter = property("hasParameter");
    public static final Property hasDescriptorValue = property("hasDescriptorValue");

    
}