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
       
        set @cmd = CONCAT(QUOTENAME(@server), N'.high_value_data.sys.sp_executesql');

-- Create a table on the compute node to get min/max stats for sensor columns.
-- This table will be used to normalize the sensor readings.
        exec @cmd N'
drop table if exists SensorDataRange;
create table SensorDataRange (
        sensor varchar(10) not null primary key,
        min_val decimal(18,4),
        max_val decimal(18,4)
);
declare @min_val decimal(18, 4), @max_val decimal(18,4), @name nvarchar(128), @sql nvarchar(4000);
declare @cur cursor;
set @cur = cursor fast_forward for select name from sys.columns where object_id = object_id(''airlinedata'') and name like ''s[0-9]%'';
open @cur;
while(1=1)
begin
        fetch @cur into @name;
        if @@FETCH_STATUS < 0 break;

        set @sql = replace(N''select ''''%s'''', min(%s), max(%s) from airlinedata'', N''%s'', @name);
        insert into SensorDataRange
        exec(@sql);
end;
'

-- Create view on the airlinedadta that looks at last 1 hour data of each engine
-- and computes avg reading for some sensor
        exec @cmd N'
create or alter view AirlineEngineSensorDataNorm
as
with sm
as (
        select min(case sensor when ''s2'' then min_val end) as s2_min
                 , min(case sensor when ''s2'' then max_val end) as s2_max
                 , min(case sensor when ''s3'' then min_val end) as s3_min
                 , min(case sensor when ''s3'' then max_val end) as s3_max
                 , min(case sensor when ''s4'' then min_val end) as s4_min
                 , min(case sensor when ''s4'' then max_val end) as s4_max
                 , min(case sensor when ''s7'' then min_val end) as s7_min
                 , min(case sensor when ''s7'' then max_val end) as s7_max
                 , min(case sensor when ''s9'' then min_val end) as s9_min
                 , min(case sensor when ''s9'' then max_val end) as s9_max
                 , min(case sensor when ''s11'' then min_val end) as s11_min
                 , min(case sensor when ''s11'' then max_val end) as s11_max
                 , min(case sensor when ''s12'' then min_val end) as s12_min
                 , min(case sensor when ''s12'' then max_val end) as s12_max
                 , min(case sensor when ''s13'' then min_val end) as s13_min
                 , min(case sensor when ''s13'' then max_val end) as s13_max
                 , min(case sensor when ''s14'' then min_val end) as s14_min
                 , min(case sensor when ''s14'' then max_val end) as s14_max
                 , min(case sensor when ''s15'' then min_val end) as s15_min
                 , min(case sensor when ''s15'' then max_val end) as s15_max
                 , min(case sensor when ''s17'' then min_val end) as s17_min
                 , min(case sensor when ''s17'' then max_val end) as s17_max
                 , min(case sensor when ''s20'' then min_val end) as s20_min
                 , min(case sensor when ''s20'' then max_val end) as s20_max
                 , min(case sensor when ''s21'' then min_val end) as s21_min
                 , min(case sensor when ''s21'' then max_val end) as s21_max
         from SensorDataRange as s
        where s.min_val <> s.max_val
), edt as (
        select id, max(processed) as recent_processed from airlinedata with (readpast) group by id
)
select t.id as EngineId
       , tp.tstamp
           , (AVG(t.s2) - MIN(sm.s2_min))/MIN(sm.s2_max - sm.s2_min) as "Bleed Air Channel"
           , (AVG(t.s3) - MIN(sm.s3_min))/MIN(sm.s3_max - sm.s3_min) as "Flow Control"
           , (AVG(t.s4) - MIN(sm.s4_min))/MIN(sm.s4_max - sm.s4_min) as "Fuel Pump"
           , (AVG(t.s7) - MIN(sm.s7_min))/MIN(sm.s7_max - sm.s7_min) as "Low-pressure Turbine"
           , (AVG(t.s9) - MIN(sm.s9_min))/MIN(sm.s9_max - sm.s9_min) as "Air inlet"
           , (AVG(t.s11) - MIN(sm.s11_min))/MIN(sm.s11_max - sm.s11_min) as "High-pressure Turbine"
           , (AVG(t.s12) - MIN(sm.s12_min))/MIN(sm.s12_max - sm.s12_min) as "Turbine Nozzle"
           , case when t.id = 48 and datepart(second, tp.tstamp)%30 = 0
                                then 1
                                else (AVG(t.s13) - MIN(sm.s13_min))/MIN(sm.s13_max - sm.s13_min)
                 end as "Bleed Air"
           , case when t.id = 48 and datepart(second, tp.tstamp)%30 = 0
                                then 1
                                else (AVG(t.s14) - MIN(sm.s14_min))/MIN(sm.s14_max - sm.s14_min)
                 end as "Bleed Fan"
           , (AVG(t.s15) - MIN(sm.s15_min))/MIN(sm.s15_max - sm.s15_min) as "Body"
           , (AVG(t.s17) - MIN(sm.s17_min))/MIN(sm.s17_max - sm.s17_min) as "Diverter"
           , (AVG(t.s20) - MIN(sm.s20_min))/MIN(sm.s20_max - sm.s20_min) as "Actuator"
           , (AVG(t.s21) - MIN(sm.s21_min))/MIN(sm.s21_max - sm.s21_min) as "Expansion Control"
  from airlinedata as t WITH(READPAST)
 cross apply (values(CAST(CONVERT(varchar(30), t.processed, 120) as datetime2(0)))) as tp(tstamp)
 cross apply sm
 where t.processed >= dateadd(minute, -60, (select t2.recent_processed from edt as t2 where t2.id = t.id))
 group by t.id, tp.tstamp;
'
end;
go


-- Create external table on view on the compute node
-- This will be used to run the query with the aggregations on each compute node & join with the high value data.
--
CREATE EXTERNAL TABLE AirlineEngineSensorDataNorm (
        EngineId int,
        tstamp datetime2(0),
        "Bleed Air Channel" float,
        "Flow Control" float,
        "Fuel Pump" float,
        "Low-pressure Turbine" float,
        "Air inlet" float,
        "High-pressure Turbine" float,
        "Turbine Nozzle" float,
        "Bleed Air" float,
        "Bleed Fan" float,
        "Body" float,
        "Diverter" float,
        "Actuator" float,
        "Expansion Control" float
) 
WITH 
( 
  DATA_SOURCE = [mssql-compute-pool], 
  SCHEMA_NAME = 'dbo', 
  OBJECT_NAME = 'AirlineEngineSensorDataNorm', 
  DISTRIBUTION=ROUND_ROBIN 
);
GO

-- Join high-value data with the high-volume data in compute pool
--
SELECT E.AircraftRegistration, F.Origin, F.Destination, A.*
  FROM AirlineEngineSensorDataNorm AS A
  JOIN high_value_data.dbo.AirlineEngines AS E
    ON E.EngineId = A.EngineId
  JOIN high_value_data.dbo.FlightRoutes AS F
    ON F.AircraftRegistration = E.AircraftRegistration AND F.EngineId = E.EngineId
 WHERE A.EngineId IN (9, 48);
GO