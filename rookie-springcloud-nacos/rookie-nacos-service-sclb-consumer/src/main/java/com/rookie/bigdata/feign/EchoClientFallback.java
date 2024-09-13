package com.rookie.bigdata.feign;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Class EchoClientFallback
 * @Description
 * @Author rookie
 * @Date 2024/9/10 17:43
 * @Version 1.0
 */

/**
 * When the service is blown, the fallback operation is performed.
 *
 * @author fangjian0423, MieAh
 */
public class EchoClientFallback implements EchoClient {

    @Override
    public String echo(@PathVariable("str") String str) {
        return "echo fallback";
    }

    @Override
    public String divide(@RequestParam Integer a, @RequestParam Integer b) {
        return "divide fallback";
    }

    @Override
    public String notFound() {
        return "notFound fallback";
    }
}
