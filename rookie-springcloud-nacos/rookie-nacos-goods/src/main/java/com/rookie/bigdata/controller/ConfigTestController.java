package com.rookie.bigdata.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Class ConfigTestController
 * @Description
 * @Author rookie
 * @Date 2025/4/29 10:35
 * @Version 1.0
 */
@RestController
@RequestMapping("api/v1/config")
public class ConfigTestController {

    /**
     * nacos获取配置
     */
    @Value("${users.name}")
    private String name;



    @RequestMapping("test-config")
    public Object findByGoodsId() {
        System.out.println("name = " + name);
        return name;
    }

}

