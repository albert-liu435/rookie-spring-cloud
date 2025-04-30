参考github代码：
https://github.com/yudiandemingzi/spring-cloud-alibaba-study

## nacos服务注册与发现
启动rookie-mall-goods和rookie-mall-orrder服务

### 设置yaml文件
mall-goods.yml

users:
    name: rookie-mall

进行地址访问:http://localhost:6001/api/v1/config/test-config
服务注册与发现访问地址：http://localhost:7001/api/v1/goods_order/getGoods?goodsId=1

## nacos服务集成openfeign
启动rookie-mall-goods和rookie-mall-orrder服务

负载均衡策略可以查看RandomLoadBalancer类的源码

请求地址：http://localhost:7001/api/v1/goods_order/getGoodsByFeign?goodsId=1
请求地址：http://localhost:7001/api/v1/goods_order/getClusterName?goodsId=1


## nacos服务集成sentinel
sentinel参考文档：https://sentinelguard.io/zh-cn/docs/introduction.html
下载并启动sentinel控制台
启动 rookie-mall-goods服务
请求地址：http://localhost:6001/test-sentinel

采用nacos进行配置
将flowrule.json文件上传到nacos控制台,然后访问：http://localhost:6001/test-sentinel 访问次数超过1次，会限流


## nacos服务集成gateway
启动 rookie-mall-goods、rookie-mall-order、rookie-mall-gateway服务

访问地址: http://localhost:8001/mall-goods/api/v1/config/test-config
访问地址: http://localhost:8001/mall-order/api/v1/goods_order/getGoods?goodsId=1

http://localhost:8001/mall-goods/api/v1/goods/findByGoodsId?goodsId=1



## spring-cloud-sleuth迁移micrometer

https://blog.csdn.net/liu320yj/article/details/136801589

https://www.google.com/search?q=logback+%E6%95%B4%E5%90%88micrometer&rlz=1C1FKPE_en__1112__1112&oq=logback+%E6%95%B4%E5%90%88micrometer&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIICAEQABgIGB4yCggCEAAYgAQYogQyBwgDEAAY7wUyBwgEEAAY7wUyBwgFEAAY7wUyBwgGEAAY7wXSAQk1MjM5ajFqMTWoAgiwAgHxBYnOer0T-4f28QWJznq9E_uH9g&sourceid=chrome&ie=UTF-8


https://gitee.com/little-ali-of-peach/springcloud-demo

- Migrate from Spring Cloud Sleuth to Micrometer Tracing .
  You can check the Sleuth 3.1 Migration Guide over here [https://github.com/micrometer-metrics/tracing/wiki/Spring-Cloud-Sleuth-3.1-Migration-Guide].
  If you want to disable this check, just set the property [spring.cloud.compatibility-verifier.enabled=false]


