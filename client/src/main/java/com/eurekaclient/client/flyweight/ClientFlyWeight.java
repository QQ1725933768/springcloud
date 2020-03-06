package com.eurekaclient.client.flyweight;

import com.eurekaclient.client.abstraction.AbstractClientWrite;
import com.eurekaclient.client.abstraction.impl.CrmClientWriteImpl;
import com.eurekaclient.client.service.impl.CrmBuyClientServiceImpl;
import com.eurekaclient.client.service.impl.CrmSellClientServiceImpl;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author XuMeng
 * @version 1.0.0
 * @ClassName ClientFlyWeight.java
 * @Description TODO
 * @createTime 2020年03月05日 19:17:00
 */
@Component
public class ClientFlyWeight {

    private static final Map<String, AbstractClientWrite> CLIENT_WRITE_CACHE = new ConcurrentHashMap<>();

    @Resource
    private CrmBuyClientServiceImpl crmBuyClientService;

    @Resource
    private CrmSellClientServiceImpl crmSellClientService;

    @PostConstruct
    public void init(){
        CLIENT_WRITE_CACHE.put("CRM_SELL",new CrmClientWriteImpl(crmSellClientService));
        CLIENT_WRITE_CACHE.put("CRM_BUY",new CrmClientWriteImpl(crmBuyClientService));
    }

    /**
     * @title
     * @description TODO
     * @author xumeng
     * @param type 1 买车 2 卖车
     * @updateTime 2020/3/5 20:46
     * @throws
     */
    public CrmClientWriteImpl getCrmClientImpl(int type) {
        switch (type){
            case 1:
                return (CrmClientWriteImpl) CLIENT_WRITE_CACHE.get("CRM_BUY");
            case 2:
                return (CrmClientWriteImpl) CLIENT_WRITE_CACHE.get("CRM_SELL");
            default:
                throw new RuntimeException("not found CrmClientWriteImpl");
        }
    }
}
