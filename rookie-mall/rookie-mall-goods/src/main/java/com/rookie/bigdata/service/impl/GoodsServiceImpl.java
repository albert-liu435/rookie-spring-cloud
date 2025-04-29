package com.rookie.bigdata.service.impl;

import com.rookie.bigdata.dao.GoodsMapper;
import com.rookie.bigdata.domain.Goods;
import com.rookie.bigdata.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Class GoodsServiceImpl
 * @Description 商品服务实现类
 * @Author rookie
 * @Date 2025/4/29 11:36
 * @Version 1.0
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper videoMapper;

    @Override
    public Goods findById(int goodsId) {
        return videoMapper.findById(goodsId);
    }

}

