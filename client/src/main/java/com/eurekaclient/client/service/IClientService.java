package com.eurekaclient.client.service;

public interface IClientService {

    void persistClient(String type);

    void writeFollowRecord();

    void updateClientNeedInfo();

    void updateClientInfo();
}
