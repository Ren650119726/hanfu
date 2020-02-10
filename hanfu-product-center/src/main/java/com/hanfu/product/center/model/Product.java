package com.hanfu.product.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Product implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.id
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.hf_name
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    private String hfName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.category_id
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.brand_id
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    private Integer brandId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_desc
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    private String productDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.boss_id
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    private Integer bossId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.file_id
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    private Integer fileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.claim
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    private Short claim;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.create_time
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.last_modifier
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    private String lastModifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.modify_time
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.is_deleted
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    private Short isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.hf_name
     *
     * @return the value of product.hf_name
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public String getHfName() {
        return hfName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.hf_name
     *
     * @param hfName the value for product.hf_name
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public void setHfName(String hfName) {
        this.hfName = hfName == null ? null : hfName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.category_id
     *
     * @return the value of product.category_id
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.category_id
     *
     * @param categoryId the value for product.category_id
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.brand_id
     *
     * @return the value of product.brand_id
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.brand_id
     *
     * @param brandId the value for product.brand_id
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_desc
     *
     * @return the value of product.product_desc
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_desc
     *
     * @param productDesc the value for product.product_desc
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.boss_id
     *
     * @return the value of product.boss_id
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public Integer getBossId() {
        return bossId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.boss_id
     *
     * @param bossId the value for product.boss_id
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public void setBossId(Integer bossId) {
        this.bossId = bossId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.file_id
     *
     * @return the value of product.file_id
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.file_id
     *
     * @param fileId the value for product.file_id
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.claim
     *
     * @return the value of product.claim
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public Short getClaim() {
        return claim;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.claim
     *
     * @param claim the value for product.claim
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public void setClaim(Short claim) {
        this.claim = claim;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.create_time
     *
     * @return the value of product.create_time
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.create_time
     *
     * @param createTime the value for product.create_time
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.last_modifier
     *
     * @return the value of product.last_modifier
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public String getLastModifier() {
        return lastModifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.last_modifier
     *
     * @param lastModifier the value for product.last_modifier
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier == null ? null : lastModifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.modify_time
     *
     * @return the value of product.modify_time
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.modify_time
     *
     * @param modifyTime the value for product.modify_time
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.is_deleted
     *
     * @return the value of product.is_deleted
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.is_deleted
     *
     * @param isDeleted the value for product.is_deleted
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Feb 10 09:00:31 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hfName=").append(hfName);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", brandId=").append(brandId);
        sb.append(", productDesc=").append(productDesc);
        sb.append(", bossId=").append(bossId);
        sb.append(", fileId=").append(fileId);
        sb.append(", claim=").append(claim);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastModifier=").append(lastModifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}