package com.rookie.bigdata.service;

import com.rookie.bigdata.domain.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Class GoodsService
 * @Description rookie-mall-goods就是商品微服务的 spring.application.name
 * @Author rookie
 * @Date 2025/4/30 10:19
 * @Version 1.0
 */
@FeignClient(value = "rookie-mall-goods")
public interface GoodsService {

    /**
     * /api/v1/goods/findByGoodsId就是商品服务提供的接口，参数也是
     */
    @GetMapping("/api/v1/goods/findByGoodsId")
    Goods findById(@RequestParam("goodsId") int goodsId);

    /**
     * /api/v1/goods/findByGoodsId就是商品服务提供的接口，参数也是
     */
    @GetMapping("/api/v1/goods/findClusterName")
    String findClusterName();
}
