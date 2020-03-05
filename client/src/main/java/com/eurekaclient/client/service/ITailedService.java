package com.eurekaclient.client.service;

import com.eurekaclient.client.pojo.entity.TailedRecord;

public interface ITailedService {

    /**
     * 写跟进
     */
    void writeTailedRecord(TailedRecord tailedRecord);
}
