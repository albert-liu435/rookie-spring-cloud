package com.rookie.bigdata.api;

import com.rookie.bigdata.api.fallback.UserFeignFallbackClient;
import com.rookie.bigdata.domain.User;
import com.rookie.bigdata.domain.UserAuthInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Class UserFeignClient
 * @Description
 * @Author rookie
 * @Date 2025/4/28 9:25
 * @Version 1.0
 */
@FeignClient(value = "rookie-user-service", fallback = UserFeignFallbackClient.class/*, configuration = {FeignDecoderConfig.class}*/)
public interface UserFeignClient {

    @GetMapping("/echo/getUserInfo")
    String getUserAuthInfo(/*@PathVariable String username*/);

    @RequestMapping("/echo/getSingleParam")
    String getSingleParam(@RequestParam String username);

    //    @RequestMapping("/echo/getMultiParam")
//    String getMultiParam(String username, String password);
    @RequestMapping("/echo/objParam")
    User objParam(User user);

    @RequestMapping("/echo/jsonParam")
    User jsonParam(User user);

//    @RequestMapping("/echo/getMultiParam")
//    String getMultiParamss(String username, String password);
}
