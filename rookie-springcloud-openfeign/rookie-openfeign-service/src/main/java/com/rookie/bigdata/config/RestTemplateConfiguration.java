//package com.rookie.bigdata.config;
//
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.client.RestTemplate;
//
///**
// * @Class RestTemplateConfiguration
// * @Description
// * @Author rookie
// * @Date 2025/4/28 9:55
// * @Version 1.0
// */
//@Configuration
//public class RestTemplateConfiguration {
//
//    @LoadBalanced
//    @Bean
//    // todo sentinel need to support GraalVM in future
////	@SentinelRestTemplate(urlCleanerClass = UrlCleaner.class, urlCleaner = "clean")
//    public RestTemplate urlCleanedRestTemplate() {
//        return new RestTemplate();
//    }
//
//    @LoadBalanced
//    @Bean
//    // todo sentinel need to support GraalVM in future
////	@SentinelRestTemplate
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
//}
