package com.eurekaclient.client.pojo.bo;

import com.eurekaclient.client.pojo.entity.CrmClient;
import com.eurekaclient.client.pojo.entity.CrmClientBelong;
import com.eurekaclient.client.pojo.entity.CrmClientDependence;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author XuMeng
 * @version 1.0.0
 * @ClassName CrmClientInfoBO.java
 * @Description TODO
 * @createTime 2020年03月06日 21:31:00
 */
@Data
@Accessors(chain = true)
public class CrmClientInfoBO {

    /**
     * CRM客户详情信息POJO
     */
    private CrmClient crmClient;
    /**
     * CRM客户归属信息POJO
     */
    private CrmClientBelong crmClientBelong;
    /**
     * CRM客户附属信息POJO
     */
    private CrmClientDependence crmClientDependence;
}
