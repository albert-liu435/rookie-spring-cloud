package com.rookie.bigdata.controller;

import com.rookie.bigdata.domain.Goods;
import com.rookie.bigdata.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Class GoodsController
 * @Description
 * @Author rookie
 * @Date 2025/4/29 10:20
 * @Version 1.0
 */
@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private GoodsService goodsService;

    @LoadBalanced
    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("findByGoodsId")
    public Object findByGoodsId(int goodsId) {
        Goods goods = goodsService.findById(goodsId);
        return goods;
    }

    @RequestMapping("find")
    public Object findByGoods(int goodsId) {
        return restTemplate.getForObject("http://rookie-nacos-goods/api/v1/goods/findByGoodsId?goodsId=1000",
                Goods.class);

    }



}
