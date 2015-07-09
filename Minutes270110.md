# Topic #

Cheminf ontology progress and next steps

# Present #

Nico, Michel, Egon, Janna

# Minutes #

Nico half way through including chemaxiom into cheminf ontology.

Egon extracted BODO terms and added a few predicates into separate BODO file
Axioms? Parents?

Nico has stuck everything under descriptor for now.

Question: why descriptors are generically dependent continuants? J: because they're information. N: But can be blatantly wrong for descriptors? Not want to debate this right now.

M: Doesn't preclude use as data integration toolkit to be tied to BFO at upper level.

M: Question for Egon: what is difference between descriptor and molecular descriptor? E: a descriptor does not require that that it describes to have chemical content. Molecular descriptor requires a description of a molecule (graph). Atomic descriptor requires atom. Descriptor is superclass of these three. In ontology: descriptor class. we have mol entity descriptor and chemical substance descriptor. Also have atomic descriptor. M: Also not use same as or equivalent class, and that mapping should not be held in your own file, but should be held in a separate file for mappings only. N: What about annotation properties? hasAlternativeId? Even though not explicit for reasoner? M: Yes I'll include as annotation property. Separate file for equivalent classes mappings. E: using equivalent classes to indicate equivalent BODO to cheminf classes. E: which namespace? oboInOwl. M: cheminf = unique set of concepts for which each is mapped with hasAlternativeId prefix: identifier. Later we can iterate through that and automatically generate mapping files. Have to ensure that cheminf ontology contains a unique set of concepts.

J: any missing relationships? N: need enough to cover metadata. Canonical representation. Reference to code that implements. Versions and so on. Class for logP descriptor: no canonical representation of logP descriptor. Many many different approaches. For any instance of logP descriptor, need to indicate which specification it conforms to. Also need reference to implementation of descriptor: Two different things. Implementation may or may not be faithful. Want to link specifically to the software that generates. Including software versioning.

N: take molecules, calculate descriptors, model process and output in ontology format.
M: need example case. One! Let's do it with just one molecule and some descriptors and instantiate the ontology even if it is in abstract form.
N: 5-10 molecules, pass to CDK for calculating descriptors, model under ontology (automatically) - need software to convert automatically.
E: SWAT4LS paper with CDK descriptor calculations contains examples.
E: last week putting ChEMBL RDF into virtuoso and it became really slow... can send around RDF for subset of ChEBI... can calculate descriptors.

E: CDK descriptors in BODO; BODO in cheminf; mapping.

M: will go through Egon's SWAT4LS publication
J: will work on definitions and primary file
N: has left definitions as comments as these are non-Aristotelian
N: Need review for natural language descriptions, these should be reviewed in review process, no decent definitions, definitions should inspire axiomatization.
N: mixture of distribution of work and review process? Use comment field for discussion, put initials in comment field.
E: definitions not clear to Egon. BODO definitions not included from BODO ontology. Have to be copied/pasted.
E: besides Protege, is there a tree view of the hierarchy of the cheminf.owl file?
N: clark & parsia has one, called owlsite. webapp creates tree hierarchy.