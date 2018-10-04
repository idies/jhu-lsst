USE high_value_data
GO
DECLARE @data_pool_name NVARCHAR(max) = 'mssql-data-pool'
DECLARE @cluster_node_count INT = 4

EXEC sp_data_pool_create @data_pool_name, @cluster_node_count
GO


select * from dm_data_pools()

DECLARE @data_pool_name NVARCHAR(max) = 'mssql-data-pool'
SELECT * FROM dm_data_pool_node_status (@data_pool_name)


exec sp_data_pool_log
