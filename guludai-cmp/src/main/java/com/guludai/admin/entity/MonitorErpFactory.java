package com.guludai.admin.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "monitor_erp_factory")
public class MonitorErpFactory {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * erp厂商名称
     */
    @Column(name = "erp_name")
    private String erpName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 版本号
     */
    @Column(name = "version_number")
    private Integer versionNumber;

    /**
     * 状态  0 有效 1无效
     */
    @Column(name = "version_status")
    private Integer versionStatus;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取erp厂商名称
     *
     * @return erp_name - erp厂商名称
     */
    public String getErpName() {
        return erpName;
    }

    /**
     * 设置erp厂商名称
     *
     * @param erpName erp厂商名称
     */
    public void setErpName(String erpName) {
        this.erpName = erpName;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取版本号
     *
     * @return version_number - 版本号
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * 设置版本号
     *
     * @param versionNumber 版本号
     */
    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * 获取状态  0 有效 1无效
     *
     * @return version_status - 状态  0 有效 1无效
     */
    public Integer getVersionStatus() {
        return versionStatus;
    }

    /**
     * 设置状态  0 有效 1无效
     *
     * @param versionStatus 状态  0 有效 1无效
     */
    public void setVersionStatus(Integer versionStatus) {
        this.versionStatus = versionStatus;
    }
}