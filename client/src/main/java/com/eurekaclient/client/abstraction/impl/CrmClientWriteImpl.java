package com.eurekaclient.client.abstraction.impl;

import com.eurekaclient.client.abstraction.AbstractClientWrite;
import com.eurekaclient.client.service.IClientWriteService;

/**
 * @author XuMeng
 * @version 1.0.0
 * @ClassName CrmClientWriteImpl.java
 * @Description TODO
 * @createTime 2020年03月05日 18:55:00
 */
public class CrmClientWriteImpl extends AbstractClientWrite {


    public CrmClientWriteImpl(IClientWriteService clientWriteService) {
        super(clientWriteService);
    }

    @Override
    public void persistClient(String type) {
        clientWriteService.persistClient(type);
    }

    @Override
    public void writeFollowRecord() {

    }

    @Override
    public void updateClientNeedInfo() {

    }
}
