package com.rookie.bigdata.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Class EchoController
 * @Description Provide a service interface to the gateway for forwarding calls.
 * @Author rookie
 * @Date 2025/4/27 17:03
 * @Version 1.0
 */
@RestController
@Slf4j
public class EchoController {

    @GetMapping("/echo/{string}")
    public String echo(@PathVariable String string) {

        log.info("[EchoController] echo: {}", string);
        return "hello Nacos Discovery " + string;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer a, @RequestParam Integer b) {
        return String.valueOf(a / b);
    }

}
