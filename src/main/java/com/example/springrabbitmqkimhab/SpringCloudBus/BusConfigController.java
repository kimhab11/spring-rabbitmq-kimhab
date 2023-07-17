package com.example.springrabbitmqkimhab.SpringCloudBus;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RefreshScope
@ConfigurationProperties(prefix = "greeting")
public class BusConfigController {
    @Value("${greeting.hi}")
    private String configMsg;
    String tt;

    // test config
    @GetMapping("config")
    public String getConfigMsg() {
        return tt + configMsg ;
    }
}