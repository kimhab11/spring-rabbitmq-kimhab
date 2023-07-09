package com.example.springrabbitmqkimhab;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

import java.util.stream.Stream;

@SpringBootApplication
@EnableRabbit
@EnableBinding(Sink.class)
public class SpringRabbitmqKimhabApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringRabbitmqKimhabApplication.class, args);
    }

    @StreamListener(Sink.INPUT)
    void handMsg(String msg) {
        System.out.println("msg: " + msg);
    }
}
