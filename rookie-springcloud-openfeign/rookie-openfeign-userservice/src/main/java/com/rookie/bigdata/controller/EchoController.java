package com.rookie.bigdata.controller;

import com.rookie.bigdata.domain.User;
import org.springframework.web.bind.annotation.*;

/**
 * @Class EchoController
 * @Description Provide a service interface to the gateway for forwarding calls.
 * @Author rookie
 * @Date 2025/4/27 17:03
 * @Version 1.0
 */
@RestController
public class EchoController {


    /**
     * 无参请求
     *
     * @return
     */
    @RequestMapping("/echo/getUserInfo")
    public String getUserInfo() {

        return "hello rookie";
    }

    /**
     * 单个请求参数
     *
     * @param username
     * @return
     */
    @RequestMapping("/echo/getSingleParam")
    public String getSingleParam(String username) {
        return "hello " + username;
    }

    /**
     * 多个请求参数
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/echo/getMultiParam")
    public String getMultiParam(String username, String password) {
        return "hello " + username + " " + password;
    }

    /**
     * 实体参数
     */
    @RequestMapping("/echo/objParam")
    public User objParam(User user) {
        return user;
    }


    /**
     * json参数
     */
    @RequestMapping("/echo/jsonParam")
    public User jsonParam(@RequestBody User user) {
        return user;
    }


}
