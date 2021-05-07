package com.glacier.consumer;

import com.glacier.producer.impl.ProducerImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * date 2021-05-07 12:39
 *
 * @author glacier
 * @version 1.0
 */
class ProducerTest {
    
    @BeforeEach
    void setUp() {
    }
    
    @AfterEach
    void tearDown() {
    }
    
    @Test
    void accpept() {
        var producer = new ProducerImpl();
        producer.accpept("hello");
    }
    
    @Test
    void reject() {
        var producer = new ProducerImpl();
        producer.reject("world");
    }
}
