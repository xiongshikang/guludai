package com.guludai.admin.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "monitor_shop_upgrade")
public class MonitorShopUpgrade {
    @Id
    private Long id;

    /**
     * erp厂商id
     */
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
     * 更新版本号
     */
    @Column(name = "version_number")
    private Integer versionNumber;

    /**
     * 0 更新中 1更新成功 2.更新失败 
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
     * 获取erp厂商id
     *
     * @return erp_id - erp厂商id
     */
    public Long getErpId() {
        return erpId;
    }

    /**
     * 设置erp厂商id
     *
     * @param erpId erp厂商id
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
     * 获取更新版本号
     *
     * @return version_number - 更新版本号
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * 设置更新版本号
     *
     * @param versionNumber 更新版本号
     */
    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * 获取0 更新中 1更新成功 2.更新失败 
     *
     * @return version_status - 0 更新中 1更新成功 2.更新失败 
     */
    public Integer getVersionStatus() {
        return versionStatus;
    }

    /**
     * 设置0 更新中 1更新成功 2.更新失败 
     *
     * @param versionStatus 0 更新中 1更新成功 2.更新失败 
     */
    public void setVersionStatus(Integer versionStatus) {
        this.versionStatus = versionStatus;
    }
}