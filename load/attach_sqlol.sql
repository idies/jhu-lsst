USE [master]
GO
CREATE DATABASE [lsst_stage] ON 
( FILENAME = N'c:\pool\sql_db\lsst_stage.mdf' ),
( FILENAME = N'c:\pool\sql_log\lsst_stage_log.ldf' ),
( FILENAME = N'c:\pool\sql_db\stage01.ndf' ),
( FILENAME = N'c:\pool\sql_db\stage_02.ndf' )
 FOR ATTACH
GO


USE [master]
GO
CREATE DATABASE [lsst_stage] ON 
( FILENAME = N'\pool\sql_db\lsst_stage.mdf' ),
( FILENAME = N'\pool\sql_log\lsst_stage_log.ldf' ),
( FILENAME = N'\pool\sql_db\stage01.ndf' ),
( FILENAME = N'\pool\sql_db\stage_02.ndf' )
 FOR ATTACH
GO
