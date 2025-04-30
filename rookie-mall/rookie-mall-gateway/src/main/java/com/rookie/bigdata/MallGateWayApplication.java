package com.rookie.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName MallGateWayApplication
 * @Description MallGateWayApplication
 * @Author rookie
 * @Date 2021/6/17 11:32
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
//@MapperScan("com.rookie.bigdata.dao")
public class MallGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallGateWayApplication.class, args);
    }
}
