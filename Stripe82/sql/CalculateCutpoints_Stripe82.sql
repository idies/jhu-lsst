
:setvar PartitionCutpointServer DSP016
:setvar nslices 1
:setvar npartitionsperslice 16
:setvar RefObjectsTable ReferenceObjects2
:setvar outputTableName Cutpoints_Stripe82_16
:setvar dbname suedb


SET NOCOUNT ON
  
 
 declare @nslices smallint
 declare @nPartitionsPerSlice smallint

set @nslices = $(nslices)
set @npartitionsperslice = $(npartitionsperslice)
 
 
 declare @tbl table
( sliceNumber     smallint not null,
  partitionNumber smallint not null,
  minObjIdActual  bigint   not null,
  maxObjIdActual  bigint   not null,
  minObjId        bigint   not null default 0,
  maxObjId        bigint   not null default 0 ) 
  
    declare @nRowsTotal          int,
            @nRowsPerSlice       int,
            @nRowsPerPartition   int,
            @s                   smallint,
            @p                   smallint

    -- compute the number of rows in each slice and partition
    select @nRowsTotal = max(ordinal) from [$(PartitionCutpointServer)].[$(dbname)].dbo.$(RefObjectsTable)
    set @nRowsPerSlice = @nRowsTotal / @nSlices
    set @nRowsPerPartition = @nRowsPerSlice / @nPartitionsPerSlice

	select @nRowsTotal
	select @nRowsPerSlice
	select @nRowsPerPartition


    -- loop once for each slice
    set @s = 1
    while @s <= @nSlices
    begin
    
        declare @cutSlice int

        -- get the minimum row ordinal for the slice
        select @cutSlice = ((@s-1) * @nRowsPerSlice) + 1

        -- loop once for each partition
        set @p = 1
        while @p <= @nPartitionsPerSlice
        begin
        
            declare @cutPartition int
            
            -- get the minimum row ordinal for the partition
            set @cutPartition = ((@p-1) * @nRowsPerPartition) + @cutSlice

			select @cutSlice as 'cutSlice'
			select @cutPartition as 'cutPartition'





            -- get the objID values that correspond to the partition cutpoints
            --insert @tbl(sliceNumber, partitionNumber, minObjIdActual, maxObjIdActual)
            select @s, @p,
                   (select [objID]
                      from [$(PartitionCutpointServer)].[$(dbname)].dbo.$(RefObjectsTable)
                     where ordinal = @cutPartition),
                   (select max([objID])
                      from [$(PartitionCutpointServer)].[$(dbname)].dbo.$(RefObjectsTable) where ordinal = (select max(ordinal)
                                                                    from [$(PartitionCutpointServer)].[$(dbname)].dbo.$(RefObjectsTable)
                                                                   where ordinal <= (@cutPartition+@nRowsPerPartition)))
            set @p = @p + 1
        end

        set @s = @s + 1
    end

    /* round the objID values to 5 sig figs (to be consistent with the way the cutpoints
        were originally computed in the early days of PanSTARRS (way back in 2008) */
    update @tbl
       set minObjId = convert(bigint, 1e13*floor((minObjIdActual + 000009999999999999) / 1e13)) + 1,
           maxObjId = convert(bigint, 1e13*floor((maxObjIdActual + 000009999999999999) / 1e13))
           
    
    
    
    
    /*
    select * 
    into [$(dbname)].dbo.$(OutputTableName)
    from @tbl
    
    
    
    select * from [$(dbname)].dbo.$(OutputTableName)
    */

	select * from @tbl


    
    
    
    
---------------------HACK ALERT---------------------------------

/** 

Get rid of this when we can actually compute the cutpoints from Maui
e.g. when we have reference data

**/
------------------------------------------------------------------
	/*
	insert @tbl
	select * from $(PathToCutpointsTable)
	
	return
	*/


go