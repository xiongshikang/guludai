package com.guludai.admin.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "monitor_shop_upgrade_history")
public class MonitorShopUpgradeHistory {
    @Id
    private Long id;

    @Column(name = "erp_id")
    private Long erpId;

    /**
     * erp版本id
     */
    @Column(name = "erp_version_id")
    private Long erpVersionId;

    /**
     * 门店id
     */
    @Column(name = "shop_id")
    private Long shopId;

    /**
     * 插件id
     */
    @Column(name = "plug_id")
    private Long plugId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "version_number")
    private Integer versionNumber;

    /**
     * 0 升级成功 1升级失败 2未返回状态
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
     * @return erp_id
     */
    public Long getErpId() {
        return erpId;
    }

    /**
     * @param erpId
     */
    public void setErpId(Long erpId) {
        this.erpId = erpId;
    }

    /**
     * 获取erp版本id
     *
     * @return erp_version_id - erp版本id
     */
    public Long getErpVersionId() {
        return erpVersionId;
    }

    /**
     * 设置erp版本id
     *
     * @param erpVersionId erp版本id
     */
    public void setErpVersionId(Long erpVersionId) {
        this.erpVersionId = erpVersionId;
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
     * 获取插件id
     *
     * @return plug_id - 插件id
     */
    public Long getPlugId() {
        return plugId;
    }

    /**
     * 设置插件id
     *
     * @param plugId 插件id
     */
    public void setPlugId(Long plugId) {
        this.plugId = plugId;
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
     * 获取0 升级成功 1升级失败 2未返回状态
     *
     * @return version_status - 0 升级成功 1升级失败 2未返回状态
     */
    public Integer getVersionStatus() {
        return versionStatus;
    }

    /**
     * 设置0 升级成功 1升级失败 2未返回状态
     *
     * @param versionStatus 0 升级成功 1升级失败 2未返回状态
     */
    public void setVersionStatus(Integer versionStatus) {
        this.versionStatus = versionStatus;
    }
}