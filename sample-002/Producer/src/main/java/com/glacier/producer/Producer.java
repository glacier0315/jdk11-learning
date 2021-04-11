package com.glacier.producer;

/**
 * 2021-04-11 14:58
 *
 * @author glacier
 * @version 1.0
 */
public interface Producer {
    /**
     * 接受
     * @param name
     * @return
     */
    String accpept(String name);

    /**
     * 拒绝
     * @param name
     * @return
     */
    String reject(String name);
}
