alter database lsst_stage
add file
( NAME = N'stage01', FILENAME = N'C:\ssd\sql_db\stage01.ndf' , SIZE = 134656000KB , MAXSIZE = UNLIMITED, FILEGROWTH = 512000KB )
to filegroup [st_01]

drop table object_stage


alter database lsst_stage remove file stage01
