package com.guludai.admin.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "monitor_plugin_data")
public class MonitorPluginData {
    @Id
    private Long id;

    /**
     * 门店id
     */
    @Column(name = "shop_id")
    private Long shopId;

    /**
     * 昨天上传数据总量
     */
    @Column(name = "plug_count")
    private Integer plugCount;

    /**
     * 昨天上传数据总量
     */
    @Column(name = "data_count")
    private Integer dataCount;

    /**
     * t+1 门店昨天的日期
     */
    @Column(name = "shop_time")
    private Date shopTime;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "version_number")
    private Integer versionNumber;

    @Column(name = "version_status")
    private Integer versionStatus;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取门店id
     *
     * @return shop_id - 门店id
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * 设置门店id
     *
     * @param shopId 门店id
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取昨天上传数据总量
     *
     * @return plug_count - 昨天上传数据总量
     */
    public Integer getPlugCount() {
        return plugCount;
    }

    /**
     * 设置昨天上传数据总量
     *
     * @param plugCount 昨天上传数据总量
     */
    public void setPlugCount(Integer plugCount) {
        this.plugCount = plugCount;
    }

    /**
     * 获取昨天上传数据总量
     *
     * @return data_count - 昨天上传数据总量
     */
    public Integer getDataCount() {
        return dataCount;
    }

    /**
     * 设置昨天上传数据总量
     *
     * @param dataCount 昨天上传数据总量
     */
    public void setDataCount(Integer dataCount) {
        this.dataCount = dataCount;
    }

    /**
     * 获取t+1 门店昨天的日期
     *
     * @return shop_time - t+1 门店昨天的日期
     */
    public Date getShopTime() {
        return shopTime;
    }

    /**
     * 设置t+1 门店昨天的日期
     *
     * @param shopTime t+1 门店昨天的日期
     */
    public void setShopTime(Date shopTime) {
        this.shopTime = shopTime;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return version_number
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * @param versionNumber
     */
    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * @return version_status
     */
    public Integer getVersionStatus() {
        return versionStatus;
    }

    /**
     * @param versionStatus
     */
    public void setVersionStatus(Integer versionStatus) {
        this.versionStatus = versionStatus;
    }
}