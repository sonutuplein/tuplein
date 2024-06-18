package com.code.prosol;


import com.code.prosol.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.code.prosol"})
public class ProsolApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProsolApplication.class, args);
    }
}