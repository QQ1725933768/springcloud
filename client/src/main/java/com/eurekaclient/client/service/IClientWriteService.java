package com.eurekaclient.client.service;

import com.eurekaclient.client.pojo.bo.CrmClientInfoBO;
import lombok.NonNull;

public interface IClientWriteService {

    void persistClient(@NonNull CrmClientInfoBO crmClientInfoBO);

    void writeFollowRecord();

    void updateClientNeedInfo();

    void updateClientInfo(@NonNull CrmClientInfoBO crmClientInfoBO);
}
