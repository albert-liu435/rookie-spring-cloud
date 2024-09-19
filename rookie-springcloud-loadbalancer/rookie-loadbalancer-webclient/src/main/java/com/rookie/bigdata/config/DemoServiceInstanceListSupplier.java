package com.rookie.bigdata.config;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

/**
 * @Author rookie
 * @Description
 * @Date 2024/9/19 22:38
 * @Version 1.0
 */
public class DemoServiceInstanceListSupplier implements ServiceInstanceListSupplier {

    private final String serviceId;

    DemoServiceInstanceListSupplier(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String getServiceId() {
        return serviceId;
    }

    @Override
    public Flux<List<ServiceInstance>> get() {
        return Flux.just(Arrays
                .asList(new DefaultServiceInstance(serviceId + "1", serviceId, "rookie-authorization.client.com", 8090, false),
                        new DefaultServiceInstance(serviceId + "2", serviceId, "rookie-authorization.server.com", 8090, false),
                        new DefaultServiceInstance(serviceId + "3", serviceId, "rookie-authorization.vue.com", 8090, false)));
    }
}
