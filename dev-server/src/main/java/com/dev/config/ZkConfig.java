package com.dev.config;/**
 * @description
 * @author zhhy
 * @date 2018-08-18-8-19 下午3:15
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @description zookeeper配置信息
 * @author zhhy
 * @date 2018-08-18-8-19 下午3:15
 *
 */
@ConfigurationProperties("zk")
public class ZkConfig {
    private String connect;
    private int timeout;

    public String getConnect() {
        return connect;
    }

    public void setConnect(String connect) {
        this.connect = connect;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
