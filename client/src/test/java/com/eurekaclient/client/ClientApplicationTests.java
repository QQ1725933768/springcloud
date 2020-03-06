package com.eurekaclient.client;

import com.eurekaclient.client.abstraction.impl.CrmClientWriteImpl;
import com.eurekaclient.client.flyweight.ClientFlyWeight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CompletableFuture;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientApplicationTests {

    @Autowired
    private ClientFlyWeight clientFlyWeight;

    @Test
    public void contextLoads() {

        CrmClientWriteImpl client = clientFlyWeight.getCrmClientImpl(0);
        CrmClientWriteImpl client1 = clientFlyWeight.getCrmClientImpl(0);
        CompletableFuture.runAsync(() -> {
            CrmClientWriteImpl client2 = clientFlyWeight.getCrmClientImpl(0);
            client2.persistClient("999999");
        });
        client1.persistClient("78888");
        client.persistClient("45466");
        System.out.println(client.equals(client1));

    }

}
