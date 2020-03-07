package com.eurekaclient.client.pojo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 客户归属表(CrmClientBelong)实体类
 *
 * @author makejava
 * @since 2020-03-06 21:17:54
 */
@Data
@Accessors(chain = true)
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

}