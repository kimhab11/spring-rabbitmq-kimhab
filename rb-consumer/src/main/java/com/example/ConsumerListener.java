package com.example;

import jdk.jfr.ContentType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.*;

@Slf4j
@EnableBinding(Sink.class)
public class ConsumerListener {
    @StreamListener(target = Sink.INPUT)
    public void doSome1(@Payload String a,
                        @Header String contentType,
                        @DestinationVariable String d
    ) {
        System.out.println("Consumer1 message : " + a);
        System.out.println("Consumer2 message : " + d);
        log.info("Message {}", contentType);
    }
}
