package com.javatechie.spring.api;

import lombok.Data;

@Data
public class Order {

    private String userName;
    private String productName;
    private int amount;
}
