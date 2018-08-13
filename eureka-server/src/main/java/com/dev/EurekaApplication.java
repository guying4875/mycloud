package com.dev;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhy
 * @desc ${DESCRIPTION}
 * @create 2018-08-08 21:15
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args){
        new SpringApplicationBuilder(EurekaApplication.class).web(WebApplicationType.REACTIVE);
    }
}
