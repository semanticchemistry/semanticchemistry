CheminfData2Rdf.py will use CheminfData.txt to generate RDF for cheminf.owl to the standard output.

- CheminfData.txt is a TAB-separated text that starts with the header such as: 'ShortName', 'CHEMINF_URI', 'Label', 'subClassOf', 'subClassName', 'Description', 'Comment', 'Note'. You can use any header you want but the code will search for the following labels:

'ShortName', 'CHEMINF_URI', 'Label', 'subClassOf', 'Description', 'Comment'

- The header fields could be at random positions.
- The minimum fields should be: 'CHEMINF_URI', 'Label', 'subClassOf', 'Description'.

Any question to muntisa@gmail.com