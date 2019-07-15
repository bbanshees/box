package com.soap.box.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "admin_log")
public class Admin_log implements Serializable {
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 操作人id
     */
    @Column(name = "admin_id")
    private Integer adminId;

    /**
     * 请求地址
     */
    @Column(name = "request_url")
    private String requestUrl;

    /**
     * 请求类名
     */
    @Column(name = "request_class")
    private String requestClass;

    /**
     * 请求方法名
     */
    @Column(name = "request_function")
    private String requestFunction;

    /**
     * 请求ip
     */
    @Column(name = "request_ip")
    private String requestIp;

    /**
     * 请求耗时
     */
    @Column(name = "consume_time")
    private Integer consumeTime;

    /**
     * 请求状态(0：失败  1：成功)
     */
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Integer createTime;

    /**
     * 版本号
     */
    private Integer version;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取操作人id
     *
     * @return admin_id - 操作人id
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * 设置操作人id
     *
     * @param adminId 操作人id
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * 获取请求地址
     *
     * @return request_url - 请求地址
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * 设置请求地址
     *
     * @param requestUrl 请求地址
     */
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl == null ? null : requestUrl.trim();
    }

    /**
     * 获取请求类名
     *
     * @return request_class - 请求类名
     */
    public String getRequestClass() {
        return requestClass;
    }

    /**
     * 设置请求类名
     *
     * @param requestClass 请求类名
     */
    public void setRequestClass(String requestClass) {
        this.requestClass = requestClass == null ? null : requestClass.trim();
    }

    /**
     * 获取请求方法名
     *
     * @return request_function - 请求方法名
     */
    public String getRequestFunction() {
        return requestFunction;
    }

    /**
     * 设置请求方法名
     *
     * @param requestFunction 请求方法名
     */
    public void setRequestFunction(String requestFunction) {
        this.requestFunction = requestFunction == null ? null : requestFunction.trim();
    }

    /**
     * 获取请求ip
     *
     * @return request_ip - 请求ip
     */
    public String getRequestIp() {
        return requestIp;
    }

    /**
     * 设置请求ip
     *
     * @param requestIp 请求ip
     */
    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp == null ? null : requestIp.trim();
    }

    /**
     * 获取请求耗时
     *
     * @return consume_time - 请求耗时
     */
    public Integer getConsumeTime() {
        return consumeTime;
    }

    /**
     * 设置请求耗时
     *
     * @param consumeTime 请求耗时
     */
    public void setConsumeTime(Integer consumeTime) {
        this.consumeTime = consumeTime;
    }

    /**
     * 获取请求状态(0：失败  1：成功)
     *
     * @return status - 请求状态(0：失败  1：成功)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置请求状态(0：失败  1：成功)
     *
     * @param status 请求状态(0：失败  1：成功)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Admin_log other = (Admin_log) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAdminId() == null ? other.getAdminId() == null : this.getAdminId().equals(other.getAdminId()))
            && (this.getRequestUrl() == null ? other.getRequestUrl() == null : this.getRequestUrl().equals(other.getRequestUrl()))
            && (this.getRequestClass() == null ? other.getRequestClass() == null : this.getRequestClass().equals(other.getRequestClass()))
            && (this.getRequestFunction() == null ? other.getRequestFunction() == null : this.getRequestFunction().equals(other.getRequestFunction()))
            && (this.getRequestIp() == null ? other.getRequestIp() == null : this.getRequestIp().equals(other.getRequestIp()))
            && (this.getConsumeTime() == null ? other.getConsumeTime() == null : this.getConsumeTime().equals(other.getConsumeTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAdminId() == null) ? 0 : getAdminId().hashCode());
        result = prime * result + ((getRequestUrl() == null) ? 0 : getRequestUrl().hashCode());
        result = prime * result + ((getRequestClass() == null) ? 0 : getRequestClass().hashCode());
        result = prime * result + ((getRequestFunction() == null) ? 0 : getRequestFunction().hashCode());
        result = prime * result + ((getRequestIp() == null) ? 0 : getRequestIp().hashCode());
        result = prime * result + ((getConsumeTime() == null) ? 0 : getConsumeTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adminId=").append(adminId);
        sb.append(", requestUrl=").append(requestUrl);
        sb.append(", requestClass=").append(requestClass);
        sb.append(", requestFunction=").append(requestFunction);
        sb.append(", requestIp=").append(requestIp);
        sb.append(", consumeTime=").append(consumeTime);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}