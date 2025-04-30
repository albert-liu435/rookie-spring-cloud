package com.rookie.bigdata.controller;

//import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Class SentinelTestController
 * @Description 测试sentinel
 * @Author rookie
 * @Date 2025/4/30 14:15
 * @Version 1.0
 */
@RestController
//@RequestMapping("api/v1/sentinel")
public class SentinelTestController {

    private volatile int total = 0;

    @RequestMapping("test-sentinel")
    public Object findByGoodsId() {

        return String.valueOf(total++);
//        return JSONObject.toJSONString(String.valueOf(total++));
    }


    @RequestMapping("test-sentinel-exception")
    public Object testSentinelException() {
        int i = (int) (Math.random() * 100);
        if(i>50){
            throw new NullPointerException("随机错误");
        }
        return "成功";
    }


}
