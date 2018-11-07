import pandas as pd
from azure.storage.blob import (
    BlockBlobService
)
import io
import export as exp




# for testing
chunkid = 10030
basetable = 'Object'
tablename = exp.generateTableName(basetable, chunkid)


cnx = exp.dbconnect()
s = exp.generateRawObjectSql(tablename, 10)

df = pd.read_sql(s, cnx)

output = df.to_csv(index=False, header=False)

# connect to azure
accountName = 'lsstcsv'
accountKey = 'kJk741bN3dzPggR8Ac7zgDhVhiLXD//Vu79bCAupUwmp8kSTFS8FUPL7+qqkXznxetGXxOvZkC2Vlrk5J2+VQg=='

blobName = '_Object_10030.csv'


container_name = 'sue2'

blobService = BlockBlobService(account_name=accountName, account_key=accountKey)



blobService.create_container(container_name)


blobService.create_blob_from_text(container_name, 'Object_test_10030.csv', df.to_csv(index=False, header=False))




    
