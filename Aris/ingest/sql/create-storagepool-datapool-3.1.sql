

USE LSST
GO

-- Create the SqlDataPool data source:
IF NOT EXISTS(SELECT * FROM sys.external_data_sources WHERE name = 'SqlDataPool')
		IF SERVERPROPERTY('ProductLevel') = 'CTP3.0'
			CREATE EXTERNAL DATA SOURCE SqlDataPool
			WITH (LOCATION = 'sqldatapool://controller-svc:8080/datapools/default');
		ELSE IF SERVERPROPERTY('ProductLevel') = 'CTP3.1'
			CREATE EXTERNAL DATA SOURCE SqlDataPool
			WITH (LOCATION = 'sqldatapool://controller-svc/default');

-- Create the SqlStoragePool data source:
IF NOT EXISTS(SELECT * FROM sys.external_data_sources WHERE name = 'SqlStoragePool')
    IF SERVERPROPERTY('ProductLevel') = 'CTP3.0'
        CREATE EXTERNAL DATA SOURCE SqlStoragePool
        WITH (LOCATION = 'sqlhdfs://controller-svc:8080/default');
    ELSE IF SERVERPROPERTY('ProductLevel') = 'CTP3.1'
        CREATE EXTERNAL DATA SOURCE SqlStoragePool
        WITH (LOCATION = 'sqlhdfs://controller-svc/default');