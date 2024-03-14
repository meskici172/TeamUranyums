@echo off
cd /d C:\Users\mehmet.eskici\Desktop\HttpBin
echo Newman ile testleri calıstırılıyor...
newman run httpbin.json -e HttpBinenvironment.json --reporters cli,json --reporter-json-export report.json
