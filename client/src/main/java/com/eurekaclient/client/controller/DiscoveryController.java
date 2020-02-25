package com.eurekaclient.client.controller;

import com.eurekaclient.client.service.DiscoveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryController {

    @Autowired
    private DiscoveryService discoveryService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/pc")
    public String getMsg(){
        System.out.println(discoveryClient.getServices());
        return discoveryService.printMsg();
    }
}
