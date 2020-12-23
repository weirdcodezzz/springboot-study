package com.luo.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author luo Fuqiang
 * @date 2020/12/22 17:43
 */
@ConfigurationProperties(prefix = "zero.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
