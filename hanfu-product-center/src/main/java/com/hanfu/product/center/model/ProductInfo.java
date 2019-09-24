package com.hanfu.product.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ProductInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.id
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.product_id
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    private Integer productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.hf_name
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    private String hfName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.hf_value
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    private String hfValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.value_unit
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    private String valueUnit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.create_time
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.modify_time
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.last_modifier
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    private String lastModifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.hf_remark
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    private String hfRemark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_info.is_deleted
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    private Short isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_info
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_info.id
     *
     * @return the value of product_info.id
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_info.id
     *
     * @param id the value for product_info.id
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_info.product_id
     *
     * @return the value of product_info.product_id
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_info.product_id
     *
     * @param productId the value for product_info.product_id
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_info.hf_name
     *
     * @return the value of product_info.hf_name
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public String getHfName() {
        return hfName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_info.hf_name
     *
     * @param hfName the value for product_info.hf_name
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public void setHfName(String hfName) {
        this.hfName = hfName == null ? null : hfName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_info.hf_value
     *
     * @return the value of product_info.hf_value
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public String getHfValue() {
        return hfValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_info.hf_value
     *
     * @param hfValue the value for product_info.hf_value
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public void setHfValue(String hfValue) {
        this.hfValue = hfValue == null ? null : hfValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_info.value_unit
     *
     * @return the value of product_info.value_unit
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public String getValueUnit() {
        return valueUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_info.value_unit
     *
     * @param valueUnit the value for product_info.value_unit
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public void setValueUnit(String valueUnit) {
        this.valueUnit = valueUnit == null ? null : valueUnit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_info.create_time
     *
     * @return the value of product_info.create_time
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_info.create_time
     *
     * @param createTime the value for product_info.create_time
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_info.modify_time
     *
     * @return the value of product_info.modify_time
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_info.modify_time
     *
     * @param modifyTime the value for product_info.modify_time
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_info.last_modifier
     *
     * @return the value of product_info.last_modifier
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public String getLastModifier() {
        return lastModifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_info.last_modifier
     *
     * @param lastModifier the value for product_info.last_modifier
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier == null ? null : lastModifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_info.hf_remark
     *
     * @return the value of product_info.hf_remark
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public String getHfRemark() {
        return hfRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_info.hf_remark
     *
     * @param hfRemark the value for product_info.hf_remark
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public void setHfRemark(String hfRemark) {
        this.hfRemark = hfRemark == null ? null : hfRemark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_info.is_deleted
     *
     * @return the value of product_info.is_deleted
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_info.is_deleted
     *
     * @param isDeleted the value for product_info.is_deleted
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Tue Sep 24 21:59:55 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", hfName=").append(hfName);
        sb.append(", hfValue=").append(hfValue);
        sb.append(", valueUnit=").append(valueUnit);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", lastModifier=").append(lastModifier);
        sb.append(", hfRemark=").append(hfRemark);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}