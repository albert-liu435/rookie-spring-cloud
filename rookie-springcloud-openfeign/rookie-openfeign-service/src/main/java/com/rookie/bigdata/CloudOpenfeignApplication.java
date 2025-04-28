package com.rookie.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName CloudOpenfeignApplication
 * @Description CloudOpenfeignApplication
 * @Author rookie
 * @Date 2021/6/17 11:32
 * @Version 1.0
 */
// 启用Feign服务调用
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class CloudOpenfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudOpenfeignApplication.class, args);
    }
}
