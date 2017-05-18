


--%%%%%%%%%%%%%%
--%% APPENDIX %%
--%%%%%%%%%%%%%%
--=======================================================
-- test.go.sql
--
-- execute the workflow for the G. Richards/B. Yanny
-- QSO candidate crossmatch problem
--
-- Alex Szalay, 2008-11-09, Baltimore
--=======================================================
SET NOCOUNT ON
GO
-------------------------------------
-- build the full coadd table
-------------------------------------
IF EXISTS (SELECT * FROM sys.objects
 WHERE object_id = OBJECT_ID(N'[test].[coadd]') AND type in (N'U'))
 DROP TABLE [test].[coadd]
GO
--
CREATE TABLE test.coadd (
 cobjid bigint not null,
 type smallint not null,
 ra float not null,
 dec float not null,
 cx float,
 cy float,
 cz float,
 u real not null,
 g real not null,
 r real not null,
 i real not null,
 z real not null,
 c real not null,
 psfMag_u real not null,
 psfMag_g real not null,
 psfMag_r real not null,
 psfMag_i real not null,
 psfMag_z real not null,
 PRIMARY KEY (cobjid)
)
GO
--
INSERT test.coadd
SELECT
 objid as cobjid, type,
 case when ra>300 then ra-360 else ra end as ra, dec,
 cx, cy, cz,
 psfMag_u - extinction_u as u,
 psfMag_g - extinction_g as g,
 psfMag_r - extinction_r as r,
 psfMag_i - extinction_i as i,
 psfMag_z - extinction_z as z,
 psfMag_i - modelMag_i as c,
 psfMagErr_u, psfMagErr_g, psfMagErr_r, psfMagErr_i, psfMagErr_z
FROM photoObjAll with (readuncommitted, nolock)
WHERE mode=1
 AND objid between 8647474690312306688 and 8647475122761764294
 AND ((psfmag_g - extinction_g) < 23.5 OR (psfmag_i - extinction_i) < 22)
 AND type in (3,6)
-- AND ((ra>=320.0 AND ra<360.0) OR (ra>=0.0 AND ra<=55.0))
-- AND g-i<6.0
-- AND type=6 
 AND psfMagErr_g<0.5
 AND psfMagErr_i<0.333
 AND (psfmag_u>0 AND psfmag_g>0 AND psfmag_r>0 AND psfmag_i>0 AND psfmag_z>0)
 AND (flags & 0x10000000) > 0
 AND (flags & 0x8100000C00AE) = 0
 AND ((flags & 0x100000000000) = 0 OR (flags & 0x1000) = 0)
 AND NOT (
 (flags & 0x400000000000) = 0 AND
 (psfMagErr_g>0.2 OR psfMagErr_r>0.2 OR psfMagErr_i>0.2)
 )
GO
-- 01:10 1230958
CREATE INDEX ix_coadd_ra ON test.coadd(ra)
GO
--------------------------------------------------
PRINT 'test.coadd table created on '+db_name()
 +' at ' + cast(getdate() as varchar(22))
--------------------------------------------------
GO
--%%%%%%%%%%%%%%%
--% zones.sql %
--%%%%%%%%%%%%%%%
--==============================================================
IF EXISTS (SELECT * FROM sys.objects
 WHERE object_id = OBJECT_ID(N'[test].[zone]') AND type in (N'U'))
 DROP TABLE [test].[zone]
GO
--
CREATE TABLE test.zone (
 zoneid int NOT NULL,
 decMin float NOT NULL,
 decMax float NOT NULL,
 alpha float NOT NULL,
 PRIMARY KEY (zoneid)
)
GO
--
--====================================================================
IF EXISTS (SELECT * FROM sys.objects
 WHERE object_id = OBJECT_ID(N'[test].[zone1]') AND type in (N'U'))
 DROP TABLE [test].[zone1]
GO
--
CREATE TABLE test.zone1 (
 zoneid int not null,
 objid bigint not null,
 ra float not null,
 dec float not null,
 cx float not null,
 cy float not null,
 cz float not null,
 PRIMARY KEY (zoneid, ra, objid)
)
GO
--====================================================================
IF EXISTS (SELECT * FROM sys.objects
 WHERE object_id = OBJECT_ID(N'[test].[zone2]') AND type in (N'U'))
 DROP TABLE [test].[zone2]
GO
--
CREATE TABLE test.zone2 (
 zoneid int not null,
 objid bigint not null,
 ra float not null,
 dec float not null,
 cx float not null,
 cy float not null,
 cz float not null,
 PRIMARY KEY (zoneid, ra, objid)
)
GO
--=================================================================
IF EXISTS (SELECT * FROM sys.objects
 WHERE object_id = OBJECT_ID(N'[test].[t2]') AND type in (N'U'))
 DROP TABLE [test].[t2]
GO
--
CREATE TABLE test.t2 (
 objid bigint NOT NULL PRIMARY KEY
)
GO
--=================================================================
IF EXISTS (SELECT * FROM sys.objects
 WHERE object_id = OBJECT_ID(N'[test].[pmts]') AND type in (N'U'))
 DROP TABLE [test].[pmts]
GO
--
CREATE TABLE test.pmts (
 name varchar(20),
 value float
)
GO
--=================================================================
IF EXISTS (SELECT * FROM sys.objects
 WHERE object_id = OBJECT_ID(N'[test].[fZoneAlpha]')
 AND type in (N'FN', N'IF', N'TF', N'FS', N'FT'))
 DROP FUNCTION [test].[fZoneAlpha]
GO
--
CREATE FUNCTION [test].[fZoneAlpha](@theta float, @dec float)
----------------------------------------------------------
--/H Compute alpha "expansion" of theta for a given latitude
-- ------------------------------------------------------
--/T Latitude and theta are in degrees.
----------------------------------------------------------
RETURNS float
AS BEGIN
 IF abs(@dec)+@theta > 89.9 return 180
 RETURN(degrees(abs(atan(
 sin(radians(@theta)) /
 sqrt(abs(
 cos(radians(@dec-@theta))
 *cos(radians(@dec+@theta))
 ))
 ))))
END
GO
------------------------------------------
-- fetch the relevant parameters
-- zoneHeight, maxTheta, ra_lo, ra_hi
------------------------------------------
DECLARE @zoneHeight float, @theta float;
DECLARE @ra_lo float, @ra_hi float;
--
SELECT @zoneHeight=zoneHeight,@theta=theta
FROM GWWN1.alex.dbo.zonePmts
--
SELECT @ra_lo=ra_lo, @ra_hi=ra_hi
FROM GWWN1.alex.dbo.parts
WHERE svname=@@SERVERNAME
 and dbname=DB_NAME()
----------------------
-- log the values
----------------------
INSERT test.pmts VALUES('ra_lo', @ra_lo)
INSERT test.pmts VALUES('ra_hi', @ra_hi)
INSERT test.pmts VALUES('zoneHeight', @zoneHeight)
INSERT test.pmts VALUES('theta', @theta)
-------------------------------------------
-- get the coadd part of the data
-------------------------------------------
INSERT test.zone1
SELECT
 cast(floor(([dec]+90.0)/@zoneHeight) as int) zoneid,
 cobjid as objid,
 ra, dec, cx,cy,cz
FROM test.coadd
WHERE ra>= @ra_lo and ra<@ra_hi
 and g-i<6.0
 and type=6
ORDER BY zoneid, ra, objid
-----------------------------------------------------------
PRINT 'test.zone1 table created with '+cast(@@rowcount as varchar(15))
 +' objects in '+db_name()+' at ' + cast(getdate() as varchar(22))
-----------------------------------------------------------
-- add a bit to the two limits
----------------------------------
SET @ra_lo = @ra_lo - @theta*3;
SET @ra_hi = @ra_hi + @theta*3;
--
PRINT '('+cast(@ra_lo as varchar(20))+','+cast(@ra_hi as varchar(20))+')'
--
IF (@ra_lo<0 and @ra_hi>0)
BEGIN
 PRINT '['+cast(@ra_lo+360 as varchar(20))+','+cast(360 as varchar(20))+']'
 PRINT '['+cast(0 as varchar(20))+','+cast(@ra_hi as varchar(20))+']'
 INSERT test.t2
 SELECT objid
 FROM (
 select objid
 FROM dbo.PhotoObjAll with (nolock, readuncommitted)
 WHERE objid >= 8647475122761764295 -- not in coadd
 AND ra>= (@ra_lo+360) and ra<360
 union all
 select objid
 FROM dbo.PhotoObjAll with (nolock, readuncommitted)
 WHERE objid >= 8647475122761764295 -- not in coadd
 AND ra>= 0 and ra<@ra_hi
 ) q
END
--
IF (@ra_lo<0 and @ra_hi<0)
BEGIN
 PRINT '['+cast(@ra_lo+360 as varchar(20))+','+cast(@ra_hi+360 as varchar(20))+']'
 INSERT test.t2
 SELECT objid
 FROM dbo.PhotoObjAll with (nolock, readuncommitted)
 WHERE objid >= 8647475122761764295 -- not in coadd
 AND ra>= (@ra_lo+360) and ra<(@ra_hi+360)
END
--
IF (@ra_lo>0)
BEGIN
 PRINT '['+cast(@ra_lo as varchar(20))+','+cast(@ra_hi as varchar(20))+']'
 INSERT test.t2
 SELECT objid
 FROM dbo.PhotoObjAll with (nolock, readuncommitted)
 WHERE objid >= 8647475122761764295 -- not in coadd
 AND ra>= @ra_lo and ra<@ra_hi
END
--
DECLARE @r bigint
SELECT @r=count_big(*) FROM test.t2
-----------------------------------------------------------
PRINT 'test.t2 table created with '+cast(@r as varchar(15))
 +' objects in '+db_name()+' at ' + cast(getdate() as varchar(22))
-----------------------------------------------------------
-------------------------------------------
-- get the detections part of the data
-------------------------------------------
INSERT test.zone2
SELECT
 cast(floor(([dec]+90.0)/@zoneHeight) as int) zoneid,
 t.objid,
 case when ra>300 then ra-360 else ra end ra,
 dec, cx,cy,cz
FROM test.t2 t with (nolock) INNER LOOP JOIN
 dbo.PhotoObjAll p with (nolock, readuncommitted)
 ON t.objid=p.objid
WHERE mode in (1,2)
 AND (psfmag_u>0 AND psfmag_g>0 AND psfmag_r>0 AND psfmag_i>0 AND psfmag_z>0)
 AND (flags & 0x10000000) > 0
 AND (flags & 0x8100000C00AE) = 0
 AND ((flags & 0x100000000000) = 0 OR (flags & 0x1000) = 0)
 AND NOT (
 (flags & 0x400000000000) = 0 AND
 (psfMagErr_g>0.2 OR psfMagErr_r>0.2 OR psfMagErr_i>0.2)
 )
SELECT @r=count_big(*) FROM test.zone2
-----------------------------------------------------------
PRINT 'test.zone2 table created with '+cast(@r as varchar(15))
 +' objects in '+db_name()+' at ' + cast(getdate() as varchar(22))
-----------------------------------------------------------
-----------------------------
-- create the zone table
-----------------------------
INSERT test.zone
SELECT zoneid,
 (zoneid*@zoneHeight-90) decMin,
 ((zoneid+1)*@zoneHeight-90) decMax,
 0 alpha
FROM (
 select distinct zoneid
 from (
 select distinct zoneid from test.zone1
 union
 select distinct zoneid from test.zone2
 ) q
) z
ORDER BY zoneid
---------------------------------------
-- insert the alpha limits
---------------------------------------
UPDATE test.zone
 SET alpha = CASE WHEN abs(decMax)<abs(decMin)
 THEN [test].[fZoneAlpha](@theta, decMin)
 ELSE [test].[fZoneAlpha](@theta, decMax)
 END
-----------------------------------------------------------
PRINT 'test.zone table created on '
 +db_name()+' at ' + cast(getdate() as varchar(22))
-----------------------------------------------------------
GO
--%%%%%%%%%%%%%%
--% search.sql %
--%%%%%%%%%%%%%%
--==========================================================================
IF EXISTS (SELECT * FROM sys.objects
 WHERE object_id = OBJECT_ID(N'[test].[zoneZone]') AND type in (N'U'))
DROP TABLE [test].[zoneZone]
GO
--
CREATE TABLE test.zoneZone (
 zone1 int,
 zone2 int,
 alpha float,
 PRIMARY KEY(zone1,zone2)
)
--
INSERT test.zoneZone
SELECT Z1.zoneid, Z2.zoneid, Z2.alpha
FROM test.zone Z1 join test.zone Z2
ON Z2.zoneid between Z1.zoneid - 1 and Z1.zoneid + 1
GO
--------------------------------------
-- drop test.self and test.neighbors
--------------------------------------
IF EXISTS (SELECT * FROM sys.objects
 WHERE object_id = OBJECT_ID(N'[test].[self]') AND type in (N'U'))
 DROP TABLE [test].[self]
GO
IF EXISTS (SELECT * FROM sys.objects
 WHERE object_id = OBJECT_ID(N'[test].[neighbors]') AND type in (N'U'))
DROP TABLE [test].[neighbors]
GO
----------------------------------------------
-- get search radius from head node
----------------------------------------------
DECLARE @theta float;
SELECT @theta = theta FROM GWWN1.alex.dbo.zonePmts
DECLARE @sintheta2 float;
SET @sintheta2 = 4*power(sin(radians(@theta/2)),2);
----------------------
-- do the self-join
----------------------
SELECT U.objid as objid1, U.ra as ra1, U.dec as dec1,
 S.objid as objid2, S.ra as ra2, S.dec as dec2,
 120*degrees(asin(sqrt(
 power(U.cx-S.cx,2)+power(U.cy-S.cy,2)+power(U.cz-S.cz,2)
 )/2)) distance
INTO test.self
FROM test.zone1 U
INNER LOOP JOIN test.zoneZone ZZ on ZZ.zone1=U.zoneid
INNER LOOP JOIN test.zone1 S on ZZ.zone2 = S.zoneid
WHERE S.dec between U.dec-@theta and U.dec+@theta
 and S.ra between U.ra-ZZ.alpha and U.ra+ZZ.alpha
 and U.objid<S.objid
 and power(U.cx-S.cx,2)+power(U.cy-S.cy,2)
 +power(U.cz-S.cz,2) < @sintheta2
----------------------
-- do the neighbors
----------------------
SELECT U.objid as objid1, U.ra as ra1, U.dec as dec1,
 S.objid as objid2, S.ra as ra2, S.dec as dec2,
 120*degrees(asin(sqrt(
 power(U.cx-S.cx,2)+power(U.cy-S.cy,2)+power(U.cz-S.cz,2)
 )/2)) distance
INTO test.neighbors
FROM test.zone1 U
INNER LOOP JOIN test.zoneZone ZZ on ZZ.zone1=U.zoneid
INNER LOOP JOIN test.zone2 S on ZZ.zone2 = S.zoneid
WHERE S.dec between U.dec-@theta and U.dec+@theta
 and S.ra between U.ra-ZZ.alpha and U.ra+ZZ.alpha
 and power(U.cx-S.cx,2)+power(U.cy-S.cy,2)
 +power(U.cz-S.cz,2) < @sintheta2
GO
--
ALTER TABLE test.neighbors
 ADD CONSTRAINT pk_test_neighbors PRIMARY KEY(objid1,objid2)
GO
ALTER TABLE test.self
 ADD CONSTRAINT pk_test_self PRIMARY KEY(objid1,objid2)
GO
-----------------------------------------------------------
PRINT 'test.self and test.neighbors created on '
 +db_name()+' at ' + cast(getdate() as varchar(22))
-----------------------------------------------------------
GO
--%%%%%%%%%%%%%
--% match.sql %
--%%%%%%%%%%%%%
------------------------------------------------
-- collect the results through a four-way join
------------------------------------------------
--=====================================================================
IF EXISTS (SELECT * FROM sys.objects
 WHERE object_id = OBJECT_ID(N'[test].[match]') AND type in (N'U'))
 DROP TABLE [test].[match]
GO
--
CREATE TABLE test.match (
 cobjid bigint NOT NULL,
 objid bigint NOT NULL,
 distance float NULL,
 type_c smallint NOT NULL,
 ra_c float NOT NULL,
 dec_c float NOT NULL,
 c_u real NOT NULL,
 c_g real NOT NULL,
 c_r real NOT NULL,
 c_i real NOT NULL,
 c_z real NOT NULL,
 c_c real NOT NULL,
 fieldid bigint NOT NULL,
 run smallint NOT NULL,
 type smallint NOT NULL,
 mode smallint NOT NULL,
 status int NOT NULL,
 ra float NOT NULL,
 dec float NOT NULL,
 u real NOT NULL,
 g real NOT NULL,
 r real NOT NULL,
C:\Documents and Settings\szalay\My Documents\SC08\test.go.sql 8
 i real NOT NULL,
 z real NOT NULL,
 extinction_u real NOT NULL,
 mjd_r real NOT NULL,
 airmass_r real NOT NULL,
 psfWidth_r real NOT NULL,
 quality tinyint NOT NULL,
 PRIMARY KEY (cobjid, objid)
)
GO
--
INSERT test.match
SELECT
 c.cobjid,
 p.objid,
 n.distance,
 --
 c.type type_c,
 c.ra ra_c, c.dec dec_c,
 c.u c_u,
 c.g c_g,
 c.r c_r,
 c.i c_i,
 c.z c_z,
 c.c c_c,
 --
 p.fieldid,
 p.run, p.type, p.mode, p.status,
 p.ra, p.dec,
 p.psfMag_u - p.extinction_u as u,
 p.psfMag_g - p.extinction_g as g,
 p.psfMag_r - p.extinction_r as r,
 p.psfMag_i - p.extinction_i as i,
 p.psfMag_z - p.extinction_z as z,
 p.extinction_u,
 --
 f.mjd_r,
 f.airmass_r,
 f.psfWidth_r,
 f.quality
 --
FROM test.coadd c JOIN test.neighbors n ON c.cobjid=n.objid1
 JOIN dbo.PhotoObjAll p ON n.objid2=p.objid
 JOIN dbo.Field f ON p.fieldid=f.fieldid
ORDER BY c.cobjid, p.objid
GO
DECLARE @r bigint;
SELECT @r=COUNT_BIG(*) FROM test.match
-----------------------------------------------------------
PRINT 'test.match table created with '+cast(@r as varchar(15))
 +' objects in '+db_name()+' at ' + cast(getdate() as varchar(22))
-----------------------------------------------------------
GO
PRINT 