package com.rookie.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName CustomerGateWayApplication
 * @Description https://www.cnblogs.com/rjzheng/p/9220437.html
 * @Author rookie
 * @Date 2021/6/17 11:32
 * @Version 1.0
 */
@SpringBootApplication
//@ServletComponentScan(basePackageClasses = IndexController.class)
public class CustomerGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerGateWayApplication.class, args);
    }
}
