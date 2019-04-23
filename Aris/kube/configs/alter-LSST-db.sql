alter database lsst
    add log file 
    (
    NAME = LSSTlog,
    FILENAME = '/srv/ssd1/sql_db/LSSTlog.ldf',
    SIZE = 45GB,
    MAXSIZE = UNLIMITED,
    FILEGROWTH = 1GB
);
GO

alter database lsst remove file LSST_log
go

