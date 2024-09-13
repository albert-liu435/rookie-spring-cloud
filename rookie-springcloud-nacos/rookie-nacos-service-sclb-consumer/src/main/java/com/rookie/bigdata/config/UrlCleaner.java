package com.rookie.bigdata.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Class UrlCleaner
 * @Description
 * @Author rookie
 * @Date 2024/9/10 17:50
 * @Version 1.0
 */
public class UrlCleaner {

    private static final Logger LOGGER = LoggerFactory.getLogger(UrlCleaner.class);

    private static final String URL_CLEAN_ECHO = ".*/echo/.*";

    public static String clean(String url) {
        LOGGER.info("enter urlCleaner");
        if (url.matches(URL_CLEAN_ECHO)) {
            LOGGER.info("change url");
            url = url.replaceAll("/echo/.*", "/echo/{str}");
        }
        return url;
    }

}
