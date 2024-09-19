package com.rookie.bigdata.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @Author rookie
 * @Description
 * @Date 2024/9/19 22:38
 * @Version 1.0
 */
@Configuration
//@LoadBalancerClient(name = "hello", configuration = HelloConfiguration.class)
public class RestTemplateConfig {

    @LoadBalanced
    @Bean
//    WebClient.Builder webClientBuilder() {
//        return WebClient.builder();
//    }

    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}