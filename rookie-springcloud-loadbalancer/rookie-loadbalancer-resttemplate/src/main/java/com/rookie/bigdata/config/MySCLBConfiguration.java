package com.rookie.bigdata.config;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Configuration;

/**
 * @Author rookie
 * @Description
 * @Date 2024/9/19 22:56
 * @Version 1.0
 */
@Configuration
@LoadBalancerClient(value = "hello", configuration = MyLoadBalancerConfiguration.class)
public class MySCLBConfiguration {
}
