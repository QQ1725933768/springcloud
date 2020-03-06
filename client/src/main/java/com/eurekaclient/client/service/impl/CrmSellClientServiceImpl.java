package com.eurekaclient.client.service.impl;

import com.eurekaclient.client.pojo.bo.ClientInfoBO;
import com.eurekaclient.client.service.IClientService;
import com.eurekaclient.client.service.ICrmClientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author XuMeng
 * @version 1.0.0
 * @ClassName CrmSellClientServiceImpl.java
 * @Description CRM卖车客户Service
 * @createTime 2020年03月03日 23:23:00
 */
@Service
public class CrmSellClientServiceImpl implements IClientService {

    @Resource
    private ICrmClientService crmClientService;

    @Override
    public void persistClient(String type) {
        System.out.println(type);
    }

    @Override
    public void writeFollowRecord() {

    }

    @Override
    public void updateClientNeedInfo() {

    }

    @Override
    public void updateClientInfo(ClientInfoBO clientInfoBO) {
        crmClientService.updateCrmClientInfo(clientInfoBO.getCrmClient());
    }
}
