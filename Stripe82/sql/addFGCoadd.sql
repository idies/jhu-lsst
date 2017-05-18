alter database stripe82
add filegroup coadd
go

alter database stripe82
add file ( NAME = N'COADD_01', FILENAME = N'C:\pool\sql_db\COADD_01.ndf' , SIZE = 10GB , MAXSIZE = UNLIMITED, FILEGROWTH = 100MB )
to filegroup coadd

