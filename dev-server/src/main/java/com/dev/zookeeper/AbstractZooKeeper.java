package com.dev.zookeeper;/**
 * @description
 * @author zhhy
 * @date 2018-08-18-8-19 下午3:53
 */

import com.dev.config.ZkConfig;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 *
 * @description zookeeper 操作工具类
 * @author zhhy
 * @date 2018-08-18-8-19 下午3:53
 *
 */
@Component
public class AbstractZooKeeper implements Watcher{
    private Logger logger = LoggerFactory.getLogger(AbstractZooKeeper.class);
    private CountDownLatch latch = new CountDownLatch(1);

    protected ZooKeeper zooKeeper ;

    @Autowired
    private ZkConfig zkConfig;

    public void createConnect() throws IOException, InterruptedException {
        zooKeeper = new ZooKeeper(zkConfig.getConnect(),zkConfig.getTimeout(),this);
        latch.wait();
    }

    @Override
    public void process(WatchedEvent event) {
        if(event.getState()== Event.KeeperState.SyncConnected){
            latch.countDown();
        }
    }

    public void close() throws InterruptedException {
        zooKeeper.close();
    }
}
