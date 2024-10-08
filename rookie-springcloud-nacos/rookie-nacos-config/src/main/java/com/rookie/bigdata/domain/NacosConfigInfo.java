package com.rookie.bigdata.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Class NacosConfigInfo
 * @Description
 * @Author rookie
 * @Date 2024/9/9 17:34
 * @Version 1.0
 */
@ConfigurationProperties(prefix = "spring.cloud.nacos.config")
@Component
public class NacosConfigInfo {

    /**
     * Nacos server address.
     */
    private String serverAddr;

    /**
     * Data Id prefix.
     */
    private String prefix;

    /**
     * Nacos group.
     */
    private String group;

    /**
     * Nacos namespace.
     */
    private String namespace;

    public String getServerAddr() {
        return serverAddr;
    }

    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}
