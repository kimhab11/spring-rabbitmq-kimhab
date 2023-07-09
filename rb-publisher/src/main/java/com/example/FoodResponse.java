package com.example;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FoodResponse {
    @JsonFormat(pattern = "HH:mm:ss dd-MM-yyyy")
    private LocalDateTime localDateTime = LocalDateTime.now();
    private String restaurant;
    private String customerAddress;
    private String orderDescription;
}
