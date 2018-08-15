package com.dev.test.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.io.BufferedReader;

/**
 * @author zhy
 * @desc 验证redis订阅发布模型
 * @create 2018-08-15 21:45
 **/
public class TestRedisPubSub {

    public static void main(String[] args){
        Jedis jedis = new Jedis("localhost",6379);
        jedis.auth("Clic1234!");
        TestRedisPubSub.publish(jedis);
    }


    public static void publish(Jedis jedis) {
        for (int i=0;i<6; i++) {
            jedis.publish("mychannel", "test message"+i);   //从 mychannel 的频道上推送消息
        }
    }
}
