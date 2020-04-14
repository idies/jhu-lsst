# DNS names for BDC services
azdata bdc config replace -c custom-ad/control.json -j "$.spec.endpoints[0].dnsName=adtest-controller.sdss.pha.jhu.edu"
azdata bdc config replace -c custom-ad/control.json -j "$.spec.endpoints[1].dnsName=adtest-monitor.sdss.pha.jhu.edu"

azdata bdc config replace -c custom-ad/bdc.json -j "$.spec.resources.master.spec.endpoints[0].dnsName=adtest-master.sdss.pha.jhu.edu"
#azdata bdc config replace -c custom-ad/bdc.json -j "$.spec.resources.master.spec.endpoints[1].dnsName=<SQL Master Secondary DNS name>.<Domain name. e.g. contoso.local>"
azdata bdc config replace -c custom-ad/bdc.json -j "$.spec.resources.gateway.spec.endpoints[0].dnsName=adtest-gateway.sdss.pha.jhu.edu"
azdata bdc config replace -c custom-ad/bdc.json -j "$.spec.resources.appproxy.spec.endpoints[0].dnsName=adtest-appproxy.sdss.pha.jhu.edu"