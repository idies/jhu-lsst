
exec sp_helpfile

use lsst_stage
go

--1. create object_stage on staging fg with template

select * into object_stage 
on [ST_01]
from object_template
where (0=1)
go

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
---counter = partition number to insert
declare @counter integer = 2, @nPart integer = 4

declare @sql nvarchar(4000), @s1 nvarchar(100), @s2 nvarchar(512);
declare @id int, @name varchar(64), @rows int, @last int;
declare @loc nvarchar(200)
declare @tname sysname = 'Object'
declare @stagetab sysname = 'object_stage'

declare @doExecute bit = 0

set nocount on

-------------------------
--
-- to actually insert the data set @doExecute=1
--
set @doExecute = 1


--select  @s1 = N'BULK INSERT source_v FROM ''',
select  @s1 = N'BULK INSERT ' + @stagetab +' FROM ''',
                @s2 = N''' WITH ('
                 --       + '     DATAFILETYPE = ''char'','
                 --       + '     CODEPAGE=''1251'','
						+ ' FIRSTROW=2,  '  
                        + '     FIELDTERMINATOR = '';'','
  --                      + ' ROWTERMINATOR = ''0x0a'','
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

			open @bulk_cur

			fetch next from @bulk_cur into @loc, @id
			while @@FETCH_STATUS = 0
			begin
				


				set @sql = @s1 + @loc + @s2
				print @sql
				if (@doExecute = 1)
				begin
					exec sp_executesql @sql

					set @rows = @@rowcount;
					insert loadlog(fileId, tname, fname,[rows],ltime) values(@id,@tname, @loc, @rows, GETDATE());
				end

				fetch next from @bulk_cur into @loc, @id
			end
			close @bulk_cur
			deallocate @bulk_cur

	 --set @counter = @counter+1
	end

select * from LoadLog order by ltime desc
