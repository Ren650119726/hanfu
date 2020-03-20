package com.hanfu.product.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class HfProductCoupons implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_product_coupons.id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_product_coupons.hf_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private String hfName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_product_coupons.hf_desc
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private String hfDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_product_coupons.coupons_type
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private String couponsType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_product_coupons.product_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private Integer productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_product_coupons.product_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_product_coupons.goods_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_product_coupons.goods_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private String goodsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_product_coupons.group_number
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private Integer groupNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_product_coupons.purchase_upper_limit
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private Integer purchaseUpperLimit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_product_coupons.repertory_limit
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private Integer repertoryLimit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_product_coupons.coupons_strategy_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private Integer couponsStrategyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_product_coupons.effective_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private LocalDateTime effectiveDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_product_coupons.expire_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private LocalDateTime expireDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_product_coupons.create_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private LocalDateTime createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_product_coupons.modify_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private LocalDateTime modifyDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_product_coupons.id_deleted
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private Byte idDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_product_coupons
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_product_coupons.id
     *
     * @return the value of hf_product_coupons.id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_product_coupons.id
     *
     * @param id the value for hf_product_coupons.id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_product_coupons.hf_name
     *
     * @return the value of hf_product_coupons.hf_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public String getHfName() {
        return hfName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_product_coupons.hf_name
     *
     * @param hfName the value for hf_product_coupons.hf_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setHfName(String hfName) {
        this.hfName = hfName == null ? null : hfName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_product_coupons.hf_desc
     *
     * @return the value of hf_product_coupons.hf_desc
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public String getHfDesc() {
        return hfDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_product_coupons.hf_desc
     *
     * @param hfDesc the value for hf_product_coupons.hf_desc
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setHfDesc(String hfDesc) {
        this.hfDesc = hfDesc == null ? null : hfDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_product_coupons.coupons_type
     *
     * @return the value of hf_product_coupons.coupons_type
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public String getCouponsType() {
        return couponsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_product_coupons.coupons_type
     *
     * @param couponsType the value for hf_product_coupons.coupons_type
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setCouponsType(String couponsType) {
        this.couponsType = couponsType == null ? null : couponsType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_product_coupons.product_id
     *
     * @return the value of hf_product_coupons.product_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_product_coupons.product_id
     *
     * @param productId the value for hf_product_coupons.product_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_product_coupons.product_name
     *
     * @return the value of hf_product_coupons.product_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_product_coupons.product_name
     *
     * @param productName the value for hf_product_coupons.product_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_product_coupons.goods_id
     *
     * @return the value of hf_product_coupons.goods_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_product_coupons.goods_id
     *
     * @param goodsId the value for hf_product_coupons.goods_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_product_coupons.goods_name
     *
     * @return the value of hf_product_coupons.goods_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_product_coupons.goods_name
     *
     * @param goodsName the value for hf_product_coupons.goods_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_product_coupons.group_number
     *
     * @return the value of hf_product_coupons.group_number
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public Integer getGroupNumber() {
        return groupNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_product_coupons.group_number
     *
     * @param groupNumber the value for hf_product_coupons.group_number
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_product_coupons.purchase_upper_limit
     *
     * @return the value of hf_product_coupons.purchase_upper_limit
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public Integer getPurchaseUpperLimit() {
        return purchaseUpperLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_product_coupons.purchase_upper_limit
     *
     * @param purchaseUpperLimit the value for hf_product_coupons.purchase_upper_limit
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setPurchaseUpperLimit(Integer purchaseUpperLimit) {
        this.purchaseUpperLimit = purchaseUpperLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_product_coupons.repertory_limit
     *
     * @return the value of hf_product_coupons.repertory_limit
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public Integer getRepertoryLimit() {
        return repertoryLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_product_coupons.repertory_limit
     *
     * @param repertoryLimit the value for hf_product_coupons.repertory_limit
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setRepertoryLimit(Integer repertoryLimit) {
        this.repertoryLimit = repertoryLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_product_coupons.coupons_strategy_id
     *
     * @return the value of hf_product_coupons.coupons_strategy_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public Integer getCouponsStrategyId() {
        return couponsStrategyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_product_coupons.coupons_strategy_id
     *
     * @param couponsStrategyId the value for hf_product_coupons.coupons_strategy_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setCouponsStrategyId(Integer couponsStrategyId) {
        this.couponsStrategyId = couponsStrategyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_product_coupons.effective_date
     *
     * @return the value of hf_product_coupons.effective_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public LocalDateTime getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_product_coupons.effective_date
     *
     * @param effectiveDate the value for hf_product_coupons.effective_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setEffectiveDate(LocalDateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_product_coupons.expire_date
     *
     * @return the value of hf_product_coupons.expire_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public LocalDateTime getExpireDate() {
        return expireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_product_coupons.expire_date
     *
     * @param expireDate the value for hf_product_coupons.expire_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setExpireDate(LocalDateTime expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_product_coupons.create_date
     *
     * @return the value of hf_product_coupons.create_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_product_coupons.create_date
     *
     * @param createDate the value for hf_product_coupons.create_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_product_coupons.modify_date
     *
     * @return the value of hf_product_coupons.modify_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public LocalDateTime getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_product_coupons.modify_date
     *
     * @param modifyDate the value for hf_product_coupons.modify_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setModifyDate(LocalDateTime modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_product_coupons.id_deleted
     *
     * @return the value of hf_product_coupons.id_deleted
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public Byte getIdDeleted() {
        return idDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_product_coupons.id_deleted
     *
     * @param idDeleted the value for hf_product_coupons.id_deleted
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setIdDeleted(Byte idDeleted) {
        this.idDeleted = idDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_product_coupons
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hfName=").append(hfName);
        sb.append(", hfDesc=").append(hfDesc);
        sb.append(", couponsType=").append(couponsType);
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", groupNumber=").append(groupNumber);
        sb.append(", purchaseUpperLimit=").append(purchaseUpperLimit);
        sb.append(", repertoryLimit=").append(repertoryLimit);
        sb.append(", couponsStrategyId=").append(couponsStrategyId);
        sb.append(", effectiveDate=").append(effectiveDate);
        sb.append(", expireDate=").append(expireDate);
        sb.append(", createDate=").append(createDate);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", idDeleted=").append(idDeleted);
        sb.append("]");
        return sb.toString();
    }
}