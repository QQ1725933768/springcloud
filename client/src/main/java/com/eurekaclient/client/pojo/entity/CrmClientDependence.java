package com.eurekaclient.client.pojo.entity;

import java.io.Serializable;

/**
 * 客户信息附属表(CrmClientDependence)实体类
 *
 * @author makejava
 * @since 2020-03-06 21:18:00
 */
public class CrmClientDependence implements Serializable {
    private static final long serialVersionUID = 817622861197171000L;
    /**
    * 主键
    */
    private Integer dependenceId;
    /**
    * 客户来源[0:自然到店 1:客服电话 2:别人推荐 3:二手车之家 4:苏宁 5:PC官网 6:微店 7:其它  8:抖音
    */
    private Integer sourceType;
    /**
    * 了解渠道[0:电台 1:公交广告 2:熟人推荐 3:电梯广告 4:网站 5:新闻 6:微信公众号 7:其它]
    */
    private Integer channelType;
    /**
    * 推存人姓名
    */
    private String referrerName;
    /**
    * 推荐人手机号
    */
    private String referrerPhone;
    /**
    * 客户等级[0:优秀 1:良好 2:一般]
    */
    private Integer gradeType;
    /**
    * 客户体验满意度[0:不满意 1:满意]
    */
    private Integer customerExperience;
    /**
    * 客户体验描述
    */
    private String description;
    /**
    * 备注
    */
    private String remark;


    public Integer getDependenceId() {
        return dependenceId;
    }

    public void setDependenceId(Integer dependenceId) {
        this.dependenceId = dependenceId;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getChannelType() {
        return channelType;
    }

    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }

    public String getReferrerName() {
        return referrerName;
    }

    public void setReferrerName(String referrerName) {
        this.referrerName = referrerName;
    }

    public String getReferrerPhone() {
        return referrerPhone;
    }

    public void setReferrerPhone(String referrerPhone) {
        this.referrerPhone = referrerPhone;
    }

    public Integer getGradeType() {
        return gradeType;
    }

    public void setGradeType(Integer gradeType) {
        this.gradeType = gradeType;
    }

    public Integer getCustomerExperience() {
        return customerExperience;
    }

    public void setCustomerExperience(Integer customerExperience) {
        this.customerExperience = customerExperience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}