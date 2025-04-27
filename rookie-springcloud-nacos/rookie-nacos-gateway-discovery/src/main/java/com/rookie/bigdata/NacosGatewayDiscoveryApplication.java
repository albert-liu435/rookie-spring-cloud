package com.rookie.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;

/**
 * @ClassName JacksonApplication
 * @Description JacksonApplication
 * @Author rookie
 * @Date 2021/6/17 11:32
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@LoadBalancerClients({
        @LoadBalancerClient("service-gateway-provider")
})
public class NacosGatewayDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosGatewayDiscoveryApplication.class, args);
    }
}
