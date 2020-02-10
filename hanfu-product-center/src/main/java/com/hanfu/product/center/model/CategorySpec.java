package com.hanfu.product.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class CategorySpec implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category_spec.id
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category_spec.category_id
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category_spec.hf_name
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    private String hfName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category_spec.spec_unit
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    private String specUnit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category_spec.spec_value
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    private String specValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category_spec.create_time
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category_spec.modify_time
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category_spec.is_deleted
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    private Short isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table category_spec
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category_spec.id
     *
     * @return the value of category_spec.id
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category_spec.id
     *
     * @param id the value for category_spec.id
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category_spec.category_id
     *
     * @return the value of category_spec.category_id
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category_spec.category_id
     *
     * @param categoryId the value for category_spec.category_id
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category_spec.hf_name
     *
     * @return the value of category_spec.hf_name
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    public String getHfName() {
        return hfName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category_spec.hf_name
     *
     * @param hfName the value for category_spec.hf_name
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    public void setHfName(String hfName) {
        this.hfName = hfName == null ? null : hfName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category_spec.spec_unit
     *
     * @return the value of category_spec.spec_unit
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    public String getSpecUnit() {
        return specUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category_spec.spec_unit
     *
     * @param specUnit the value for category_spec.spec_unit
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    public void setSpecUnit(String specUnit) {
        this.specUnit = specUnit == null ? null : specUnit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category_spec.spec_value
     *
     * @return the value of category_spec.spec_value
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    public String getSpecValue() {
        return specValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category_spec.spec_value
     *
     * @param specValue the value for category_spec.spec_value
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    public void setSpecValue(String specValue) {
        this.specValue = specValue == null ? null : specValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category_spec.create_time
     *
     * @return the value of category_spec.create_time
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category_spec.create_time
     *
     * @param createTime the value for category_spec.create_time
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category_spec.modify_time
     *
     * @return the value of category_spec.modify_time
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category_spec.modify_time
     *
     * @param modifyTime the value for category_spec.modify_time
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category_spec.is_deleted
     *
     * @return the value of category_spec.is_deleted
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category_spec.is_deleted
     *
     * @param isDeleted the value for category_spec.is_deleted
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category_spec
     *
     * @mbg.generated Mon Feb 10 08:12:26 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", hfName=").append(hfName);
        sb.append(", specUnit=").append(specUnit);
        sb.append(", specValue=").append(specValue);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}