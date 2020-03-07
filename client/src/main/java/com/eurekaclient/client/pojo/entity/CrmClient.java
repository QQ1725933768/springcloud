package com.eurekaclient.client.pojo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 客户信息详情表(CrmClient)实体类
 *
 * @author makejava
 * @since 2020-03-06 21:17:36
 */
@Data
@Accessors(chain = true)
public class CrmClient implements Serializable {
    private static final long serialVersionUID = 823684335846026024L;
    /**
    * 客户ID
    */
    private Integer clientId;
    /**
    * 客户姓名
    */
    private String clientName;
    /**
    * 电话号码
    */
    private String clientPhone;
    /**
    * 微信号
    */
    private String wechatNum;
    /**
    * 邮箱
    */
    private String clientEmail;
    /**
    * 身份证号
    */
    private String idNum;
    /**
    * 生日
    */
    private Date birthday;
    /**
    * 年龄
    */
    private Integer age;
    /**
    * 职业
    */
    private String profession;
    /**
    * 性别[0:男 1:女]
    */
    private Integer sex;
    /**
    * 婚姻状况[0:未婚 1:已婚]
    */
    private Integer marriageType;
    /**
    * 家庭人数
    */
    private Integer familyNum;
    /**
    * 省份ID
    */
    private Integer provinceId;
    /**
    * 省份名称
    */
    private String provinceName;
    /**
    * 城市ID
    */
    private Integer cityId;
    /**
    * 城市名称
    */
    private String cityName;
    /**
    * 区域ID
    */
    private Integer areaId;
    /**
    * 区域名称
    */
    private String areaName;
    /**
    * 详细地址
    */
    private String address;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 创建人
    */
    private String founder;

}