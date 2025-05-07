package com.rookie.bigdata.domain;

import java.io.Serializable;

/**
 * @Class Order
 * @Description
 * @Author rookie
 * @Date 2025/5/7 15:35
 * @Version 1.0
 */
public class Order implements Serializable {

    /**
     * id.
     */
    public long id;

    /**
     * user id.
     */
    public String userId;

    /**
     * commodity code.
     */
    public String commodityCode;

    /**
     * count.
     */
    public int count;

    /**
     * money.
     */
    public int money;

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", userId='" + userId + '\'' + ", commodityCode='"
                + commodityCode + '\'' + ", count=" + count + ", money=" + money + '}';
    }

}
