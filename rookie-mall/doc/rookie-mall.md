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

