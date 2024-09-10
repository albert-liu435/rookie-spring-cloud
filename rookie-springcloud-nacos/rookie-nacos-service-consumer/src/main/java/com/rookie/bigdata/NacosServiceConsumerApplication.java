package com.rookie.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName NacosServiceProviderApplication
 * @Description NacosServiceProviderApplication
 * @Author rookie
 * @Date 2021/6/17 11:32
 * @Version 1.0
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class NacosServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosServiceConsumerApplication.class, args);
    }
}
