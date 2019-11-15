package com.shen.springbootweb.controller;

import com.shen.springbootweb.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;


@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user){
        if(user.equals("aaa")){
            throw new UserNotExistException();
        }
        return "hello world";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>您好</h1>");
        map.put("users", Arrays.asList("张三","李四","王五"));
        return "success";
    }

//    @RequestMapping("/test")
//    public String test(){
//        return "fragment1";
//    }

//    @RequestMapping({"/","/index.html"})
//    public String index(){
//        return "login";
//    }
}
