# Task at Hand #

We would like to verify that we have full coverage of the descriptors calculated by the major cheminformatics packages. For this purpose, we need to compile an exhaustive list of descriptors used (by going to the API documentation if necessary), determine whether these descriptors are present in our descriptor ontology, and add them in appropriate classes if necessary.

# CDK Descriptor Assessment #

> Amino Acid Count

> Atomic Polarizabilities

> Element Count

> Atomic Degree

> Atomic Hybridization

> Atomic Hybridization VSEPR

> Atomic Valence

> Aromatic Atoms Count

> Aromatic Bonds Count

> Inductive atomic hardness

> Inductive atomic softness

> BCUT

> Bond Count

> Bonds to Atom

> Bond Polarizabilities

> Valence connectivity index (order 1)

> Valence carbon connectivity index (order 1)

> Valence connectivity index (order 0)

> Valence carbon connectivity index (order 0)

> Carbon connectivity index (order 0)

> Carbon connectivity index (order 1)

> Distance to Atom

> Effective Polarizability

> Gravitational Index

> Gravitational Index (Square and Cube Roots)

> Hydrogen Bond Acceptors

> Hydrogen Bond Donors

> Hydrogen Bond Acceptors (Daylight)

> Hydrogen Bond Donors (Daylight)

> Acceptor Field Atoms (Boehm,Klebe)

> Donor Field Atoms (Boehm,Klebe)

> Acceptors or Donors Field Atoms (Boehm,Klebe)

> Proton belonging to an aromatic system

> Proton belonging to a pi-system

> Kier and Hall kappa molecular shape indices

> Largest Chain

> Largest Pi Chain

> Lipinski's Rule of Five

> Longest Aliphatic Chain

> Moments of Inertia

> Partial Pi Charge

> Partial Pi Charge

> Partial Total Charge (MMFF94)

> Period of an atom

> Petitjean Number

> Pi-contact of two atoms

> Pi Electronegativity

> Proton Total Partial Charge

> RDF Proton Descriptor

> Rotatable Bonds Count

> Sigma Electronegativity

> Topological Polar Surface Area

> Molecular Weight

> WHIM

> Wiener Numbers

> Vertex adjacency information magnitude

> Van der Waals radius

> XLogP

> ALogP

> Zagreb Index

> Covalent Radius

> Bond Partial Pi Charge

> Bond Partial Sigma Charge

> Bond Partial Total Charge

> Bond Sigma Electronegativity

> Petitjean Shape Indices

> Ring Count

> Eccentric Connectivity Index

> Charged Partial Surface Areas

> Fragment Complexity

> Weighted path descriptors

> Moreau-Broto Autocorrelation (charge) descriptors

> Moreau-Broto Autocorrelation (polarizability) descriptors

> Moreau-Broto Autocorrelation (mass) descriptors

> TAE RECON descriptors for amino acid sequences

> Molecular Distance Edge

> Length Over Breadth

> Chi Chain Indices

> Chi Path Indices

> Chi Cluster Indices

> Chi Path-Cluster Indices

> Carbon Types

> Kier Hall SMARTS

> Ionization Potential


# RDKit #

> Gasteiger/Marsili Partial Charges

> BalabanJ

> BertzCT

> Ipc

> HallKierAlpha

> Kappa1 - Kappa 3

> Chi0

> Chi1

> Chi0n-Chi4n

> Chi0v-Chi4v

> MolLogP

> MolMR

> MolWt

> HeavyAtomCount

> HeavyAtomMolWt

> NHOHCount

> NOCount

> NumHAcceptors

> NumHDonors

> NumHeteroatoms

> NumRotatableBonds

> NumValenceElectrons

> RingCount

> TPSA

> LabuteASA

> PEOE\_VSA1 - PEOE\_VSA14

> SMR\_VSA1 - SMR\_VSA10

> SlogP\_VSA1 - SlogP\_VSA12

> EState\_VSA1 - EState\_VSA11

> VSA\_EState1 - VSA\_EState10


# OEChem #

TBD

# JOELib #

TBD

# Notes #

When adding descriptors to the cheminf ontology, please keep track of which package the descriptor identity is coming from. Since some packages may name different descriptors the same name, we need to discuss ways of appropriately addressing this.