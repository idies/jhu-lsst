use lsst_datapool

alter database lsst_datapool
    add log file 
    (
    NAME = LSST_datapoollog,
    FILENAME = '/srv/ssd1/sql_db/LSST_datapoollog.ldf',
    SIZE = 1GB,
    MAXSIZE = UNLIMITED,
    FILEGROWTH = 1GB
);
GO

DBCC SHRINKFILE (N'LSST_datapool_log', EMPTYFILE )

alter database lsst_datapool
    modify file 
    (
    NAME = LSST_datapool_log,
    MAXSIZE = 8192KB
);
GO

alter database lsst_datapool
    modify file 
    (
    NAME = LSST_datapool_log,
    FILEGROWTH = 0
);
GO

alter database lsst_datapool remove file LSST_datapool_log
go

