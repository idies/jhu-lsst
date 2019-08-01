import export as exp
import os
from time import time


def do_export():
    export_log = []
    skipped = []
    tic = time()
    print('Starting export at\t{time}'.format(time=tic))

    csvbase = '/srv/data02/sql_db/sue/chunks/'
    
    cnx = exp.dbconnect()
    # basetable = 'Object'
    object_tables = exp.getTablenamesFromDB('Object', cnx)

    for row in object_tables:
        table = row[0]
        chunkid = exp.getChunkIDFromTablename(table)
        chunkdir = os.path.join(csvbase, chunkid)

        # check if dir exists
        direxists = os.path.isdir(chunkdir)
        if direxists == False:

            try:
                os.mkdir(chunkdir)
                os.chmod(chunkdir, 0o777)
            except(OSError):
                print("failed to create directory {chunkdir}".format(chunkdir=chunkdir))
        
        else:
            print('directory {chunkdir} already exists'.format(chunkdir=chunkdir))
        


        objtable, objfile = exp.generateFileInfo(chunkid, 'Object', chunkdir)

        # check if object file exists
        if (os.path.isfile(objfile)) == False:
            sql = exp.generateObjectSql(chunkid, table, objfile)

            #write object csv file to directory
            otime = exp.executesql(cnx, sql)
            print('\t{table} exported in\t{time}'.format(table=objtable, time=otime))
        
        else: 
            print('file {file} already exists'.format(file=objfile))
            skipped.append(objfile)

        #export source csv files by exposure_id
        log_time = exp.export_by_exposure_id(exp.generateTableName('Source',chunkid), chunkdir, cnx)
    
        export_log.append(log_time)
    toc = time()
    print('Export finished at\t{time}\telapsed time is\t{etime}'.format(time=toc, etime=(toc-tic)))
    print('skipped:' + skipped)
    return export_log

def main():
     log = do_export()


    



