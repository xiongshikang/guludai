package com.guludai.base.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "base_erp_version")
public class BaseErpVersion {
    /**
     * 主键
     */
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Long id;

    /**
     * erp版本编号
     */
    @Column(name = "erp_version_code")
    private String erpVersionCode;

    /**
     * ERP版本号名称
     */
    @Column(name = "erp_version_name")
    private String erpVersionName;

    /**
     * ERP版本号
     */
    @Column(name = "erp_version")
    private Integer erpVersion;

    /**
     * ERP厂商编号
     */
    @Column(name = "erp_factory_code")
    private String erpFactoryCode;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 版本号(默认值：1，同步递增修改)
     */
    private Long version;

    /**
     * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
     */
    @Column(name = "data_status")
    private String dataStatus;

    /**
     * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
     */
    @Column(name = "disk_status")
    private String diskStatus;

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
     * 获取erp版本编号
     *
     * @return erp_version_code - erp版本编号
     */
    public String getErpVersionCode() {
        return erpVersionCode;
    }

    /**
     * 设置erp版本编号
     *
     * @param erpVersionCode erp版本编号
     */
    public void setErpVersionCode(String erpVersionCode) {
        this.erpVersionCode = erpVersionCode;
    }

    /**
     * 获取ERP版本号名称
     *
     * @return erp_version_name - ERP版本号名称
     */
    public String getErpVersionName() {
        return erpVersionName;
    }

    /**
     * 设置ERP版本号名称
     *
     * @param erpVersionName ERP版本号名称
     */
    public void setErpVersionName(String erpVersionName) {
        this.erpVersionName = erpVersionName;
    }

    /**
     * 获取ERP版本号
     *
     * @return erp_version - ERP版本号
     */
    public Integer getErpVersion() {
        return erpVersion;
    }

    /**
     * 设置ERP版本号
     *
     * @param erpVersion ERP版本号
     */
    public void setErpVersion(Integer erpVersion) {
        this.erpVersion = erpVersion;
    }

    /**
     * 获取ERP厂商编号
     *
     * @return erp_factory_code - ERP厂商编号
     */
    public String getErpFactoryCode() {
        return erpFactoryCode;
    }

    /**
     * 设置ERP厂商编号
     *
     * @param erpFactoryCode ERP厂商编号
     */
    public void setErpFactoryCode(String erpFactoryCode) {
        this.erpFactoryCode = erpFactoryCode;
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
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取版本号(默认值：1，同步递增修改)
     *
     * @return version - 版本号(默认值：1，同步递增修改)
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 设置版本号(默认值：1，同步递增修改)
     *
     * @param version 版本号(默认值：1，同步递增修改)
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * 获取逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
     *
     * @return data_status - 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
     */
    public String getDataStatus() {
        return dataStatus;
    }

    /**
     * 设置逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
     *
     * @param dataStatus 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
     */
    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
    }

    /**
     * 获取物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
     *
     * @return disk_status - 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
     */
    public String getDiskStatus() {
        return diskStatus;
    }

    /**
     * 设置物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
     *
     * @param diskStatus 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
     */
    public void setDiskStatus(String diskStatus) {
        this.diskStatus = diskStatus;
    }
}