package com.hanfu.order.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class HfBoss implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_boss.id
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_boss.name
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_boss.amount
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    private Integer amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_boss.create_time
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_boss.modify_time
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_boss.expire_time
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    private LocalDateTime expireTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_boss.is_deleted
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    private Short isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_boss
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_boss.id
     *
     * @return the value of hf_boss.id
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_boss.id
     *
     * @param id the value for hf_boss.id
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_boss.name
     *
     * @return the value of hf_boss.name
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_boss.name
     *
     * @param name the value for hf_boss.name
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_boss.amount
     *
     * @return the value of hf_boss.amount
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_boss.amount
     *
     * @param amount the value for hf_boss.amount
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_boss.create_time
     *
     * @return the value of hf_boss.create_time
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_boss.create_time
     *
     * @param createTime the value for hf_boss.create_time
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_boss.modify_time
     *
     * @return the value of hf_boss.modify_time
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_boss.modify_time
     *
     * @param modifyTime the value for hf_boss.modify_time
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_boss.expire_time
     *
     * @return the value of hf_boss.expire_time
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    public LocalDateTime getExpireTime() {
        return expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_boss.expire_time
     *
     * @param expireTime the value for hf_boss.expire_time
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    public void setExpireTime(LocalDateTime expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_boss.is_deleted
     *
     * @return the value of hf_boss.is_deleted
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_boss.is_deleted
     *
     * @param isDeleted the value for hf_boss.is_deleted
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_boss
     *
     * @mbg.generated Mon Feb 10 21:14:04 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", amount=").append(amount);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", expireTime=").append(expireTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}