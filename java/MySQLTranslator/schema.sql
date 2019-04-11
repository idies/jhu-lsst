-- MySQL dump 10.14  Distrib 5.5.60-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: cbioportal
-- ------------------------------------------------------
-- Server version	5.5.60-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `authorities`
--

DROP TABLE IF EXISTS `authorities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authorities` (
  `EMAIL` varchar(128) NOT NULL,
  `AUTHORITY` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cancer_study`
--

DROP TABLE IF EXISTS `cancer_study`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cancer_study` (
  `CANCER_STUDY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CANCER_STUDY_IDENTIFIER` varchar(255) DEFAULT NULL,
  `TYPE_OF_CANCER_ID` varchar(63) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `SHORT_NAME` varchar(64) NOT NULL,
  `DESCRIPTION` varchar(1024) NOT NULL,
  `PUBLIC` tinyint(1) NOT NULL,
  `PMID` varchar(1024) DEFAULT NULL,
  `CITATION` varchar(200) DEFAULT NULL,
  `GROUPS` varchar(200) DEFAULT NULL,
  `STATUS` int(1) DEFAULT NULL,
  `IMPORT_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`CANCER_STUDY_ID`),
  UNIQUE KEY `CANCER_STUDY_IDENTIFIER` (`CANCER_STUDY_IDENTIFIER`),
  KEY `TYPE_OF_CANCER_ID` (`TYPE_OF_CANCER_ID`),
  CONSTRAINT `cancer_study_ibfk_1` FOREIGN KEY (`TYPE_OF_CANCER_ID`) REFERENCES `type_of_cancer` (`TYPE_OF_CANCER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1478 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cancer_study_tags`
--

DROP TABLE IF EXISTS `cancer_study_tags`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cancer_study_tags` (
  `CANCER_STUDY_ID` int(11) NOT NULL,
  `TAGS` text NOT NULL,
  PRIMARY KEY (`CANCER_STUDY_ID`),
  CONSTRAINT `cancer_study_tags_ibfk_1` FOREIGN KEY (`CANCER_STUDY_ID`) REFERENCES `cancer_study` (`CANCER_STUDY_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `clinical_attribute_meta`
--

DROP TABLE IF EXISTS `clinical_attribute_meta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clinical_attribute_meta` (
  `ATTR_ID` varchar(255) NOT NULL,
  `DISPLAY_NAME` varchar(255) NOT NULL,
  `DESCRIPTION` varchar(2048) NOT NULL,
  `DATATYPE` varchar(255) NOT NULL COMMENT 'NUMBER, BOOLEAN, or STRING',
  `PATIENT_ATTRIBUTE` tinyint(1) NOT NULL,
  `PRIORITY` varchar(255) NOT NULL,
  `CANCER_STUDY_ID` int(11) NOT NULL,
  PRIMARY KEY (`ATTR_ID`,`CANCER_STUDY_ID`),
  KEY `CANCER_STUDY_ID` (`CANCER_STUDY_ID`),
  CONSTRAINT `clinical_attribute_meta_ibfk_1` FOREIGN KEY (`CANCER_STUDY_ID`) REFERENCES `cancer_study` (`CANCER_STUDY_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `clinical_event`
--

DROP TABLE IF EXISTS `clinical_event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clinical_event` (
  `CLINICAL_EVENT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PATIENT_ID` int(11) NOT NULL,
  `START_DATE` int(11) NOT NULL,
  `STOP_DATE` int(11) DEFAULT NULL,
  `EVENT_TYPE` varchar(20) NOT NULL,
  PRIMARY KEY (`CLINICAL_EVENT_ID`),
  KEY `PATIENT_ID` (`PATIENT_ID`,`EVENT_TYPE`),
  CONSTRAINT `clinical_event_ibfk_1` FOREIGN KEY (`PATIENT_ID`) REFERENCES `patient` (`INTERNAL_ID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5766 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `clinical_event_data`
--

DROP TABLE IF EXISTS `clinical_event_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clinical_event_data` (
  `CLINICAL_EVENT_ID` int(255) NOT NULL,
  `KEY` varchar(255) NOT NULL,
  `VALUE` varchar(5000) NOT NULL,
  KEY `CLINICAL_EVENT_ID` (`CLINICAL_EVENT_ID`),
  CONSTRAINT `clinical_event_data_ibfk_1` FOREIGN KEY (`CLINICAL_EVENT_ID`) REFERENCES `clinical_event` (`CLINICAL_EVENT_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `clinical_patient`
--

DROP TABLE IF EXISTS `clinical_patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clinical_patient` (
  `INTERNAL_ID` int(11) NOT NULL,
  `ATTR_ID` varchar(255) NOT NULL,
  `ATTR_VALUE` varchar(255) NOT NULL,
  PRIMARY KEY (`INTERNAL_ID`,`ATTR_ID`),
  CONSTRAINT `clinical_patient_ibfk_1` FOREIGN KEY (`INTERNAL_ID`) REFERENCES `patient` (`INTERNAL_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `clinical_sample`
--

DROP TABLE IF EXISTS `clinical_sample`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clinical_sample` (
  `INTERNAL_ID` int(11) NOT NULL,
  `ATTR_ID` varchar(255) NOT NULL,
  `ATTR_VALUE` varchar(255) NOT NULL,
  PRIMARY KEY (`INTERNAL_ID`,`ATTR_ID`),
  CONSTRAINT `clinical_sample_ibfk_1` FOREIGN KEY (`INTERNAL_ID`) REFERENCES `sample` (`INTERNAL_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cna_event`
--

DROP TABLE IF EXISTS `cna_event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cna_event` (
  `CNA_EVENT_ID` int(255) NOT NULL AUTO_INCREMENT,
  `ENTREZ_GENE_ID` int(11) NOT NULL,
  `ALTERATION` tinyint(4) NOT NULL,
  PRIMARY KEY (`CNA_EVENT_ID`),
  UNIQUE KEY `ENTREZ_GENE_ID` (`ENTREZ_GENE_ID`,`ALTERATION`),
  CONSTRAINT `cna_event_ibfk_1` FOREIGN KEY (`ENTREZ_GENE_ID`) REFERENCES `gene` (`ENTREZ_GENE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=74374 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `copy_number_seg`
--

DROP TABLE IF EXISTS `copy_number_seg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `copy_number_seg` (
  `SEG_ID` int(255) NOT NULL AUTO_INCREMENT,
  `CANCER_STUDY_ID` int(11) NOT NULL,
  `SAMPLE_ID` int(11) NOT NULL,
  `CHR` varchar(5) NOT NULL,
  `START` int(11) NOT NULL,
  `END` int(11) NOT NULL,
  `NUM_PROBES` int(11) NOT NULL,
  `SEGMENT_MEAN` double NOT NULL,
  PRIMARY KEY (`SEG_ID`),
  KEY `CANCER_STUDY_ID` (`CANCER_STUDY_ID`,`SAMPLE_ID`),
  KEY `SAMPLE_ID` (`SAMPLE_ID`),
  CONSTRAINT `copy_number_seg_ibfk_1` FOREIGN KEY (`SAMPLE_ID`) REFERENCES `sample` (`INTERNAL_ID`) ON DELETE CASCADE,
  CONSTRAINT `copy_number_seg_ibfk_2` FOREIGN KEY (`CANCER_STUDY_ID`) REFERENCES `cancer_study` (`CANCER_STUDY_ID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=61790556 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `copy_number_seg_file`
--

DROP TABLE IF EXISTS `copy_number_seg_file`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `copy_number_seg_file` (
  `SEG_FILE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CANCER_STUDY_ID` int(11) NOT NULL,
  `REFERENCE_GENOME_ID` varchar(10) NOT NULL,
  `DESCRIPTION` varchar(255) NOT NULL,
  `FILENAME` varchar(255) NOT NULL,
  PRIMARY KEY (`SEG_FILE_ID`),
  KEY `CANCER_STUDY_ID` (`CANCER_STUDY_ID`),
  CONSTRAINT `copy_number_seg_file_ibfk_1` FOREIGN KEY (`CANCER_STUDY_ID`) REFERENCES `cancer_study` (`CANCER_STUDY_ID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=843 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cosmic_mutation`
--

DROP TABLE IF EXISTS `cosmic_mutation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cosmic_mutation` (
  `COSMIC_MUTATION_ID` varchar(30) NOT NULL,
  `CHR` varchar(5) DEFAULT NULL,
  `START_POSITION` bigint(20) DEFAULT NULL,
  `REFERENCE_ALLELE` varchar(255) DEFAULT NULL,
  `TUMOR_SEQ_ALLELE` varchar(255) DEFAULT NULL,
  `STRAND` varchar(2) DEFAULT NULL,
  `CODON_CHANGE` varchar(255) DEFAULT NULL,
  `ENTREZ_GENE_ID` int(11) NOT NULL,
  `PROTEIN_CHANGE` varchar(255) NOT NULL,
  `COUNT` int(11) NOT NULL,
  `KEYWORD` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`COSMIC_MUTATION_ID`),
  KEY `KEYWORD` (`KEYWORD`),
  KEY `ENTREZ_GENE_ID` (`ENTREZ_GENE_ID`),
  CONSTRAINT `cosmic_mutation_ibfk_1` FOREIGN KEY (`ENTREZ_GENE_ID`) REFERENCES `gene` (`ENTREZ_GENE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `data_access_tokens`
--

DROP TABLE IF EXISTS `data_access_tokens`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `data_access_tokens` (
  `TOKEN` varchar(50) NOT NULL,
  `USERNAME` varchar(255) NOT NULL,
  `EXPIRATION` datetime NOT NULL,
  `CREATION` datetime NOT NULL,
  PRIMARY KEY (`TOKEN`),
  KEY `USERNAME` (`USERNAME`),
  CONSTRAINT `data_access_tokens_ibfk_1` FOREIGN KEY (`USERNAME`) REFERENCES `users` (`EMAIL`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `drug`
--

DROP TABLE IF EXISTS `drug`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `drug` (
  `DRUG_ID` char(30) NOT NULL,
  `DRUG_RESOURCE` varchar(255) NOT NULL,
  `DRUG_NAME` varchar(255) NOT NULL,
  `DRUG_SYNONYMS` varchar(4096) DEFAULT NULL,
  `DRUG_DESCRIPTION` varchar(4096) DEFAULT NULL,
  `DRUG_XREF` varchar(4096) DEFAULT NULL,
  `DRUG_ATC_CODE` varchar(1024) DEFAULT NULL,
  `DRUG_APPROVED` int(1) DEFAULT '0',
  `DRUG_CANCERDRUG` int(1) DEFAULT '0',
  `DRUG_NUTRACEUTICAL` int(1) DEFAULT '0',
  `DRUG_NUMOFTRIALS` int(11) DEFAULT '-1',
  PRIMARY KEY (`DRUG_ID`),
  KEY `DRUG_NAME` (`DRUG_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `drug_interaction`
--

DROP TABLE IF EXISTS `drug_interaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `drug_interaction` (
  `DRUG` char(30) NOT NULL,
  `TARGET` bigint(20) NOT NULL,
  `INTERACTION_TYPE` char(50) NOT NULL,
  `DATA_SOURCE` varchar(256) NOT NULL,
  `EXPERIMENT_TYPES` varchar(1024) DEFAULT NULL,
  `PMIDS` varchar(1024) DEFAULT NULL,
  KEY `DRUG` (`DRUG`),
  CONSTRAINT `drug_interaction_ibfk_1` FOREIGN KEY (`DRUG`) REFERENCES `drug` (`DRUG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `fraction_genome_altered`
--

DROP TABLE IF EXISTS `fraction_genome_altered`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fraction_genome_altered` (
  `CANCER_STUDY_ID` int(11) NOT NULL,
  `SAMPLE_ID` int(11) NOT NULL,
  `VALUE` double NOT NULL,
  PRIMARY KEY (`CANCER_STUDY_ID`,`SAMPLE_ID`),
  KEY `SAMPLE_ID` (`SAMPLE_ID`),
  CONSTRAINT `fraction_genome_altered_ibfk_1` FOREIGN KEY (`CANCER_STUDY_ID`) REFERENCES `cancer_study` (`CANCER_STUDY_ID`) ON DELETE CASCADE,
  CONSTRAINT `fraction_genome_altered_ibfk_2` FOREIGN KEY (`SAMPLE_ID`) REFERENCES `sample` (`INTERNAL_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `gene`
--

DROP TABLE IF EXISTS `gene`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gene` (
  `ENTREZ_GENE_ID` int(11) NOT NULL,
  `HUGO_GENE_SYMBOL` varchar(255) NOT NULL,
  `GENETIC_ENTITY_ID` int(11) NOT NULL,
  `TYPE` varchar(50) DEFAULT NULL,
  `CYTOBAND` varchar(50) DEFAULT NULL,
  `LENGTH` int(11) DEFAULT NULL,
  PRIMARY KEY (`ENTREZ_GENE_ID`),
  UNIQUE KEY `GENETIC_ENTITY_ID_UNIQUE` (`GENETIC_ENTITY_ID`),
  KEY `HUGO_GENE_SYMBOL` (`HUGO_GENE_SYMBOL`),
  CONSTRAINT `gene_ibfk_1` FOREIGN KEY (`GENETIC_ENTITY_ID`) REFERENCES `genetic_entity` (`ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `gene_alias`
--

DROP TABLE IF EXISTS `gene_alias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gene_alias` (
  `ENTREZ_GENE_ID` int(11) NOT NULL,
  `GENE_ALIAS` varchar(255) NOT NULL,
  PRIMARY KEY (`ENTREZ_GENE_ID`,`GENE_ALIAS`),
  CONSTRAINT `gene_alias_ibfk_1` FOREIGN KEY (`ENTREZ_GENE_ID`) REFERENCES `gene` (`ENTREZ_GENE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `gene_panel`
--

DROP TABLE IF EXISTS `gene_panel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gene_panel` (
  `INTERNAL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `STABLE_ID` varchar(255) NOT NULL,
  `DESCRIPTION` mediumtext,
  PRIMARY KEY (`INTERNAL_ID`),
  UNIQUE KEY `STABLE_ID` (`STABLE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `gene_panel_list`
--

DROP TABLE IF EXISTS `gene_panel_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gene_panel_list` (
  `INTERNAL_ID` int(11) NOT NULL,
  `GENE_ID` int(11) NOT NULL,
  PRIMARY KEY (`INTERNAL_ID`,`GENE_ID`),
  KEY `GENE_ID` (`GENE_ID`),
  CONSTRAINT `gene_panel_list_ibfk_1` FOREIGN KEY (`INTERNAL_ID`) REFERENCES `gene_panel` (`INTERNAL_ID`) ON DELETE CASCADE,
  CONSTRAINT `gene_panel_list_ibfk_2` FOREIGN KEY (`GENE_ID`) REFERENCES `gene` (`ENTREZ_GENE_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `geneset`
--

DROP TABLE IF EXISTS `geneset`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `geneset` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `GENETIC_ENTITY_ID` int(11) NOT NULL,
  `EXTERNAL_ID` varchar(200) NOT NULL,
  `NAME` varchar(200) NOT NULL,
  `DESCRIPTION` varchar(300) NOT NULL,
  `REF_LINK` text,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `NAME_UNIQUE` (`NAME`),
  UNIQUE KEY `EXTERNAL_ID_COLL_UNIQUE` (`EXTERNAL_ID`),
  UNIQUE KEY `GENESET_GENETIC_ENTITY_ID_UNIQUE` (`GENETIC_ENTITY_ID`),
  CONSTRAINT `geneset_ibfk_1` FOREIGN KEY (`GENETIC_ENTITY_ID`) REFERENCES `genetic_entity` (`ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `geneset_gene`
--

DROP TABLE IF EXISTS `geneset_gene`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `geneset_gene` (
  `GENESET_ID` int(11) NOT NULL,
  `ENTREZ_GENE_ID` int(11) NOT NULL,
  PRIMARY KEY (`GENESET_ID`,`ENTREZ_GENE_ID`),
  KEY `ENTREZ_GENE_ID` (`ENTREZ_GENE_ID`),
  CONSTRAINT `geneset_gene_ibfk_1` FOREIGN KEY (`ENTREZ_GENE_ID`) REFERENCES `gene` (`ENTREZ_GENE_ID`) ON DELETE CASCADE,
  CONSTRAINT `geneset_gene_ibfk_2` FOREIGN KEY (`GENESET_ID`) REFERENCES `geneset` (`ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `geneset_hierarchy_leaf`
--

DROP TABLE IF EXISTS `geneset_hierarchy_leaf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `geneset_hierarchy_leaf` (
  `NODE_ID` bigint(20) NOT NULL,
  `GENESET_ID` int(11) NOT NULL,
  PRIMARY KEY (`NODE_ID`,`GENESET_ID`),
  KEY `GENESET_ID` (`GENESET_ID`),
  CONSTRAINT `geneset_hierarchy_leaf_ibfk_1` FOREIGN KEY (`NODE_ID`) REFERENCES `geneset_hierarchy_node` (`NODE_ID`) ON DELETE CASCADE,
  CONSTRAINT `geneset_hierarchy_leaf_ibfk_2` FOREIGN KEY (`GENESET_ID`) REFERENCES `geneset` (`ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `geneset_hierarchy_node`
--

DROP TABLE IF EXISTS `geneset_hierarchy_node`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `geneset_hierarchy_node` (
  `NODE_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `NODE_NAME` varchar(200) NOT NULL,
  `PARENT_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`NODE_ID`),
  UNIQUE KEY `NODE_NAME_UNIQUE` (`NODE_NAME`,`PARENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `genetic_alteration`
--

DROP TABLE IF EXISTS `genetic_alteration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genetic_alteration` (
  `GENETIC_PROFILE_ID` int(11) NOT NULL,
  `GENETIC_ENTITY_ID` int(11) NOT NULL,
  `VALUES` longtext NOT NULL,
  PRIMARY KEY (`GENETIC_PROFILE_ID`,`GENETIC_ENTITY_ID`),
  KEY `genetic_alteration_fk_2` (`GENETIC_ENTITY_ID`),
  CONSTRAINT `genetic_alteration_fk_1` FOREIGN KEY (`GENETIC_PROFILE_ID`) REFERENCES `genetic_profile` (`GENETIC_PROFILE_ID`) ON DELETE CASCADE,
  CONSTRAINT `genetic_alteration_fk_2` FOREIGN KEY (`GENETIC_ENTITY_ID`) REFERENCES `genetic_entity` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `genetic_entity`
--

DROP TABLE IF EXISTS `genetic_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genetic_entity` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ENTITY_TYPE` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=147751 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `genetic_profile`
--

DROP TABLE IF EXISTS `genetic_profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genetic_profile` (
  `GENETIC_PROFILE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `STABLE_ID` varchar(255) NOT NULL,
  `CANCER_STUDY_ID` int(11) NOT NULL,
  `GENETIC_ALTERATION_TYPE` varchar(255) NOT NULL,
  `DATATYPE` varchar(255) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `DESCRIPTION` mediumtext,
  `SHOW_PROFILE_IN_ANALYSIS_TAB` tinyint(1) NOT NULL,
  PRIMARY KEY (`GENETIC_PROFILE_ID`),
  UNIQUE KEY `STABLE_ID` (`STABLE_ID`),
  KEY `CANCER_STUDY_ID` (`CANCER_STUDY_ID`),
  CONSTRAINT `genetic_profile_ibfk_1` FOREIGN KEY (`CANCER_STUDY_ID`) REFERENCES `cancer_study` (`CANCER_STUDY_ID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7206 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `genetic_profile_link`
--

DROP TABLE IF EXISTS `genetic_profile_link`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genetic_profile_link` (
  `REFERRING_GENETIC_PROFILE_ID` int(11) NOT NULL,
  `REFERRED_GENETIC_PROFILE_ID` int(11) NOT NULL,
  `REFERENCE_TYPE` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`REFERRING_GENETIC_PROFILE_ID`,`REFERRED_GENETIC_PROFILE_ID`),
  KEY `REFERRED_GENETIC_PROFILE_ID` (`REFERRED_GENETIC_PROFILE_ID`),
  CONSTRAINT `genetic_profile_link_ibfk_1` FOREIGN KEY (`REFERRING_GENETIC_PROFILE_ID`) REFERENCES `genetic_profile` (`GENETIC_PROFILE_ID`) ON DELETE CASCADE,
  CONSTRAINT `genetic_profile_link_ibfk_2` FOREIGN KEY (`REFERRED_GENETIC_PROFILE_ID`) REFERENCES `genetic_profile` (`GENETIC_PROFILE_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `genetic_profile_samples`
--

DROP TABLE IF EXISTS `genetic_profile_samples`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genetic_profile_samples` (
  `GENETIC_PROFILE_ID` int(11) NOT NULL,
  `ORDERED_SAMPLE_LIST` longtext NOT NULL,
  UNIQUE KEY `GENETIC_PROFILE_ID` (`GENETIC_PROFILE_ID`),
  CONSTRAINT `genetic_profile_samples_ibfk_1` FOREIGN KEY (`GENETIC_PROFILE_ID`) REFERENCES `genetic_profile` (`GENETIC_PROFILE_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `gistic`
--

DROP TABLE IF EXISTS `gistic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gistic` (
  `GISTIC_ROI_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CANCER_STUDY_ID` int(11) NOT NULL,
  `CHROMOSOME` int(11) NOT NULL,
  `CYTOBAND` varchar(255) NOT NULL,
  `WIDE_PEAK_START` int(11) NOT NULL,
  `WIDE_PEAK_END` int(11) NOT NULL,
  `Q_VALUE` double NOT NULL,
  `AMP` tinyint(1) NOT NULL,
  PRIMARY KEY (`GISTIC_ROI_ID`),
  KEY `CANCER_STUDY_ID` (`CANCER_STUDY_ID`),
  CONSTRAINT `gistic_ibfk_1` FOREIGN KEY (`CANCER_STUDY_ID`) REFERENCES `cancer_study` (`CANCER_STUDY_ID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=23762 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `gistic_to_gene`
--

DROP TABLE IF EXISTS `gistic_to_gene`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gistic_to_gene` (
  `GISTIC_ROI_ID` bigint(20) NOT NULL,
  `ENTREZ_GENE_ID` int(11) NOT NULL,
  PRIMARY KEY (`GISTIC_ROI_ID`,`ENTREZ_GENE_ID`),
  KEY `ENTREZ_GENE_ID` (`ENTREZ_GENE_ID`),
  CONSTRAINT `gistic_to_gene_ibfk_1` FOREIGN KEY (`ENTREZ_GENE_ID`) REFERENCES `gene` (`ENTREZ_GENE_ID`),
  CONSTRAINT `gistic_to_gene_ibfk_2` FOREIGN KEY (`GISTIC_ROI_ID`) REFERENCES `gistic` (`GISTIC_ROI_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `info`
--

DROP TABLE IF EXISTS `info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `info` (
  `DB_SCHEMA_VERSION` varchar(24) DEFAULT NULL,
  `GENESET_VERSION` varchar(24) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `interaction`
--

DROP TABLE IF EXISTS `interaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `interaction` (
  `GENE_A` bigint(20) NOT NULL,
  `GENE_B` bigint(20) NOT NULL,
  `INTERACTION_TYPE` varchar(256) NOT NULL,
  `DATA_SOURCE` varchar(256) NOT NULL,
  `EXPERIMENT_TYPES` varchar(1024) NOT NULL,
  `PMIDS` varchar(1024) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `mut_sig`
--

DROP TABLE IF EXISTS `mut_sig`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mut_sig` (
  `CANCER_STUDY_ID` int(11) NOT NULL,
  `ENTREZ_GENE_ID` int(11) NOT NULL,
  `RANK` int(11) NOT NULL,
  `NumBasesCovered` int(11) NOT NULL,
  `NumMutations` int(11) NOT NULL,
  `P_VALUE` float NOT NULL,
  `Q_VALUE` float NOT NULL,
  PRIMARY KEY (`CANCER_STUDY_ID`,`ENTREZ_GENE_ID`),
  KEY `ENTREZ_GENE_ID` (`ENTREZ_GENE_ID`),
  CONSTRAINT `mut_sig_ibfk_1` FOREIGN KEY (`CANCER_STUDY_ID`) REFERENCES `cancer_study` (`CANCER_STUDY_ID`) ON DELETE CASCADE,
  CONSTRAINT `mut_sig_ibfk_2` FOREIGN KEY (`ENTREZ_GENE_ID`) REFERENCES `gene` (`ENTREZ_GENE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `mutation`
--

DROP TABLE IF EXISTS `mutation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mutation` (
  `MUTATION_EVENT_ID` int(255) NOT NULL,
  `GENETIC_PROFILE_ID` int(11) NOT NULL,
  `SAMPLE_ID` int(11) NOT NULL,
  `ENTREZ_GENE_ID` int(11) NOT NULL,
  `CENTER` varchar(100) DEFAULT NULL,
  `SEQUENCER` varchar(255) DEFAULT NULL,
  `MUTATION_STATUS` varchar(25) DEFAULT NULL COMMENT 'Germline, Somatic or LOH.',
  `VALIDATION_STATUS` varchar(25) DEFAULT NULL,
  `TUMOR_SEQ_ALLELE1` varchar(255) DEFAULT NULL,
  `TUMOR_SEQ_ALLELE2` varchar(255) DEFAULT NULL,
  `MATCHED_NORM_SAMPLE_BARCODE` varchar(255) DEFAULT NULL,
  `MATCH_NORM_SEQ_ALLELE1` varchar(255) DEFAULT NULL,
  `MATCH_NORM_SEQ_ALLELE2` varchar(255) DEFAULT NULL,
  `TUMOR_VALIDATION_ALLELE1` varchar(255) DEFAULT NULL,
  `TUMOR_VALIDATION_ALLELE2` varchar(255) DEFAULT NULL,
  `MATCH_NORM_VALIDATION_ALLELE1` varchar(255) DEFAULT NULL,
  `MATCH_NORM_VALIDATION_ALLELE2` varchar(255) DEFAULT NULL,
  `VERIFICATION_STATUS` varchar(10) DEFAULT NULL,
  `SEQUENCING_PHASE` varchar(100) DEFAULT NULL,
  `SEQUENCE_SOURCE` varchar(255) NOT NULL,
  `VALIDATION_METHOD` varchar(255) DEFAULT NULL,
  `SCORE` varchar(100) DEFAULT NULL,
  `BAM_FILE` varchar(255) DEFAULT NULL,
  `TUMOR_ALT_COUNT` int(11) DEFAULT NULL,
  `TUMOR_REF_COUNT` int(11) DEFAULT NULL,
  `NORMAL_ALT_COUNT` int(11) DEFAULT NULL,
  `NORMAL_REF_COUNT` int(11) DEFAULT NULL,
  `AMINO_ACID_CHANGE` varchar(255) DEFAULT NULL,
  `DRIVER_FILTER` varchar(20) DEFAULT NULL,
  `DRIVER_FILTER_ANNOTATION` varchar(80) DEFAULT NULL,
  `DRIVER_TIERS_FILTER` varchar(50) DEFAULT NULL,
  `DRIVER_TIERS_FILTER_ANNOTATION` varchar(80) DEFAULT NULL,
  UNIQUE KEY `UQ_MUTATION_EVENT_ID_GENETIC_PROFILE_ID_SAMPLE_ID` (`MUTATION_EVENT_ID`,`GENETIC_PROFILE_ID`,`SAMPLE_ID`),
  KEY `GENETIC_PROFILE_ID` (`GENETIC_PROFILE_ID`,`ENTREZ_GENE_ID`),
  KEY `GENETIC_PROFILE_ID_2` (`GENETIC_PROFILE_ID`,`SAMPLE_ID`),
  KEY `GENETIC_PROFILE_ID_3` (`GENETIC_PROFILE_ID`),
  KEY `ENTREZ_GENE_ID` (`ENTREZ_GENE_ID`),
  KEY `SAMPLE_ID` (`SAMPLE_ID`),
  KEY `MUTATION_EVENT_ID` (`MUTATION_EVENT_ID`),
  CONSTRAINT `mutation_ibfk_1` FOREIGN KEY (`ENTREZ_GENE_ID`) REFERENCES `gene` (`ENTREZ_GENE_ID`),
  CONSTRAINT `mutation_ibfk_2` FOREIGN KEY (`GENETIC_PROFILE_ID`) REFERENCES `genetic_profile` (`GENETIC_PROFILE_ID`) ON DELETE CASCADE,
  CONSTRAINT `mutation_ibfk_3` FOREIGN KEY (`SAMPLE_ID`) REFERENCES `sample` (`INTERNAL_ID`) ON DELETE CASCADE,
  CONSTRAINT `mutation_ibfk_4` FOREIGN KEY (`MUTATION_EVENT_ID`) REFERENCES `mutation_event` (`MUTATION_EVENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Mutation Data Details';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `mutation_count`
--

DROP TABLE IF EXISTS `mutation_count`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mutation_count` (
  `GENETIC_PROFILE_ID` int(11) NOT NULL,
  `SAMPLE_ID` int(11) NOT NULL,
  `MUTATION_COUNT` int(11) NOT NULL,
  KEY `GENETIC_PROFILE_ID` (`GENETIC_PROFILE_ID`,`SAMPLE_ID`),
  KEY `SAMPLE_ID` (`SAMPLE_ID`),
  CONSTRAINT `mutation_count_ibfk_1` FOREIGN KEY (`GENETIC_PROFILE_ID`) REFERENCES `genetic_profile` (`GENETIC_PROFILE_ID`) ON DELETE CASCADE,
  CONSTRAINT `mutation_count_ibfk_2` FOREIGN KEY (`SAMPLE_ID`) REFERENCES `sample` (`INTERNAL_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `mutation_count_by_keyword`
--

DROP TABLE IF EXISTS `mutation_count_by_keyword`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mutation_count_by_keyword` (
  `GENETIC_PROFILE_ID` int(11) NOT NULL,
  `KEYWORD` varchar(255) DEFAULT NULL,
  `ENTREZ_GENE_ID` int(11) NOT NULL,
  `KEYWORD_COUNT` int(11) NOT NULL,
  `GENE_COUNT` int(11) NOT NULL,
  KEY `GENETIC_PROFILE_ID` (`GENETIC_PROFILE_ID`,`KEYWORD`),
  KEY `ENTREZ_GENE_ID` (`ENTREZ_GENE_ID`),
  CONSTRAINT `mutation_count_by_keyword_ibfk_1` FOREIGN KEY (`GENETIC_PROFILE_ID`) REFERENCES `genetic_profile` (`GENETIC_PROFILE_ID`) ON DELETE CASCADE,
  CONSTRAINT `mutation_count_by_keyword_ibfk_2` FOREIGN KEY (`ENTREZ_GENE_ID`) REFERENCES `gene` (`ENTREZ_GENE_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `mutation_event`
--

DROP TABLE IF EXISTS `mutation_event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mutation_event` (
  `MUTATION_EVENT_ID` int(255) NOT NULL AUTO_INCREMENT,
  `ENTREZ_GENE_ID` int(11) NOT NULL,
  `CHR` varchar(5) DEFAULT NULL,
  `START_POSITION` bigint(20) DEFAULT NULL,
  `END_POSITION` bigint(20) DEFAULT NULL,
  `REFERENCE_ALLELE` varchar(255) DEFAULT NULL,
  `TUMOR_SEQ_ALLELE` varchar(255) DEFAULT NULL,
  `PROTEIN_CHANGE` varchar(255) DEFAULT NULL,
  `MUTATION_TYPE` varchar(255) DEFAULT NULL COMMENT 'e.g. Missense, Nonsence, etc.',
  `FUNCTIONAL_IMPACT_SCORE` varchar(50) DEFAULT NULL COMMENT 'Result from OMA/XVAR.',
  `FIS_VALUE` float DEFAULT NULL,
  `LINK_XVAR` varchar(500) DEFAULT NULL COMMENT 'Link to OMA/XVAR Landing Page for the specific mutation.',
  `LINK_PDB` varchar(500) DEFAULT NULL,
  `LINK_MSA` varchar(500) DEFAULT NULL,
  `NCBI_BUILD` varchar(10) DEFAULT NULL,
  `STRAND` varchar(2) DEFAULT NULL,
  `VARIANT_TYPE` varchar(15) DEFAULT NULL,
  `DB_SNP_RS` varchar(25) DEFAULT NULL,
  `DB_SNP_VAL_STATUS` varchar(255) DEFAULT NULL,
  `ONCOTATOR_DBSNP_RS` varchar(255) DEFAULT NULL,
  `ONCOTATOR_REFSEQ_MRNA_ID` varchar(64) DEFAULT NULL,
  `ONCOTATOR_CODON_CHANGE` varchar(255) DEFAULT NULL,
  `ONCOTATOR_UNIPROT_ENTRY_NAME` varchar(64) DEFAULT NULL,
  `ONCOTATOR_UNIPROT_ACCESSION` varchar(64) DEFAULT NULL,
  `ONCOTATOR_PROTEIN_POS_START` int(11) DEFAULT NULL,
  `ONCOTATOR_PROTEIN_POS_END` int(11) DEFAULT NULL,
  `CANONICAL_TRANSCRIPT` tinyint(1) DEFAULT NULL,
  `KEYWORD` varchar(50) DEFAULT NULL COMMENT 'e.g. truncating, V200 Missense, E338del, ',
  PRIMARY KEY (`MUTATION_EVENT_ID`),
  UNIQUE KEY `CHR` (`CHR`,`START_POSITION`,`END_POSITION`,`TUMOR_SEQ_ALLELE`,`ENTREZ_GENE_ID`,`PROTEIN_CHANGE`,`MUTATION_TYPE`),
  KEY `KEYWORD` (`KEYWORD`),
  KEY `ENTREZ_GENE_ID` (`ENTREZ_GENE_ID`),
  CONSTRAINT `mutation_event_ibfk_1` FOREIGN KEY (`ENTREZ_GENE_ID`) REFERENCES `gene` (`ENTREZ_GENE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14553886 DEFAULT CHARSET=utf8 COMMENT='Mutation Data';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient` (
  `INTERNAL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `STABLE_ID` varchar(50) NOT NULL,
  `CANCER_STUDY_ID` int(11) NOT NULL,
  PRIMARY KEY (`INTERNAL_ID`),
  KEY `CANCER_STUDY_ID` (`CANCER_STUDY_ID`),
  CONSTRAINT `patient_ibfk_1` FOREIGN KEY (`CANCER_STUDY_ID`) REFERENCES `cancer_study` (`CANCER_STUDY_ID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=670341 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `pdb_uniprot_alignment`
--

DROP TABLE IF EXISTS `pdb_uniprot_alignment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pdb_uniprot_alignment` (
  `ALIGNMENT_ID` int(11) NOT NULL,
  `PDB_ID` char(4) NOT NULL,
  `CHAIN` char(1) NOT NULL,
  `UNIPROT_ID` varchar(50) NOT NULL,
  `PDB_FROM` varchar(10) NOT NULL,
  `PDB_TO` varchar(10) NOT NULL,
  `UNIPROT_FROM` int(11) NOT NULL,
  `UNIPROT_TO` int(11) NOT NULL,
  `EVALUE` float DEFAULT NULL,
  `IDENTITY` float DEFAULT NULL,
  `IDENTP` float DEFAULT NULL,
  `UNIPROT_ALIGN` text,
  `PDB_ALIGN` text,
  `MIDLINE_ALIGN` text,
  PRIMARY KEY (`ALIGNMENT_ID`),
  KEY `UNIPROT_ID` (`UNIPROT_ID`),
  KEY `PDB_ID` (`PDB_ID`,`CHAIN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `pdb_uniprot_residue_mapping`
--

DROP TABLE IF EXISTS `pdb_uniprot_residue_mapping`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pdb_uniprot_residue_mapping` (
  `ALIGNMENT_ID` int(11) NOT NULL,
  `PDB_POSITION` int(11) NOT NULL,
  `PDB_INSERTION_CODE` char(1) DEFAULT NULL,
  `UNIPROT_POSITION` int(11) NOT NULL,
  `MATCH` char(1) DEFAULT NULL,
  KEY `ALIGNMENT_ID` (`ALIGNMENT_ID`,`UNIPROT_POSITION`),
  CONSTRAINT `pdb_uniprot_residue_mapping_ibfk_1` FOREIGN KEY (`ALIGNMENT_ID`) REFERENCES `pdb_uniprot_alignment` (`ALIGNMENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `pfam_graphics`
--

DROP TABLE IF EXISTS `pfam_graphics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pfam_graphics` (
  `UNIPROT_ACC` varchar(255) NOT NULL,
  `JSON_DATA` longtext NOT NULL,
  PRIMARY KEY (`UNIPROT_ACC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `protein_array_cancer_study`
--

DROP TABLE IF EXISTS `protein_array_cancer_study`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `protein_array_cancer_study` (
  `PROTEIN_ARRAY_ID` varchar(50) NOT NULL,
  `CANCER_STUDY_ID` int(11) NOT NULL,
  PRIMARY KEY (`PROTEIN_ARRAY_ID`,`CANCER_STUDY_ID`),
  KEY `CANCER_STUDY_ID` (`CANCER_STUDY_ID`),
  CONSTRAINT `protein_array_cancer_study_ibfk_1` FOREIGN KEY (`CANCER_STUDY_ID`) REFERENCES `cancer_study` (`CANCER_STUDY_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `protein_array_data`
--

DROP TABLE IF EXISTS `protein_array_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `protein_array_data` (
  `PROTEIN_ARRAY_ID` varchar(50) NOT NULL,
  `CANCER_STUDY_ID` int(11) NOT NULL,
  `SAMPLE_ID` int(11) NOT NULL,
  `ABUNDANCE` double NOT NULL,
  PRIMARY KEY (`PROTEIN_ARRAY_ID`,`CANCER_STUDY_ID`,`SAMPLE_ID`),
  KEY `CANCER_STUDY_ID` (`CANCER_STUDY_ID`),
  KEY `SAMPLE_ID` (`SAMPLE_ID`),
  CONSTRAINT `protein_array_data_ibfk_1` FOREIGN KEY (`PROTEIN_ARRAY_ID`) REFERENCES `protein_array_info` (`PROTEIN_ARRAY_ID`),
  CONSTRAINT `protein_array_data_ibfk_2` FOREIGN KEY (`CANCER_STUDY_ID`) REFERENCES `cancer_study` (`CANCER_STUDY_ID`) ON DELETE CASCADE,
  CONSTRAINT `protein_array_data_ibfk_3` FOREIGN KEY (`SAMPLE_ID`) REFERENCES `sample` (`INTERNAL_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `protein_array_info`
--

DROP TABLE IF EXISTS `protein_array_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `protein_array_info` (
  `PROTEIN_ARRAY_ID` varchar(50) NOT NULL,
  `TYPE` varchar(50) NOT NULL,
  `GENE_SYMBOL` varchar(50) NOT NULL,
  `TARGET_RESIDUE` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`PROTEIN_ARRAY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `protein_array_target`
--

DROP TABLE IF EXISTS `protein_array_target`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `protein_array_target` (
  `PROTEIN_ARRAY_ID` varchar(50) NOT NULL,
  `ENTREZ_GENE_ID` int(11) NOT NULL,
  PRIMARY KEY (`PROTEIN_ARRAY_ID`,`ENTREZ_GENE_ID`),
  KEY `ENTREZ_GENE_ID` (`ENTREZ_GENE_ID`),
  CONSTRAINT `protein_array_target_ibfk_1` FOREIGN KEY (`ENTREZ_GENE_ID`) REFERENCES `gene` (`ENTREZ_GENE_ID`),
  CONSTRAINT `protein_array_target_ibfk_2` FOREIGN KEY (`PROTEIN_ARRAY_ID`) REFERENCES `protein_array_info` (`PROTEIN_ARRAY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `reference_genome`
--

DROP TABLE IF EXISTS `reference_genome`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reference_genome` (
  `REFERENCE_GENOME_ID` int(4) NOT NULL AUTO_INCREMENT,
  `SPECIES` varchar(64) NOT NULL,
  `NAME` varchar(64) NOT NULL,
  `BUILD_NAME` varchar(64) NOT NULL,
  `GENOME_SIZE` bigint(20) DEFAULT NULL,
  `URL` varchar(256) NOT NULL,
  `RELEASE_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`REFERENCE_GENOME_ID`),
  UNIQUE KEY `BUILD_NAME_UNIQUE` (`BUILD_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `reference_genome_gene`
--

DROP TABLE IF EXISTS `reference_genome_gene`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reference_genome_gene` (
  `ENTREZ_GENE_ID` int(11) NOT NULL,
  `REFERENCE_GENOME_ID` int(4) NOT NULL,
  `CHR` varchar(4) DEFAULT NULL,
  `CYTOBAND` varchar(64) DEFAULT NULL,
  `EXONIC_LENGTH` int(11) DEFAULT NULL,
  `START` bigint(20) DEFAULT NULL,
  `END` bigint(20) DEFAULT NULL,
  `ENSEMBL_GENE_ID` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`ENTREZ_GENE_ID`,`REFERENCE_GENOME_ID`),
  KEY `REFERENCE_GENOME_ID` (`REFERENCE_GENOME_ID`),
  CONSTRAINT `reference_genome_gene_ibfk_1` FOREIGN KEY (`REFERENCE_GENOME_ID`) REFERENCES `reference_genome` (`REFERENCE_GENOME_ID`) ON DELETE CASCADE,
  CONSTRAINT `reference_genome_gene_ibfk_2` FOREIGN KEY (`ENTREZ_GENE_ID`) REFERENCES `gene` (`ENTREZ_GENE_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sample`
--

DROP TABLE IF EXISTS `sample`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sample` (
  `INTERNAL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `STABLE_ID` varchar(50) NOT NULL,
  `SAMPLE_TYPE` varchar(255) NOT NULL,
  `PATIENT_ID` int(11) NOT NULL,
  `TYPE_OF_CANCER_ID` varchar(63) NOT NULL,
  PRIMARY KEY (`INTERNAL_ID`),
  KEY `PATIENT_ID` (`PATIENT_ID`),
  KEY `TYPE_OF_CANCER_ID` (`TYPE_OF_CANCER_ID`),
  CONSTRAINT `sample_ibfk_1` FOREIGN KEY (`TYPE_OF_CANCER_ID`) REFERENCES `type_of_cancer` (`TYPE_OF_CANCER_ID`),
  CONSTRAINT `sample_ibfk_2` FOREIGN KEY (`PATIENT_ID`) REFERENCES `patient` (`INTERNAL_ID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=646470 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sample_cna_event`
--

DROP TABLE IF EXISTS `sample_cna_event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sample_cna_event` (
  `CNA_EVENT_ID` int(255) NOT NULL,
  `SAMPLE_ID` int(11) NOT NULL,
  `GENETIC_PROFILE_ID` int(11) NOT NULL,
  PRIMARY KEY (`CNA_EVENT_ID`,`SAMPLE_ID`,`GENETIC_PROFILE_ID`),
  KEY `GENETIC_PROFILE_ID` (`GENETIC_PROFILE_ID`,`SAMPLE_ID`),
  KEY `SAMPLE_ID` (`SAMPLE_ID`),
  CONSTRAINT `sample_cna_event_ibfk_3` FOREIGN KEY (`SAMPLE_ID`) REFERENCES `sample` (`INTERNAL_ID`) ON DELETE CASCADE,
  CONSTRAINT `sample_cna_event_ibfk_4` FOREIGN KEY (`GENETIC_PROFILE_ID`) REFERENCES `genetic_profile` (`GENETIC_PROFILE_ID`) ON DELETE CASCADE,
  CONSTRAINT `sample_cna_event_ibfk_5` FOREIGN KEY (`CNA_EVENT_ID`) REFERENCES `cna_event` (`CNA_EVENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sample_list`
--

DROP TABLE IF EXISTS `sample_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sample_list` (
  `LIST_ID` int(11) NOT NULL AUTO_INCREMENT,
  `STABLE_ID` varchar(255) NOT NULL,
  `CATEGORY` varchar(255) NOT NULL,
  `CANCER_STUDY_ID` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `DESCRIPTION` mediumtext,
  PRIMARY KEY (`LIST_ID`),
  UNIQUE KEY `STABLE_ID` (`STABLE_ID`),
  KEY `CANCER_STUDY_ID` (`CANCER_STUDY_ID`),
  CONSTRAINT `sample_list_ibfk_1` FOREIGN KEY (`CANCER_STUDY_ID`) REFERENCES `cancer_study` (`CANCER_STUDY_ID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8389 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sample_list_list`
--

DROP TABLE IF EXISTS `sample_list_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sample_list_list` (
  `LIST_ID` int(11) NOT NULL,
  `SAMPLE_ID` int(11) NOT NULL,
  PRIMARY KEY (`LIST_ID`,`SAMPLE_ID`),
  KEY `SAMPLE_ID` (`SAMPLE_ID`),
  CONSTRAINT `sample_list_list_ibfk_1` FOREIGN KEY (`SAMPLE_ID`) REFERENCES `sample` (`INTERNAL_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sample_profile`
--

DROP TABLE IF EXISTS `sample_profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sample_profile` (
  `SAMPLE_ID` int(11) NOT NULL,
  `GENETIC_PROFILE_ID` int(11) NOT NULL,
  `PANEL_ID` int(11) DEFAULT NULL,
  UNIQUE KEY `UQ_SAMPLE_ID_GENETIC_PROFILE_ID` (`SAMPLE_ID`,`GENETIC_PROFILE_ID`),
  KEY `GENETIC_PROFILE_ID` (`GENETIC_PROFILE_ID`),
  KEY `SAMPLE_ID` (`SAMPLE_ID`),
  KEY `PANEL_ID` (`PANEL_ID`),
  CONSTRAINT `sample_profile_ibfk_1` FOREIGN KEY (`SAMPLE_ID`) REFERENCES `sample` (`INTERNAL_ID`) ON DELETE CASCADE,
  CONSTRAINT `sample_profile_ibfk_2` FOREIGN KEY (`GENETIC_PROFILE_ID`) REFERENCES `genetic_profile` (`GENETIC_PROFILE_ID`) ON DELETE CASCADE,
  CONSTRAINT `sample_profile_ibfk_3` FOREIGN KEY (`PANEL_ID`) REFERENCES `gene_panel` (`INTERNAL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sanger_cancer_census`
--

DROP TABLE IF EXISTS `sanger_cancer_census`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sanger_cancer_census` (
  `ENTREZ_GENE_ID` int(11) NOT NULL,
  `CANCER_SOMATIC_MUT` tinyint(1) NOT NULL,
  `CANCER_GERMLINE_MUT` tinyint(1) NOT NULL,
  `TUMOR_TYPES_SOMATIC_MUT` text NOT NULL,
  `TUMOR_TYPES_GERMLINE_MUT` text NOT NULL,
  `CANCER_SYNDROME` text NOT NULL,
  `TISSUE_TYPE` text NOT NULL,
  `MUTATION_TYPE` text NOT NULL,
  `TRANSLOCATION_PARTNER` text NOT NULL,
  `OTHER_GERMLINE_MUT` tinyint(1) NOT NULL,
  `OTHER_DISEASE` text NOT NULL,
  KEY `ENTREZ_GENE_ID` (`ENTREZ_GENE_ID`),
  CONSTRAINT `sanger_cancer_census_ibfk_1` FOREIGN KEY (`ENTREZ_GENE_ID`) REFERENCES `gene` (`ENTREZ_GENE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Sanger Cancer Gene Census';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `structural_variant`
--

DROP TABLE IF EXISTS `structural_variant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `structural_variant` (
  `SAMPLE_ID` int(11) NOT NULL,
  `INTERNAL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `BREAKPOINT_TYPE` varchar(25) DEFAULT NULL,
  `ANNOTATION` varchar(255) DEFAULT NULL,
  `COMMENTS` varchar(2048) DEFAULT NULL,
  `CONFIDENCE_CLASS` varchar(25) DEFAULT NULL,
  `CONNECTION_TYPE` varchar(25) DEFAULT NULL,
  `EVENT_INFO` varchar(255) DEFAULT NULL,
  `MAPQ` int(11) DEFAULT NULL,
  `NORMAL_READ_COUNT` int(11) DEFAULT NULL,
  `NORMAL_VARIANT_COUNT` int(11) DEFAULT NULL,
  `PAIRED_END_READ_SUPPORT` varchar(255) DEFAULT NULL,
  `SITE1_CHROM` varchar(25) DEFAULT NULL,
  `SITE1_DESC` varchar(255) DEFAULT NULL,
  `SITE1_ENTREZ_GENE_ID` int(11) DEFAULT NULL,
  `SITE1_POS` int(11) DEFAULT NULL,
  `SITE2_CHROM` varchar(25) DEFAULT NULL,
  `SITE2_DESC` varchar(255) DEFAULT NULL,
  `SITE2_ENTREZ_GENE_ID` int(11) DEFAULT NULL,
  `SITE2_POS` int(11) DEFAULT NULL,
  `SPLIT_READ_SUPPORT` varchar(255) DEFAULT NULL,
  `SV_CLASS_NAME` varchar(25) DEFAULT NULL,
  `SV_DESC` varchar(255) DEFAULT NULL,
  `SV_LENGTH` int(11) DEFAULT NULL,
  `TUMOR_READ_COUNT` int(11) DEFAULT NULL,
  `TUMOR_VARIANT_COUNT` int(11) DEFAULT NULL,
  `VARIANT_STATUS_NAME` varchar(255) DEFAULT NULL,
  `GENETIC_PROFILE_ID` int(11) NOT NULL,
  PRIMARY KEY (`INTERNAL_ID`),
  KEY `SAMPLE_ID` (`SAMPLE_ID`),
  KEY `SITE1_ENTREZ_GENE_ID` (`SITE1_ENTREZ_GENE_ID`),
  KEY `SITE2_ENTREZ_GENE_ID` (`SITE2_ENTREZ_GENE_ID`),
  KEY `GENETIC_PROFILE_ID` (`GENETIC_PROFILE_ID`),
  CONSTRAINT `structural_variant_ibfk_1` FOREIGN KEY (`SAMPLE_ID`) REFERENCES `sample` (`INTERNAL_ID`) ON DELETE CASCADE,
  CONSTRAINT `structural_variant_ibfk_2` FOREIGN KEY (`SITE1_ENTREZ_GENE_ID`) REFERENCES `gene` (`ENTREZ_GENE_ID`) ON DELETE CASCADE,
  CONSTRAINT `structural_variant_ibfk_3` FOREIGN KEY (`SITE2_ENTREZ_GENE_ID`) REFERENCES `gene` (`ENTREZ_GENE_ID`) ON DELETE CASCADE,
  CONSTRAINT `structural_variant_ibfk_4` FOREIGN KEY (`GENETIC_PROFILE_ID`) REFERENCES `genetic_profile` (`GENETIC_PROFILE_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `text_cache`
--

DROP TABLE IF EXISTS `text_cache`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `text_cache` (
  `HASH_KEY` varchar(32) NOT NULL,
  `TEXT` longtext NOT NULL,
  `DATE_TIME_STAMP` datetime NOT NULL,
  PRIMARY KEY (`HASH_KEY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `type_of_cancer`
--

DROP TABLE IF EXISTS `type_of_cancer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `type_of_cancer` (
  `TYPE_OF_CANCER_ID` varchar(63) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `CLINICAL_TRIAL_KEYWORDS` varchar(1024) NOT NULL,
  `DEDICATED_COLOR` char(31) NOT NULL,
  `SHORT_NAME` varchar(127) DEFAULT NULL,
  `PARENT` varchar(63) DEFAULT NULL,
  PRIMARY KEY (`TYPE_OF_CANCER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `uniprot_id_mapping`
--

DROP TABLE IF EXISTS `uniprot_id_mapping`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `uniprot_id_mapping` (
  `UNIPROT_ACC` varchar(255) NOT NULL,
  `UNIPROT_ID` varchar(255) NOT NULL,
  `ENTREZ_GENE_ID` int(11) NOT NULL,
  PRIMARY KEY (`ENTREZ_GENE_ID`,`UNIPROT_ID`),
  KEY `UNIPROT_ID` (`UNIPROT_ID`),
  KEY `UNIPROT_ACC` (`UNIPROT_ACC`),
  CONSTRAINT `uniprot_id_mapping_ibfk_1` FOREIGN KEY (`ENTREZ_GENE_ID`) REFERENCES `gene` (`ENTREZ_GENE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `EMAIL` varchar(128) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `ENABLED` tinyint(1) NOT NULL,
  PRIMARY KEY (`EMAIL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-11 15:20:04
