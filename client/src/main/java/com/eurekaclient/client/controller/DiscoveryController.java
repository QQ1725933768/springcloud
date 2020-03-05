package com.eurekaclient.client.controller;

import com.eurekaclient.client.common.TailComponent;
import com.eurekaclient.client.service.ITailedService;
import com.eurekaclient.client.service.impl.DiscoveryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryController {

    @Autowired
    private DiscoveryServiceImpl discoveryServiceImpl;

    @Autowired
    private DiscoveryClient discoveryClient;

    private TailComponent tailComponent;

    @GetMapping("/pc")
    public String getMsg(){
        System.out.println(discoveryClient.getServices());
        tailComponent.writeTailedRecord(null);
        return discoveryServiceImpl.printMsg();
    }
}
