package com.shenbo.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot03LoggingApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {

        //日志的级别
        //由低到高
        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");
        //默认给我们使用的是info级别的 没有指定级别的就用spring boot默认规定级别的（root级别）
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");

    }

}
