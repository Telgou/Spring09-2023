package com.example.spring092023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan({"controller", "com.example.spring092023.entities","com.example.spring092023.services", "com.example.spring092023.repositories", "com.example.spring092023.configuration", "com.example.spring092023.Aspect"})
@EnableScheduling()
@EnableAspectJAutoProxy
public class Spring092023Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring092023Application.class, args);
    }

}
