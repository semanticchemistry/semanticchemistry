# convert TXT TAB-separated cheminf data into RDF for cheminf.owl
# ----------------------------------------------------------------
# by Cristian R Munteanu (muntisa@gmail.com)

# the header fields could be at random positions
# the script will search only for 'ShortName', 'CHEMINF_URI', 'Label', 'subClassOf', 'Description', 'DOI', 'Comment'
# the minimum should be: 'CHEMINF_URI', 'Label', 'subClassOf', 'Description'

ChemDataFile="CheminfData.txt" # file with data to be converted
f=open(ChemDataFile, "r") # read the file to check
lines=f.readlines()
f.close()

header=lines[0]
headerL=(header.replace('\n', '')).split("\t") # get the header as list
# ex: ['ShortName', 'CHEMINF_URI', 'Label', 'subClassOf', 'subClassName', 'Description', 'DOI', 'Comment', 'Note']

for i in range(1,len(lines)): # for each descriptor get the info
    descriptorL=((lines[i]).replace('\n', '')).split("\t") # get descriptor fields as list

    if len(descriptorL)>=4: # only if find 4 fields (minim description): uri, label, subclass, description
        sRDF="" # conversion text
        sShortName=""
        sCHEMINF_URI=""
        sLabel=""
        sSubClass=""
        sDescription=""
        sComment=""
        sDOI=""

        # ADD strip! remove spaces! Replace new lines etc with nothong!
        for j in range(len(headerL)): # for each header
            if headerL[j]=="ShortName":
                sShortName=descriptorL[j]
            else:
                if headerL[j]=="CHEMINF_URI":
                    sCHEMINF_URI=descriptorL[j]
                else:
                    if headerL[j]=="Label":
                        sLabel=descriptorL[j]
                    else:
                        if headerL[j]=="subClassOf":
                            sSubClass=descriptorL[j]
                        else:
                            if headerL[j]=="Description":
                                sDescription=descriptorL[j]
                            else:
                                if headerL[j]=="DOI":
                                    sDOI=descriptorL[j]
                                else:
                                    if headerL[j]=="Comment":
                                        sComment=descriptorL[j]
                                    

        # write RDF
        if sCHEMINF_URI!="" and sLabel!="" and sSubClass!="" and sDescription!="": # only if find a minimum description
            sRDF+="    <!-- http://semanticscience.org/resource/"+sCHEMINF_URI+" -->\n\n"
            sRDF+="    <owl:Class rdf:about=\"&resource;"+sCHEMINF_URI+"\">\n"
            sRDF+="        <rdfs:label xml:lang=\"en\">"+sLabel+"</rdfs:label>\n"   
            sRDF+="        <rdfs:subClassOf rdf:resource=\"&resource;"+sSubClass+"\"/>\n"
            sRDF+="        <dc:description>"+sDescription+"</dc:description>\n"
            #sRDF+="        <obo:IAO_0000115>"+sDescription+"</obo:IAO_0000115>\n"

            if sDOI!="":
                sRDF+="        <bibo:doi rdf:datatype=\"&xsd;string\">"+sDOI+"</bibo:doi>\n"
                
            if sComment!="":
                sRDF+="        <rdfs:comment>"+sComment+"</rdfs:comment>\n"
            if sShortName!="":
                sRDF+="        <short_name>"+sShortName+"</short_name>\n"

            sRDF+="    </owl:Class>\n\n\n"


            print sRDF # print RDF for each descriptor only if find a minimum description!
        
            
            
        

                    
                

                
        
