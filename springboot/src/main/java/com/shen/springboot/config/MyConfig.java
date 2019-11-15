package com.shen.springboot.config;


import com.shen.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public HelloService helloService02(){
        System.out.println("使用@bean给容器中添加了组件！");
        return new HelloService();
    }

}
