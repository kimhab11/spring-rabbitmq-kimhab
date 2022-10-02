package com.example.springrabbitmqkimhab;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class SpringRabbitmqKimhabApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRabbitmqKimhabApplication.class, args);
    }

}
