set nocount on; begin try
 exec('select top 10 * from [authorities]')
 end try
 begin catch
 print 'Error in external table [authorities]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [cancer_study]')
 end try
 begin catch
 print 'Error in external table [cancer_study]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [cancer_study_tags]')
 end try
 begin catch
 print 'Error in external table [cancer_study_tags]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [clinical_attribute_meta]')
 end try
 begin catch
 print 'Error in external table [clinical_attribute_meta]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [clinical_event]')
 end try
 begin catch
 print 'Error in external table [clinical_event]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [clinical_event_data]')
 end try
 begin catch
 print 'Error in external table [clinical_event_data]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [clinical_patient]')
 end try
 begin catch
 print 'Error in external table [clinical_patient]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [clinical_sample]')
 end try
 begin catch
 print 'Error in external table [clinical_sample]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [cna_event]')
 end try
 begin catch
 print 'Error in external table [cna_event]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [copy_number_seg]')
 end try
 begin catch
 print 'Error in external table [copy_number_seg]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [copy_number_seg_file]')
 end try
 begin catch
 print 'Error in external table [copy_number_seg_file]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [cosmic_mutation]')
 end try
 begin catch
 print 'Error in external table [cosmic_mutation]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [data_access_tokens]')
 end try
 begin catch
 print 'Error in external table [data_access_tokens]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [drug]')
 end try
 begin catch
 print 'Error in external table [drug]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [drug_interaction]')
 end try
 begin catch
 print 'Error in external table [drug_interaction]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [fraction_genome_altered]')
 end try
 begin catch
 print 'Error in external table [fraction_genome_altered]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [gene]')
 end try
 begin catch
 print 'Error in external table [gene]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [gene_alias]')
 end try
 begin catch
 print 'Error in external table [gene_alias]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [gene_panel]')
 end try
 begin catch
 print 'Error in external table [gene_panel]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [gene_panel_list]')
 end try
 begin catch
 print 'Error in external table [gene_panel_list]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [geneset]')
 end try
 begin catch
 print 'Error in external table [geneset]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [geneset_gene]')
 end try
 begin catch
 print 'Error in external table [geneset_gene]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [geneset_hierarchy_leaf]')
 end try
 begin catch
 print 'Error in external table [geneset_hierarchy_leaf]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [geneset_hierarchy_node]')
 end try
 begin catch
 print 'Error in external table [geneset_hierarchy_node]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [genetic_alteration]')
 end try
 begin catch
 print 'Error in external table [genetic_alteration]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [genetic_entity]')
 end try
 begin catch
 print 'Error in external table [genetic_entity]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [genetic_profile]')
 end try
 begin catch
 print 'Error in external table [genetic_profile]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [genetic_profile_link]')
 end try
 begin catch
 print 'Error in external table [genetic_profile_link]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [genetic_profile_samples]')
 end try
 begin catch
 print 'Error in external table [genetic_profile_samples]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [gistic]')
 end try
 begin catch
 print 'Error in external table [gistic]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [gistic_to_gene]')
 end try
 begin catch
 print 'Error in external table [gistic_to_gene]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [info]')
 end try
 begin catch
 print 'Error in external table [info]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [interaction]')
 end try
 begin catch
 print 'Error in external table [interaction]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [mut_sig]')
 end try
 begin catch
 print 'Error in external table [mut_sig]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [mutation]')
 end try
 begin catch
 print 'Error in external table [mutation]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [mutation_count]')
 end try
 begin catch
 print 'Error in external table [mutation_count]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [mutation_count_by_keyword]')
 end try
 begin catch
 print 'Error in external table [mutation_count_by_keyword]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [mutation_event]')
 end try
 begin catch
 print 'Error in external table [mutation_event]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [patient]')
 end try
 begin catch
 print 'Error in external table [patient]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [pdb_uniprot_alignment]')
 end try
 begin catch
 print 'Error in external table [pdb_uniprot_alignment]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [pdb_uniprot_residue_mapping]')
 end try
 begin catch
 print 'Error in external table [pdb_uniprot_residue_mapping]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [pfam_graphics]')
 end try
 begin catch
 print 'Error in external table [pfam_graphics]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [protein_array_cancer_study]')
 end try
 begin catch
 print 'Error in external table [protein_array_cancer_study]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [protein_array_data]')
 end try
 begin catch
 print 'Error in external table [protein_array_data]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [protein_array_info]')
 end try
 begin catch
 print 'Error in external table [protein_array_info]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [protein_array_target]')
 end try
 begin catch
 print 'Error in external table [protein_array_target]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [reference_genome]')
 end try
 begin catch
 print 'Error in external table [reference_genome]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [reference_genome_gene]')
 end try
 begin catch
 print 'Error in external table [reference_genome_gene]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [sample]')
 end try
 begin catch
 print 'Error in external table [sample]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [sample_cna_event]')
 end try
 begin catch
 print 'Error in external table [sample_cna_event]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [sample_list]')
 end try
 begin catch
 print 'Error in external table [sample_list]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [sample_list_list]')
 end try
 begin catch
 print 'Error in external table [sample_list_list]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [sample_profile]')
 end try
 begin catch
 print 'Error in external table [sample_profile]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [sanger_cancer_census]')
 end try
 begin catch
 print 'Error in external table [sanger_cancer_census]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [structural_variant]')
 end try
 begin catch
 print 'Error in external table [structural_variant]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [text_cache]')
 end try
 begin catch
 print 'Error in external table [text_cache]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [type_of_cancer]')
 end try
 begin catch
 print 'Error in external table [type_of_cancer]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [uniprot_id_mapping]')
 end try
 begin catch
 print 'Error in external table [uniprot_id_mapping]: '+ error_message();
end catch

set nocount on; begin try
 exec('select top 10 * from [users]')
 end try
 begin catch
 print 'Error in external table [users]: '+ error_message();
end catch

