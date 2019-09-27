package com.hanfu.product.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class HfGoods implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods.id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods.instance_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    private Integer instanceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods.product_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    private Integer productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods.category_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods.stone_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    private Integer stoneId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods.boss_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    private Integer bossId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods.brand_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    private Integer brandId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods.resp_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    private Integer respId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods.price_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    private Integer priceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods.goods_desc
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    private String goodsDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods.create_time
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods.modify_time
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_goods.is_deleted
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    private Short isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_goods
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods.id
     *
     * @return the value of hf_goods.id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods.id
     *
     * @param id the value for hf_goods.id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods.instance_id
     *
     * @return the value of hf_goods.instance_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public Integer getInstanceId() {
        return instanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods.instance_id
     *
     * @param instanceId the value for hf_goods.instance_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public void setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods.product_id
     *
     * @return the value of hf_goods.product_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods.product_id
     *
     * @param productId the value for hf_goods.product_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods.category_id
     *
     * @return the value of hf_goods.category_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods.category_id
     *
     * @param categoryId the value for hf_goods.category_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods.stone_id
     *
     * @return the value of hf_goods.stone_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public Integer getStoneId() {
        return stoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods.stone_id
     *
     * @param stoneId the value for hf_goods.stone_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public void setStoneId(Integer stoneId) {
        this.stoneId = stoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods.boss_id
     *
     * @return the value of hf_goods.boss_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public Integer getBossId() {
        return bossId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods.boss_id
     *
     * @param bossId the value for hf_goods.boss_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public void setBossId(Integer bossId) {
        this.bossId = bossId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods.brand_id
     *
     * @return the value of hf_goods.brand_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods.brand_id
     *
     * @param brandId the value for hf_goods.brand_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods.resp_id
     *
     * @return the value of hf_goods.resp_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public Integer getRespId() {
        return respId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods.resp_id
     *
     * @param respId the value for hf_goods.resp_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public void setRespId(Integer respId) {
        this.respId = respId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods.price_id
     *
     * @return the value of hf_goods.price_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public Integer getPriceId() {
        return priceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods.price_id
     *
     * @param priceId the value for hf_goods.price_id
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods.goods_desc
     *
     * @return the value of hf_goods.goods_desc
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public String getGoodsDesc() {
        return goodsDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods.goods_desc
     *
     * @param goodsDesc the value for hf_goods.goods_desc
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc == null ? null : goodsDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods.create_time
     *
     * @return the value of hf_goods.create_time
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods.create_time
     *
     * @param createTime the value for hf_goods.create_time
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods.modify_time
     *
     * @return the value of hf_goods.modify_time
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods.modify_time
     *
     * @param modifyTime the value for hf_goods.modify_time
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_goods.is_deleted
     *
     * @return the value of hf_goods.is_deleted
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_goods.is_deleted
     *
     * @param isDeleted the value for hf_goods.is_deleted
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_goods
     *
     * @mbg.generated Fri Sep 27 13:16:18 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", instanceId=").append(instanceId);
        sb.append(", productId=").append(productId);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", stoneId=").append(stoneId);
        sb.append(", bossId=").append(bossId);
        sb.append(", brandId=").append(brandId);
        sb.append(", respId=").append(respId);
        sb.append(", priceId=").append(priceId);
        sb.append(", goodsDesc=").append(goodsDesc);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}