package com.rookie.bigdata.service;

import com.rookie.bigdata.domain.Goods;

/**
 * @Class GoodsService
 * @Description 商品相关实现类
 * @Author rookie
 * @Date 2025/4/29 10:10
 * @Version 1.0
 */
public interface GoodsService {

    /**
     * 获取商品信息
     */
    Goods findById(int goodsId);
}

