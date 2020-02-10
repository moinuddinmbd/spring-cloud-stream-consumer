# spring-cloud-stream-consumer
Spring cloud messaging consumer. This will consume messages from messaging layer (Kafka in this case), anonymize some attributes and save it to elasticsearch.
## Download elasticsearch
1. Download elasticsearch from their official download page. Unzip the tar and start ES.
> elasticsearch\bin\elasticsearch.bat

2. Run below command to start the consumer.
> mvn spring-boot:run

3. Query to check the records in elasticsearch
> curl -XGET 'http://localhost:9200/business-event/_search'
