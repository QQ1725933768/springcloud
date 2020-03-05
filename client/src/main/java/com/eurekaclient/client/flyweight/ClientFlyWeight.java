package com.eurekaclient.client.flyweight;

import com.eurekaclient.client.abstraction.AbstractClient;
import com.eurekaclient.client.abstraction.impl.CrmClientImpl;
import com.eurekaclient.client.service.IClientService;
import com.eurekaclient.client.service.impl.CrmBuyClientServiceImpl;
import com.eurekaclient.client.service.impl.CrmSellClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

    @Resource
    private CrmBuyClientServiceImpl crmBuyClientService;

    @Resource
    private CrmSellClientServiceImpl crmSellClientService;

    /**
     * @title
     * @description 获取CRM卖车客户端
     * @author xumeng
     * @updateTime 2020/3/5 20:26
     * @throws
     */
    public CrmClientImpl getSellCrmClientImpl() {
        CrmClientImpl CRM_SELL = (CrmClientImpl) AbstractClientCache.CLIENT_CACHE.get("CRM_SELL");
        if (CRM_SELL == null) {
            CRM_SELL = (CrmClientImpl) AbstractClientCache.put("CRM_SELL", new CrmClientImpl(crmSellClientService));
        }
        return CRM_SELL;
    }

    /**
     * @title
     * @description 获取CRM买车客户端
     * @author xumeng
     * @updateTime 2020/3/5 20:27
     * @throws
     */
    public CrmClientImpl getBuyCrmClientImpl() {
        CrmClientImpl CRM_BUY = (CrmClientImpl) AbstractClientCache.CLIENT_CACHE.get("CRM_BUY");
        if (CRM_BUY == null) {
            CRM_BUY = (CrmClientImpl) AbstractClientCache.put("CRM_BUY", new CrmClientImpl(crmBuyClientService));
        }
        return CRM_BUY;
    }

    private static class AbstractClientCache {

        private static final Map<String, AbstractClient> CLIENT_CACHE = new ConcurrentHashMap<>();

        static AbstractClient put(String key, AbstractClient client) {
            CLIENT_CACHE.put(key, client);
            return client;
        }
    }
}
