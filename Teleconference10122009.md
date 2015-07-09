# Agenda #

For this meeting I would like us to concentrate on defining the next steps and ultimate goal of the chemical information ontology which we aim to jointly develop. To this end, I've attached a draft planning document which I'd like especially Egon, Michel and Nico to read carefully. The particular points which I would like to discuss in the teleconf are:

  * Agreement about scope and branding
  * Commitment from each contributor about what will be included and what excluded from the collaboratively developed artifact
  * Work plan for integration and ontology construction, with tasks and timelines


# Minutes #

Scope:

Definition of properties? - includes descriptors and physicochemical properties.
Problem of scope: do we represent the relevant molecules themselves? No - not needed.
Some properties inhere in bulk substances? e.g. do we differentiate atomic charge from molecular charge? Yes, and bulk substance properties from molecular properties. Links to ChEBI as needed (molecule, atom, chemical substance).

Source?
  * Do we want to use an authoritative source e.g. encyclopedia of QSAR concepts. Good to use that for inspiration. Enough work to get on with for now just to merge the electronic sources that we have already identified to be merged.
  * Calculated descriptors different from physicochemical properties. Physicochemical properties need to be treated differently. Possibility of confusion of terms which should be merged. Yes - this is exactly what we want to resolve with clear definitions and a synthesised offering to the community.
  * Description of algorithms should include minimum description of implementation necessary to identify the algorithm.
  * Data provision? E.g. SADIE? Data mapping relationships into ontology? Problem with maintenance of mappings? Egon has ideas to do this kind of maintenance tasks automatically. Blue Obelisk ontology serving all these needs at the moment. Have been doing this for a long time. Additional mappings can be added. This should not be added to this centralisation effort though? - Probably not; we shoudl include algorithms, descriptions, and links to implementations. Implementations should maintain data mappings.
  * Not maintain mapping Mulliken Charge as calculated by MOE is same as Mulliken Charge as calculated by CDK. Implementations can differ. Subclass isAModificationOf indicating algorithm is mostly the same as but with some slight tuning changes used in Blue Obelisk. This might be useful.
  * Can bring in Egon's descriptor stuff already as-is. (as long as we get the location correct within the upper levels).
  * Implementation for mappings: Has Egon used his ontology computationally yet? Not in SADIE but CDK is using it for its lookup. Bioclipse is using RDF and SPARQL for doing such queries. Clever stuff.

Integration.

Source attribution? Academic visibility for what we do. Problem with total integration - academic visibility disappears.  Original application needs to be maintained as well. Not sure if total integration will work for all use cases. BFO issues with integration.

Solution: Source attribution as metadata in terms. Attribution? To Blue Obelisk Descriptor Ontology; ChemAxiom and Michel (to decide on their group attribution).

Integration? Work plan?

Each contributor to independently create implementation script to include their stuff into cheminf ontology OWL file.

Deadline by when we have successfully completed the technical integration of terms into one ontology? Review point third week of January.