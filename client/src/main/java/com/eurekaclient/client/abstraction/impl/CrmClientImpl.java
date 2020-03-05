package com.eurekaclient.client.abstraction.impl;

import com.eurekaclient.client.abstraction.AbstractClient;
import com.eurekaclient.client.service.IClientService;

/**
 * @author XuMeng
 * @version 1.0.0
 * @ClassName CrmClientImpl.java
 * @Description TODO
 * @createTime 2020年03月05日 18:55:00
 */
public class CrmClientImpl extends AbstractClient {


    public CrmClientImpl(IClientService clientService) {
        super(clientService);
    }

    @Override
    public void persistClient(String type) {
        clientService.persistClient(type);
    }

    @Override
    public void writeFollowRecord() {

    }

    @Override
    public void updateClientNeedInfo() {

    }
}
