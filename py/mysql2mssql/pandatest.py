import pandas as pd
from azure.storage.blob import (
    BlockBlobService
)
import io
import export as exp







cnx = exp.dbconnect()
s = exp.generateRawObjectSql(tablename, 10)

df = pd.read_sql(s, cnx)

output = df.to_csv(index=False, header=False)

# connect to azure
accountName = 'lsstcsv'
accountKey = 'kJk741bN3dzPggR8Ac7zgDhVhiLXD//Vu79bCAupUwmp8kSTFS8FUPL7+qqkXznxetGXxOvZkC2Vlrk5J2+VQg=='


container_name = 'sue2/testdir1'

blobService = BlockBlobService(account_name=accountName, account_key=accountKey)
blobService.create_container(container_name)

# blobService.create_blob_from_text(container_name, 'Object_test_10030.csv', df.to_csv(index=False, header=False))

filename = 'Object_10030.csv'
csvpath = '/srv/data02/sql_db/sue/tests/Object_10030.csv'
# blobname = os.path.join(csvpath,'test2/Source_10030_94230528.csv')
blobService.create_blob_from_path(container_name, filename, csvpath)


block_blob_service.create_blob_from_path(container_name, local_file_name, full_path_to_file)

# Create a file in Documents to test the upload and download.
local_path=os.path.expanduser("~\Documents")
local_file_name ="QuickStart_" + str(uuid.uuid4()) + ".txt"
full_path_to_file =os.path.join(local_path, local_file_name)


    
