package com.eurekaclient.client.abstraction;

import com.eurekaclient.client.pojo.bo.ClientInfoBO;
import com.eurekaclient.client.service.IClientWriteService;

/**
 * @author XuMeng
 * @version 1.0.0
 * @ClassName AbstractClientWrite.java
 * @Description TODO
 * @createTime 2020年03月03日 22:55:00
 */
public abstract class AbstractClientWrite {

    public IClientWriteService clientWriteService;

    public AbstractClientWrite(IClientWriteService clientWriteService) {
        this.clientWriteService = clientWriteService;
    }

    /**
     * @throws
     * @title
     * @description 持久化客户信息及需求
     * @author xumeng
     * @updateTime 2020/3/5 18:49
     */
    public abstract void persistClient(String type);

    /**
     * @throws
     * @title
     * @description 写跟进
     * @author xumeng
     * @updateTime 2020/3/5 18:48
     */
    public abstract void writeFollowRecord();

    /**
     * @throws
     * @title
     * @description 修改客户需求详情
     * @author xumeng
     * @updateTime 2020/3/5 18:48
     */
    public abstract void updateClientNeedInfo();

    /**
     * @title
     * @description 修改客户信息
     * @author xumeng
     * @updateTime 2020/3/5 19:14
     * @throws
     */
    public void updateClientInfo(ClientInfoBO clientInfoBO){
        clientWriteService.updateClientInfo(clientInfoBO);
    }

}
