

exec sp_helpfile

alter database LSST add file

--( NAME = N'stripe01', FILENAME = N'/var/opt/mssql/data/stripe01.ndf' , SIZE = 5GB , MAXSIZE = UNLIMITED, FILEGROWTH = 500MB ),
( NAME = N'stripe02', FILENAME = N'/var/opt/mssql/data2/stripe02.ndf' , SIZE = 5GB , MAXSIZE = UNLIMITED, FILEGROWTH = 500MB ),
( NAME = N'stripe03', FILENAME = N'/var/opt/mssql/data3/stripe03.ndf' , SIZE = 5GB , MAXSIZE = UNLIMITED, FILEGROWTH = 500MB ),
( NAME = N'stripe04', FILENAME = N'/var/opt/mssql/data4/stripe04.ndf' , SIZE = 5GB , MAXSIZE = UNLIMITED, FILEGROWTH = 500MB ),
( NAME = N'stripe05', FILENAME = N'/var/opt/mssql/data5/stripe05.ndf' , SIZE = 5GB , MAXSIZE = UNLIMITED, FILEGROWTH = 500MB ),
( NAME = N'stripe06', FILENAME = N'/var/opt/mssql/data6/stripe06.ndf' , SIZE = 5GB , MAXSIZE = UNLIMITED, FILEGROWTH = 500MB ),
( NAME = N'stripe07', FILENAME = N'/var/opt/mssql/data7/stripe07.ndf' , SIZE = 5GB , MAXSIZE = UNLIMITED, FILEGROWTH = 500MB )
to filegroup STRIPEFG
go

exec sp_helpfile