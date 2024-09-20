package com.rookie.bigdata.service;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.PropertyKeyConst;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class NacosClientServiceTest
 * @Description
 * @Author rookie
 * @Date 2024/9/20 16:14
 * @Version 1.0
 */
@SpringBootTest/*(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)*/
//@ActiveProfiles("dev")
@Slf4j
class NacosClientServiceTest {

    ConfigService configService = null;

    // 指定配置的 DataID 和 Group
    String dataId = "testDataId";
    String group = "testGroup";
    String content = "connectTimeoutInMills=5000";

    @BeforeEach
    void init() throws NacosException {
        Properties properties = new Properties();
        // 指定 Nacos 地址
        properties.put(PropertyKeyConst.SERVER_ADDR, "81.70.241.167:8848");
        properties.put(PropertyKeyConst.USERNAME, "nacos");
        properties.put(PropertyKeyConst.PASSWORD, "nacos123");

        configService = NacosFactory.createConfigService(properties);
    }


    @Test
    void testPublishConfig() throws NacosException {
        // 发布配置
        boolean publishConfig = configService.publishConfig(dataId, group, content);
        log.info("publishConfig: {}", publishConfig);
        wait2Sync();
    }


    @Test
    void testGetConfig() throws NacosException {
//        Properties properties = new Properties();
//        // 指定 Nacos 地址
//        properties.put(PropertyKeyConst.SERVER_ADDR, "127.0.0.1:8848");
//        // 默认命名空间是空，可以不填写
////        properties.put(PropertyKeyConst.NAMESPACE, "${namespace}");
//        // 如果在云上开启鉴权可以传入应用身份
//        // properties.put("ramRoleName", "$ramRoleName");
////        properties.put(PropertyKeyConst.ACCESS_KEY, "${accessKey}");
////        properties.put(PropertyKeyConst.SECRET_KEY, "${secretKey}");
//
//        ConfigService configService = NacosFactory.createConfigService(properties);
//
//        // 指定配置的 DataID 和 Group
//        String dataId = "testDataId";
//        String group = "testGroup";
//        String content = "connectTimeoutInMills=5000";
//        // 查询配置
//        String config = configService.getConfig(dataId, group, 5000);
//        log.info("getConfig: {}", config);
    }




    private static void wait2Sync() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // ignore
        }
    }
}
