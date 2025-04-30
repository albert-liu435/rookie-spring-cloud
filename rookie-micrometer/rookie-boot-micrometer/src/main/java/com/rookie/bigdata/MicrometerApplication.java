package com.rookie.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Hooks;

/**
 * @ClassName MicrometerApplication
 * @Description https://github.com/HashJang/SpringOne-2023
 * @Author rookie
 * @Date 2021/6/17 11:32
 * @Version 1.0
 */
@SpringBootApplication
public class MicrometerApplication {

    public static void main(String[] args) {
        Hooks.enableAutomaticContextPropagation();

        SpringApplication.run(MicrometerApplication.class, args);
    }
}
