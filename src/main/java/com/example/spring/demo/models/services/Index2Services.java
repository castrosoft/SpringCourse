package com.example.spring.demo.models.services;

import org.springframework.stereotype.Component;

@Component("myComplexService")
public class Index2Services implements IndexInterface {

    @Override
    public String operation() {
        return "Executing an complex process!";
    }
}
