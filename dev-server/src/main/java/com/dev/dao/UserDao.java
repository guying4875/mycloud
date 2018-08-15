package com.dev.dao;/**
 * @description
 * @author zhhy
 * @date 2018-08-18-8-15 下午4:08
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

/**
 *
 * @description
 * @author zhhy
 * @date 2018-08-18-8-15 下午4:08
 *
 */
@Component
public class UserDao {

    @Autowired
    private Jedis jedis;

}
