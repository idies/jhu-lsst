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

drop table LoadLog

create table LoadLog(
        loadid int identity(1,1),
        fileId bigint,
		tname sysname,
        fname varchar(200),
        rows int,
        ltime datetime
)



----1. create empty table on staging filegroup

--
-- method 1 - everything is a varchar
/*
drop table object_stage

select * 
into object_stage on [ST_01]
from object_template
where (0=1)
*/

drop table source_stage2

-- method 2 - replaced nulls in csv files with empty string
-- template file has correct data types
select * into source_stage2 
on src_st01
from source_template2 --has correct data types but not chunkID and subChunkID
where (0=1)  



drop table objectfulloverlap_stage

-- method 2 - replaced nulls in csv files with empty string
-- template file has correct data types
select * into objectfulloverlap_stage 
on src_st01
from objectfulloverlap_template2 --has correct data types 
where (0=1)  


--maybe create clustered index?  --NO DO NOT DO THIS
/*
ALTER TABLE object_stage
add constraint pk_obj_stage_deepsourceID 
primary key clustered (deepsourceId)
with (data_compression=page)
on [ST_01]
*/
checkpoint
-----------------------------------------------------
-----------------------------------------------------
--  Generate (run) bulk insert statements
-----------------------------------------------------

declare @counter integer = 1, @nPart integer = 4

declare @sql nvarchar(4000), @s1 nvarchar(100), @s2 nvarchar(512);
declare @id int, @name varchar(64), @rows int, @last int;
declare @loc nvarchar(200)
declare @tname sysname = 'ObjectFullOverlap'

set nocount on

--select  @s1 = N'BULK INSERT source_v FROM ''',
select  @s1 = N'BULK INSERT ObjectFullOverlap_stage FROM ''',
                @s2 = N''' WITH ('
                 --       + '     DATAFILETYPE = ''char'','
                 --       + '     CODEPAGE=''1251'','
						+ ' FIRSTROW=2,  '  
                        + '     FIELDTERMINATOR = '';'','
              --          + ' ROWTERMINATOR = ''0x0a'','
                        + ' TABLOCK );',        
                @last = 0;

--while (@counter <= @nPart)
	begin
		declare @bulk_cur as cursor

		set @bulk_cur = cursor fast_forward for 
			select loc, chunkid 
			from part_all
			where partitionID = @counter
			and tname = @tname
			--and chunkid > 4169

			/*
			select * from part_all
			where partitionID = 1
			and tname='ForcedSource'
			*/

			open @bulk_cur

			fetch next from @bulk_cur into @loc, @id
			while @@FETCH_STATUS = 0
			begin
				


				set @sql = @s1 + @loc + @s2
				print @sql
				exec sp_executesql @sql

				set @rows = @@rowcount;
				insert loadlog(fileId, tname, fname,[rows],ltime) values(@id,@tname, @loc, @rows, GETDATE());

				/*
				update source_stage3
				set chunkid = @id
				where chunkid = -999
				*/


				fetch next from @bulk_cur into @loc, @id
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
order by loadid desc

