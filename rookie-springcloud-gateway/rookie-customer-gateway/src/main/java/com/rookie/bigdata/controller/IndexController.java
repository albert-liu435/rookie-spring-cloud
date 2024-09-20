package com.rookie.bigdata.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Class IndexController
 * @Description
 * @Author rookie
 * @Date 2024/9/20 13:44
 * @Version 1.0
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "hello!world";
    }
}
