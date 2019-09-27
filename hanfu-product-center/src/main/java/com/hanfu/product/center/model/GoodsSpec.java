package com.hanfu.product.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class GoodsSpec implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods_spec.id
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods_spec.goods_id
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods_spec.hf_spec_id
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    private String hfSpecId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods_spec.hf_value
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    private String hfValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods_spec.create_time
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods_spec.modify_time
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods_spec.last_modifier
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    private String lastModifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods_spec.is_deleted
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    private Short isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods_spec.id
     *
     * @return the value of hf_goods_spec.id
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods_spec.id
     *
     * @param id the value for hf_goods_spec.id
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods_spec.goods_id
     *
     * @return the value of hf_goods_spec.goods_id
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods_spec.goods_id
     *
     * @param goodsId the value for hf_goods_spec.goods_id
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods_spec.hf_spec_id
     *
     * @return the value of hf_goods_spec.hf_spec_id
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    public String getHfSpecId() {
        return hfSpecId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods_spec.hf_spec_id
     *
     * @param hfSpecId the value for hf_goods_spec.hf_spec_id
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    public void setHfSpecId(String hfSpecId) {
        this.hfSpecId = hfSpecId == null ? null : hfSpecId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods_spec.hf_value
     *
     * @return the value of hf_goods_spec.hf_value
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    public String getHfValue() {
        return hfValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods_spec.hf_value
     *
     * @param hfValue the value for hf_goods_spec.hf_value
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    public void setHfValue(String hfValue) {
        this.hfValue = hfValue == null ? null : hfValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods_spec.create_time
     *
     * @return the value of hf_goods_spec.create_time
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods_spec.create_time
     *
     * @param createTime the value for hf_goods_spec.create_time
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods_spec.modify_time
     *
     * @return the value of hf_goods_spec.modify_time
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods_spec.modify_time
     *
     * @param modifyTime the value for hf_goods_spec.modify_time
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods_spec.last_modifier
     *
     * @return the value of hf_goods_spec.last_modifier
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    public String getLastModifier() {
        return lastModifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods_spec.last_modifier
     *
     * @param lastModifier the value for hf_goods_spec.last_modifier
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier == null ? null : lastModifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods_spec.is_deleted
     *
     * @return the value of hf_goods_spec.is_deleted
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods_spec.is_deleted
     *
     * @param isDeleted the value for hf_goods_spec.is_deleted
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods_spec
     *
     * @mbg.generated Fri Sep 27 10:59:20 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", hfSpecId=").append(hfSpecId);
        sb.append(", hfValue=").append(hfValue);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", lastModifier=").append(lastModifier);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}