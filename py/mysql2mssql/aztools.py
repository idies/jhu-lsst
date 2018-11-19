import pandas as pd
from azure.storage.blob import (
    BlockBlobService
)
import io



def az_connect():
    accountName = 'lsstcsv',
    accountKey = 'kJk741bN3dzPggR8Ac7zgDhVhiLXD//Vu79bCAupUwmp8kSTFS8FUPL7+qqkXznxetGXxOvZkC2Vlrk5J2+VQg=='

    blobService = BlockBlobService(account_name=accountName, account_key=accountKey)

    return blobService


def listBlobs(container_name, blobService):

    generator = blobService.list_blobs(container_name)
    for blob in generator:
        print("\t Blob Name: " + blob.name)


       """
       azcopy --source /srv/data02/sql_db/sue/chunks --destination https://lsstcsv.blob.core.windows.net/chunks --dest-key kJk741bN3dzPggR8Ac7zgDhVhiLXD//Vu79bCAupUwmp8kSTFS8FUPL7+qqkXznxetGXxOvZkC2Vlrk5J2+VQg== --recursive
"""




