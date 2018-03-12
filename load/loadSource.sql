
exec sp_helpfile

use lsst_stage
go

--1. create stage on staging fg with template

drop table if exists source_stage


select * into source_stage 
on [ST_01]
from source_template
where (0=1)
go


alter table source_stage 
add constraint def_ss_999 default -999 for chunkID



-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
---counter = partition number to insert
declare @counter integer = 3, @nPart integer = 4

declare @sql nvarchar(4000), @s1 nvarchar(100), @s2 nvarchar(512);
declare @id int, @name varchar(64), @rows int, @last int;
declare @loc nvarchar(200)
declare @tname sysname = 'Source'
declare @stagetab sysname = 'source_v'

declare @doExecute bit = 0

set nocount on

-------------------------
--
-- to actually insert the data set @doExecute=1
--
set @doExecute = 1


--select  @s1 = N'BULK INSERT source_v FROM ''',
select  @s1 = N'BULK INSERT ' + @stagetab +' FROM ''',
                @s2 = N''' WITH ('
                 --       + '     DATAFILETYPE = ''char'','
                 --       + '     CODEPAGE=''1251'','
						+ ' FIRSTROW=2,  '  
                        + '     FIELDTERMINATOR = '';'','
  --                      + ' ROWTERMINATOR = ''0x0a'','
                        + ' TABLOCK );',        
                @last = 0;

--while (@counter <= @nPart)
	begin
		declare @bulk_cur as cursor

		set @bulk_cur = cursor fast_forward for 
			select loc, chunkid 
			from part_all
			where partitionID = @counter
			and tname = @tname

			open @bulk_cur

			fetch next from @bulk_cur into @loc, @id
			while @@FETCH_STATUS = 0
			begin
				


				set @sql = @s1 + @loc + @s2
				print @sql
				if (@doExecute = 1)
				begin
					exec sp_executesql @sql

				update source_stage
				set chunkid = @id
				where chunkid = -999
				
					set @rows = @@rowcount;
					insert loadlog(fileId, tname, fname,[rows],ltime) values(@id,@tname, @loc, @rows, GETDATE());
				end

				fetch next from @bulk_cur into @loc, @id
			end
			close @bulk_cur
			deallocate @bulk_cur

	 --set @counter = @counter+1
	end

select * from LoadLog order by ltime desc


create index ix_source on source_stage(id)
on st_01

USE [LSST_03]
GO

INSERT INTO [dbo].[Source_03] with (tablockx)
           ([id]
           ,[coord_ra]
           ,[coord_decl]
           ,[coord_htmId20]
           ,[htmID]
           ,[parent]
           ,[flags_badcentroid]
           ,[centroid_sdss_x]
           ,[centroid_sdss_y]
           ,[centroid_sdss_xVar]
           ,[centroid_sdss_xyCov]
           ,[centroid_sdss_yVar]
           ,[centroid_sdss_flags]
           ,[flags_pixel_edge]
           ,[flags_pixel_interpolated_any]
           ,[flags_pixel_interpolated_center]
           ,[flags_pixel_saturated_any]
           ,[flags_pixel_saturated_center]
           ,[flags_pixel_cr_any]
           ,[flags_pixel_cr_center]
           ,[centroid_naive_x]
           ,[centroid_naive_y]
           ,[centroid_naive_xVar]
           ,[centroid_naive_xyCov]
           ,[centroid_naive_yVar]
           ,[centroid_naive_flags]
           ,[centroid_gaussian_x]
           ,[centroid_gaussian_y]
           ,[centroid_gaussian_xVar]
           ,[centroid_gaussian_xyCov]
           ,[centroid_gaussian_yVar]
           ,[centroid_gaussian_flags]
           ,[shape_sdss_Ixx]
           ,[shape_sdss_Iyy]
           ,[shape_sdss_Ixy]
           ,[shape_sdss_IxxVar]
           ,[shape_sdss_IxxIyyCov]
           ,[shape_sdss_IxxIxyCov]
           ,[shape_sdss_IyyVar]
           ,[shape_sdss_IyyIxyCov]
           ,[shape_sdss_IxyVar]
           ,[shape_sdss_flags]
           ,[shape_sdss_centroid_x]
           ,[shape_sdss_centroid_y]
           ,[shape_sdss_centroid_xVar]
           ,[shape_sdss_centroid_xyCov]
           ,[shape_sdss_centroid_yVar]
           ,[shape_sdss_centroid_flags]
           ,[shape_sdss_flags_unweightedbad]
           ,[shape_sdss_flags_unweighted]
           ,[shape_sdss_flags_shift]
           ,[shape_sdss_flags_maxiter]
           ,[flux_psf]
           ,[flux_psf_err]
           ,[flux_psf_flags]
           ,[flux_psf_psffactor]
           ,[flux_psf_flags_psffactor]
           ,[flux_psf_flags_badcorr]
           ,[flux_naive]
           ,[flux_naive_err]
           ,[flux_naive_flags]
           ,[flux_gaussian]
           ,[flux_gaussian_err]
           ,[flux_gaussian_flags]
           ,[flux_gaussian_psffactor]
           ,[flux_gaussian_flags_psffactor]
           ,[flux_gaussian_flags_badcorr]
           ,[flux_sinc]
           ,[flux_sinc_err]
           ,[flux_sinc_flags]
           ,[centroid_record_x]
           ,[centroid_record_y]
           ,[classification_extendedness]
           ,[aperturecorrection]
           ,[aperturecorrection_err]
           ,[refFlux]
           ,[refFlux_err]
           ,[objectId]
           ,[coord_raVar]
           ,[coord_radeclCov]
           ,[coord_declVar]
           ,[exposure_id]
           ,[exposure_filter_id]
           ,[exposure_time]
           ,[exposure_time_mid]
           ,[cluster_id]
           ,[cluster_coord_ra]
           ,[cluster_coord_decl]
           ,[chunkID]
           ,[subChunkID]) 
    select 
	[id]
           ,[coord_ra]
           ,[coord_decl]
           ,[coord_htmId20]
           ,LSST20.htmid.FromEq(coord_ra, coord_decl)
           ,[parent]
           ,[flags_badcentroid]
           ,[centroid_sdss_x]
           ,[centroid_sdss_y]
           ,[centroid_sdss_xVar]
           ,[centroid_sdss_xyCov]
           ,[centroid_sdss_yVar]
           ,[centroid_sdss_flags]
           ,[flags_pixel_edge]
           ,[flags_pixel_interpolated_any]
           ,[flags_pixel_interpolated_center]
           ,[flags_pixel_saturated_any]
           ,[flags_pixel_saturated_center]
           ,[flags_pixel_cr_any]
           ,[flags_pixel_cr_center]
           ,[centroid_naive_x]
           ,[centroid_naive_y]
           ,[centroid_naive_xVar]
           ,[centroid_naive_xyCov]
           ,[centroid_naive_yVar]
           ,[centroid_naive_flags]
           ,[centroid_gaussian_x]
           ,[centroid_gaussian_y]
           ,[centroid_gaussian_xVar]
           ,[centroid_gaussian_xyCov]
           ,[centroid_gaussian_yVar]
           ,[centroid_gaussian_flags]
           ,[shape_sdss_Ixx]
           ,[shape_sdss_Iyy]
           ,[shape_sdss_Ixy]
           ,[shape_sdss_IxxVar]
           ,[shape_sdss_IxxIyyCov]
           ,[shape_sdss_IxxIxyCov]
           ,[shape_sdss_IyyVar]
           ,[shape_sdss_IyyIxyCov]
           ,[shape_sdss_IxyVar]
           ,[shape_sdss_flags]
           ,[shape_sdss_centroid_x]
           ,[shape_sdss_centroid_y]
           ,[shape_sdss_centroid_xVar]
           ,[shape_sdss_centroid_xyCov]
           ,[shape_sdss_centroid_yVar]
           ,[shape_sdss_centroid_flags]
           ,[shape_sdss_flags_unweightedbad]
           ,[shape_sdss_flags_unweighted]
           ,[shape_sdss_flags_shift]
           ,[shape_sdss_flags_maxiter]
           ,[flux_psf]
           ,[flux_psf_err]
           ,[flux_psf_flags]
           ,[flux_psf_psffactor]
           ,[flux_psf_flags_psffactor]
           ,[flux_psf_flags_badcorr]
           ,[flux_naive]
           ,[flux_naive_err]
           ,[flux_naive_flags]
           ,[flux_gaussian]
           ,[flux_gaussian_err]
           ,[flux_gaussian_flags]
           ,[flux_gaussian_psffactor]
           ,[flux_gaussian_flags_psffactor]
           ,[flux_gaussian_flags_badcorr]
           ,[flux_sinc]
           ,[flux_sinc_err]
           ,[flux_sinc_flags]
           ,[centroid_record_x]
           ,[centroid_record_y]
           ,[classification_extendedness]
           ,[aperturecorrection]
           ,[aperturecorrection_err]
           ,[refFlux]
           ,[refFlux_err]
           ,[objectId]
           ,[coord_raVar]
           ,[coord_radeclCov]
           ,[coord_declVar]
           ,[exposure_id]
           ,[exposure_filter_id]
           ,[exposure_time]
           ,[exposure_time_mid]
           ,[cluster_id]
           ,[cluster_coord_ra]
           ,[cluster_coord_decl]
           ,[chunkID]
           ,[subChunkID]
		from lsst_stage.dbo.source_stage
		with (nolock)






