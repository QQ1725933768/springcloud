package com.eurekaclient.client.controller;

import com.eurekaclient.client.abstraction.impl.CrmClientWriteImpl;
import com.eurekaclient.client.common.AppClientConfig;
import com.eurekaclient.client.flyweight.ClientFlyWeight;
import com.eurekaclient.client.service.impl.DiscoveryServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DiscoveryController {

    @Resource
    private DiscoveryServiceImpl discoveryServiceImpl;

    @Resource
    private ClientFlyWeight clientFlyWeight;


    @GetMapping("/pc")
    public String getMsg(String type) {
        Integer clientType = AppClientConfig.CRM_BUY_WRITE;
        CrmClientWriteImpl buyCrmClientImpl = clientFlyWeight.getCrmClientWriteImpl(clientType);
        buyCrmClientImpl.persistClient(null);
        return discoveryServiceImpl.printMsg();
    }
}
