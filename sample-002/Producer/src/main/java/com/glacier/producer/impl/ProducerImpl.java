package com.glacier.producer.impl;

import com.glacier.producer.Producer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 2021-04-11 15:00
 *
 * @author glacier
 * @version 1.0
 */
public class ProducerImpl implements Producer {

    private static final Logger logger = LogManager.getLogger(Producer.class);
    /**
     * 接受
     *
     * @param name
     * @return
     */
    @Override
    public String accpept(String name) {
        System.out.println(this.getClass() + "\t" + name);
        logger.info("accept {}", name);
        return name;
    }

    /**
     * 拒绝
     *
     * @param name
     * @return
     */
    @Override
    public String reject(String name) {
        System.out.println(this.getClass() + "\t" + name);
        logger.info("reject {}", name);
        return name;
    }
}
