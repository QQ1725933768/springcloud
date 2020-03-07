package com.eurekaclient.client.pojo.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XuMeng
 * @version 1.0.0
 * @ClassName ClientBO.java
 * @Description TODO
 * @createTime 2020年03月06日 22:47:00
 */
@Data
public class ClientBO implements Serializable {

    private static final long serialVersionUID = 3859796945078077727L;

    private CrmClientInfoBO crmClientInfoBO;
}
