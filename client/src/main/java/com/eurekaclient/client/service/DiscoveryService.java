package com.eurekaclient.client.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DiscoveryService {

    @Value("${eureka.client.serviceUrl.defaultZone}")
    private String value;

    public String printMsg(){
        return "你好";
    }
}
