文章来源:
https://github.com/alibaba/spring-cloud-alibaba/blob/2023.x/spring-cloud-alibaba-examples/nacos-example/readme-zh.md


1、启动应用示例

查询服务验证
注意：需要替换 accessToken！

在浏览器输入此地址 http://101.43.142.12:8848/nacos/v1/ns/catalog/instances?accessToken=eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJuYWNvcyIsImV4cCI6MTc0NTc1NTY5Mn0.Wext_M_E5X1fGXW44nDcC57lXW9Zrud95BD3i3Zdsrz96wYaUaMu416DCLSILdi7&serviceName=service-provider&clusterName=DEFAULT&pageSize=10&pageNo=1&namespaceId=，并点击跳转，可以看到服务节点已经成功注册到 Nacos Server。
