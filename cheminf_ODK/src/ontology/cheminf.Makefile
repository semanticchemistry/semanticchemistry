## Customize Makefile settings for cheminf
## 
## If you need to customize your Makefile, make
## changes here rather than in the main Makefile



# OBI import module
# this ROBOT extract code only deviates from the ODK default in that it excludes individuals
# which had to be done, since the `slme_individuals: exclude` flag
# did not work in the cheminf-odk.yaml
$(IMPORTDIR)/obi_import.owl: $(MIRRORDIR)/obi.owl $(IMPORTDIR)/obi_terms.txt \
			   $(IMPORTSEED) | all_robot_plugins
	$(ROBOT) annotate --input $< --remove-annotations \
		 odk:normalize --add-source true \
		 extract --term-file $(IMPORTDIR)/obi_terms.txt $(T_IMPORTSEED) \
		         --force true --copy-ontology-annotations true \
		         --individuals exclude \
		         --method BOT \
		 remove $(foreach p, $(ANNOTATION_PROPERTIES), --term $(p)) \
		        --term-file $(IMPORTDIR)/obi_terms.txt $(T_IMPORTSEED) \
		        --select complement --select annotation-properties \
		 odk:normalize --base-iri http://semanticscience.org/ontology \
		               --subset-decls true --synonym-decls true \
		 repair --merge-axiom-annotations true \
		 $(ANNOTATE_CONVERT_FILE)

# IAO import module
# this ROBOT extract code only deviates from the ODK default in that it excludes individuals
# which had to be done, since the `slme_individuals: exclude` flag
# did not work in the cheminf-odk.yaml
$(IMPORTDIR)/iao_import.owl: $(MIRRORDIR)/iao.owl $(IMPORTDIR)/iao_terms.txt \
			   $(IMPORTSEED) | all_robot_plugins
	$(ROBOT) annotate --input $< --remove-annotations \
		 odk:normalize --add-source true \
		 extract --term-file $(IMPORTDIR)/iao_terms.txt $(T_IMPORTSEED) \
		         --force true --copy-ontology-annotations true \
		         --individuals exclude \
		         --method BOT \
		 remove $(foreach p, $(ANNOTATION_PROPERTIES), --term $(p)) \
		        --term-file $(IMPORTDIR)/iao_terms.txt $(T_IMPORTSEED) \
		        --select complement --select annotation-properties \
		 odk:normalize --base-iri http://semanticscience.org/ontology \
		               --subset-decls true --synonym-decls true \
		 repair --merge-axiom-annotations true \
		 $(ANNOTATE_CONVERT_FILE)