package com.eurekaclient.client.mode;

/**
 * @author XuMeng
 * @version 1.0.0
 * @ClassName Train.java
 * @Description TODO
 * @createTime 2020年03月02日 16:01:00
 */
public class Train implements Vehicle{
    @Override
    public void vehicleRunning() {
        System.out.println("火车跑起来了");
    }
}
