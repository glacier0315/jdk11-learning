package com.glacier.base;

import com.glacier.consumer.impl.ConsumerImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * date 2021-05-07 12:39
 *
 * @author glacier
 * @version 1.0
 */
class ConsumerTest {
    
    @BeforeEach
    void setUp() {
    }
    
    @AfterEach
    void tearDown() {
    }
    
    @Test
    void accpept() {
        var consumer = new ConsumerImpl();
        consumer.accpept("hello");
    }
    
    @Test
    void reject() {
        var consumer = new ConsumerImpl();
        consumer.reject("world");
    }
}
