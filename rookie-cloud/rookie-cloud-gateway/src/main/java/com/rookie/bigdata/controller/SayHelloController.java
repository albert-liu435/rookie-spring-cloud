package com.rookie.bigdata.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

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
public class SayHelloController {

    @GetMapping("/greeting")
    public String greet() {
        log.info("Access /greeting");

        List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");
        Random rand = new Random();


        HttpServletRequest request = ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes())).getRequest();
        String url = request.getRequestURL().toString();
        log.info("获取的url:{}", url);

        int randomNum = rand.nextInt(greetings.size());
        return greetings.get(randomNum);
    }

    @GetMapping("/")
    public String home() {
        log.info("Access /");
        return "Hi!";
    }
}
