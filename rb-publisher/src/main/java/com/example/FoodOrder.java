package com.example;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//@JsonIgnoreProperties(ignoreUnknown = false)
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude()
public class FoodOrder {
//
//    @JsonFormat(pattern = "HH:mm:ss dd:MM:yyyy")
//    private LocalDateTime localDateTime = LocalDateTime.now();
    private String restaurant;
    private String customerAddress;
    private String orderDescription;


//    public FoodOrder(String restaurant, String customerAddress, String orderDescription) {
//        this.restaurant = restaurant;
//        this.customerAddress = customerAddress;
//        this.orderDescription = orderDescription;
//        this.localDateTime = LocalDateTime.now();
//    }
}