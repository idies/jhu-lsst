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

--trying sequence instead of identity
create sequence seq1 as int
start with 1
increment by 1
go




create table #fstage(
	loc nvarchar(200),
	fname sysname, 
	tname sysname,
	chunkid int,
	nrows int,
	nbytes bigint
)


bulk insert #fstage
	from '/pool/rowsfile2.csv'
	with (
		firstrow = 1,
		fieldterminator = ',',
		rowterminator = '0x0a',  --USE THIS FOR UNIX
		tablock
	)


drop table rowsfile

create table rowsfile (
id int not null primary key clustered,
tname sysname not null,
fname sysname not null,
loc varchar (200) not null,
chunkid int not null,
nrows bigint not null,
nbytes bigint not null
)

insert rowsfile (id, tname, fname, loc, chunkid, nrows, nbytes)
select next value for seq1 over (order by tname, chunkid) as id, tname, fname, loc, chunkid, nrows, nbytes
from #fstage
order by tname, chunkid

select * from rowsfile
order by id

/*
I have a table called bloxfile that contains basically a fileId (to be used as partitioning key),
a fileLocation and a size in bytes.
Then the following query, using @numPartition, will give all files in order of fileid, with a running total of size.
It adds a percentage, and the partitionId to which the files could belong.
The version at the bottom finds the right boundery for each partition, note assumed to be 'right' inclusive.
*/

declare @numPartition integer = 4;

with 
total as (
	select 1./cast(sum(nrows) as float) as oneOverSize from rowsfile
	where tname = 'ForcedSource'
	
), 
rt as (
	select chunkid, loc,nrows,
                sum(nrows) over(order by chunkid rows unbounded preceding) as runningSumSize,
				100*oneOverSize*sum(nrows) over(order by chunkid rows unbounded preceding) as runningPercentage
from rowsfile cross join total
where tname = 'ForcedSource'
)
select *,
--@numPartition*runningpercentage
ceiling(@numPartition*runningPercentage/100) as partitionID
into PartForcedSource
from rt

select * from PartForcedSource
select * from PartSource


create table LoadLog(
        loadid int identity(1,1),
        fileId bigint,
        fname varchar(128),
        rows int,
        ltime datetime
)



----1. create empty table on staging filegroup
select * 
into object_stage on [ST_01]
from Object_1025
where (0=1)

select * from PartObject
where partitionID = 1


declare @counter integer = 1, @nPart integer = 4

declare @sql nvarchar(4000), @s1 nvarchar(100), @s2 nvarchar(512);
declare @id int, @name varchar(64), @rows int, @last int;
declare @loc nvarchar(200)

select  @s1 = N'BULK INSERT object_stage FROM ''',
                @s2 = N''' WITH ('
                        + '     DATAFILETYPE = ''char'','
                        + '     CODEPAGE=''1251'','
                        + '     FIELDTERMINATOR = '';'','
                        + ' ROWTERMINATOR = ''0x0a'','
                        + ' TABLOCK );',        
                @last = 0;

--while (@counter <= @nPart)
	begin
		declare @bulk_cur as cursor

		set @bulk_cur = cursor fast_forward for 
			select loc 
			from PartObject 
			where partitionID = @counter


			open @bulk_cur

			fetch next from @bulk_cur into @loc
			while @@FETCH_STATUS = 0
			begin
				set @sql = @s1 + @loc + @s2
				print @sql
				fetch next from @bulk_cur into @loc
			end
			close @bulk_cur
			deallocate @bulk_cur

	 --set @counter = @counter+1
	end
/*


while(1=1)
begin
        if @counter > @maxcount  break
        --
        -- get the id and filename
        select top 1  @id = fileId, @name = fileLocation
        from bigwig..bloxfile where fileId>@last and fileLocation like '2000/%'
        order by 1
        --
        if (@@rowcount=0) break;
        --
        truncate table bw_staging

        set @sql = @s1+@name+@s2;
        exec sp_executesql @sql

        insert into bw with(tablock)
        select sampleId,chr
        ,      dbo.ix4lo(lo)
    ,      dbo.iw4lohi(lo,hi)
        ,      lo,hi,block
          from bw_staging

        --
        set @rows = @@rowcount;
        insert loadlog(fileId, fname,[rows],ltime) values(@id,@name, @rows, GETDATE());
        set @last = @id
        --

        set @counter=@counter+1
end
*/
select * from LoadLog
