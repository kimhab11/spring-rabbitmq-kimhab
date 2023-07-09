package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Publisher {
    public static void main(String[] args) {
        SpringApplication.run(Publisher.class ,args);
    }
}