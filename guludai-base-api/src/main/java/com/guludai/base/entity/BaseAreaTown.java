package com.guludai.base.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "base_area_town")
public class BaseAreaTown {
    /**
     * 主键
     */
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Long id;

    /**
     * 地市编号
     */
    @Column(name = "city_no")
    private String cityNo;

    /**
     * 区域编号
     */
    @Column(name = "town_no")
    private String townNo;

    /**
     * 区域名称
     */
    @Column(name = "town_name")
    private String townName;

    /**
     * 排序号
     */
    private Short orders;

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
     * 获取地市编号
     *
     * @return city_no - 地市编号
     */
    public String getCityNo() {
        return cityNo;
    }

    /**
     * 设置地市编号
     *
     * @param cityNo 地市编号
     */
    public void setCityNo(String cityNo) {
        this.cityNo = cityNo;
    }

    /**
     * 获取区域编号
     *
     * @return town_no - 区域编号
     */
    public String getTownNo() {
        return townNo;
    }

    /**
     * 设置区域编号
     *
     * @param townNo 区域编号
     */
    public void setTownNo(String townNo) {
        this.townNo = townNo;
    }

    /**
     * 获取区域名称
     *
     * @return town_name - 区域名称
     */
    public String getTownName() {
        return townName;
    }

    /**
     * 设置区域名称
     *
     * @param townName 区域名称
     */
    public void setTownName(String townName) {
        this.townName = townName;
    }

    /**
     * 获取排序号
     *
     * @return orders - 排序号
     */
    public Short getOrders() {
        return orders;
    }

    /**
     * 设置排序号
     *
     * @param orders 排序号
     */
    public void setOrders(Short orders) {
        this.orders = orders;
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