package com.eurekaclient.client.pojo.bo;

import com.eurekaclient.client.pojo.entity.CrmClient;

/**
 * @author XuMeng
 * @version 1.0.0
 * @ClassName ClientInfoBO.java
 * @Description TODO
 * @createTime 2020年03月06日 21:31:00
 */
public class ClientInfoBO {

    private CrmClient crmClient;

    public CrmClient getCrmClient() {
        return crmClient;
    }

    public void setCrmClient(CrmClient crmClient) {
        this.crmClient = crmClient;
    }
}
