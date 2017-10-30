package com.guludai.base.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "base_shop_erp")
public class BaseShopErp {
    /**
     * 主键
     */
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Long id;

    /**
     * 公司编号
     */
    @Column(name = "company_code")
    private String companyCode;

    /**
     * 门店编号
     */
    @Column(name = "shop_code")
    private String shopCode;

    /**
     * ERP厂商编号
     */
    @Column(name = "erp_factory_code")
    private String erpFactoryCode;

    /**
     * ERP版本编号
     */
    @Column(name = "erp_version_code")
    private String erpVersionCode;

    /**
     * 数据签名盐值
     */
    @Column(name = "data_salt")
    private String dataSalt;

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
     * 数据私钥串
     */
    @Column(name = "data_public_key")
    private String dataPublicKey;

    /**
     * 数据私钥串
     */
    @Column(name = "data_private_key")
    private String dataPrivateKey;

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
     * 获取公司编号
     *
     * @return company_code - 公司编号
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * 设置公司编号
     *
     * @param companyCode 公司编号
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     * 获取门店编号
     *
     * @return shop_code - 门店编号
     */
    public String getShopCode() {
        return shopCode;
    }

    /**
     * 设置门店编号
     *
     * @param shopCode 门店编号
     */
    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
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
     * 获取ERP版本编号
     *
     * @return erp_version_code - ERP版本编号
     */
    public String getErpVersionCode() {
        return erpVersionCode;
    }

    /**
     * 设置ERP版本编号
     *
     * @param erpVersionCode ERP版本编号
     */
    public void setErpVersionCode(String erpVersionCode) {
        this.erpVersionCode = erpVersionCode;
    }

    /**
     * 获取数据签名盐值
     *
     * @return data_salt - 数据签名盐值
     */
    public String getDataSalt() {
        return dataSalt;
    }

    /**
     * 设置数据签名盐值
     *
     * @param dataSalt 数据签名盐值
     */
    public void setDataSalt(String dataSalt) {
        this.dataSalt = dataSalt;
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

    /**
     * 获取数据私钥串
     *
     * @return data_public_key - 数据私钥串
     */
    public String getDataPublicKey() {
        return dataPublicKey;
    }

    /**
     * 设置数据私钥串
     *
     * @param dataPublicKey 数据私钥串
     */
    public void setDataPublicKey(String dataPublicKey) {
        this.dataPublicKey = dataPublicKey;
    }

    /**
     * 获取数据私钥串
     *
     * @return data_private_key - 数据私钥串
     */
    public String getDataPrivateKey() {
        return dataPrivateKey;
    }

    /**
     * 设置数据私钥串
     *
     * @param dataPrivateKey 数据私钥串
     */
    public void setDataPrivateKey(String dataPrivateKey) {
        this.dataPrivateKey = dataPrivateKey;
    }
}