package com.hanfu.product.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class SeniorityInstance implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seniority_instance.id
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seniority_instance.seniority_id
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    private Integer seniorityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seniority_instance.goods_id
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seniority_instance.create_time
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seniority_instance.modifiey_time
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    private LocalDateTime modifieyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seniority_instance.is_deleted
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    private Short isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table seniority_instance
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seniority_instance.id
     *
     * @return the value of seniority_instance.id
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seniority_instance.id
     *
     * @param id the value for seniority_instance.id
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seniority_instance.seniority_id
     *
     * @return the value of seniority_instance.seniority_id
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public Integer getSeniorityId() {
        return seniorityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seniority_instance.seniority_id
     *
     * @param seniorityId the value for seniority_instance.seniority_id
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public void setSeniorityId(Integer seniorityId) {
        this.seniorityId = seniorityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seniority_instance.goods_id
     *
     * @return the value of seniority_instance.goods_id
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seniority_instance.goods_id
     *
     * @param goodsId the value for seniority_instance.goods_id
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seniority_instance.create_time
     *
     * @return the value of seniority_instance.create_time
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seniority_instance.create_time
     *
     * @param createTime the value for seniority_instance.create_time
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seniority_instance.modifiey_time
     *
     * @return the value of seniority_instance.modifiey_time
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public LocalDateTime getModifieyTime() {
        return modifieyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seniority_instance.modifiey_time
     *
     * @param modifieyTime the value for seniority_instance.modifiey_time
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public void setModifieyTime(LocalDateTime modifieyTime) {
        this.modifieyTime = modifieyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seniority_instance.is_deleted
     *
     * @return the value of seniority_instance.is_deleted
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seniority_instance.is_deleted
     *
     * @param isDeleted the value for seniority_instance.is_deleted
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seniority_instance
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", seniorityId=").append(seniorityId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifieyTime=").append(modifieyTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}