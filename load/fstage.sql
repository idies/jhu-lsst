EXEC sp_configure 'show advanced options', 1; 
GO 
-- To update the currently configured value for advanced options. 
RECONFIGURE; 
GO 
-- To enable the feature. 
EXEC sp_configure 'xp_cmdshell', 1; 
GO 
-- To update the currently configured value for this feature. 
RECONFIGURE; 
GO 




sp_helpfile

create sequence seq1 as int
start with 1
increment by 1
go


create table tempdb.dbo.fstage(
	loc nvarchar(200),
	fname sysname, 
	tname sysname,
	chunkid int,
	nrows int,
	nbytes int
)


bulk insert tempdb.dbo.fstage
	from 'c:\Temp\rowsfile2.csv'
	with (
		firstrow = 2,
		fieldterminator = ',',
		rowterminator = '\n',
		tablock
	)


