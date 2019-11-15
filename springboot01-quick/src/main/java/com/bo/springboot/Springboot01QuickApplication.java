package com.bo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class Springboot01QuickApplication {


    public static void main(String[] args) {

        SpringApplication.run(Springboot01QuickApplication.class, args);
    }

}
