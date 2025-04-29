package com.rookie.bigdata.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Class RestTemplateConfig
 * @Description TODO
 * @Author rookie
 * @Date 2025/4/29 10:58
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
