package com.dev;/**
 * @description
 * @author zhhy
 * @date 2018-08-18-8-8 上午10:53
 */

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * @description
 * @author zhhy
 * @date 2018-08-18-8-8 上午10:53
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String args[]){
        SpringApplication application = new SpringApplication(EurekaApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run();
    }
}
