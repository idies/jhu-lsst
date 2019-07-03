use LSST

--execute ('select @@servername') at data_source SqlDataPool

execute ('sp_configure "max server memory"') at data_source SqlDataPool
execute ('sp_configure "show advanced options", 1; RECONFIGURE;') at data_source SqlDataPool
--execute ('sp_configure "max server memory", 65536; RECONFIGURE;') at data_source SqlDataPool
execute ('sp_configure "max server memory", 2147483647; RECONFIGURE;') at data_source SqlDataPool
execute ('sp_configure "max server memory"') at data_source SqlDataPool
