package com.guludai.admin.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "monitor_plugin")
public class MonitorPlugin {
    @Id
    private Long id;

    /**
     * 插件名称
     */
    @Column(name = "plus_name")
    private String plusName;

    /**
     * 下载地址
     */
    private String url;

    /**
     * 描述
     */
    private String desc;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "version_number")
    private Integer versionNumber;

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
     * 获取插件名称
     *
     * @return plus_name - 插件名称
     */
    public String getPlusName() {
        return plusName;
    }

    /**
     * 设置插件名称
     *
     * @param plusName 插件名称
     */
    public void setPlusName(String plusName) {
        this.plusName = plusName;
    }

    /**
     * 获取下载地址
     *
     * @return url - 下载地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置下载地址
     *
     * @param url 下载地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取描述
     *
     * @return desc - 描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置描述
     *
     * @param desc 描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
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
     * @return version_status
     */
    public Integer getVersionStatus() {
        return versionStatus;
    }

    /**
     * @param versionStatus
     */
    public void setVersionStatus(Integer versionStatus) {
        this.versionStatus = versionStatus;
    }
}