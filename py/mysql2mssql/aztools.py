import export as exp
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




