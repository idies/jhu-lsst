


select top 10 id, coord_ra, coord_decl, coord_htmId20, chunkID, 
LSST20.htmid.FromEqAdvanced(coord_ra, coord_decl, 20) as jhuHTM, 
cast(coord_htmId20 as float)/LSST20.htmid.FromEqAdvanced(coord_ra, coord_decl,20) as ratio, LSST20.htmid.FromEq(coord_ra, coord_decl) from Source_01
--order by id desc

select top 10 deepSourceId, ra, decl, htmID, chunkID 
from Object_01
order by deepsourceid




