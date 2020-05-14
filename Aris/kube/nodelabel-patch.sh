azdata bdc config add -c custom/control.json -j "$.spec.clusterLabel=bdc"
azdata bdc config add -c custom/control.json -j "$.spec.nodeLabel=bdc-shared"

azdata bdc config add -c custom/bdc.json -j "$.spec.resources.master.spec.nodeLabel=bdc-master"