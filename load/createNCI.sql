CREATE NONCLUSTERED INDEX [idx_objfloap_subchunkid] ON [dbo].[ObjectFullOverlap]
(
	[subChunkId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [OBJ]
GO
/****** Object:  Index [ix_source02_chunkID]    Script Date: 4/5/2018 12:00:21 AM ******/
CREATE NONCLUSTERED INDEX [ix_source0_chunkID] ON [dbo].[Source]
(
	[chunkID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [SRC]
GO
/****** Object:  Index [ix_source02_coordhtmid]    Script Date: 4/5/2018 12:00:21 AM ******/
CREATE NONCLUSTERED INDEX [ix_source_coordhtmid] ON [dbo].[Source]
(
	[coord_htmId20] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [SRC]
GO
/****** Object:  Index [ix_source02_htmid]    Script Date: 4/5/2018 12:00:21 AM ******/
CREATE NONCLUSTERED INDEX [ix_source_htmid] ON [dbo].[Source]
(
	[htmID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [SRC]
GO
/****** Object:  Index [ix_source02_htmid_inc]    Script Date: 4/5/2018 12:00:21 AM ******/
CREATE NONCLUSTERED INDEX [ix_source_htmid_inc] ON [dbo].[Source]
(
	[htmID] ASC
)
INCLUDE ( 	[coord_ra],
	[coord_decl]) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [SRC]
GO



/****** Object:  Index [idx_src_1025_expid]    Script Date: 4/5/2018 12:07:46 AM ******/
CREATE NONCLUSTERED INDEX [idx_src_expid] ON [dbo].[Source]
(
	[exposure_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [SRC]
GO

CREATE NONCLUSTERED INDEX [idx_src_objectid] ON [dbo].[Source]
(
	[objectid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [SRC]
GO

CREATE NONCLUSTERED INDEX [idx_src_parent] ON [dbo].[Source]
(
	[parent] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [SRC]
GO