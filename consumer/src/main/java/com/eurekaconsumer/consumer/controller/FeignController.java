package com.eurekaconsumer.consumer.controller;

import com.eurekaconsumer.consumer.service.FeignService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignController {

    @Resource
    private FeignService feignService;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${spring.rabbitmq.host}")
    private String mq;

    @GetMapping("/feign")
    public String getMsg(){
        rabbitTemplate.convertAndSend("vehicle.issued","vehicle.issued","我是发送方.....");
        return feignService.getMsg()+"feign ："+mq;
    }
}
