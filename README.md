# elasticsearch-demo
Elasticsearch Spring-data  
# introduction
  ElasticSearch是一个基于Lucene的搜索服务器。它提供了一个分布式多用户能力的全文搜索引擎，基于RESTful web接口。本demo采用spring-boot+spring-data-elasticsearch，操作es的curd。
# 配置指南
  开发环境：  
  1.此demo用的version 2.1.1版本elasticsearch，download and install elasticsearch。  
    下载地址：https://www.elastic.co/downloads/elasticsearch,安装使用参考：http://liuhongjiang.github.io/tech/blog/2013/01/11/es/    
  2.启动elasticsearch，访问：curl 'http://localhost:9200/?pretty'，会有json返回，status为200，证明启动成功。
  3.启动 server，直接run com.zbt.elasticsearch.ElasticsearchServer类。  
  4.浏览器访问localhost:8080/dish/1,会有response数据返回(此数据为data目录下的数据)。  
  5.post调用localhost:8080/dish，parameter：{"id":10,"name":"妈妈做的菜","description":"家乡菜"},add dish.  
    然后get调用localhost:8080/dish/10,会有response数据返回,证明add成功。  

