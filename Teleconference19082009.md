# Semantic Chemistry Teleconference 19-08-2009 #

**Attendees:** Janna Hastings (JH), Paula de Matos (PdM), Michel Dumontier (MD), Leonid Chepelev (LC), Nico Adams (NA), Egon Willighagen (EW)

**Minute taker:** JH

**Minutes**

1. Polycyclic cages. Leo: reduced graph with ring as unit rather than atom. Pay computational cost up-front. Janna difficult to differentiate interesting rings from not interesting rings. Egon: algorithm for SSSR not well defined. Still maybe not so bad for defining cage systems. Any implementation for SSSR should work as long as the resulting SSSR is normalised. Reduced graph: vertice = ring; edge = shared bond. Egon: definition of number of rings in SSSR is "the number of bonds you need to break to generate a not-cyclic molecule". For cubane this is 5. By contrast a reduced graph would have six nodes. Structure of diamantane was discussed. Everybody to think some more about regularity of structure.

2. QSAR descriptors. Egon and Nico both have not had time so nothing to report. When they have time they need to meet and discuss. Egon no time till after German conference on cheminformatics. Todo: more algorithmic definition of descriptors. Actual timeframe for working merged, agreed QSAR ontology? No idea. Michel/Leo need ontology of stable terms for properties and QSAR descriptors. Need this by late October - possible? Late October should be possible. Checkpoint: mid-October. Egon: expressing in CML calculation results of QSAR descriptors. Egon going to express this in RDF. Michel been working on submitting terms to IAO ontology. Leo to simply start using terms in the meantime and add those to SCES (CHESS) terminology. Need terms for everything that can be calculated; need terms for the algorithms themselves.

3. Rules and reasoning. DL-safe rules and SPARQL queries to query substructures in represented molecules. Previous work proved the concept; latest work generalized a bit further. Rules specified in Protege friendly format and sent to Pellet. Every query variable in DL safe rules must be bound to an individual. Searching LIPIDMAPS database. Performance decreased exponentially in the size of the molecule. General purpose reasoner doesn't know about partial order or anything. Every atom in substructure pattern is represented in the query and therefore pretty expensive to reason over. Represent SMARTS pattern as SPARQL query: this works better and can finish on LIPIDS in some cases but not for all queries. Some queries estimated at 11 years!!! SPARQL better as allows termination after the first solution found. Need to interface between cheminformatics algorithms which already do what they do really well, and logic-based ontology reasoning which we need for ontologies. Michel and Egon already devising a plan for this based on web services and Semantic Web.

4. SMARTS: Janna would like a graphical editor which was able to generate SMARTS. Does PubChem have something which does this? Check. Already renders SMARTS queries if you paste them in. JChemPaint not funded. SMARTS generation is on the wish list for JChemPaint but not yet implemented. For now have to generate SMILES and then try to generate SMARTS from the generated SMILES by hand by inserting SMARTS operators. Daylight page: SMARTS substructure on SMILES and showing matches. Useful for verifying.

Additional:

Egon will have student soon working on RDF and Prolog.

Michel suggested getting into contact with Mike Bada and sending some text for relationship (chemical-role) extraction, they are also working on that. Janna to send sample text around before next meeting.