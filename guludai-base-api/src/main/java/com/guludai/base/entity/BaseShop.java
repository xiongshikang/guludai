package com.guludai.base.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "base_shop")
public class BaseShop {
    /**
     * 主键
     */
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Long id;

    /**
     * 门店编号
     */
    @Column(name = "shop_code")
    private String shopCode;

    /**
     * 门店名称
     */
    @Column(name = "shop_name")
    private String shopName;

    /**
     * 经度
     */
    @Column(name = "shop_longitude")
    private BigDecimal shopLongitude;

    /**
     * 纬度
     */
    @Column(name = "shop_latitude")
    private BigDecimal shopLatitude;

    /**
     * 省份编号
     */
    @Column(name = "province_no")
    private String provinceNo;

    /**
     * 城市编号
     */
    @Column(name = "city_no")
    private String cityNo;

    /**
     * 地区编号
     */
    @Column(name = "town_no")
    private String townNo;

    /**
     * 公司id
     */
    @Column(name = "company_code")
    private String companyCode;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 商铺地址
     */
    @Column(name = "shop_address")
    private String shopAddress;

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
     * 获取门店名称
     *
     * @return shop_name - 门店名称
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 设置门店名称
     *
     * @param shopName 门店名称
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * 获取经度
     *
     * @return shop_longitude - 经度
     */
    public BigDecimal getShopLongitude() {
        return shopLongitude;
    }

    /**
     * 设置经度
     *
     * @param shopLongitude 经度
     */
    public void setShopLongitude(BigDecimal shopLongitude) {
        this.shopLongitude = shopLongitude;
    }

    /**
     * 获取纬度
     *
     * @return shop_latitude - 纬度
     */
    public BigDecimal getShopLatitude() {
        return shopLatitude;
    }

    /**
     * 设置纬度
     *
     * @param shopLatitude 纬度
     */
    public void setShopLatitude(BigDecimal shopLatitude) {
        this.shopLatitude = shopLatitude;
    }

    /**
     * 获取省份编号
     *
     * @return province_no - 省份编号
     */
    public String getProvinceNo() {
        return provinceNo;
    }

    /**
     * 设置省份编号
     *
     * @param provinceNo 省份编号
     */
    public void setProvinceNo(String provinceNo) {
        this.provinceNo = provinceNo;
    }

    /**
     * 获取城市编号
     *
     * @return city_no - 城市编号
     */
    public String getCityNo() {
        return cityNo;
    }

    /**
     * 设置城市编号
     *
     * @param cityNo 城市编号
     */
    public void setCityNo(String cityNo) {
        this.cityNo = cityNo;
    }

    /**
     * 获取地区编号
     *
     * @return town_no - 地区编号
     */
    public String getTownNo() {
        return townNo;
    }

    /**
     * 设置地区编号
     *
     * @param townNo 地区编号
     */
    public void setTownNo(String townNo) {
        this.townNo = townNo;
    }

    /**
     * 获取公司id
     *
     * @return company_code - 公司id
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * 设置公司id
     *
     * @param companyCode 公司id
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     * 获取联系人
     *
     * @return contacts - 联系人
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * 设置联系人
     *
     * @param contacts 联系人
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取商铺地址
     *
     * @return shop_address - 商铺地址
     */
    public String getShopAddress() {
        return shopAddress;
    }

    /**
     * 设置商铺地址
     *
     * @param shopAddress 商铺地址
     */
    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
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