package com.hanfu.product.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class HfOrderGroup implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_order_group.id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_order_group.user_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_order_group.group_number
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private Integer groupNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_order_group.group_number_limit
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private Integer groupNumberLimit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_order_group.product_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private Integer productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_order_group.product_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_order_group.goods_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_order_group.goods_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private String goodsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_order_group.group_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private String groupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_order_group.group_desc
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private String groupDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_order_group.coupons_strategy_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private Integer couponsStrategyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_order_group.coupons_strategy_type
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private String couponsStrategyType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_order_group.coupons_strategy_info
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private String couponsStrategyInfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_order_group.create_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private LocalDateTime createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_order_group.modify_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private LocalDateTime modifyDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_order_group.id_deleted
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private Byte idDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_order_group
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_order_group.id
     *
     * @return the value of hf_order_group.id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_order_group.id
     *
     * @param id the value for hf_order_group.id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_order_group.user_id
     *
     * @return the value of hf_order_group.user_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_order_group.user_id
     *
     * @param userId the value for hf_order_group.user_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_order_group.group_number
     *
     * @return the value of hf_order_group.group_number
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public Integer getGroupNumber() {
        return groupNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_order_group.group_number
     *
     * @param groupNumber the value for hf_order_group.group_number
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_order_group.group_number_limit
     *
     * @return the value of hf_order_group.group_number_limit
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public Integer getGroupNumberLimit() {
        return groupNumberLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_order_group.group_number_limit
     *
     * @param groupNumberLimit the value for hf_order_group.group_number_limit
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setGroupNumberLimit(Integer groupNumberLimit) {
        this.groupNumberLimit = groupNumberLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_order_group.product_id
     *
     * @return the value of hf_order_group.product_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_order_group.product_id
     *
     * @param productId the value for hf_order_group.product_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_order_group.product_name
     *
     * @return the value of hf_order_group.product_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_order_group.product_name
     *
     * @param productName the value for hf_order_group.product_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_order_group.goods_id
     *
     * @return the value of hf_order_group.goods_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_order_group.goods_id
     *
     * @param goodsId the value for hf_order_group.goods_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_order_group.goods_name
     *
     * @return the value of hf_order_group.goods_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_order_group.goods_name
     *
     * @param goodsName the value for hf_order_group.goods_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_order_group.group_name
     *
     * @return the value of hf_order_group.group_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_order_group.group_name
     *
     * @param groupName the value for hf_order_group.group_name
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_order_group.group_desc
     *
     * @return the value of hf_order_group.group_desc
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_order_group.group_desc
     *
     * @param groupDesc the value for hf_order_group.group_desc
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc == null ? null : groupDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_order_group.coupons_strategy_id
     *
     * @return the value of hf_order_group.coupons_strategy_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public Integer getCouponsStrategyId() {
        return couponsStrategyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_order_group.coupons_strategy_id
     *
     * @param couponsStrategyId the value for hf_order_group.coupons_strategy_id
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setCouponsStrategyId(Integer couponsStrategyId) {
        this.couponsStrategyId = couponsStrategyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_order_group.coupons_strategy_type
     *
     * @return the value of hf_order_group.coupons_strategy_type
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public String getCouponsStrategyType() {
        return couponsStrategyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_order_group.coupons_strategy_type
     *
     * @param couponsStrategyType the value for hf_order_group.coupons_strategy_type
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setCouponsStrategyType(String couponsStrategyType) {
        this.couponsStrategyType = couponsStrategyType == null ? null : couponsStrategyType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_order_group.coupons_strategy_info
     *
     * @return the value of hf_order_group.coupons_strategy_info
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public String getCouponsStrategyInfo() {
        return couponsStrategyInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_order_group.coupons_strategy_info
     *
     * @param couponsStrategyInfo the value for hf_order_group.coupons_strategy_info
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setCouponsStrategyInfo(String couponsStrategyInfo) {
        this.couponsStrategyInfo = couponsStrategyInfo == null ? null : couponsStrategyInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_order_group.create_date
     *
     * @return the value of hf_order_group.create_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_order_group.create_date
     *
     * @param createDate the value for hf_order_group.create_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_order_group.modify_date
     *
     * @return the value of hf_order_group.modify_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public LocalDateTime getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_order_group.modify_date
     *
     * @param modifyDate the value for hf_order_group.modify_date
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setModifyDate(LocalDateTime modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_order_group.id_deleted
     *
     * @return the value of hf_order_group.id_deleted
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public Byte getIdDeleted() {
        return idDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_order_group.id_deleted
     *
     * @param idDeleted the value for hf_order_group.id_deleted
     *
     * @mbg.generated Fri Mar 20 11:51:04 CST 2020
     */
    public void setIdDeleted(Byte idDeleted) {
        this.idDeleted = idDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_order_group
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
        sb.append(", userId=").append(userId);
        sb.append(", groupNumber=").append(groupNumber);
        sb.append(", groupNumberLimit=").append(groupNumberLimit);
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", groupName=").append(groupName);
        sb.append(", groupDesc=").append(groupDesc);
        sb.append(", couponsStrategyId=").append(couponsStrategyId);
        sb.append(", couponsStrategyType=").append(couponsStrategyType);
        sb.append(", couponsStrategyInfo=").append(couponsStrategyInfo);
        sb.append(", createDate=").append(createDate);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", idDeleted=").append(idDeleted);
        sb.append("]");
        return sb.toString();
    }
}