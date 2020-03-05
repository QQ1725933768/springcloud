package com.eurekaclient.client;

import com.eurekaclient.client.abstraction.impl.CrmClientImpl;
import com.eurekaclient.client.flyweight.ClientFlyWeight;
import com.eurekaclient.client.service.IClientService;
import com.eurekaclient.client.service.impl.CrmBuyClientServiceImpl;
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

        CrmClientImpl client = clientFlyWeight.getBuyCrmClientImpl();
        CrmClientImpl client1 = clientFlyWeight.getBuyCrmClientImpl();
        CompletableFuture.runAsync(() -> {
            CrmClientImpl client2 = clientFlyWeight.getBuyCrmClientImpl();
            client2.persistClient("999999");
        });
        client1.persistClient("78888");
        client.persistClient("45466");
        System.out.println(client.equals(client1));

    }

}
