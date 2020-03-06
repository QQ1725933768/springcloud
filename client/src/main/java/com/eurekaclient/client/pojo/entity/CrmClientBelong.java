package com.eurekaclient.client.pojo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 客户归属表(CrmClientBelong)实体类
 *
 * @author makejava
 * @since 2020-03-06 21:17:54
 */
public class CrmClientBelong implements Serializable {
    private static final long serialVersionUID = 982987155605136324L;
    /**
    * 主键
    */
    private Integer uniqueId;
    /**
    * 归属人ID
    */
    private Integer belongToId;
    /**
    * 归属人姓名
    */
    private String belongToName;
    /**
    * 客户状态[0:待跟进 1:跟进中 2:已预约 3:已成交 4:已战败]
    */
    private Integer followStatus;
    /**
    * 分配时间
    */
    private Date allocateTime;
    /**
    * 成交时间
    */
    private Date tradingTime;
    /**
    * 战败时间
    */
    private Date defeatTime;
    /**
    * 确认成交状态[0:否 1:是]
    */
    private Integer confirmationStatus;
    /**
    * 下次跟进时间
    */
    private Date nextFollowTime;
    /**
    * 回访时间
    */
    private Date revisitTime;
    /**
    * 客户附属ID
    */
    private Integer dependenceId;
    /**
    * 客户详情ID
    */
    private Integer clientId;
    /**
    * 需求类型[0.买车,1.卖车]
    */
    private Integer requireType;
    /**
    * 线索类型[0.客户,1.线索,2.作废线索]
    */
    private Integer clueType;
    /**
    * 回流次数
    */
    private Integer backNum;
    /**
    * 回流时间
    */
    private Date backTime;
    /**
    * 所属市场ID
    */
    private Integer marketId;
    /**
    * 所属公司ID
    */
    private Integer companyId;


    public Integer getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Integer uniqueId) {
        this.uniqueId = uniqueId;
    }

    public Integer getBelongToId() {
        return belongToId;
    }

    public void setBelongToId(Integer belongToId) {
        this.belongToId = belongToId;
    }

    public String getBelongToName() {
        return belongToName;
    }

    public void setBelongToName(String belongToName) {
        this.belongToName = belongToName;
    }

    public Integer getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(Integer followStatus) {
        this.followStatus = followStatus;
    }

    public Date getAllocateTime() {
        return allocateTime;
    }

    public void setAllocateTime(Date allocateTime) {
        this.allocateTime = allocateTime;
    }

    public Date getTradingTime() {
        return tradingTime;
    }

    public void setTradingTime(Date tradingTime) {
        this.tradingTime = tradingTime;
    }

    public Date getDefeatTime() {
        return defeatTime;
    }

    public void setDefeatTime(Date defeatTime) {
        this.defeatTime = defeatTime;
    }

    public Integer getConfirmationStatus() {
        return confirmationStatus;
    }

    public void setConfirmationStatus(Integer confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }

    public Date getNextFollowTime() {
        return nextFollowTime;
    }

    public void setNextFollowTime(Date nextFollowTime) {
        this.nextFollowTime = nextFollowTime;
    }

    public Date getRevisitTime() {
        return revisitTime;
    }

    public void setRevisitTime(Date revisitTime) {
        this.revisitTime = revisitTime;
    }

    public Integer getDependenceId() {
        return dependenceId;
    }

    public void setDependenceId(Integer dependenceId) {
        this.dependenceId = dependenceId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getRequireType() {
        return requireType;
    }

    public void setRequireType(Integer requireType) {
        this.requireType = requireType;
    }

    public Integer getClueType() {
        return clueType;
    }

    public void setClueType(Integer clueType) {
        this.clueType = clueType;
    }

    public Integer getBackNum() {
        return backNum;
    }

    public void setBackNum(Integer backNum) {
        this.backNum = backNum;
    }

    public Date getBackTime() {
        return backTime;
    }

    public void setBackTime(Date backTime) {
        this.backTime = backTime;
    }

    public Integer getMarketId() {
        return marketId;
    }

    public void setMarketId(Integer marketId) {
        this.marketId = marketId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

}