package com.rookie.bigdata.filter;

/**
 * @Class EatuulFilter
 * @Description
 * @Author rookie
 * @Date 2024/9/20 13:40
 * @Version 1.0
 */
public abstract class EatuulFilter {

    abstract public String filterType();

    abstract public int filterOrder();

    abstract public void run();
}

