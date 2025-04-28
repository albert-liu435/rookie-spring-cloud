package com.rookie.bigdata.api.fallback;

import com.rookie.bigdata.api.UserFeignClient;
import com.rookie.bigdata.domain.User;
import com.rookie.bigdata.domain.UserAuthInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Class UserFeignFallbackClient
 * @Description 系统用户服务远程调用异常后的降级处理类
 * @Author rookie
 * @Date 2025/4/28 9:25
 * @Version 1.0
 */
@Component
@Slf4j
public class UserFeignFallbackClient implements UserFeignClient {

    @Override
    public String getUserAuthInfo(/*String username*/) {
        log.error("feign远程调用系统用户服务异常后的降级方法");
        return "feign远程调用系统用户服务异常后的降级方法";
    }

    @Override
    public String getSingleParam(String username) {

        log.error("feign远程调用系统用户服务异常后的降级方法");
        return "feign远程调用系统用户服务异常后的降级方法";
    }

//    @Override
//    public String getMultiParam(String username, String password) {
//        log.error("feign远程调用系统用户服务异常后的降级方法");
//        return "feign远程调用系统用户服务异常后的降级方法";
//    }

    @Override
    public User objParam(User user) {
        log.error("feign远程调用系统用户服务异常后的降级方法");
        return new User();
    }

    @Override
    public User jsonParam(User user) {
        log.error("feign远程调用系统用户服务异常后的降级方法");
        return new User();
    }

//    @Override
//    public String getMultiParamss(String username, String password) {
//                log.error("feign远程调用系统用户服务异常后的降级方法");
//        return "feign远程调用系统用户服务异常后的降级方法";
//    }
}
