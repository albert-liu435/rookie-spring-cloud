package com.rookie.bigdata.controller;

import com.rookie.bigdata.domain.Goods;
import com.rookie.bigdata.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Class GoodsController
 * @Description 商品相关接口
 * @Author rookie
 * @Date 2025/4/29 11:35
 * @Version 1.0
 */
@RestController
@RequestMapping("api/v1/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("findByGoodsId")
    public Object findByGoodsId(int goodsId) {
        Goods goods = goodsService.findById(goodsId);
        return goods;
    }

}
