package com.eurekaclient.client.pojo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 客户信息详情表(CrmClient)实体类
 *
 * @author makejava
 * @since 2020-03-06 21:17:36
 */
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


    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getWechatNum() {
        return wechatNum;
    }

    public void setWechatNum(String wechatNum) {
        this.wechatNum = wechatNum;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getMarriageType() {
        return marriageType;
    }

    public void setMarriageType(Integer marriageType) {
        this.marriageType = marriageType;
    }

    public Integer getFamilyNum() {
        return familyNum;
    }

    public void setFamilyNum(Integer familyNum) {
        this.familyNum = familyNum;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

}