
drop table ReferenceObjects2

create table ReferenceObjects2
( ordinal int    not null identity,
  RA      float  not null,
  [dec]   float  not null,
  [objID] bigint not null )

  create clustered index PK_ReferenceObjects2 on dbo.ReferenceObjects2([objID]) with (sort_in_tempdb=on)
go

dbcc traceon(610)
insert dbo.referenceObjects2
--with (tablockx)
 (ra, dec, objid)
select ra, dec, objid
from Stripe82.dbo.photoObjAll with (nolock)

create nonclustered index IX_ReferenceObjects_ordinal on dbo.ReferenceObjects2(ordinal) with (sort_in_tempdb=on)
go


select * from suedb.dbo.ReferenceObjects2
--(851495166 row(s) affected)
--1:11

