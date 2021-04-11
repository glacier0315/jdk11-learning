/**
 * 2021-04-11 15:45
 *
 * @author glacier
 * @version 1.0
 */
open module com.glacier.consumer {
    requires org.apache.logging.log4j;
    requires com.glacier.producer;


    exports com.glacier.consumer;
    exports com.glacier.consumer.impl;
}