package com.rookie.bigdata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Class EchoController
 * @Description
 * @Author rookie
 * @Date 2025/4/27 14:58
 * @Version 1.0
 */

@RestController
public class EchoController {




    @GetMapping("/echo/{string}")
    public String echo(@PathVariable String string) {
        return "hello Nacos Discovery " + string;
    }



}
