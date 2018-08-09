package com.dev;/**
 * @description
 * @author zhhy
 * @date 2018-08-18-8-9 下午3:21
 */

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 *
 * @description
 * @author zhhy
 * @date 2018-08-18-8-9 下午3:21
 *
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class DevZuulApplication {
    public static void main(String[] args){
        SpringApplicationBuilder builder = new SpringApplicationBuilder(DevZuulApplication.class);
        builder.bannerMode(Banner.Mode.OFF);
        builder.run();
    }
}
