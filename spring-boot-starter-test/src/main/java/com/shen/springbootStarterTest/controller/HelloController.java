package com.shen.springbootStarterTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import shen.starter.HelloService;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;


    @GetMapping("/hello")
    public String hello(){
        return helloService.sayHelloShen("bo");
    }

}
