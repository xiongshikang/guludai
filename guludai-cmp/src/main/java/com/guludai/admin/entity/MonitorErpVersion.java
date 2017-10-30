package com.guludai.admin.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "monitor_erp_version")
public class MonitorErpVersion {
    @Id
    private Long id;

    /**
     * erp厂商版本号名称
     */
    @Column(name = "version_name")
    private String versionName;

    /**
     * erp厂商版本号
     */
    private Integer version;

    /**
     * 外键 ,对应erp厂商表id
     */
    @Column(name = "erp_id")
    private Long erpId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 修改版本
     */
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
     * 获取erp厂商版本号名称
     *
     * @return version_name - erp厂商版本号名称
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * 设置erp厂商版本号名称
     *
     * @param versionName erp厂商版本号名称
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * 获取erp厂商版本号
     *
     * @return version - erp厂商版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置erp厂商版本号
     *
     * @param version erp厂商版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取外键 ,对应erp厂商表id
     *
     * @return erp_id - 外键 ,对应erp厂商表id
     */
    public Long getErpId() {
        return erpId;
    }

    /**
     * 设置外键 ,对应erp厂商表id
     *
     * @param erpId 外键 ,对应erp厂商表id
     */
    public void setErpId(Long erpId) {
        this.erpId = erpId;
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
     * 获取修改版本
     *
     * @return version_number - 修改版本
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * 设置修改版本
     *
     * @param versionNumber 修改版本
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