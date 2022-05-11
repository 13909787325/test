package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MallApplication {
    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(MallApplication.class, args);
    }
}