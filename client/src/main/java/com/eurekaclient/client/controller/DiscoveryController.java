package com.eurekaclient.client.controller;

import com.eurekaclient.client.abstraction.impl.CrmClientImpl;
import com.eurekaclient.client.common.TailComponent;
import com.eurekaclient.client.flyweight.ClientFlyWeight;
import com.eurekaclient.client.service.IClientService;
import com.eurekaclient.client.service.ITailedService;
import com.eurekaclient.client.service.impl.DiscoveryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DiscoveryController {

    @Resource
    private DiscoveryServiceImpl discoveryServiceImpl;

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private ClientFlyWeight clientFlyWeight;


    @GetMapping("/pc")
    public String getMsg(String type){
        System.out.println(discoveryClient.getServices());
        CrmClientImpl buyCrmClientImpl = clientFlyWeight.getCrmClientImpl(1);
        buyCrmClientImpl.persistClient(type);
        return discoveryServiceImpl.printMsg();
    }
}
