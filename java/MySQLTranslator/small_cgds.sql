

drop table another_type;
 drop table if exists foo;
CREATE TABLE type_of_cancer ( foo integer not null default 1 COMMENT 'bollocks', bar datetime  default '2017-01-01'
, amount decimal(10,3)
  ) ;
  
  /**
   * eishfies
   * sdcfkh
   */
  CREATE TABLE type_of_cancer ( foo int(10) default null, bar datetime  default 0, decc decimal(10)
  ) ;
  
  -- --------------------------------------------------------
CREATE TABLE `type_of_cancer` (
  `TYPE_OF_CANCER_ID` varchar(63) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `CLINICAL_TRIAL_KEYWORDS` varchar(1024) NOT NULL,
  `DEDICATED_COLOR` char(31) NOT NULL,
  `SHORT_NAME` varchar(127),
  `PARENT` varchar(63),
  PRIMARY KEY (`TYPE_OF_CANCER_ID`)
);


  CREATE TABLE another_type_of_cancer ( foo int(10) default null, bar datetime  default 0, decc decimal(10)
  ) ;
-- -------------------------------------------------------
  CREATE TABLE `cancer_study` (
  `CANCER_STUDY_ID` int(11) NOT NULL ,
  `CANCER_STUDY_IDENTIFIER` varchar(255),
  `TYPE_OF_CANCER_ID` varchar(25) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `SHORT_NAME` varchar(64) NOT NULL,
  `DESCRIPTION` varchar(1024) NOT NULL,
  `PUBLICS` BOOLEAN NOT NULL,
  `PMID` varchar(20) DEFAULT NULL,
  `CITATION` varchar(200) DEFAULT NULL,
  `GROUPS` varchar(200) DEFAULT NULL,
  `STATUS` int(1) DEFAULT NULL,
  `IMPORT_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`CANCER_STUDY_ID`)
);
  
  drop table if exists bar;
    -- --------------------------------------------------------
