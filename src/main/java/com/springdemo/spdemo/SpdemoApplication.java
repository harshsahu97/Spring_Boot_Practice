package com.springdemo.spdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpdemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello()
    {
        return "hello";
    }
}
