package com.rookie.bigdata.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Class EchoClient
 * @Description
 * @Author rookie
 * @Date 2024/9/10 17:43
 * @Version 1.0
 */



/**
 * Provide the external exposure interface of the service calling client.
 *
 * @author fangjian0423, MieAh
 */
@FeignClient(name = "service-provider", contextId = "service-provider")
public interface EchoClient {

    /**
     * Call the echo method of the remote provider or roll back when the service is blown.
     *
     * @param str str
     * @return {@link String}
     */
    @GetMapping("/echo/{str}")
    String echo(@PathVariable("str") String str);

    /**
     * Call the divide method of the remote provider or roll back when the service is blown.
     *
     * @param a a
     * @param b b
     * @return {@link String}
     */
    @GetMapping("/divide")
    String divide(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

    /**
     * Test that the default method calls the remote method is still a remote call.
     *
     * @param a a
     * @return {@link String}
     */
    default String divide(Integer a) {
        return divide(a, 0);
    }

    /**
     * Call the notFound method of the remote provider or roll back when the service is blown.
     *
     * @return {@link String}
     */
    @GetMapping("/notFound")
    String notFound();
}
