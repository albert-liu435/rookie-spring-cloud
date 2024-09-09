package com.rookie.bigdata.controller;

import com.rookie.bigdata.domain.NacosConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Class BeanAutoRefreshConfigController
 * @Description
 * @Author rookie
 * @Date 2024/9/9 17:33
 * @Version 1.0
 */
@RestController
@RequestMapping("/nacos/bean")
public class BeanAutoRefreshConfigController {


    @Autowired
    private NacosConfigInfo nacosConfigInfo;

    @GetMapping
    public Map<String, String> getConfigInfo() {
        Map<String, String> result = new HashMap<>();
        result.put("serverAddr", nacosConfigInfo.getServerAddr());
        result.put("prefix", nacosConfigInfo.getPrefix());
        result.put("group", nacosConfigInfo.getGroup());
        result.put("namespace", nacosConfigInfo.getNamespace());
        return result;
    }


}
