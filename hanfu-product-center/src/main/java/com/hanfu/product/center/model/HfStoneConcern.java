package com.hanfu.product.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class HfStoneConcern implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_stone_concern.id
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_stone_concern.user_id
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_stone_concern.stone_id
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    private Integer stoneId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_stone_concern.concern_time
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    private LocalDateTime concernTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_stone_concern.create_time
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_stone_concern.modify_time
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_stone_concern.is_deleted
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    private Byte isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_stone_concern
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_stone_concern.id
     *
     * @return the value of hf_stone_concern.id
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_stone_concern.id
     *
     * @param id the value for hf_stone_concern.id
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_stone_concern.user_id
     *
     * @return the value of hf_stone_concern.user_id
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_stone_concern.user_id
     *
     * @param userId the value for hf_stone_concern.user_id
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_stone_concern.stone_id
     *
     * @return the value of hf_stone_concern.stone_id
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    public Integer getStoneId() {
        return stoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_stone_concern.stone_id
     *
     * @param stoneId the value for hf_stone_concern.stone_id
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    public void setStoneId(Integer stoneId) {
        this.stoneId = stoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_stone_concern.concern_time
     *
     * @return the value of hf_stone_concern.concern_time
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    public LocalDateTime getConcernTime() {
        return concernTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_stone_concern.concern_time
     *
     * @param concernTime the value for hf_stone_concern.concern_time
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    public void setConcernTime(LocalDateTime concernTime) {
        this.concernTime = concernTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_stone_concern.create_time
     *
     * @return the value of hf_stone_concern.create_time
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_stone_concern.create_time
     *
     * @param createTime the value for hf_stone_concern.create_time
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_stone_concern.modify_time
     *
     * @return the value of hf_stone_concern.modify_time
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_stone_concern.modify_time
     *
     * @param modifyTime the value for hf_stone_concern.modify_time
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_stone_concern.is_deleted
     *
     * @return the value of hf_stone_concern.is_deleted
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_stone_concern.is_deleted
     *
     * @param isDeleted the value for hf_stone_concern.is_deleted
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_stone_concern
     *
     * @mbg.generated Mon Apr 06 12:20:12 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", stoneId=").append(stoneId);
        sb.append(", concernTime=").append(concernTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}