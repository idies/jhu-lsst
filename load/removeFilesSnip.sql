


exec sp_helpfile

drop table bw_16
drop table bw_17
drop table bw_18
drop table bw_19
drop table bw_20
drop table bw_21
drop table bw_22
drop table bw_23
drop table bw_24



declare @name sysname

select @name=name from sys.database_files
where file_id >= 18



declare @sql nvarchar(max)
set @sql = 'alter database BigWig remove file '
select @sql = coalesce(@sql + name + '; alter database BigWig remove file ', name) from sys.database_files where file_id >= 18
select @sql