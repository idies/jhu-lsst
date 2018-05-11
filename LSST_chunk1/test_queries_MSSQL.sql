-- 3.1
-- SELECT * FROM Object WHERE deepSourceId = 16968353272299750
SELECT * FROM Object_1025 WHERE deepSourceId = 16968353272299750

-- SELECT COUNT(*) FROM Object WHERE qserv_areaspec_box(42.247928, 38.874077, 42.273855, 39.034748)
--NB qserv_areaspec_box seems to be an indicator to the qserv system that the objects should be found in a box.
-- otherwise there is no constraint on the objects anyway.
-- see https://github.com/lsst/qserv/blob/master/UserManual.md for documentation


-- 3.2
-- SELECT ra , decl , u_psfFlux , g_psfFlux , r_psfFlux FROM Object WHERE y_shapeIxx BETWEEN 20 AND 20.2
SELECT ra , decl , u_psfFlux , g_psfFlux , r_psfFlux FROM Object_1025 WHERE y_shapeIxx BETWEEN 20 AND 20.2

-- SELECT COUNT(*) FROM Source WHERE flux\_sinc BETWEEN 1 AND 1.1
 SELECT COUNT(*) FROM Source_1025 WHERE flux_sinc BETWEEN 1 AND 1.1

-- SELECT COUNT(*) FROM ForcedSource WHERE psfFlux BETWEEN 0.1 AND 0.2
SELECT COUNT(*) FROM ForcedSource_1025 WHERE psfFlux BETWEEN 0.1 AND 0.2


-- 3.3
/*
SELECT o.deepSourceId , s. objectId , s.id , o.ra , o. decl 
  FROM Object o, Source s
 WHERE o.deepSourceId=s. objectId  
   AND s. flux_sinc BETWEEN 0.3 AND 0.31
*/
SELECT o.deepSourceId , s. objectId , s.id , o.ra , o. decl 
  FROM Object_1025 o, Source_1025 s
 WHERE o.deepSourceId=s.objectId  
   AND s.flux_sinc BETWEEN 0.3 AND 0.31


/*
SELECT o.deepSourceId , f . psfFlux 
  FROM Object o, ForcedSource f
 WHERE o.deepSourceId=f .deepSourceId
   AND f . psfFlux BETWEEN 0.13 AND 0.14
 */
 SELECT o.deepSourceId , f . psfFlux 
  FROM Object_1025 o, ForcedSource_1025 f
 WHERE o.deepSourceId=f .deepSourceId
   AND f . psfFlux BETWEEN 0.13 AND 0.14
