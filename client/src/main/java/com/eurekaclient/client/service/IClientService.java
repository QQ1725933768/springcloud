package com.eurekaclient.client.service;

public interface IClientService {

    void persistClient();

    void writeFollowRecord();

    void updateClientNeedInfo();

    void updateClientInfo();
}
