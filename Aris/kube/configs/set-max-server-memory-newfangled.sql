--execute ('select @@servername') at data_source SqlDataPool
execute ('sp_configure "max server memory", 65536; RECONFIGURE;') at data_source SqlDataPool
