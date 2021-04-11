package com.glacier.consumer.impl;

import com.glacier.consumer.Consumer;
import com.glacier.producer.Producer;
import com.glacier.producer.impl.ProducerImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 2021-04-11 14:58
 *
 * @author glacier
 * @version 1.0
 */
public class ConsumerImpl implements Consumer {
    private static final Logger logger = LogManager.getLogger(Consumer.class);
    private final Producer producer = new ProducerImpl();

    /**
     * 接受
     *
     * @param name
     * @return
     */
    @Override
    public String accpept(String name) {
        logger.info("accept {}", name);
        return producer.accpept(name);
    }

    /**
     * 拒绝
     *
     * @param name
     * @return
     */
    @Override
    public String reject(String name) {
        logger.info("reject {}", name);
        return producer.reject(name);
    }
}
