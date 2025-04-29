package com.rookie.bigdata.service.impl;

import com.rookie.bigdata.domain.Goods;
import com.rookie.bigdata.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Class GoodsServiceImpl
 * @Description 商品服务实现类
 * @Author rookie
 * @Date 2025/4/29 10:11
 * @Version 1.0
 */
@Service
public class GoodsServiceImpl implements GoodsService {

//    @Autowired
//    private GoodsMapper videoMapper;

    @Override
    public Goods findById(int goodsId) {
//        return videoMapper.findById(goodsId);

        Goods goods = new Goods();
        goods.setId(goodsId);
        goods.setPrice(10000);
        goods.setGoodsName("华为手机");
        goods.setSummary("华为手机");

        return goods;

    }

}

