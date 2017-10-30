package com.guludai.base.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "base_erp_factory")
public class BaseErpFactory {
    /**
     * 主键
     */
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Long id;

    /**
     * ERP厂商编号
     */
    @Column(name = "erp_factory_code")
    private String erpFactoryCode;

    /**
     * ERP厂商名称
     */
    @Column(name = "erp_factory_name")
    private String erpFactoryName;

    /**
     * 厂商联系电话
     */
    private String phone;

    /**
     * 厂商联系邮箱
     */
    private String mail;

    /**
     * 厂商公司地址
     */
    private String address;

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
     * 获取ERP厂商名称
     *
     * @return erp_factory_name - ERP厂商名称
     */
    public String getErpFactoryName() {
        return erpFactoryName;
    }

    /**
     * 设置ERP厂商名称
     *
     * @param erpFactoryName ERP厂商名称
     */
    public void setErpFactoryName(String erpFactoryName) {
        this.erpFactoryName = erpFactoryName;
    }

    /**
     * 获取厂商联系电话
     *
     * @return phone - 厂商联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置厂商联系电话
     *
     * @param phone 厂商联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取厂商联系邮箱
     *
     * @return mail - 厂商联系邮箱
     */
    public String getMail() {
        return mail;
    }

    /**
     * 设置厂商联系邮箱
     *
     * @param mail 厂商联系邮箱
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * 获取厂商公司地址
     *
     * @return address - 厂商公司地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置厂商公司地址
     *
     * @param address 厂商公司地址
     */
    public void setAddress(String address) {
        this.address = address;
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