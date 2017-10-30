package com.guludai.base.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "base_bank")
public class BaseBank {
    /**
     * 主键
     */
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Long id;

    /**
     * 银行编号
     */
    @Column(name = "bank_no")
    private String bankNo;

    /**
     * 银行简称
     */
    @Column(name = "bank_nick")
    private String bankNick;

    /**
     * 银行全称
     */
    @Column(name = "bank_name")
    private String bankName;

    /**
     * 是否支持(常量值：Y-支持，N-不支持，默认值：Y)
     */
    @Column(name = "bank_suport")
    private String bankSuport;

    /**
     * 银行图标地址
     */
    @Column(name = "bank_picture")
    private String bankPicture;

    /**
     * 版本号(默认值：1，同步递增修改)
     */
    private Long version;

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
     * 获取银行编号
     *
     * @return bank_no - 银行编号
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * 设置银行编号
     *
     * @param bankNo 银行编号
     */
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    /**
     * 获取银行简称
     *
     * @return bank_nick - 银行简称
     */
    public String getBankNick() {
        return bankNick;
    }

    /**
     * 设置银行简称
     *
     * @param bankNick 银行简称
     */
    public void setBankNick(String bankNick) {
        this.bankNick = bankNick;
    }

    /**
     * 获取银行全称
     *
     * @return bank_name - 银行全称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置银行全称
     *
     * @param bankName 银行全称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 获取是否支持(常量值：Y-支持，N-不支持，默认值：Y)
     *
     * @return bank_suport - 是否支持(常量值：Y-支持，N-不支持，默认值：Y)
     */
    public String getBankSuport() {
        return bankSuport;
    }

    /**
     * 设置是否支持(常量值：Y-支持，N-不支持，默认值：Y)
     *
     * @param bankSuport 是否支持(常量值：Y-支持，N-不支持，默认值：Y)
     */
    public void setBankSuport(String bankSuport) {
        this.bankSuport = bankSuport;
    }

    /**
     * 获取银行图标地址
     *
     * @return bank_picture - 银行图标地址
     */
    public String getBankPicture() {
        return bankPicture;
    }

    /**
     * 设置银行图标地址
     *
     * @param bankPicture 银行图标地址
     */
    public void setBankPicture(String bankPicture) {
        this.bankPicture = bankPicture;
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