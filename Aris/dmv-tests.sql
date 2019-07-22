

select top 10 (id) from SourceDP

select top 10 (deepsourceID) from Object


select top 10 (id) from Source

select min(id), max(id) from Source_test

select count(*) from source_test

select * from sys.dm_exec_external_operations

select * from sys.dm_exec_external_work order by start_time desc

select * from sys.dm_exec_distributed_requests order by start_time desc

select * from sys.dm_exec_distributed_sql_requests order by start_time desc

select * from sys.dm_exec_distributed_request_steps order by start_time desc


select top 10 * from sys.external_tables

select top 10 * from sys.external_data_sources

select t1.name, t1.LOCATION, d1.name, d1.location, d1.resource_manager_location 
from sys.external_tables t1
join sys.external_data_sources d1
on t1.data_source_id = d1.data_source_id



select dr.execution_id, 
dr.status, dr.start_time, dr.end_time,
ds.compute_node_id, ds.command
from sys.dm_exec_distributed_requests dr
join sys.dm_exec_distributed_sql_requests ds
on dr.execution_id = ds.execution_id
order by dr.start_time desc

select dr.execution_id, 
dr.status, dr.start_time, dr.end_time,
ds.step_index, ds.location_type, ds.command
from sys.dm_exec_distributed_requests dr
join sys.dm_exec_distributed_request_Steps ds
on dr.execution_id = ds.execution_id
order by dr.start_time desc

/*
USE tempdbDECLARE @cursor CURSORDECLARE @tableName SYSNAMEDECLARE @columns NVARCHAR(max)SET @cursor = CURSOR FOR SELECT name FROM sys.tables    WHERE name LIKE 'QTable_1ec92c5b6ddb4ab8a836f021d1c79d5a%'    ORDER BY nameOPEN @cursorFETCH NEXT FROM @cursor INTO @tableNameWHILE (@@FETCH_STATUS = 0)BEGIN    SET @columns = NULL    SELECT @columns = COALESCE(@columns + N', ', N'') + QUOTENAME(name)    FROM sys.columns    WHERE OBJECT_ID = OBJECT_ID(@tableName)    AND name <> N'id'    ORDER BY column_id;    DECLARE @sql NVARCHAR(max)    SET @sql = N'SELECT ' + @columns + N' FROM [' + @tableName + N'] ORDER BY id;' +        N'DROP VIEW [' + @tableName + N'View];' +        N'DROP TABLE [' + @tableName + N']'    EXEC sp_executesql @sql    FETCH NEXT FROM @cursor INTO @tableNameENDCLOSE @cursorDEALLOCATE @cursor
*/


select 
    execution_id,
       st.text,
       dr.total_elapsed_time
FROM sys.dm_exec_distributed_requests  dr
     cross apply sys.dm_exec_sql_requests(sql_handle) st
order by total_elapsed_time desc