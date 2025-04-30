package com.rookie.bigdata.service;

import com.rookie.bigdata.domain.Goods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Class GoodServiceFeignFallbackClient
 * @Description
 * @Author rookie
 * @Date 2025/4/30 10:22
 * @Version 1.0
 */
@Component
@Slf4j
public class GoodServiceFeignFallbackClient implements GoodsService{
    @Override
    public Goods findById(int goodsId) {
        log.error("feign远程调用系统用户服务异常后的降级方法");
//        return "feign远程调用系统用户服务异常后的降级方法";
        return null;
    }

    @Override
    public String findClusterName() {
        log.error("feign远程调用系统用户服务异常后的降级方法");
//        return "feign远程调用系统用户服务异常后的降级方法";

        return null;
    }
}
