package com.guludai.ui.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "base_security_resources")
public class BaseSecurityResources implements Serializable{
    /**
	 * @author: xiongshikang
	 * @date: 2017年10月29日 下午2:38:20
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: 
	 */
	private static final long serialVersionUID = 3012827114475500807L;

	/**
     * 主建
     */
    @Id
    private Long id;

    /**
     * 资源编号
     */
    @Column(name = "resources_code")
    private String resourcesCode;

    /**
     * 资源名称
     */
    @Column(name = "security_name")
    private String securityName;

    /**
     * 资源地址
     */
    private String path;

    /**
     * 资源符号
     */
    private String item;

    /**
     * 父节点编号
     */
    @Column(name = "parent_code")
    private String parentCode;

    /**
     * 跳转地址
     */
    private String href;

    /**
     * 排序字段（默认为0）
     */
    private Integer orders;

    /**
     * 显示图标
     */
    private String icon;

    /**
     * 备注
     */
    private String description;

    /**
     * 类型（0功能，1菜单，默认为0）
     */
    private Integer type;

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
     * 获取主建
     *
     * @return id - 主建
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主建
     *
     * @param id 主建
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取资源编号
     *
     * @return resources_code - 资源编号
     */
    public String getResourcesCode() {
        return resourcesCode;
    }

    /**
     * 设置资源编号
     *
     * @param resourcesCode 资源编号
     */
    public void setResourcesCode(String resourcesCode) {
        this.resourcesCode = resourcesCode;
    }

    /**
     * 获取资源名称
     *
     * @return security_name - 资源名称
     */
    public String getSecurityName() {
        return securityName;
    }

    /**
     * 设置资源名称
     *
     * @param securityName 资源名称
     */
    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    /**
     * 获取资源地址
     *
     * @return path - 资源地址
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置资源地址
     *
     * @param path 资源地址
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取资源符号
     *
     * @return item - 资源符号
     */
    public String getItem() {
        return item;
    }

    /**
     * 设置资源符号
     *
     * @param item 资源符号
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * 获取父节点编号
     *
     * @return parent_code - 父节点编号
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * 设置父节点编号
     *
     * @param parentCode 父节点编号
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    /**
     * 获取跳转地址
     *
     * @return href - 跳转地址
     */
    public String getHref() {
        return href;
    }

    /**
     * 设置跳转地址
     *
     * @param href 跳转地址
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * 获取排序字段（默认为0）
     *
     * @return orders - 排序字段（默认为0）
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * 设置排序字段（默认为0）
     *
     * @param orders 排序字段（默认为0）
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * 获取显示图标
     *
     * @return icon - 显示图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置显示图标
     *
     * @param icon 显示图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取备注
     *
     * @return description - 备注
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置备注
     *
     * @param description 备注
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取类型（0功能，1菜单，默认为0）
     *
     * @return type - 类型（0功能，1菜单，默认为0）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型（0功能，1菜单，默认为0）
     *
     * @param type 类型（0功能，1菜单，默认为0）
     */
    public void setType(Integer type) {
        this.type = type;
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