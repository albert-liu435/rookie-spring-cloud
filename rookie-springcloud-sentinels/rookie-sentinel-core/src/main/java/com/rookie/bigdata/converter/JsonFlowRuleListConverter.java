package com.rookie.bigdata.converter;

import com.alibaba.csp.sentinel.datasource.Converter;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.List;

/**
 * @Class JsonFlowRuleListConverter
 * @Description
 * @Author rookie
 * @Date 2025/4/28 18:25
 * @Version 1.0
 */
public class JsonFlowRuleListConverter implements Converter<String, List<FlowRule>> {

    @Override
    public List<FlowRule> convert(String source) {
        return JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
        });
    }

}
