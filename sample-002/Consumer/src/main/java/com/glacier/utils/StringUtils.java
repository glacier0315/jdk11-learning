package com.glacier.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 2021-04-11 14:58
 *
 * @author glacier
 * @version 1.0
 */
public class StringUtils {
    private static final Logger logger = LogManager.getLogger(StringUtils.class);

    public static String defaultValue(String input, String defaultValue){
        logger.info("defaultValue {} {}", input, defaultValue);
        if (input == null || input.isBlank()) {
            return defaultValue;
        }
        return input;
    }
}
