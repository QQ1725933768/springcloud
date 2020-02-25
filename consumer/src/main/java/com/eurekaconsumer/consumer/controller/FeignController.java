package com.eurekaconsumer.consumer.controller;

import com.eurekaconsumer.consumer.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignController {

    @Resource
    private FeignService feignService;

    @GetMapping("/feign")
    public String getMsg(){
        return feignService.getMsg()+"feign";
    }
}
