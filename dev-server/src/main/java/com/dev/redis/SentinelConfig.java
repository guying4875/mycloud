package com.dev.redis;/**
 * @description
 * @author zhhy
 * @date 2018-08-18-8-15 下午3:33
 */

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * @description
 * @author zhhy
 * @date 2018-08-18-8-15 下午3:33
 *
 */
@Component
@EnableAutoConfiguration
@ConfigurationProperties("redis")
public class SentinelConfig {

}
