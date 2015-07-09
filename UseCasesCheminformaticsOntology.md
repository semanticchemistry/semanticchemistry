# Background #

The semantic chemistry working group aims to coordinate development of a single ontology, compatible with BFO principles and become part of the OBO Foundry collection of ontologies for the domain of cheminformatics, QSAR and drug discovery.

This effort will bring together the previous work of the members of the semantic chemistry working group under a single umbrella, facilitating greater interoperability and creating a stronger unified offering for the scientific community as a whole.

In order to guide the effort to align previous work under a single umbrella and to develop this further as a community offering, we need to collect the use cases for the eventual end result.

# Use Cases for Cheminformatics Ontology #

## 1. ChEBI automatic classification ##

For the project of classifying novel chemicals into [ChEBI](http://www.ebi.ac.uk/chebi/) ontology classes using automated reasoning, we need to extend the vocabulary of properties which are able to assert at the class level. This vocabulary should ultimately allow arbitrary chemical class definitions to be specified logically using necessary and sufficient conditions. At the very least, to accomplish this we will need predicates for common chemical properties such as aromaticity, charge, valence and various constituents. Ideally, these should be defined in an ontology and should be linked to algorithmic implementations (such as in the CDK) which are able to determine these properties from structural representations of molecular entities or parts.

## 2. Semantic e-Science ##
Application interoperability is made possible by the use of a data exchange mechanism in which there is agreement to the type of content defined in the document. While there are over [90 chemical file formats](http://openbabel.org/wiki/Category:Formats) detailing various aspects of molecular structure and attributes, none capture the rich domain semantics required to differentiate one kind of information from another in a machine understandable manner. The provision of common terminology enriched with logic-based semantics will facilitate storage, retrieval and workflow by chaining semantic web services. The [Dumontier Lab](http://dumontierlab.com) and [Bioclipse team](http://bioclipse.blogspot.com/) intend to define and use a semantic specification upon which interoperable semantic web services can be designed and used within the [SADI framework](http://sadiframework.org).

## 3. Scientific Publishing ##
Producing peer-reviewed scientific publications for human consumption is at the heart of the scientific communication paradigm. However, the current publishing strategy falls short in terms of our ability to ask **questions** over published knowledge. The reason for this is that normal English prose is too flexible to consistently extract meaning and    tables/figures are typically images as opposed to embedded raw data. If textual entities were tagged with labels that corresponded to a common meaning, and if simplified statements were recorded, then it would be possible to have questions answered by the content of articles. The first step for this is the generation controlled vocabularies or ontologies, and in this case, we need chemical and chemoinformatic terminologies.