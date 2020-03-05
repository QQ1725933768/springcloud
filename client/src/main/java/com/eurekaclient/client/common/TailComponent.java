package com.eurekaclient.client.common;

import com.eurekaclient.client.pojo.entity.TailedRecord;
import com.eurekaclient.client.pojo.surport.TailedServiceType;
import com.eurekaclient.client.service.ITailedService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class TailComponent implements ApplicationContextAware {

    private static Map<String, ITailedService> tailedServiceMap;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, ITailedService> map = applicationContext.getBeansOfType(ITailedService.class);
        tailedServiceMap = new ConcurrentHashMap<>();
        map.forEach((key, value) -> tailedServiceMap.put(key, value));
    }

    public void writeTailedRecord(TailedRecord record) {
        String key = TailedServiceType.getValueByKey(record.getTailedType());
        ITailedService tailedService = tailedServiceMap.get(key);
        tailedService.writeTailedRecord(record);
    }
}
