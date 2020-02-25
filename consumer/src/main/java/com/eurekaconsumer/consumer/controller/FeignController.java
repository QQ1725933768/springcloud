package com.eurekaconsumer.consumer.controller;

import com.eurekaconsumer.consumer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/feign")
    public String getMsg(){
        return feignService.getMsg();
    }
}
