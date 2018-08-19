package com.dev.redis;/**
 * @description
 * @author zhhy
 * @date 2018-08-18-8-16 下午1:41
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

/**
 *
 * @description
 * @author zhhy
 * @date 2018-08-18-8-16 下午1:41
 *
 */
@Configuration
public class RedisMsgSubScribeManage {

    @Autowired
    private JedisTool jedisTool;


    @Bean
    public RedisMsgSubScribe channelPub(){
        Jedis j = jedisTool.getResource();
        RedisMsgSubScribe scribe = new RedisMsgSubScribe();
        j.subscribe(scribe,"mychannel");
        return scribe;
    }


}
