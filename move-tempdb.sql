use tempdb


exec sp_helpfile

use master
go

alter database tempdb modify file (name = tempdev, filename = '/var/opt/mssql/data8/tempdb.mdf')
alter database tempdb modify file (name = templog, filename = '/var/opt/mssql/data8/templog.ldf')
alter database tempdb modify file (name = tempdev2, filename = '/var/opt/mssql/data8/tempdev2.ndf')
alter database tempdb modify file (name = tempdev3, filename = '/var/opt/mssql/data8/tempdev3.ndf')
alter database tempdb modify file (name = tempdev4, filename = '/var/opt/mssql/data8/tempdev4.ndf')
alter database tempdb modify file (name = tempdev5, filename = '/var/opt/mssql/data8/tempdev5.ndf')
alter database tempdb modify file (name = tempdev6, filename = '/var/opt/mssql/data8/tempdev6.ndf')
go


