package com.rookie.bigdata.config;

import com.rookie.bigdata.feign.EchoClient;
import com.rookie.bigdata.feign.EchoClientFallback;
import org.springframework.context.annotation.Bean;

/**
 * @Class FeignConfiguration
 * @Description Configuration for Feign.
 * @Author rookie
 * @Date 2024/9/10 17:49
 * @Version 1.0
 */
public class FeignConfiguration {

    @Bean
    public EchoClient echoClientFallback() {
        return new EchoClientFallback();
    }

}
