package com.rookie.bigdata.controller;

import com.rookie.bigdata.api.UserFeignClient;
import com.rookie.bigdata.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Class AccountController
 * @Description
 * @Author rookie
 * @Date 2025/4/28 15:57
 * @Version 1.0
 */
@RestController
@RequestMapping("demo")
public class AccountController {


    @Autowired
    private UserFeignClient userFeignClient;


    /**
     * 无参请求
     */
    @GetMapping("normal")
    public String getUserInfo() {
        return userFeignClient.getUserAuthInfo(/*"rookie"*/).toString();
    }

    /**
     * 单个参数
     * @param username
     * @return
     */
    @RequestMapping("singleParam")
    public String getSingleParam(String username) {
        return userFeignClient.getSingleParam(username);
    }


    /**
     * 多个请求参数
     *
     * @param username
     * @param password
     * @return
     */
//    @RequestMapping("/getMultiParam")
//    public String getMultiParamss(String username, String password) {
//        return userFeignClient.getMultiParamss(username,password);
//    }

    /**
     * 实体参数
     */
    @RequestMapping("/objParam")
    public User objParam(User user) {
        return userFeignClient.objParam(user);
    }


    /**
     * json参数
     */
    @RequestMapping("/jsonParam")
    public User jsonParam(@RequestBody User user) {
        return userFeignClient.jsonParam(user);
    }





}
