package com.example;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class FoodOrderController {

    @Autowired
    FoodOrderSource foodOrderSource;

    @PostMapping ("/order")
    @ResponseBody
    public Object orderFood(@RequestBody FoodOrder foodOrder){
//        FoodOrderR foodOrder1 = new FoodOrder(foodOrder.getRestaurant(), foodOrder.getCustomerAddress(), foodOrder.getOrderDescription());

        FoodResponse foodResponse = new FoodResponse();
        BeanUtils.copyProperties(foodOrder,foodResponse);

        Random r = new Random();
        int n = r.nextInt();

        boolean f = foodOrderSource.foodOrders().send(MessageBuilder.withPayload(n+" "+foodResponse).build());
        System.out.println("No: "+n);
        System.out.println(f);
        System.out.println(foodOrder);
        System.out.println(foodResponse);
     //   System.out.println(foodOrder1.toString());
        return foodResponse ;
    }
}