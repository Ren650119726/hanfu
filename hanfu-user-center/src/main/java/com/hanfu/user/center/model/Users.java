package com.hanfu.user.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Users implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.id
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.createDate
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    private LocalDateTime createdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.modifyDate
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    private LocalDateTime modifydate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.isEnabled
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    private Boolean isenabled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.isLocked
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    private Boolean islocked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.lastLoginDate
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    private LocalDateTime lastlogindate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.lastLoginIp
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    private String lastloginip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.lockDate
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    private LocalDateTime lockdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.id
     *
     * @return the value of users.id
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.id
     *
     * @param id the value for users.id
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.createDate
     *
     * @return the value of users.createDate
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    public LocalDateTime getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.createDate
     *
     * @param createdate the value for users.createDate
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    public void setCreatedate(LocalDateTime createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.modifyDate
     *
     * @return the value of users.modifyDate
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    public LocalDateTime getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.modifyDate
     *
     * @param modifydate the value for users.modifyDate
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    public void setModifydate(LocalDateTime modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.isEnabled
     *
     * @return the value of users.isEnabled
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    public Boolean getIsenabled() {
        return isenabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.isEnabled
     *
     * @param isenabled the value for users.isEnabled
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    public void setIsenabled(Boolean isenabled) {
        this.isenabled = isenabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.isLocked
     *
     * @return the value of users.isLocked
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    public Boolean getIslocked() {
        return islocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.isLocked
     *
     * @param islocked the value for users.isLocked
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    public void setIslocked(Boolean islocked) {
        this.islocked = islocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.lastLoginDate
     *
     * @return the value of users.lastLoginDate
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    public LocalDateTime getLastlogindate() {
        return lastlogindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.lastLoginDate
     *
     * @param lastlogindate the value for users.lastLoginDate
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    public void setLastlogindate(LocalDateTime lastlogindate) {
        this.lastlogindate = lastlogindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.lastLoginIp
     *
     * @return the value of users.lastLoginIp
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    public String getLastloginip() {
        return lastloginip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.lastLoginIp
     *
     * @param lastloginip the value for users.lastLoginIp
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.lockDate
     *
     * @return the value of users.lockDate
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    public LocalDateTime getLockdate() {
        return lockdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.lockDate
     *
     * @param lockdate the value for users.lockDate
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    public void setLockdate(LocalDateTime lockdate) {
        this.lockdate = lockdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Sep 23 14:30:21 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createdate=").append(createdate);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", isenabled=").append(isenabled);
        sb.append(", islocked=").append(islocked);
        sb.append(", lastlogindate=").append(lastlogindate);
        sb.append(", lastloginip=").append(lastloginip);
        sb.append(", lockdate=").append(lockdate);
        sb.append("]");
        return sb.toString();
    }
}