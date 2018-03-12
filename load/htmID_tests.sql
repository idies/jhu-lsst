


select top 10 id, coord_ra, coord_decl, coord_htmId20, chunkID, 
LSST20.htmid.FromEqAdvanced(coord_ra, coord_decl, 20) as jhuHTM, 
--cast(coord_htmId20 as float)/LSST20.htmid.FromEqAdvanced(coord_ra, coord_decl,20) as ratio, 
LSST20.htmid.FromEq(coord_ra, coord_decl), h.ra, h.dec from Source_01
cross apply LSST20.htmID.GetCenter(coord_htmID20) as h
--order by id desc
--where chunkID = 1025
--where id = 9310939610611712
where coord_htmId20 = 12754127959762

select * from LSST20.htmid.GetCenter(12754127959762)


select top 10 deepSourceId, ra, decl, htmID, chunkID,LSST20.htmid.FromEqAdvanced(ra, decl, 20) as jhuHTM 
from Object_01
--order by deepsourceid
where chunkID = 1025

exec sp_spaceused 'Source_01'
--364,192,720    

create index ix_coordHTM on Source_01(coord_htmID20) include (coord_ra, coord_decl)      

select top 100 s.id, s.chunkID, o.deepsourceID, o.chunkID
from Source_01 s join Object_01 o
on s.id = o.deepSourceId


create view source01_v as
select s.*, LSST20.htmid.FromEq(s.coord_ra, s.coord_decl) as htmID
from source_01 s

select * from source01_v
where htmID = coord_htmId20







