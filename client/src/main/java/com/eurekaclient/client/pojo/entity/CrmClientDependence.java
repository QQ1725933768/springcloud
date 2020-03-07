package com.eurekaclient.client.pojo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 客户信息附属表(CrmClientDependence)实体类
 *
 * @author makejava
 * @since 2020-03-06 21:18:00
 */
@Data
@Accessors(chain = true)
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

}