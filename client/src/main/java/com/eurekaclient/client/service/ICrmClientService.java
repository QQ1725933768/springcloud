package com.eurekaclient.client.service;

import com.eurekaclient.client.pojo.entity.CrmClient;
import lombok.NonNull;

public interface ICrmClientService {

    void updateCrmClientInfo(@NonNull CrmClient crmClient);
}
