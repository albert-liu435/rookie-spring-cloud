package com.rookie.bigdata.utils;

import com.alibaba.cloud.sentinel.rest.SentinelClientHttpResponse;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;

/**
 * @Class ExceptionUtil
 * @Description
 * @Author rookie
 * @Date 2025/4/28 18:24
 * @Version 1.0
 */
public final class ExceptionUtil {

    private ExceptionUtil() {

    }

    public static SentinelClientHttpResponse handleException(HttpRequest request,
                                                             byte[] body, ClientHttpRequestExecution execution, BlockException ex) {
        System.out.println("Oops: " + ex.getClass().getCanonicalName());
        return new SentinelClientHttpResponse("custom block info");
    }

}
