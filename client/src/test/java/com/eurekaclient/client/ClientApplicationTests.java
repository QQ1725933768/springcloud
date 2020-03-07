package com.eurekaclient.client;

import com.eurekaclient.client.abstraction.impl.CrmClientWriteImpl;
import com.eurekaclient.client.flyweight.ClientFlyWeight;
import com.eurekaclient.client.pojo.bo.ClientBO;
import com.eurekaclient.client.pojo.entity.CrmClient;
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

        CrmClientWriteImpl client = clientFlyWeight.getCrmClientWriteImpl(0);
        CrmClientWriteImpl client1 = clientFlyWeight.getCrmClientWriteImpl(0);
        CompletableFuture.runAsync(() -> {
            CrmClientWriteImpl client2 = clientFlyWeight.getCrmClientWriteImpl(0);
            System.out.println(client2.equals(client1));
        });
        ClientBO clientBO = new ClientBO();
        CrmClient crmClient = clientBO.getCrmClientInfoBO().getCrmClient();
        System.out.println(client.equals(client1));

    }

}
