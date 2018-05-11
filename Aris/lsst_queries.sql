use high_value_data
;
declare @mh bigint
 select @mh=max(htmid) 
 from lsst.Object 

 select * from lsst.object o
where  o.htmid > @mh-100000000


 select * from lsst.object o
where deepSourceId=4502538770453139


