# Topic #

Chemical information ontology

# Present #

Michel, Nico, Egon and Janna

# Minutes #


N: Attribution of individual terms added to the ontology?

M: Should use annotation property of some sort. How about dc?

E: BODO using DC so that's fine with him

N: Should acknowledge source ontology as well?

M: Yes, e.g. for incorporation of terms from CHESS we used IUPAC terms originally

N: legacy of support requirements: mapping made easier

M: hasAlternativeId in Gene Ontology namespace? or use notation of ontology prefix : identifier & MIREOT terminology

N: merged chemaxiom with cheminf and used chemaxiom\_blah in cheminf namespace

E: OWL ontology questions? No one or two minor ones for the mailing list


M: Aim in next three weeks: good comprehensive set of descriptors in ontology. Including contributions from Blue Obelisk and CML (PMR in Camb). Link to original sources.

M: Algorithms and implementations also (very useful to community). Egon's particular interest.


M: In Google doc: simplified model based on Egon's diagram circulated earlier. Check current version in Google doc. Check that version.

E: descriptor referring to source code? something calculated by source code? descriptor value NOT originating from source code. Source code is not implementation; algorithm is close to source code but not exactly synonymous. Source code might have platform specific things which affect the calculations.

N: Need to separate algorithm from implementation from calculation from etc etc. Implementation may differ from vendor to vendor and may be wrong.

E: diagrams in Google doc might be OK. Separator of descriptor and specification is there, so might be OK.

M: so you'd like to see the relationship between source code, software and algorithm being explicitly described.

E: CDK and <something else> had implementations of the same algorithm which gave different values.

M: Source code is a kind of specification. Intimate relationship between software and source code. Software conforms to source code specification and source code conforms to algorithm.

N: Careful about 'conforms to'. Descriptor may be defined in one way but implementation may deviate.

E: stick to 'implements' rather than 'conforms to'. The software tries to implement the algorithm design but  has implicit errors.

M: implements is weaker than conforms; implementation has to be correct, right?

N: from experience that is simply not true.

E: yes this is the case in cheminformatics. lots of things are not well defined enough to make a decision about correctness and you lack information and have to guess.

M: Relation between intent and actuality (deep philosophical issues)

N: calculation is an experiment. Look at it like OBI. Planned process with intended outcome; can differ to real outcome. NB notion of intended outcome.

M: Exciting topic! Let's think more about that?


N: Machine translation of CML schema into OWL available. Can include this if found. Suspect that it might already be there in ChemAxiom.

M: Should get in touch with Peter about someone from his group joining us for calls from now on. They are keen to participate.

N: Double amount of time dedicated to teleconferences ;-)

E: Jim Downing asked E. about descriptor things.

N: Will see Jim tonight.

E: Please ask him what he can contribute to my descriptor stuff?


E: added a first few classes with cheminf IDs starting with 0003.

N: Problem with merging. He's working on chemaxiom, Egon working on blue obelisk, problem with merging after both edit.

M: Egon create own file and just import cheminf file. That way avoids any merging.

N: A lot to be said for modularity. Could have atomic concepts in cheminf and long lists of descriptors in separate files.

N+E: Yes that's a lot easier.

M: To what extent will we have an actual use case in our first paper? Should aim for fairly low hanging fruit.

N: Already done. Build a knowledgebase for 6-7 thousand monomers/polymers in Cambridge and marked that up with descriptors etc then used SPARQL endpoint for searching in faceted search. Links small molecules to the polymers. Need to talk to Peter to see whether we can use that again - maybe publish in two papers?

E: Along same lines. SPARQL endpoints in use at the moment. Not yet using chemaxiom. Which class to use for a graph representation of molecules? Descriptors are usually based on a particular representation of a  molecule; a graph. Not so much the molecule in reality. Did plan to make a SPARQL endpoint for molecules and use QSAR descriptors for that as well. Large knowledgebase of calculated descriptors is good. Should use ChEBI/chembl. Rather not use PubChem.

E: Have code to translate chemical graph into RDF. Can represent the whole CDK data model in RDF. Including chemical graph of molecules. Not just as a clob in one field or as an inchi or a smiles.

M: Is describing a chemical graph within the scope of our activity

N: Yes. Chemical graph is an information entity and nothing else. Some chemicals cannot be described in terms of graphs. Information **only**.

E: Entry for aromaticity --> in wrong place. Definition refers to aromaticity rather than descriptor. Not a chemical information type of definition.

M: I'd be really interested to see, Egon, how you represent the chemical graph. Really interested to see how this fits into the rest of the ontology.

M: RNAO meeting in Cambridge. Talked a lot about the representation of molecular structure and the kinds of relations that could exist between atoms and the kind of relations that apply at that level. Types of bonding, for example. Can represent and compute over this.

E: Explicit definitions need to be compatible with what a descriptor implementation does.

N: Need to stick to the standard representation of a molecule to avoid contention.

E: BO ontology had a go at this. Includes 'data feature' describing information data model needed to be able to calculate the descriptor. Some require chemical graph (most but not all); some require 3D coordinates.

N: Granularity?

E: Quantum mechanic descriptors which don't match the other types of data.


M: when will we meet again?

J: Try for next week and then see if we can find a time.

N: hacking in chemaxiom for until next week

E: hacking in BODO for until next week

M+J: working on core ontology and paper


N: CIF (from PMR group) not relevant; mainly crystallographic relevance

M: Many that are chemically oriented, we should consider including them

N: need to make understood to those guys what cheminf ontology is and how to use it; they are happy at the CML/RDF level. Will get started but it will take a while longer.

N: white space in URL for SVN ontology? Seems to be - which is weird?

J: Will check that out.