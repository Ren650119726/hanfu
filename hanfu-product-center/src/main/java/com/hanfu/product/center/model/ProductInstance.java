package com.hanfu.product.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ProductInstance implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_instance.id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_instance.product_id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    private Integer productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_instance.category_id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_instance.stone_id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    private Integer stoneId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_instance.boss_id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    private Integer bossId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_instance.brand_id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    private Integer brandId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_instance.create_time
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_instance.modify_time
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_instance.last_modifier
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    private String lastModifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_instance.is_deleted
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    private Short isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_instance
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_instance.id
     *
     * @return the value of product_instance.id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_instance.id
     *
     * @param id the value for product_instance.id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_instance.product_id
     *
     * @return the value of product_instance.product_id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_instance.product_id
     *
     * @param productId the value for product_instance.product_id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_instance.category_id
     *
     * @return the value of product_instance.category_id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_instance.category_id
     *
     * @param categoryId the value for product_instance.category_id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_instance.stone_id
     *
     * @return the value of product_instance.stone_id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public Integer getStoneId() {
        return stoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_instance.stone_id
     *
     * @param stoneId the value for product_instance.stone_id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public void setStoneId(Integer stoneId) {
        this.stoneId = stoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_instance.boss_id
     *
     * @return the value of product_instance.boss_id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public Integer getBossId() {
        return bossId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_instance.boss_id
     *
     * @param bossId the value for product_instance.boss_id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public void setBossId(Integer bossId) {
        this.bossId = bossId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_instance.brand_id
     *
     * @return the value of product_instance.brand_id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_instance.brand_id
     *
     * @param brandId the value for product_instance.brand_id
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_instance.create_time
     *
     * @return the value of product_instance.create_time
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_instance.create_time
     *
     * @param createTime the value for product_instance.create_time
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_instance.modify_time
     *
     * @return the value of product_instance.modify_time
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_instance.modify_time
     *
     * @param modifyTime the value for product_instance.modify_time
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_instance.last_modifier
     *
     * @return the value of product_instance.last_modifier
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public String getLastModifier() {
        return lastModifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_instance.last_modifier
     *
     * @param lastModifier the value for product_instance.last_modifier
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier == null ? null : lastModifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_instance.is_deleted
     *
     * @return the value of product_instance.is_deleted
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_instance.is_deleted
     *
     * @param isDeleted the value for product_instance.is_deleted
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_instance
     *
     * @mbg.generated Mon Oct 07 02:29:24 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", stoneId=").append(stoneId);
        sb.append(", bossId=").append(bossId);
        sb.append(", brandId=").append(brandId);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", lastModifier=").append(lastModifier);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}