package com.joseph.microservices.limitsmicroservice.controller;


import com.joseph.microservices.limitsmicroservice.bean.Limits;
import com.joseph.microservices.limitsmicroservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {


    private Configuration configuration;

    @Autowired
    public LimitsController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
        //return new Limits(1, 1000);
    }
}
