/*
Here Alex' loading script, that I have updated to make use of this BloxFile table with file locations.
Should use also the PartLim table that we can create to restrict to files that should be loaded in a given partition.
And now need to add your staging tables etc etc

Alex' script writes to a loadlog table.

The script here was not using partitioning.
But it used staging as I wanted to calculate two zone-like columns (ix, and iw) ,
These are added in the insert into the main table.
I think I would do that still, but now first write to the switch table.
*/


/*
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


create table LoadLog(
        loadid int identity(1,1),
        fileId bigint,
        fname varchar(128),
        rows int,
        ltime datetime
)



truncate table #files


select * from #files

select object_id( 'tempdb.dbo.#files' )

*/

use bigwig_test
go

truncate table bw
go
truncate table LoadLog
go

declare @dx bigint = 10

declare @dlogw integer = 2 -- 100,10000,1000000,100000000,...
declare @ten bigint = 10


declare @counter integer = 0, @maxcount integer = 10010

declare @sql nvarchar(4000), @s1 nvarchar(100), @s2 nvarchar(512);
declare @id int, @name varchar(64), @rows int, @last int;

select  @s1 = N'BULK INSERT bw_staging FROM ''\\172.23.251.108\blox\',
                @s2 = N''' WITH ('
                        + '     DATAFILETYPE = ''char'','
                        + '     CODEPAGE=''1251'','
                        + '     FIELDTERMINATOR = '','','
                        + ' ROWTERMINATOR = ''0x0a'','
                        + ' TABLOCK );',        
                @last = 0;


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

select * from LoadLog


