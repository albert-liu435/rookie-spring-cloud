package com.rookie.bigdata.controller;

import com.rookie.bigdata.domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Class GoodsController
 * @Description 商品相关接口
 * @Author rookie
 * @Date 2025/4/29 11:35
 * @Version 1.0
 */
@RestController
@RequestMapping("api/v1/goods_order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("getGoods")
    public Object getGoods(int goodsId) {
        Goods goods = restTemplate.getForObject("http://localhost:6001/api/v1/goods/findByGoodsId?goodsId=" + goodsId, Goods.class);
        return goods;
    }
}
