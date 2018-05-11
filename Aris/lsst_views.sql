/*
cycle over filedb child nodes to define views etc
*/
use high_value_data
GO

create schema lsst
go

create view lsst.[Object] as select * from LSST.DBO.[Object]
GO



use lsst
GO

create user [mssql-compute-pool-External] for login [mssql-compute-pool-External]
alter role db_datareader add member [mssql-compute-pool-External]
GO