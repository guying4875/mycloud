package com.dev.redis;/**
 * @description
 * @author zhhy
 * @date 2018-08-18-8-15 下午3:38
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @description
 * @author zhhy
 * @date 2018-08-18-8-15 下午3:38
 *
 */
@Configuration
public class SentinelPoolBuild {

    @Value("${redis.master}")
    private String master;

    @Value("${redis.database}")
    private int database;

    @Value("${redis.password}")
    private String password;

    @Value("${redis.sentinel.nodes}")
    private String sentinelnodes;

    @Value("${redis.timeout}")
    private int timeout;

    private Set<String> getSentinelNodes(){
        Set<String> set = null;
        String[] StrArray = StringUtils.split(sentinelnodes,",");
        set = new HashSet<>(Arrays.asList(StrArray));
        return set;
    }

    @ConfigurationProperties("redis.poolconfig")
    public JedisPoolConfig jedisPoolConfig(){
        return new JedisPoolConfig();
    }

    @Bean
    public JedisSentinelPool jedisSentinelPool(){
        JedisSentinelPool sentinelPool = new JedisSentinelPool(master,getSentinelNodes(),jedisPoolConfig(),timeout,password,database);
        return sentinelPool;
    }

    public Jedis jedis(){
        Jedis jedis = jedisSentinelPool().getResource();

        return jedis;
    }


}
