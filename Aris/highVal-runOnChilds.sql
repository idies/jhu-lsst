select * from sys.servers




-- Set context to sample database:
--
USE high_value_data
go
DECLARE @compute_pool_name nvarchar(255) = 'mssql-compute-pool'
DECLARE @node_count int = 8
IF NOT EXISTS(SELECT * FROM sys.servers WHERE name LIKE CONCAT(@compute_pool_name, '-node%sa'))
        EXEC [sp_compute_pool_support_create_linked_servers] @compute_pool_name, @node_count
go

-- Current CTP1 functionality does not have data movement support or predicate / aggregate pushdown.
-- So in order to optimize query that does aggregations on the data in each compute node, we will create
-- a view on each compute node and query that view from the head node instead.
--
set nocount on;
declare @server nvarchar(128), @cmd nvarchar(1000);
declare @c cursor;
set @c = cursor fast_forward for select name from sys.servers where name like 'mssql-compute-pool-node-%sa';
open @c
while (1=1)
begin
        fetch @c into @server;
        if @@FETCH_STATUS < 0 break;
       
	    --===================================================
		-- here is where you change the name of the DB where your commands will be executed
		--  N'.lsst.sys.sp_executesql' runs stuff in lsst db's on child nodes
		--  N'.high_value_data.sys.sp_executesql' runs stuff in high_value_data db's on child nodes
		--========================================================================================
        set @cmd = CONCAT(QUOTENAME(@server), N'.high_value_data.sys.sp_executesql');
		--=========================================================================================


		--==============================================================================
		-- your commands go here

-- create lsst schema on child nodes
        exec @cmd N'if exists (select name from sys.schemas where name = ''lsst'')
	drop schema lsst;'
		exec @cmd N'
	create schema lsst;'

-- create views for Object and Source
		exec @cmd N'create view lsst.[Source] as select * from LSST.DBO.[Source]'
		exec @cmd N'create view lsst.[Object] as select * from LSST.DBO.[Object]'

	


end;
go


