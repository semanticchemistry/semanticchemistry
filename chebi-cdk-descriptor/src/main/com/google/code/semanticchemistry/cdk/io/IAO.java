/* Copyright (C) 2010  Egon Willighagen <egonw@users.sf.net>
 */
package com.google.code.semanticchemistry.cdk.io;

import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.ResourceFactory;

public class IAO {

    public static final String URI =
        "http://purl.obolibrary.org/obo/";

    private static final Resource resource(String local) {
        return ResourceFactory.createResource(URI + local);
    }

    private static final Property property(String local) {
        return ResourceFactory.createProperty(URI, local);
    }

    public static final Resource Software = resource("IAO_0000010");
    
}