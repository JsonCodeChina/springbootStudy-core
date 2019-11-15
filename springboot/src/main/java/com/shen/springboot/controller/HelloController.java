package com.shen.springboot.controller;

import com.shen.springboot.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    Logger logger = LoggerFactory.getLogger(getClass());



    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String hello(){
        //Person person = new Person();
        System.out.println(person);
        //日志的级别
        //由低到高
        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");
        //默认给我们使用的是info级别的 没有指定级别的就用spring boot默认规定级别的（root级别）
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");
        return "hello world";
    }
}
