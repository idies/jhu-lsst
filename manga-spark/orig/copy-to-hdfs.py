# For experimentation or analysis jobs that start with FITS files, it
# is probably best to keep a local copy to avoid time spent
# downloading over external network. Here is a way to copy files to
# hdfs using pyspark.

# This is not very pretty, gets the job done. Seems there is also
# manga data in a mountpoint on /sciserver/vc that could be copied
# from if the automount issue gets resolved for the storage containers.

import requests
from StringIO import StringIO
from pyarrow import hdfs
import subprocess

files = [
    'https://data.sdss.org/sas/dr13/manga/spectro/redux/v1_5_4/7977/stack/manga-7977-' + \
    i + '-LOGRSS.fits.gz'
    for i in ['12703', '12704', '1901', '1902', '3701', '3702', '3703']
]

def copy_file_to_hdfs(local, dest):
    cmd = '/opt/hadoop/bin/hdfs dfs -put {} {}'.format(local, dest)
    try:
        stdout = subprocess.check_output(
            cmd,
            stderr = subprocess.STDOUT,
            shell=True).decode('utf-8')
    except Exception as e:
        return (1, e.output)
    return (0, stdout)

def download_to_hdfs(file_data):
    parts = file_data[0].split('/')
    dr = parts[4]
    ver = parts[8]
    name = parts[-1]
    basename = '{}-{}-{}'.format(dr,ver,name)
    dest = 'hdfs:///manga/fits/{}'.format(basename)
    # cache a local copy of file to put to hdfs
    with open(basename, 'wb') as f:
        f.write(file_data[1])
    copy = copy_file_to_hdfs(basename, dest)
    os.remove(basename)
    return copy

sc.parallelize(files).map(lambda x: (x, requests.get(x).content)).map(download_to_hdfs).collect()
