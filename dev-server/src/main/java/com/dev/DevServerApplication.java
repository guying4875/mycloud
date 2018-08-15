package com.dev;/**
 * @description
 * @author zhhy
 * @date 2018-08-18-8-8 上午11:47
 */

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @description
 * @author zhhy
 * @date 2018-08-18-8-8 上午11:47
 *
 */
@SpringBootApplication
@EnableEurekaClient
@PropertySource("application.properties,application-redis.properties")
@EnableConfigurationProperties     // 开启识别configurationproperties标记的类
public class DevServerApplication {
    public static void main(String args[]){
        SpringApplication application = new SpringApplication(DevServerApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run();
    }


}
