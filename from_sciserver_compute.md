We can connect jupyter notebooks to the ARIS cluster and execute spark
and sql seemlessly with a few additions to Jupyter and some
config. Here are the steps to get going. Do the following in a
terminal session in a Python+R sciserver container:

* Install sparkmagic
```
pip install sparkmagic
```
* Install the kernel into jupyter
```
jupyter-kernelspec install --user /home/idies/miniconda3/lib/python3.6/site-packages/sparkmagic/kernels/pysparkkernel/
jupyter-kernelspec install --user /home/idies/miniconda3/lib/python3.6/site-packages/sparkmagic/kernels/sparkkernel/
jupyter-kernelspec install --user /home/idies/miniconda3/lib/python3.6/site-packages/sparkmagic/kernels/sparkrkernel/
```
* Enable the extensions
There seems to be a problem with table data rendering, but this does
properly render the progress bar for spark jobs. It is not a strict
requirement either.

```
jupyter nbextension enable --py --sys-prefix widgetsnbextension
```
* Add config
```
cat <<EOF> ~/.sparkmagic/config.json
sparkmagic/config.json
{
 "kernel_python_credentials": {
  "username": "root",
  "password": "*********",
  "url": "https://172.23.25.61:30443/gateway/default/livy/v1",
  "auth": "Basic_Access"
 },
 "ignore_ssl_errors": true,
 "cleanup_all_sessions_on_exit": true
}
EOF
```

Replace the password with the password you know and love
* Reload page, select a new notebook with "pyspark" kernel and enjoy.
Try something like this as the first cell:

```
%%configure -f
{"name": "remotesparkmagics-ak47", "executorMemory": "1G", "numExecutors": 2, "executorCores": 1,
 "conf": {"spark.yarn.appMasterEnv.PYSPARK_PYTHON":"python3"}}
```

This sets python3 and a small number of executors and memory. Size up
as needed. Simlarly for scala shells just without the python conf
