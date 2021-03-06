package com.hanky.slf4j;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jApp {

    private static Logger logger = LoggerFactory.getLogger(Slf4jApp.class);

    public static void main(String[] args) {


        // System.out.println("This is println message.");

        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");

    }
}
