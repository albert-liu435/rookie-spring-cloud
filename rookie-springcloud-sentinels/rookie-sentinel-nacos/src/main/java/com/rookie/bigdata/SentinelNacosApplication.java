package com.rookie.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @ClassName CloudOpenfeignApplication
 * @Description CloudOpenfeignApplication
 * @Author rookie
 * @Date 2021/6/17 11:32
 * @Version 1.0
 */
// 启用Feign服务调用
@SpringBootApplication
public class SentinelNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelNacosApplication.class, args);
    }
}
