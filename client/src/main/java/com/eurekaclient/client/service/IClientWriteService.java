package com.eurekaclient.client.service;

import com.eurekaclient.client.pojo.bo.ClientInfoBO;

public interface IClientWriteService {

    void persistClient(String type);

    void writeFollowRecord();

    void updateClientNeedInfo();

    void updateClientInfo(ClientInfoBO clientInfoBO);
}
