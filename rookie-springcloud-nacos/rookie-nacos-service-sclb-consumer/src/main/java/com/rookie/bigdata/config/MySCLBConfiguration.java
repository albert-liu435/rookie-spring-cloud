package com.rookie.bigdata.config;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Configuration;

/**
 * @Author rookie
 * @Description TODO
 * @Date 2024/9/13 22:37
 * @Version 1.0
 */
@Configuration
@LoadBalancerClient(value = "rookie-service-provider", configuration = MyLoadBalancerConfiguration.class)
public class MySCLBConfiguration {
}
