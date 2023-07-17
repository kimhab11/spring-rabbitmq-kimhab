package com.example.springrabbitmqkimhab.Rabbit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitController {
    @Autowired
    private QueueSender queueSender;

    @GetMapping("queue/test")
    public String send(String msg) {
        queueSender.send(msg);
        return "ok. done {} "+msg;
    }
}