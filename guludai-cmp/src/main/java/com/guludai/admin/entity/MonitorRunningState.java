package com.guludai.admin.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "monitor_running_state")
public class MonitorRunningState {
    @Id
    private Long id;

    /**
     * 门店id
     */
    @Column(name = "shop_id")
    private Long shopId;

    /**
     * 上报时间
     */
    @Column(name = "report_time")
    private Date reportTime;

    /**
     * 机器mac
     */
    private String mac;

    /**
     * 硬盘信息
     */
    private String disk;

    /**
     * cpu型号
     */
    private String cpu;

    /**
     * 数据库类型
     */
    @Column(name = "db_type")
    private String dbType;

    /**
     * 数据库ip
     */
    @Column(name = "db_ip")
    private String dbIp;

    /**
     * 数据库端口号
     */
    @Column(name = "db_post")
    private String dbPost;

    /**
     * 数据库名
     */
    @Column(name = "db_name")
    private String dbName;

    /**
     * 持行状态 0正常， 1不正常
     */
    @Column(name = "running_start")
    private Integer runningStart;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "version_number")
    private Integer versionNumber;

    /**
     * 0 有效 1无效
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
     * 获取上报时间
     *
     * @return report_time - 上报时间
     */
    public Date getReportTime() {
        return reportTime;
    }

    /**
     * 设置上报时间
     *
     * @param reportTime 上报时间
     */
    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    /**
     * 获取机器mac
     *
     * @return mac - 机器mac
     */
    public String getMac() {
        return mac;
    }

    /**
     * 设置机器mac
     *
     * @param mac 机器mac
     */
    public void setMac(String mac) {
        this.mac = mac;
    }

    /**
     * 获取硬盘信息
     *
     * @return disk - 硬盘信息
     */
    public String getDisk() {
        return disk;
    }

    /**
     * 设置硬盘信息
     *
     * @param disk 硬盘信息
     */
    public void setDisk(String disk) {
        this.disk = disk;
    }

    /**
     * 获取cpu型号
     *
     * @return cpu - cpu型号
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * 设置cpu型号
     *
     * @param cpu cpu型号
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * 获取数据库类型
     *
     * @return db_type - 数据库类型
     */
    public String getDbType() {
        return dbType;
    }

    /**
     * 设置数据库类型
     *
     * @param dbType 数据库类型
     */
    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    /**
     * 获取数据库ip
     *
     * @return db_ip - 数据库ip
     */
    public String getDbIp() {
        return dbIp;
    }

    /**
     * 设置数据库ip
     *
     * @param dbIp 数据库ip
     */
    public void setDbIp(String dbIp) {
        this.dbIp = dbIp;
    }

    /**
     * 获取数据库端口号
     *
     * @return db_post - 数据库端口号
     */
    public String getDbPost() {
        return dbPost;
    }

    /**
     * 设置数据库端口号
     *
     * @param dbPost 数据库端口号
     */
    public void setDbPost(String dbPost) {
        this.dbPost = dbPost;
    }

    /**
     * 获取数据库名
     *
     * @return db_name - 数据库名
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * 设置数据库名
     *
     * @param dbName 数据库名
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * 获取持行状态 0正常， 1不正常
     *
     * @return running_start - 持行状态 0正常， 1不正常
     */
    public Integer getRunningStart() {
        return runningStart;
    }

    /**
     * 设置持行状态 0正常， 1不正常
     *
     * @param runningStart 持行状态 0正常， 1不正常
     */
    public void setRunningStart(Integer runningStart) {
        this.runningStart = runningStart;
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
     * 获取0 有效 1无效
     *
     * @return version_status - 0 有效 1无效
     */
    public Integer getVersionStatus() {
        return versionStatus;
    }

    /**
     * 设置0 有效 1无效
     *
     * @param versionStatus 0 有效 1无效
     */
    public void setVersionStatus(Integer versionStatus) {
        this.versionStatus = versionStatus;
    }
}