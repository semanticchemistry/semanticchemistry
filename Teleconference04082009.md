Title: Semantic Chemistry Teleconference

Attendees: Janna Hastings (JH), Paula de Matos (PdM), Michel Dumontier (MD), Leonid Chepelev (LC), Nico Adams (NA), Egon Willighaven (EW)

Minute taker: PdM

Minutes

JH wanted to talk about logical formulation in chemical structure classes.

What do you think of defintion like that in owl.

LC: not trivial in OWL.
JH looking for 6 atoms are connected and where the connections go on. You would not be able to say rings of arbitrary size.

For rules which want DL ontologies specify exact no. of atoms and how are connected.

Rules:
Molecule to rules converter. Allows drawing structure interprets it into Rules which can then be interpreted into DL reasoning. Annotator can then draw the structure and its interpreted.
JH interested in how you get from logical description to a structural description.

JH: Would we be able to specify a definition for "polycyclic cage" which some java code could interpret?
LC + MD: could use a combination of java code and logical definitions.


MD: You still have to specify what class membership should do.
Leo in SCESS provision for functional groups - rely on external sw. Use the SCES to define these.

JH we want to logically define classes and map them to molecules. We will need to use some sort of chemical structure descriptions.

JH tricyclic molecules:
OWL 2, three cycles of parts. We can't specify they can't connect to each other.

LC: we need this described in ontology. Formally in some language you need to describe the structure e.g. SMARTS. MD: still doable with SMARTS.
JH we mean the case thats no easy. The interesting case we want to capture some sort of generalness but still describe something logically. LC: in a generic reasoner its not trivial.

JH you need to have a definition of cycle in an ontology. Fused property in the ontology and then match that to two cycles.

Leo go up the tree see the molecules below it and classify on the molecules below it.

NA two part reasoner:
1. General reasoner
2. Bespoke chemical reasoner, uses the traditional representations


LC good suggestion.

MD OWL does provide for custom datatypes. Example SMARTs pattern you can get the reasoner to pass off the subsumption test to a third party tool.

Action: JH first order logic translation of polycylic cage.

LC: We have a structure you can draw with JME obtain the semantic description of the molecule.
1. Agree on the properties we need.
2. Actual calculation of the properties.

JH asked about the Google group for semantic science:
MD: a portal for any kind of semantic science.

Put minutes up on the Google group for semantic science.


Descriptors and ontologies

EW: descriptor ontology something started in CDK and using CML or STML. Used in CDK and Joelib. Providing a dictionary with unique identifiers with descriptor algorithms. Ontology describes descriptor algorithms with some parameter applied. Parameters have not all been transformed to OWL. Linked algorithms to papers so that you can see what algorithm is used in what paper.
Express things in OWL. References to papers still in XML format. JH what ids to use.

MD submitted an ontology publication types to OBI ontology.
Nico also has done something similar in bitbucket. Metadata ontology, datapoint A in our properties ontology was taken from a section of a paper which is part of a paper and part of a publication etc....

Action: LC, MD and NA look at the differences between these.

JH we should make a single descriptor ontology.

NA wrote a descriptor ontology. Reasoning was going to be an added benefit. Assert shallow hierachies and use defined classes. Combined with the meta ontology.

JH: Leo and Mich what do you want to use a descriptor for?

SCES a descriptor ont would be useful of ontological descrip of molecule. A description of the method would be a bonus. So its obvious that its useful to use a single descriptor ontology.

Must be a collaborative project.

EW there is a qsar project for this. Ula PHD's here is bout to submit a paper on QSAR models and uses RDF tech to itneract with ontology.  Data providing would be useful.
In between the many disjoints its a good data provider. We wanted to describe the dragon descriptors.

JH wants opinions on using OBO and IAO.
MD thinks its a good goal but may be challenging to fit in a realist world.
Nico agrees with Michel. Nico does not think they are description artifacts. Alot of extra work to align with BFO and IAO.
EW is the ont you defined have you aligned it with ChemAxiom. NA treats descriptors as property values. Leo thinks that both ontologies are a good compliment.
Action:  Nico and Egon should look at combining the two.

JH should we have an ID scheme. We should have a similar scheme to OBO. Prefix plus numeric digits for identifier. Leo names can get so cryptic. MD: Provided there are labels and definitions there is no problem.

EW one more comment, QSAR ont did for Joelib and CDK. Descriptor of values don't only specify which algorithm but the parameters and the version.

PdM asked if there is any other descriptors ontology out there?

NA a handbook of QSAR descriptors an A-Z explanation - Wiley.
Blue and white :)