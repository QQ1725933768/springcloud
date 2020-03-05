package com.eurekaclient.client;

import com.eurekaclient.client.designmode.SimpleFactory;
import com.eurekaclient.client.mode.Train;
import com.eurekaclient.client.mode.Vehicle;
import com.eurekaclient.client.pojo.surport.TailedServiceType;

/**
 * @author XuMeng
 * @version 1.0.0
 * @ClassName Test.java
 * @Description 测试类
 * @createTime 2020年03月02日 16:01:00
 */
public class Test {

    public static void main(String[] args) throws Exception {

        Vehicle vehicle = SimpleFactory.createVehicle(Train.class);
        vehicle.vehicleRunning();

        TailedServiceType.getValueByKey(5);
    }
}
