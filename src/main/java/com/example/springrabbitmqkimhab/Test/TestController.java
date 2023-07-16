package com.example.springrabbitmqkimhab.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
@RequestMapping("/queue/test")
public class TestController {
    @Autowired
    private QueueSender queueSender;

    @GetMapping
    public String send(String msg) {
        queueSender.send(msg);
        return "ok. done {} "+msg;
    }

    // test config
//    @Value("${greeting.tt}")
    private String a;

    @GetMapping("con")
    public String get1() {
        return a;
    }


}