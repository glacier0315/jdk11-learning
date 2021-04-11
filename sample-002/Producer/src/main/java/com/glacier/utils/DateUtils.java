package com.glacier.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

/**
 * 2021-04-11 14:56
 *
 * @author glacier
 * @version 1.0
 */
public class DateUtils {

    private static final Logger logger = LogManager.getLogger(DateUtils.class);

    public static long getTime(Date date) {
        logger.info("getTime {}", date);
        return date.getTime();
    }
}
