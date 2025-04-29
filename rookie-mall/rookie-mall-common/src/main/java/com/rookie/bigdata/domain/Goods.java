package com.rookie.bigdata.domain;

import java.util.Date;

/**
 * @Class Goods
 * @Description 商品信息
 * @Author rookie
 * @Date 2025/4/29 11:30
 * @Version 1.0
 */
public class Goods {

    private Integer id;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品价格(分)
     */
    private Integer price;

    /**
     * 商品封⾯图
     */
    private String goodsImg;

    /**
     * 概述
     */
    private String summary;

    /**
     * 创建时间
     */
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
