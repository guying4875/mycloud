package com.dev.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPubSub;

/**
 * @author zhy
 * @desc Redis消息订阅
 * @create 2018-08-15 21:11
 **/
@Component
public class RedisMsgSubScribe extends JedisPubSub {
    private Logger logger = LoggerFactory.getLogger(RedisMsgSubScribe.class);
    /**
     * 监听到订阅频道接受到消息时的回调
     * @param channel
     * @param message
     */
    @Override
    public void onMessage(String channel, String message) {
        logger.debug("onMessage获取到消息，channel {} message {}",channel,message);
    }

    /**
     * 订阅频道时的回调
     * @param channel
     * @param subscribedChannels
     */
    @Override
    public void onSubscribe(String channel, int subscribedChannels) {
        logger.debug("onSubscribe订阅频道，channel {} subscribedChannels {}",channel,subscribedChannels);
    }

    /**
     * 取消订阅频道时的回调
     * @param channel
     * @param subscribedChannels
     */
    @Override
    public void onUnsubscribe(String channel, int subscribedChannels) {
        logger.debug("onUnsubscribe 取消订阅，channel {} message {}",channel,subscribedChannels);
    }

    /**
     * 监听到订阅模式接受到消息时的回调
     * @param pattern
     * @param channel
     * @param message
     */
    @Override
    public void onPMessage(String pattern, String channel, String message) {
        logger.debug("onPMessage 获取消息，pattern {} channel {} message {}",pattern,channel,message);
    }


    /**
     * 取消订阅模式时的回调
     * @param pattern
     * @param subscribedChannels
     */
    @Override
    public void onPUnsubscribe(String pattern, int subscribedChannels) {
        logger.debug("onPUnsubscribe 取消订阅，pattern {} subscribedChannels {} ",pattern,subscribedChannels);
    }

    /**
     * 模式 订阅频道时的回调
     * @param pattern
     * @param subscribedChannels
     */
    @Override
    public void onPSubscribe(String pattern, int subscribedChannels) {
        logger.debug("onPSubscribe 订阅，pattern {} subscribedChannels {} ",pattern,subscribedChannels);
    }

    /**
     * 订阅多个频道
     * @param channels
     */
    @Override
    public void subscribe(String... channels) {
        logger.debug("subscribe 订阅，channels {} ",channels);
    }

    @Override
    public void psubscribe(String... patterns) {
        super.psubscribe(patterns);
    }

    @Override
    public void punsubscribe(String... patterns) {
        super.punsubscribe(patterns);
    }

    /**
     * 获取订阅频道
     * @return
     */
    @Override
    public int getSubscribedChannels() {
        return super.getSubscribedChannels();
    }
}
