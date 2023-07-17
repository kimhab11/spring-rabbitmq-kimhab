package com.example.springrabbitmqkimhab;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@SpringBootApplication
@EnableDiscoveryClient
@EnableRabbit
public class SpringRabbitmqKimhabApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringRabbitmqKimhabApplication.class, args);
    }

}
