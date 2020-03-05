package com.eurekaclient.client.pojo.entity;

import java.io.Serializable;
import java.util.Date;

public class TailedRecord implements Serializable {

    private static final long serialVersionUID = -3875466138871195942L;

    private Integer id;

    private Integer tailedType;

    private Integer createId;

    private String createName;

    private String context;

    private Date createTime;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTailedType() {
        return tailedType;
    }

    public void setTailedType(Integer tailedType) {
        this.tailedType = tailedType;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
