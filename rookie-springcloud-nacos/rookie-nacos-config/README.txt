文章来源:
https://github.com/alibaba/spring-cloud-alibaba/blob/2023.x/spring-cloud-alibaba-examples/nacos-example/readme-zh.md

1   Open API鉴权
    1.1 获取accessToken：
        curl -X POST '127.0.0.1:8848/nacos/v1/auth/login' -d 'username=nacos&password=nacos123'
    1.2 使用 accessToken 请求 nacos api 接口
        curl -X GET '127.0.0.1:8848/nacos/v1/cs/configs?accessToken=eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJuYWNvcyIsImV4cCI6MTYwNTYyMzkyM30.O-s2yWfDSUZ7Svd3Vs7jy9tsfDNHs1SuebJB4KlNY8Q&dataId=nacos.example.1&group=nacos_group'


2   Nacos Server中添加配置
    $ curl -X POST "http://127.0.0.1:8848/nacos/v1/cs/configs?accessToken=eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJuYWNvcyIsImV4cCI6MTcyNTkwNDMwN30.sMetH5eZFj8BERF54xYP6w5scOrvVpDphVU96TkGSkADS26lKvF37I7CHkGTOa-f&dataId=nacos-config-example.properties&group=DEFAULT_GROUP&content=spring.cloud.nacos.config.serverAddr=127.0.0.1:8848%0Aspring.cloud.nacos.config.prefix=PREFIX%0Aspring.cloud.nacos.config.group=GROUP%0Aspring.cloud.nacos.config.namespace=NAMESPACE"

    2.1 动态刷新
        $ curl -X POST "http://127.0.0.1:8848/nacos/v1/cs/configs?accessToken=eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJuYWNvcyIsImV4cCI6MTcyNTkwNDMwN30.sMetH5eZFj8BERF54xYP6w5scOrvVpDphVU96TkGSkADS26lKvF37I7CHkGTOa-f&dataId=nacos-config-example.properties&group=DEFAULT_GROUP&content=spring.cloud.nacos.config.serveraddr=127.0.0.1:8848%0Aspring.cloud.nacos.config.prefix=PREFIX%0Aspring.cloud.nacos.config.group=DEFAULT_GROUP%0Aspring.cloud.nacos.config.namespace=NAMESPACE"

    {"serverAddr":"127.0.0.1:8848","prefix":"PREFIX","namespace":"NAMESPACE","group":"GROUP"}
    {"serverAddr":"127.0.0.1:8848","prefix":"PREFIX","namespace":"NAMESPACE","group":"DEFAULT_GROUP"}