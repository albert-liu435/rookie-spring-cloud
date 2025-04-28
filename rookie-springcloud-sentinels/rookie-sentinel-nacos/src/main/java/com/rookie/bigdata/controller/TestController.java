package com.rookie.bigdata.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Class TestController
 * @Description
 * @Author rookie
 * @Date 2025/4/28 18:26
 * @Version 1.0
 */
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CircuitBreakerFactory circuitBreakerFactory;

    @GetMapping("/hello")
    @SentinelResource("resource")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/aa")
    @SentinelResource("aa")
    public String aa(int b, int a) {
        return "Hello test";
    }

    @GetMapping("/test")
    public String test1() {
        return "Hello test";
    }

    @GetMapping("/template")
    public String client() {
        return restTemplate.getForObject("http://www.taobao.com/test", String.class);
    }

    @GetMapping("/slow")
    public String slow() {
        return circuitBreakerFactory.create("slow").run(() -> {
            try {
                Thread.sleep(500L);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "slow";
        }, throwable -> "fallback");
    }

}
