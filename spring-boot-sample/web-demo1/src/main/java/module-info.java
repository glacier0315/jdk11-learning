/**
 * date 2021-05-07 14:43
 *
 * @author glacier
 * @version 1.0
 */
module com.glacier.sample.web.demo1App {
    requires org.slf4j;
    requires spring.context;
    requires spring.beans;
    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires com.fasterxml.jackson.databind;
    requires org.apache.tomcat.embed.core;
    
    exports com.glacier;
}
