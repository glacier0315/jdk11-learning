package com.glacier.base;


import com.glacier.consumer.impl.ConsumerImpl;

/**
 * 2021-04-11 15:45
 *
 * @author glacier
 * @version 1.0
 */
public class App {

    public static void main(String[] args) {
        System.out.println("app");
        var consumer = new ConsumerImpl();
        consumer.accpept("hello");
    }
}
