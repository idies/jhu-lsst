PRINT('LOADING TABLE type_of_cancer')
insert into [type_of_cancer]  with (tablock)  ([TYPE_OF_CANCER_ID],[NAME],[CLINICAL_TRIAL_KEYWORDS],[DEDICATED_COLOR],[SHORT_NAME],[PARENT])select * from openquery(CBIOPORTALMYSQL,'select * from `type_of_cancer`')

PRINT('LOADING TABLE cancer_study')
SET IDENTITY_INSERT [cancer_study] ON
insert into [cancer_study]  with (tablock)  ([CANCER_STUDY_ID],[CANCER_STUDY_IDENTIFIER],[TYPE_OF_CANCER_ID],[NAME],[SHORT_NAME],[DESCRIPTION],[PUBLIC],[PMID],[CITATION],[GROUPS],[STATUS],[IMPORT_DATE])select * from openquery(CBIOPORTALMYSQL,'select * from `cancer_study`')
SET IDENTITY_INSERT [cancer_study] OFF

PRINT('LOADING TABLE users')
insert into [users]  with (tablock)  ([EMAIL],[NAME],[ENABLED])select * from openquery(CBIOPORTALMYSQL,'select * from `users`')

PRINT('LOADING TABLE authorities')
insert into [authorities]  with (tablock)  ([EMAIL],[AUTHORITY])select * from openquery(CBIOPORTALMYSQL,'select * from `authorities`')

PRINT('LOADING TABLE patient')
SET IDENTITY_INSERT [patient] ON
insert into [patient]  with (tablock)  ([INTERNAL_ID],[STABLE_ID],[CANCER_STUDY_ID])select * from openquery(CBIOPORTALMYSQL,'select * from `patient`')
SET IDENTITY_INSERT [patient] OFF

PRINT('LOADING TABLE sample')
SET IDENTITY_INSERT [sample] ON
insert into [sample]  with (tablock)  ([INTERNAL_ID],[STABLE_ID],[SAMPLE_TYPE],[PATIENT_ID],[TYPE_OF_CANCER_ID])select * from openquery(CBIOPORTALMYSQL,'select * from `sample`')
SET IDENTITY_INSERT [sample] OFF

PRINT('LOADING TABLE sample_list')
SET IDENTITY_INSERT [sample_list] ON
insert into [sample_list]  with (tablock)  ([LIST_ID],[STABLE_ID],[CATEGORY],[CANCER_STUDY_ID],[NAME],[DESCRIPTION])select * from openquery(CBIOPORTALMYSQL,'select * from `sample_list`')
SET IDENTITY_INSERT [sample_list] OFF

PRINT('LOADING TABLE sample_list_list')
insert into [sample_list_list]  with (tablock)  ([LIST_ID],[SAMPLE_ID])select * from openquery(CBIOPORTALMYSQL,'select * from `sample_list_list`')

PRINT('LOADING TABLE gene')
insert into [gene]  with (tablock)  ([ENTREZ_GENE_ID],[HUGO_GENE_SYMBOL],[TYPE],[CYTOBAND],[LENGTH])select * from openquery(CBIOPORTALMYSQL,'select * from `gene`')

PRINT('LOADING TABLE gene_alias')
insert into [gene_alias]  with (tablock)  ([ENTREZ_GENE_ID],[GENE_ALIAS])select * from openquery(CBIOPORTALMYSQL,'select * from `gene_alias`')

PRINT('LOADING TABLE uniprot_id_mapping')
insert into [uniprot_id_mapping]  with (tablock)  ([UNIPROT_ACC],[UNIPROT_ID],[ENTREZ_GENE_ID])select * from openquery(CBIOPORTALMYSQL,'select * from `uniprot_id_mapping`')

PRINT('LOADING TABLE genetic_profile')
SET IDENTITY_INSERT [genetic_profile] ON
insert into [genetic_profile]  with (tablock)  ([GENETIC_PROFILE_ID],[STABLE_ID],[CANCER_STUDY_ID],[GENETIC_ALTERATION_TYPE],[DATATYPE],[NAME],[DESCRIPTION],[SHOW_PROFILE_IN_ANALYSIS_TAB])select * from openquery(CBIOPORTALMYSQL,'select * from `genetic_profile`')
SET IDENTITY_INSERT [genetic_profile] OFF

PRINT('LOADING TABLE genetic_alteration')
insert into [genetic_alteration]  with (tablock)  ([GENETIC_PROFILE_ID],[ENTREZ_GENE_ID],[VALUES])select * from openquery(CBIOPORTALMYSQL,'select * from `genetic_alteration`')

PRINT('LOADING TABLE genetic_profile_samples')
insert into [genetic_profile_samples]  with (tablock)  ([GENETIC_PROFILE_ID],[ORDERED_SAMPLE_LIST])select * from openquery(CBIOPORTALMYSQL,'select * from `genetic_profile_samples`')

PRINT('LOADING TABLE gene_panel')
SET IDENTITY_INSERT [gene_panel] ON
insert into [gene_panel]  with (tablock)  ([INTERNAL_ID],[STABLE_ID],[DESCRIPTION])select * from openquery(CBIOPORTALMYSQL,'select * from `gene_panel`')
SET IDENTITY_INSERT [gene_panel] OFF

PRINT('LOADING TABLE gene_panel_list')
insert into [gene_panel_list]  with (tablock)  ([INTERNAL_ID],[GENE_ID])select * from openquery(CBIOPORTALMYSQL,'select * from `gene_panel_list`')

PRINT('LOADING TABLE sample_profile')
insert into [sample_profile]  with (tablock)  ([SAMPLE_ID],[GENETIC_PROFILE_ID],[PANEL_ID])select * from openquery(CBIOPORTALMYSQL,'select * from `sample_profile`')

PRINT('LOADING TABLE structural_variant')
SET IDENTITY_INSERT [structural_variant] ON
insert into [structural_variant]  with (tablock)  ([SAMPLE_ID],[INTERNAL_ID],[BREAKPOINT_TYPE],[ANNOTATION],[COMMENTS],[CONFIDENCE_CLASS],[CONNECTION_TYPE],[EVENT_INFO],[MAPQ],[NORMAL_READ_COUNT],[NORMAL_VARIANT_COUNT],[PAIRED_END_READ_SUPPORT],[SITE1_CHROM],[SITE1_DESC],[SITE1_ENTREZ_GENE_ID],[SITE1_POS],[SITE2_CHROM],[SITE2_DESC],[SITE2_ENTREZ_GENE_ID],[SITE2_POS],[SPLIT_READ_SUPPORT],[SV_CLASS_NAME],[SV_DESC],[SV_LENGTH],[TUMOR_READ_COUNT],[TUMOR_VARIANT_COUNT],[VARIANT_STATUS_NAME],[GENETIC_PROFILE_ID])select * from openquery(CBIOPORTALMYSQL,'select * from `structural_variant`')
SET IDENTITY_INSERT [structural_variant] OFF

PRINT('LOADING TABLE mutation_event')
SET IDENTITY_INSERT [mutation_event] ON
insert into [mutation_event]  with (tablock)  ([MUTATION_EVENT_ID],[ENTREZ_GENE_ID],[CHR],[START_POSITION],[END_POSITION],[REFERENCE_ALLELE],[TUMOR_SEQ_ALLELE],[PROTEIN_CHANGE],[MUTATION_TYPE],[FUNCTIONAL_IMPACT_SCORE],[FIS_VALUE],[LINK_XVAR],[LINK_PDB],[LINK_MSA],[NCBI_BUILD],[STRAND],[VARIANT_TYPE],[DB_SNP_RS],[DB_SNP_VAL_STATUS],[ONCOTATOR_DBSNP_RS],[ONCOTATOR_REFSEQ_MRNA_ID],[ONCOTATOR_CODON_CHANGE],[ONCOTATOR_UNIPROT_ENTRY_NAME],[ONCOTATOR_UNIPROT_ACCESSION],[ONCOTATOR_PROTEIN_POS_START],[ONCOTATOR_PROTEIN_POS_END],[CANONICAL_TRANSCRIPT],[KEYWORD])select * from openquery(CBIOPORTALMYSQL,'select * from `mutation_event`')
SET IDENTITY_INSERT [mutation_event] OFF

PRINT('LOADING TABLE mutation')
insert into [mutation]  with (tablock)  ([MUTATION_EVENT_ID],[GENETIC_PROFILE_ID],[SAMPLE_ID],[ENTREZ_GENE_ID],[CENTER],[SEQUENCER],[MUTATION_STATUS],[VALIDATION_STATUS],[TUMOR_SEQ_ALLELE1],[TUMOR_SEQ_ALLELE2],[MATCHED_NORM_SAMPLE_BARCODE],[MATCH_NORM_SEQ_ALLELE1],[MATCH_NORM_SEQ_ALLELE2],[TUMOR_VALIDATION_ALLELE1],[TUMOR_VALIDATION_ALLELE2],[MATCH_NORM_VALIDATION_ALLELE1],[MATCH_NORM_VALIDATION_ALLELE2],[VERIFICATION_STATUS],[SEQUENCING_PHASE],[SEQUENCE_SOURCE],[VALIDATION_METHOD],[SCORE],[BAM_FILE],[TUMOR_ALT_COUNT],[TUMOR_REF_COUNT],[NORMAL_ALT_COUNT],[NORMAL_REF_COUNT],[AMINO_ACID_CHANGE])select * from openquery(CBIOPORTALMYSQL,'select * from `mutation`')

PRINT('LOADING TABLE mutation_count')
insert into [mutation_count]  with (tablock)  ([GENETIC_PROFILE_ID],[SAMPLE_ID],[MUTATION_COUNT])select * from openquery(CBIOPORTALMYSQL,'select * from `mutation_count`')

PRINT('LOADING TABLE clinical_patient')
insert into [clinical_patient]  with (tablock)  ([INTERNAL_ID],[ATTR_ID],[ATTR_VALUE])select * from openquery(CBIOPORTALMYSQL,'select * from `clinical_patient`')

PRINT('LOADING TABLE clinical_sample')
insert into [clinical_sample]  with (tablock)  ([INTERNAL_ID],[ATTR_ID],[ATTR_VALUE])select * from openquery(CBIOPORTALMYSQL,'select * from `clinical_sample`')

PRINT('LOADING TABLE clinical_attribute_meta')
insert into [clinical_attribute_meta]  with (tablock)  ([ATTR_ID],[DISPLAY_NAME],[DESCRIPTION],[DATATYPE],[PATIENT_ATTRIBUTE],[PRIORITY],[CANCER_STUDY_ID])select * from openquery(CBIOPORTALMYSQL,'select * from `clinical_attribute_meta`')

PRINT('LOADING TABLE interaction')
insert into [interaction]  with (tablock)  ([GENE_A],[GENE_B],[INTERACTION_TYPE],[DATA_SOURCE],[EXPERIMENT_TYPES],[PMIDS])select * from openquery(CBIOPORTALMYSQL,'select * from `interaction`')

PRINT('LOADING TABLE mut_sig')
insert into [mut_sig]  with (tablock)  ([CANCER_STUDY_ID],[ENTREZ_GENE_ID],[RANK],[NumBasesCovered],[NumMutations],[P_VALUE],[Q_VALUE])select * from openquery(CBIOPORTALMYSQL,'select * from `mut_sig`')

PRINT('LOADING TABLE protein_array_info')
insert into [protein_array_info]  with (tablock)  ([PROTEIN_ARRAY_ID],[TYPE],[GENE_SYMBOL],[TARGET_RESIDUE])select * from openquery(CBIOPORTALMYSQL,'select * from `protein_array_info`')

PRINT('LOADING TABLE protein_array_target')
insert into [protein_array_target]  with (tablock)  ([PROTEIN_ARRAY_ID],[ENTREZ_GENE_ID])select * from openquery(CBIOPORTALMYSQL,'select * from `protein_array_target`')

PRINT('LOADING TABLE protein_array_data')
insert into [protein_array_data]  with (tablock)  ([PROTEIN_ARRAY_ID],[CANCER_STUDY_ID],[SAMPLE_ID],[ABUNDANCE])select * from openquery(CBIOPORTALMYSQL,'select * from `protein_array_data`')

PRINT('LOADING TABLE protein_array_cancer_study')
insert into [protein_array_cancer_study]  with (tablock)  ([PROTEIN_ARRAY_ID],[CANCER_STUDY_ID])select * from openquery(CBIOPORTALMYSQL,'select * from `protein_array_cancer_study`')

PRINT('LOADING TABLE sanger_cancer_census')
insert into [sanger_cancer_census]  with (tablock)  ([ENTREZ_GENE_ID],[CANCER_SOMATIC_MUT],[CANCER_GERMLINE_MUT],[TUMOR_TYPES_SOMATIC_MUT],[TUMOR_TYPES_GERMLINE_MUT],[CANCER_SYNDROME],[TISSUE_TYPE],[MUTATION_TYPE],[TRANSLOCATION_PARTNER],[OTHER_GERMLINE_MUT],[OTHER_DISEASE])select * from openquery(CBIOPORTALMYSQL,'select * from `sanger_cancer_census`')

PRINT('LOADING TABLE gistic')
SET IDENTITY_INSERT [gistic] ON
insert into [gistic]  with (tablock)  ([GISTIC_ROI_ID],[CANCER_STUDY_ID],[CHROMOSOME],[CYTOBAND],[WIDE_PEAK_START],[WIDE_PEAK_END],[Q_VALUE],[AMP])select * from openquery(CBIOPORTALMYSQL,'select * from `gistic`')
SET IDENTITY_INSERT [gistic] OFF

PRINT('LOADING TABLE gistic_to_gene')
insert into [gistic_to_gene]  with (tablock)  ([GISTIC_ROI_ID],[ENTREZ_GENE_ID])select * from openquery(CBIOPORTALMYSQL,'select * from `gistic_to_gene`')

PRINT('LOADING TABLE text_cache')
insert into [text_cache]  with (tablock)  ([HASH_KEY],[TEXT],[DATE_TIME_STAMP])select * from openquery(CBIOPORTALMYSQL,'select * from `text_cache`')

PRINT('LOADING TABLE pfam_graphics')
insert into [pfam_graphics]  with (tablock)  ([UNIPROT_ACC],[JSON_DATA])select * from openquery(CBIOPORTALMYSQL,'select * from `pfam_graphics`')

PRINT('LOADING TABLE drug')
insert into [drug]  with (tablock)  ([DRUG_ID],[DRUG_RESOURCE],[DRUG_NAME],[DRUG_SYNONYMS],[DRUG_DESCRIPTION],[DRUG_XREF],[DRUG_ATC_CODE],[DRUG_APPROVED],[DRUG_CANCERDRUG],[DRUG_NUTRACEUTICAL],[DRUG_NUMOFTRIALS])select * from openquery(CBIOPORTALMYSQL,'select * from `drug`')

PRINT('LOADING TABLE drug_interaction')
insert into [drug_interaction]  with (tablock)  ([DRUG],[TARGET],[INTERACTION_TYPE],[DATA_SOURCE],[EXPERIMENT_TYPES],[PMIDS])select * from openquery(CBIOPORTALMYSQL,'select * from `drug_interaction`')

PRINT('LOADING TABLE cna_event')
SET IDENTITY_INSERT [cna_event] ON
insert into [cna_event]  with (tablock)  ([CNA_EVENT_ID],[ENTREZ_GENE_ID],[ALTERATION])select * from openquery(CBIOPORTALMYSQL,'select * from `cna_event`')
SET IDENTITY_INSERT [cna_event] OFF

PRINT('LOADING TABLE sample_cna_event')
insert into [sample_cna_event]  with (tablock)  ([CNA_EVENT_ID],[SAMPLE_ID],[GENETIC_PROFILE_ID])select * from openquery(CBIOPORTALMYSQL,'select * from `sample_cna_event`')

PRINT('LOADING TABLE copy_number_seg')
SET IDENTITY_INSERT [copy_number_seg] ON
insert into [copy_number_seg]  with (tablock)  ([SEG_ID],[CANCER_STUDY_ID],[SAMPLE_ID],[CHR],[START],[END],[NUM_PROBES],[SEGMENT_MEAN])select * from openquery(CBIOPORTALMYSQL,'select * from `copy_number_seg`')
SET IDENTITY_INSERT [copy_number_seg] OFF

PRINT('LOADING TABLE copy_number_seg_file')
SET IDENTITY_INSERT [copy_number_seg_file] ON
insert into [copy_number_seg_file]  with (tablock)  ([SEG_FILE_ID],[CANCER_STUDY_ID],[REFERENCE_GENOME_ID],[DESCRIPTION],[FILENAME])select * from openquery(CBIOPORTALMYSQL,'select * from `copy_number_seg_file`')
SET IDENTITY_INSERT [copy_number_seg_file] OFF

PRINT('LOADING TABLE cosmic_mutation')
insert into [cosmic_mutation]  with (tablock)  ([COSMIC_MUTATION_ID],[CHR],[START_POSITION],[REFERENCE_ALLELE],[TUMOR_SEQ_ALLELE],[STRAND],[CODON_CHANGE],[ENTREZ_GENE_ID],[PROTEIN_CHANGE],[COUNT],[KEYWORD])select * from openquery(CBIOPORTALMYSQL,'select * from `cosmic_mutation`')

PRINT('LOADING TABLE pdb_uniprot_alignment')
insert into [pdb_uniprot_alignment]  with (tablock)  ([ALIGNMENT_ID],[PDB_ID],[CHAIN],[UNIPROT_ID],[PDB_FROM],[PDB_TO],[UNIPROT_FROM],[UNIPROT_TO],[EVALUE],[IDENTITY],[IDENTP],[UNIPROT_ALIGN],[PDB_ALIGN],[MIDLINE_ALIGN])select * from openquery(CBIOPORTALMYSQL,'select * from `pdb_uniprot_alignment`')

PRINT('LOADING TABLE pdb_uniprot_residue_mapping')
insert into [pdb_uniprot_residue_mapping]  with (tablock)  ([ALIGNMENT_ID],[PDB_POSITION],[PDB_INSERTION_CODE],[UNIPROT_POSITION],[MATCH])select * from openquery(CBIOPORTALMYSQL,'select * from `pdb_uniprot_residue_mapping`')

PRINT('LOADING TABLE clinical_event')
SET IDENTITY_INSERT [clinical_event] ON
insert into [clinical_event]  with (tablock)  ([CLINICAL_EVENT_ID],[PATIENT_ID],[START_DATE],[STOP_DATE],[EVENT_TYPE])select * from openquery(CBIOPORTALMYSQL,'select * from `clinical_event`')
SET IDENTITY_INSERT [clinical_event] OFF

PRINT('LOADING TABLE clinical_event_data')
insert into [clinical_event_data]  with (tablock)  ([CLINICAL_EVENT_ID],[KEY],[VALUE])select * from openquery(CBIOPORTALMYSQL,'select * from `clinical_event_data`')

PRINT('LOADING TABLE info')
insert into [info]  with (tablock)  ([DB_SCHEMA_VERSION])select * from openquery(CBIOPORTALMYSQL,'select * from `info`')



GO

