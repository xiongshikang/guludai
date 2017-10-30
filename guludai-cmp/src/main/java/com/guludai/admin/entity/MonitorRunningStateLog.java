package com.guludai.admin.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "monitor_running_state_log")
public class MonitorRunningStateLog {
    @Id
    private Long id;

    /**
     * 门店id
     */
    @Column(name = "shop_id")
    private Long shopId;

    /**
     * 运行状态id
     */
    @Column(name = "monito_running_state_id")
    private Long monitoRunningStateId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "version_number")
    private Integer versionNumber;

    @Column(name = "version_status")
    private Integer versionStatus;

    /**
     * 日志详情
     */
    @Column(name = "log_info")
    private String logInfo;

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
     * 获取运行状态id
     *
     * @return monito_running_state_id - 运行状态id
     */
    public Long getMonitoRunningStateId() {
        return monitoRunningStateId;
    }

    /**
     * 设置运行状态id
     *
     * @param monitoRunningStateId 运行状态id
     */
    public void setMonitoRunningStateId(Long monitoRunningStateId) {
        this.monitoRunningStateId = monitoRunningStateId;
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

    /**
     * 获取日志详情
     *
     * @return log_info - 日志详情
     */
    public String getLogInfo() {
        return logInfo;
    }

    /**
     * 设置日志详情
     *
     * @param logInfo 日志详情
     */
    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
    }
}