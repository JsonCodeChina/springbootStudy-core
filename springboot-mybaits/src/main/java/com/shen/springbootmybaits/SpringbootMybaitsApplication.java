package com.shen.springbootmybaits;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.shen.springbootmybaits.mapper")
@SpringBootApplication
public class SpringbootMybaitsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybaitsApplication.class, args);
    }

}
