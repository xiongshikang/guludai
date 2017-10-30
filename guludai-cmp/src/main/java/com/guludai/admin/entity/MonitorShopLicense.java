package com.guludai.admin.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "monitor_shop_license")
public class MonitorShopLicense {
    @Id
    private Long id;

    /**
     * 门店对应的外键
     */
    @Column(name = "shop_id")
    private Long shopId;

    /**
     * 插件注册码
     */
    @Column(name = "shop_register_code")
    private String shopRegisterCode;

    /**
     * 有效时间
     */
    @Column(name = "effective_time")
    private Integer effectiveTime;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "version_number")
    private Integer versionNumber;

    /**
     * 0可用 1不可用
     */
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
     * 获取门店对应的外键
     *
     * @return shop_id - 门店对应的外键
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * 设置门店对应的外键
     *
     * @param shopId 门店对应的外键
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取插件注册码
     *
     * @return shop_register_code - 插件注册码
     */
    public String getShopRegisterCode() {
        return shopRegisterCode;
    }

    /**
     * 设置插件注册码
     *
     * @param shopRegisterCode 插件注册码
     */
    public void setShopRegisterCode(String shopRegisterCode) {
        this.shopRegisterCode = shopRegisterCode;
    }

    /**
     * 获取有效时间
     *
     * @return effective_time - 有效时间
     */
    public Integer getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * 设置有效时间
     *
     * @param effectiveTime 有效时间
     */
    public void setEffectiveTime(Integer effectiveTime) {
        this.effectiveTime = effectiveTime;
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
     * 获取0可用 1不可用
     *
     * @return version_status - 0可用 1不可用
     */
    public Integer getVersionStatus() {
        return versionStatus;
    }

    /**
     * 设置0可用 1不可用
     *
     * @param versionStatus 0可用 1不可用
     */
    public void setVersionStatus(Integer versionStatus) {
        this.versionStatus = versionStatus;
    }
}