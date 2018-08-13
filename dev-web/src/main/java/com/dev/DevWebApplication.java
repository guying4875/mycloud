package com.dev;/**
 * @description
 * @author zhhy
 * @date 2018-08-18-8-8 上午10:53
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *
 * @description
 * @author zhhy
 * @date 2018-08-18-8-8 上午10:53
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class DevWebApplication {
    public static Logger logger = LoggerFactory.getLogger(DevWebApplication.class);

    public static void main(String args[]){
        logger.debug("debug 日志");
        logger.warn("warn 日志");
        logger.info("info 日志");
        logger.error("error 日志");
        SpringApplication application = new SpringApplication(DevWebApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run();

    }
}
