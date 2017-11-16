/*
I have a table called bloxfile that contains basically a fileId (to be used as partitioning key),
a fileLocation and a size in bytes.
Then the following query, using @numPartition, will give all files in order of fileid, with a running total of size.
It adds a percentage, and the partitionId to which the files could belong.
The version at the bottom finds the right boundery for each partition, note assumed to be 'right' inclusive.
*/

declare @numPartition integer = 24;
with total as (
select 1./cast(sum(size) as float) as oneOverSize from BloxFile
), rt as (
select fileId, fileLocation,size,
                sum(size) over(order by fileId rows unbounded preceding) as runningSumSize,
       100*oneOverSize*sum(size) over(order by fileId rows unbounded preceding) as runningPercentage
from bloxfile cross join total
)
select *, cast(round(1e-9*runningSumSize,2) as varchar(24))+' GB' as sizeGB
, ceiling(@numPartition*runningPercentage/100) as partitionId
from rt
order by 1

-- 
declare @numPartition integer = 24;
with total as (
select 1./cast(sum(size) as float) as oneOverSize from BloxFile
), rt as (
select fileId, fileLocation,size,
                sum(size) over(order by fileId rows unbounded preceding) as runningSumSize,
       100*oneOverSize*sum(size) over(order by fileId rows unbounded preceding) as runningPercentage
from bloxfile cross join total
), r as (
select *, cast(round(1e-9*runningSumSize,2) as varchar(24))+' GB' as sizeGB
, ceiling(@numPartition*runningPercentage/100) as partitionId
from rt
)
select partitionId,max(fileId) as maxLim
from r
group by partitionId
order by 1