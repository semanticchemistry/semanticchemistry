Present: Michel Dumontier, Leonid Chepelev, Nico Adams, Christoph Steinbeck, Paula de Matos, Marcus Ennis, and Janna Hastings.

Introductions: brief description of projects

Janna:     - chebi automatic classification

Michel: - connectivity-centric semantic chemistry
> - attribute semantic calculation
> - biochemical roles
> - representing functional group information and being able to use it in reasoning and computation

Leo:     - semantic specification for compounds
> - able to be reasoned over
> - formal semantic specification / atoms / bonds / functional groups / atoms transferred from one molecule to another
> - classify by attributes and functional groups
> > - metabolic fate determination; and other points
> > - automatic ontology generation from recurrent substructures in sets of compounds that have already been annotated as occurring in a particular class

Nico:     - chemical **data**. Not so much **chemicals**. Material scientist rather than biologist point of view. Different use case.

> - history and provenance of material rather than chemical structures; composition may be unknown or unknowable. Structure-centricity breaks down.
> - polyethylene in different phases have vastly different physicochemical properties. Impossible to link this to the chemical structure.
> - Use cases for cheminformatics generally motivated by biology and pharmaceuticals etc
> - Additional comment: great forum of people and not too much overlapping. (Agreement all round)

More detail about SCES

Leo: SCES: properties which relate to molecular reactivity and those particular properties which make certain atoms able to be classified into candidates for reactions
> - based on functional group annotation map to functional groups
> - every atom has a particular role within the functional group
> - further properties: charge/volume/surface area/QSAR analysis and predictors of reactivity
> - some properties necessarily have to come from literature or other services.
> - atom-centric, bond-centric and functional-group centric role helps in classification into structural classes.
> - accuracy is crucial in metabolic modelling
> - NB Deconvolution of structure and other kinds of property-based classes.
> - We want to identify properties which should be used in class definitions. If we have a description language we can use this in class definitions.


Janna asked: Use of SMARTS in class definitions. How does it relate to semantic chemical entity specification?

Michel: Can turn SMARTS string into query over knowlegebase OR turn it into database of molecules.

Paula: composition by inheritance. Curators should only have to specify the difference to the parent class. Michel: could list all SMARTS strings as siblings and then **compute** the hierarchy. Paula: wouldn't it make sense to re-use the known hierarchy. Michel: should rather be explicit about what constitutes class membership. Hierarchy can be built automatically (and should be). Paula: But rather not maintain duplicate information. <debate rages for a while>. Conclusion: we agree about SMARTS class definitions but will do everything possible to minimise curatorial effort, and however this is technically implemented is a detail for later.

Discussion about SMARTS production: PubChem (and any other) structure editor can produce SMARTS. What about SMARTS for the class Polycyclic cage? Difficult to formalise chemically. No - not. See below. Difficult to formalise in **SMARTS**.

Nico: provide audit trail as classifications will change. Put everything into version control including data, algorithms and ontologies.

Michel: class characteristic structures in MCSS; using **majority** rather than **all**. Adherence to certain structural descriptions. Can define classes by union of subclasses, and in some cases this is the only way to formalise a particular class definition.

Problem of definition by skeleton. ChEBI often gets classes requested which are informally defined by skeleton. But what does 'skeleton' mean? Invariate part? Clearly not (see use of skeleton in 'steroid' class). However, it still has a clear meaning. Graph theoretical description of commonalities CAN be done. CDK can do this kind of vague structural specification / derivation already. We may need another formalism to represent this kind of generality / possible worlds etc.

Chris came up with a graph theoretical definition for polycyclic cage => we need to combine cheminformatics techniques with logical operators in a description-logic-like language to solve the problem of definition of chemical classes generally (including polycyclic cages).

Next meeting to be scheduled after 2 weeks -> Janna to send around Doodle poll as usual.









