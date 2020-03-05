package com.eurekaclient.client.designmode;

import com.eurekaclient.client.mode.Vehicle;

/**
 * @author XuMeng
 * @version 1.0.0
 * @ClassName SimpleFactory.java
 * @Description 简单工程模型
 * @createTime 2020年03月02日 15:48:00
 */
public class SimpleFactory {

    public static Vehicle createVehicle(Class<? extends Vehicle> clazz) throws Exception{
        return clazz.getConstructor().newInstance();
    }
}
