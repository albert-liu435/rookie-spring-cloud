package com.rookie.bigdata.controller;

import jakarta.servlet.Filter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Hooks;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

/**
 * @Class HelloController
 * @Description TODO
 * @Author rookie
 * @Date 2025/4/30 18:58
 * @Version 1.0
 */


@Slf4j
@RestController
public class HelloController {
    @GetMapping("/hello")
    String hello() {
        log.info("hello endpoint called");
        return "Hello!";
    }

    @GetMapping("/hello2")
    Mono<String> hello2() {
        return Mono.fromSupplier(() -> {
            log.info("hello2 endpoint called");
            return "Hello2!";
        }).subscribeOn(
                Schedulers.boundedElastic()
        ).map(s -> {
            log.info("map operator");
            return s + s;
        }).flatMap(s -> {
            log.info("flatMap operator");
            return Mono.just(s + s);
        });
    }
}

