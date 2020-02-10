package com.hanfu.payment.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class HfUserBalance implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_balance.id
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_balance.user_id
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_balance.balance_type
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    private String balanceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_balance.hf_balance
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    private Integer hfBalance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_balance.pay_method_type
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    private String payMethodType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_balance.hf_remark
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    private String hfRemark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_balance.create_time
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_balance.modify_time
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_balance.last_modifier
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    private String lastModifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_balance.is_deleted
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    private Short isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_user_balance
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_balance.id
     *
     * @return the value of hf_user_balance.id
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_balance.id
     *
     * @param id the value for hf_user_balance.id
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_balance.user_id
     *
     * @return the value of hf_user_balance.user_id
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_balance.user_id
     *
     * @param userId the value for hf_user_balance.user_id
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_balance.balance_type
     *
     * @return the value of hf_user_balance.balance_type
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public String getBalanceType() {
        return balanceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_balance.balance_type
     *
     * @param balanceType the value for hf_user_balance.balance_type
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType == null ? null : balanceType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_balance.hf_balance
     *
     * @return the value of hf_user_balance.hf_balance
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public Integer getHfBalance() {
        return hfBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_balance.hf_balance
     *
     * @param hfBalance the value for hf_user_balance.hf_balance
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public void setHfBalance(Integer hfBalance) {
        this.hfBalance = hfBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_balance.pay_method_type
     *
     * @return the value of hf_user_balance.pay_method_type
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public String getPayMethodType() {
        return payMethodType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_balance.pay_method_type
     *
     * @param payMethodType the value for hf_user_balance.pay_method_type
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public void setPayMethodType(String payMethodType) {
        this.payMethodType = payMethodType == null ? null : payMethodType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_balance.hf_remark
     *
     * @return the value of hf_user_balance.hf_remark
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public String getHfRemark() {
        return hfRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_balance.hf_remark
     *
     * @param hfRemark the value for hf_user_balance.hf_remark
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public void setHfRemark(String hfRemark) {
        this.hfRemark = hfRemark == null ? null : hfRemark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_balance.create_time
     *
     * @return the value of hf_user_balance.create_time
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_balance.create_time
     *
     * @param createTime the value for hf_user_balance.create_time
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_balance.modify_time
     *
     * @return the value of hf_user_balance.modify_time
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_balance.modify_time
     *
     * @param modifyTime the value for hf_user_balance.modify_time
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_balance.last_modifier
     *
     * @return the value of hf_user_balance.last_modifier
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public String getLastModifier() {
        return lastModifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_balance.last_modifier
     *
     * @param lastModifier the value for hf_user_balance.last_modifier
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier == null ? null : lastModifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_balance.is_deleted
     *
     * @return the value of hf_user_balance.is_deleted
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_balance.is_deleted
     *
     * @param isDeleted the value for hf_user_balance.is_deleted
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_balance
     *
     * @mbg.generated Mon Feb 10 08:15:19 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", balanceType=").append(balanceType);
        sb.append(", hfBalance=").append(hfBalance);
        sb.append(", payMethodType=").append(payMethodType);
        sb.append(", hfRemark=").append(hfRemark);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", lastModifier=").append(lastModifier);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}