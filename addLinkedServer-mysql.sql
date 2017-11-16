USE [master]
GO

/****** Object:  LinkedServer [DSP016]    Script Date: 10/19/2017 1:54:05 PM ******/
EXEC master.dbo.sp_addlinkedserver @server = N'DSP016', @srvproduct=N'MySQL', @provider=N'MSDASQL', @datasrc=N'dsp016_mysql', @location=N'dsp016'
 /* For security reasons the linked server remote logins password is changed with ######## */
EXEC master.dbo.sp_addlinkedsrvlogin @rmtsrvname=N'DSP016',@useself=N'False',@locallogin=NULL,@rmtuser=N'root',@rmtpassword='########'

GO

EXEC master.dbo.sp_serveroption @server=N'DSP016', @optname=N'collation compatible', @optvalue=N'false'
GO

EXEC master.dbo.sp_serveroption @server=N'DSP016', @optname=N'data access', @optvalue=N'true'
GO

EXEC master.dbo.sp_serveroption @server=N'DSP016', @optname=N'dist', @optvalue=N'false'
GO

EXEC master.dbo.sp_serveroption @server=N'DSP016', @optname=N'pub', @optvalue=N'false'
GO

EXEC master.dbo.sp_serveroption @server=N'DSP016', @optname=N'rpc', @optvalue=N'false'
GO

EXEC master.dbo.sp_serveroption @server=N'DSP016', @optname=N'rpc out', @optvalue=N'true'
GO

EXEC master.dbo.sp_serveroption @server=N'DSP016', @optname=N'sub', @optvalue=N'false'
GO

EXEC master.dbo.sp_serveroption @server=N'DSP016', @optname=N'connect timeout', @optvalue=N'0'
GO

EXEC master.dbo.sp_serveroption @server=N'DSP016', @optname=N'collation name', @optvalue=null
GO

EXEC master.dbo.sp_serveroption @server=N'DSP016', @optname=N'lazy schema validation', @optvalue=N'false'
GO

EXEC master.dbo.sp_serveroption @server=N'DSP016', @optname=N'query timeout', @optvalue=N'0'
GO

EXEC master.dbo.sp_serveroption @server=N'DSP016', @optname=N'use remote collation', @optvalue=N'true'
GO

EXEC master.dbo.sp_serveroption @server=N'DSP016', @optname=N'remote proc transaction promotion', @optvalue=N'true'
GO


