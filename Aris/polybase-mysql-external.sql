    --CREATE MASTER KEY ENCRYPTION BY PASSWORD = 'xxxxxxxxxx'; --ask sue or victor for password (db name in this case)
--go
----------------------------------------------

CREATE DATABASE SCOPED CREDENTIAL MyCred2 
WITH IDENTITY = 'root',   -- username for admin user on mysql instance
    SECRET = 'xxxxxxxx;';  --ask sue or victor for password  (this instance uses the usual root password)
GO 
----------------------------------------------

CREATE EXTERNAL DATA SOURCE mydsp016  --you can name the data source whatever you want
WITH 
( 
LOCATION = 'odbc://172.23.250.16:3306',
CONNECTION_OPTIONS = 'Driver={Mysql ODBC 8.0 ANSI Driver}; ServerNode = 172.23.250.16:3306',
PUSHDOWN = ON,
CREDENTIAL = MyCred2
);





CREATE EXTERNAL TABLE [dbo].[cancer_study](
    [CANCER_STUDY_ID] [int] NOT NULL,
    [CANCER_STUDY_IDENTIFIER] [nvarchar](255) NULL,
    [TYPE_OF_CANCER_ID] [nvarchar](25) NOT NULL,
    [NAME] [nvarchar](255) NOT NULL,
    [SHORT_NAME] [nvarchar](64) NOT NULL,
    [DESCRIPTION] [nvarchar](1024) NOT NULL,
    [PUBLIC] [smallint] NOT NULL,
    [PMID] [nvarchar](20) NULL,
    [CITATION] [nvarchar](200) NULL,
    [GROUPS] [nvarchar](200) NULL,
    [STATUS] [int] NULL,
	[IMPORT_DATE] datetime2)
  --PRIMARY KEY (CANCER_STUDY_ID),
  --UNIQUE KEY CANCER_STUDY_IDENTIFIER (CANCER_STUDY_IDENTIFIER),
  --KEY TYPE_OF_CANCER_ID (TYPE_OF_CANCER_ID),
  --CONSTRAINT cancer_study_ibfk_1 FOREIGN KEY (TYPE_OF_CANCER_ID) REFERENCES type_of_cancer (TYPE_OF_CANCER_ID)
--ENGINE=InnoDB AUTO_INCREMENT=2  CHARSET=latin1 |


with (
        location='cbioportal.cancer_study',
        data_source=mydsp016
    );


