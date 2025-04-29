//package com.rookie.bigdata.dao;
//
//import com.rookie.bigdata.domain.Goods;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;
//import org.springframework.stereotype.Repository;
//
///**
// * @Class GoodsMapper
// * @Description 查询商品信息
// * @Author rookie
// * @Date 2025/4/29 11:36
// * @Version 1.0
// */
//@Repository
//public interface GoodsMapper {
//
//    @Select("select * from goods where id=#{goodsId}")
//    Goods findById(@Param("goodsId") int goodsId);
//
//}
