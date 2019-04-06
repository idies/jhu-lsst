
CREATE TABLE type_of_cancer ( foo integer not null default 1 COMMENT 'bollocks', bar datetime  default '2017-01-01'
, amount decimal(10,3)
  ) ;
  
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
  drop table if exists foo;
  