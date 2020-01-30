import requests
from gzip import GzipFile
from StringIO import StringIO
import os
import sys
import subprocess

# Until we add astropy to all nodes (perhaps in a cluster setup step,
# or through other means), we install it within the application. This
# is actually pretty fast, but annoying to do nonetheless.
if 'astropy' not in sys.modules:
    stdout = subprocess.check_output(
        sys.executable + ' -m pip install astropy',
        stderr=subprocess.STDOUT,
        shell=True).decode('utf-8')
    print(stdout)
from astropy.io import fits

# Lets experiment with a small number of files
manga_base = 'https://data.sdss.org/sas/dr13/manga/spectro/redux/v1_5_4/7977/stack/'
manga_file = '-LOGRSS.fits.gz'
manga_ext_list = [
    '7977-12703',
    '7977-12704',
    '7977-1901',
    '7977-1902',
    '7977-3701',
    '7977-3702',
    '7977-3703',
]

# download files and cache
manga_files = [manga_base + 'manga-' + i + manga_file for i in manga_ext_list]
download_rdd = sc.parallelize(manga_files).map(lambda x: (x, requests.get(x).content)).cache()

# unzip and open as fits
fits_rdd = download_rdd.map(
    lambda x: (x[0], GzipFile(fileobj=StringIO(x[1])).read())
).map(
    lambda x: (x[0], fits.open(StringIO(x[1])))
)

# unfortunately the spark dataframe interface only supports basic
# python types, so here we convert to the closest native
# representation for numpy objects
def typeconv(i):
    try:
        return i.item()
    except:
        return i

# Now table the input tuples of (filename, fits_object) and create a
# list of dictionaries (one per row) for conversion by dataframe,
# while adding the original filename to each row for reference. This
# should be changed to use Row() instead of dict eventually.
def tableToRows(f_tuple):
    filename = f_tuple[0]
    table = f_tuple[1][8].data
    columns = [i.name for i in table.columns]
    return [dict(zip(columns, [typeconv(i) for i in r])+[('ORIGIN_FILE', filename)]) for r in table]

# Do the table conversion and create a DataFrame from it
table_rdd = fits_rdd.flatMap(lambda x: tableToRows(x))
df = spark.createDataFrame(table_rdd)

# Create a table identifier in the sql context for queries
df.createOrReplaceTempView('manga')

# Do some queries
spark.sql('''SELECT ORIGIN_FILE,MJD,EXPTIME,HUMIDITY FROM manga''').show()

# Optionally save the dataframe in parquet format. This writes a bunch
# of files under this path which can be read effectively as a single
# table (there is a file per partition of the rdd). Can be read in
# again with spark.read.parquet(...)
df.write.parquet('hdfs:///manga/arik-test/hdu8')
