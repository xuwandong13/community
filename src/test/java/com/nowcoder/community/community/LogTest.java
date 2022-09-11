package com.nowcoder.community.community;

import com.nowcoder.community.CommunityApplication;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.sql.SQLOutput;

/**
 * @author ：xuwandong
 * @date ：Created in 2022/9/11 16:29
 * @description：
 * @modified By：
 */

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class LogTest {
    private static final Logger logger= LoggerFactory.getLogger(LogTest.class);
    private static final Logger logger2= LoggerFactory.getLogger("log222222");


    @Test
    public void testLogger(){
        System.out.println(logger.getName());
        //        com.nowcoder.community.community.LogTest

        System.out.println(logger2.getName());
        //log222222
        logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");
    }


}
