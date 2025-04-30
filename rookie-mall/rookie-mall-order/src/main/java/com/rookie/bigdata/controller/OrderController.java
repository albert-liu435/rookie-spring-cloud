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
 * @Description 商品相关接口
 * @Author rookie
 * @Date 2025/4/29 11:35
 * @Version 1.0
 */
@RestController
@RequestMapping("api/v1/goods_order")
public class OrderController {

    @LoadBalanced
    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private GoodsService goodsService;

    /**
     * nacos服务的注册与发现
     *
     * @param goodsId
     * @return
     */
    @RequestMapping("getGoods")
    public Object getGoods(int goodsId) {
//        Goods goods = restTemplate.getForObject("http://rookie-mall-goods/api/v1/goods/findByGoodsId?goodsId=" + goodsId, Goods.class);
//        return goods;
        return restTemplate.getForObject("http://rookie-mall-goods/api/v1/goods/findByGoodsId?goodsId=1",
                Goods.class);
    }

//    @RequestMapping("find")
//    public Object findByGoods(int goodsId) {
//        return restTemplate.getForObject("http://rookie-nacos-goods/api/v1/goods/findByGoodsId?goodsId=1000",
//                Goods.class);
//
//    }



    /**
     * 通过Feign请求mall-goods服务
     */
    @RequestMapping("getGoodsByFeign")
    public Object getGoodsByFeign(int goodsId) {
        Goods goods = goodsService.findById(goodsId);
        return goods;
    }

    /**
     * 通过Feign请求mall-goods服务
     */
    @RequestMapping("getClusterName")
    public Object findClusterName() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(goodsService.findClusterName());
        }
        return "执行结束";
    }



}
