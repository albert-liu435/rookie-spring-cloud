package com.rookie.bigdata.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @Author rookie
 * @Description
 * @Date 2024/9/19 22:31
 * @Version 1.0
 */
@RestController
@Slf4j
public class UserController {


    @LoadBalanced
    @Autowired
    private RestTemplate restTemplate;

    //    private final WebClient.Builder loadBalancedWebClientBuilder;
//    private final ReactorLoadBalancerExchangeFilterFunction lbFunction;
//
//    public UserController(WebClient.Builder webClientBuilder, ReactorLoadBalancerExchangeFilterFunction lbFunction) {
//        this.loadBalancedWebClientBuilder = webClientBuilder;
//        this.lbFunction = lbFunction;
//    }
//
//
//    @RequestMapping("/hi")
//    public Mono<String> hi(@RequestParam(value = "name", defaultValue = "Mary") String name) {
//        return loadBalancedWebClientBuilder.build().get().uri("http://hello/greeting")
//                .retrieve().bodyToMono(String.class)
//                .map(greeting -> String.format("%s, %s!", greeting, name));
//    }
//
    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "John") String name) {

        return restTemplate.getForObject("http://hello/greeting",
                String.class);
    }
}
