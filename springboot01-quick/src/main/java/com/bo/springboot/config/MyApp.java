package com.bo.springboot.config;

import com.bo.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration指明当前类是一个配置类：替代之前的spring配置文件
 * 在配置文件中用<bean></bean>标签添加组件
 */

@Configuration
public class MyApp {

    //将方法的返回值添加到容器中
    @Bean
    public HelloService helloService(){
        System.out.println("配置一个bean");
        return new HelloService();
    }
}
