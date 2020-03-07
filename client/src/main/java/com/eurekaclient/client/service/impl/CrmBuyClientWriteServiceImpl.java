package com.eurekaclient.client.service.impl;

import com.eurekaclient.client.pojo.bo.CrmClientInfoBO;
import com.eurekaclient.client.service.IClientWriteService;
import com.eurekaclient.client.service.ICrmClientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author XuMeng
 * @version 1.0.0
 * @ClassName CrmBuyClientWriteServiceImpl.java
 * @Description CRM买车客户Service
 * @createTime 2020年03月03日 23:24:00
 */
@Service
public class CrmBuyClientWriteServiceImpl implements IClientWriteService {

    @Resource
    private ICrmClientService crmClientService;

    @Override
    public void persistClient(CrmClientInfoBO crmClientInfoBO) {
        System.out.println("");
    }

    @Override
    public void writeFollowRecord() {

    }

    @Override
    public void updateClientNeedInfo() {

    }

    @Override
    public void updateClientInfo(CrmClientInfoBO crmClientInfoBO) {
        crmClientService.updateCrmClientInfo(crmClientInfoBO.getCrmClient());
    }
}
