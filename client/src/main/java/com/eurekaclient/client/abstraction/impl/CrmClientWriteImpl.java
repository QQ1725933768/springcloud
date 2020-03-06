package com.eurekaclient.client.abstraction.impl;

import com.eurekaclient.client.abstraction.AbstractClientWrite;
import com.eurekaclient.client.service.IClientService;

/**
 * @author XuMeng
 * @version 1.0.0
 * @ClassName CrmClientWriteImpl.java
 * @Description TODO
 * @createTime 2020年03月05日 18:55:00
 */
public class CrmClientWriteImpl extends AbstractClientWrite {


    public CrmClientWriteImpl(IClientService clientService) {
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
