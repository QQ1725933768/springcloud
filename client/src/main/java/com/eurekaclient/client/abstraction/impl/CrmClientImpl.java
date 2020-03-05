package com.eurekaclient.client.abstraction.impl;

import com.eurekaclient.client.abstraction.AbstractionClient;
import com.eurekaclient.client.service.IClientService;

/**
 * @author XuMeng
 * @version 1.0.0
 * @ClassName CrmClientImpl.java
 * @Description TODO
 * @createTime 2020年03月05日 18:55:00
 */
public class CrmClientImpl extends AbstractionClient {


    public CrmClientImpl(IClientService clientService) {
        super(clientService);
    }

    @Override
    public void persistClient() {

    }

    @Override
    public void writeFollowRecord() {

    }

    @Override
    public void updateClientNeedInfo() {

    }
}
