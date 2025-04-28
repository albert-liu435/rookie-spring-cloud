package com.rookie.bigdata.config;

import com.alibaba.cloud.circuitbreaker.sentinel.SentinelCircuitBreakerFactory;
import com.alibaba.cloud.circuitbreaker.sentinel.SentinelConfigBuilder;
import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import com.alibaba.csp.sentinel.datasource.Converter;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.rookie.bigdata.converter.JsonFlowRuleListConverter;
import com.rookie.bigdata.utils.ExceptionUtil;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * @Class RestTemplateConfiguration
 * @Description
 * @Author rookie
 * @Date 2025/4/28 9:55
 * @Version 1.0
 */
@Configuration
public class RestTemplateConfiguration {

    @Bean
    @SentinelRestTemplate(blockHandler = "handleException",
            blockHandlerClass = ExceptionUtil.class)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public RestTemplate restTemplate2() {
        return new RestTemplate();
    }

    @Bean
    public Converter myConverter() {
        return new JsonFlowRuleListConverter();
    }

    @Bean
    public Customizer<SentinelCircuitBreakerFactory> defaultConfig() {
        return factory -> {
            factory.configureDefault(
                    id -> new SentinelConfigBuilder().resourceName(id)
                            .rules(Collections.singletonList(new DegradeRule(id)
                                    .setGrade(RuleConstant.DEGRADE_GRADE_RT).setCount(100)
                                    .setTimeWindow(10)))
                            .build());
        };
    }

}
