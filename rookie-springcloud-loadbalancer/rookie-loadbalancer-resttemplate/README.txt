1、首先启动rookie-loadbalancer-hello项目

2、配置windows中的host文件
    本实例用的是已有的应收关系
    127.0.0.1 rookie-authorization.client.com
    127.0.0.1 rookie-authorization.server.com
    127.0.0.1 rookie-authorization.vue.com
3、启动rookie-loadbalancer-resttemplate项目
    访问：localhost:18001/hello
    然后查看rookie-loadbalancer-hello项目中的日志信息，可以看到url的地址是交替更换的