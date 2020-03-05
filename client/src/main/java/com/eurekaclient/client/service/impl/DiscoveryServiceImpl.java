package com.eurekaclient.client.service.impl;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DiscoveryServiceImpl {

    @Value("${eureka.client.serviceUrl.defaultZone}")
    private String value;

    public String printMsg(){
        return "你好"+value;
    }

    @RabbitListener(queues = "vehicle.issued")
    public void getQueuesMsq(String string){
        System.out.println(string+"222222222222222222");
    }
}
