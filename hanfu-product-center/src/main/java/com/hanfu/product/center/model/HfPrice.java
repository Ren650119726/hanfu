package com.hanfu.product.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class HfPrice implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_price.id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_price.googs_id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private Integer googsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_price.price_mode_id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private Integer priceModeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_price.sell_price
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private Integer sellPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_price.is_use_price_mode
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private Short isUsePriceMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_price.hf_desc
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private String hfDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_price.create_time
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_price.modify_time
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_price.last_modifier
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private String lastModifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_price.is_deleted
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private Short isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_price.line_price
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private Integer linePrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_price
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_price.id
     *
     * @return the value of hf_price.id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_price.id
     *
     * @param id the value for hf_price.id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_price.googs_id
     *
     * @return the value of hf_price.googs_id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public Integer getGoogsId() {
        return googsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_price.googs_id
     *
     * @param googsId the value for hf_price.googs_id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setGoogsId(Integer googsId) {
        this.googsId = googsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_price.price_mode_id
     *
     * @return the value of hf_price.price_mode_id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public Integer getPriceModeId() {
        return priceModeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_price.price_mode_id
     *
     * @param priceModeId the value for hf_price.price_mode_id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setPriceModeId(Integer priceModeId) {
        this.priceModeId = priceModeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_price.sell_price
     *
     * @return the value of hf_price.sell_price
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public Integer getSellPrice() {
        return sellPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_price.sell_price
     *
     * @param sellPrice the value for hf_price.sell_price
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_price.is_use_price_mode
     *
     * @return the value of hf_price.is_use_price_mode
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public Short getIsUsePriceMode() {
        return isUsePriceMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_price.is_use_price_mode
     *
     * @param isUsePriceMode the value for hf_price.is_use_price_mode
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setIsUsePriceMode(Short isUsePriceMode) {
        this.isUsePriceMode = isUsePriceMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_price.hf_desc
     *
     * @return the value of hf_price.hf_desc
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public String getHfDesc() {
        return hfDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_price.hf_desc
     *
     * @param hfDesc the value for hf_price.hf_desc
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setHfDesc(String hfDesc) {
        this.hfDesc = hfDesc == null ? null : hfDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_price.create_time
     *
     * @return the value of hf_price.create_time
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_price.create_time
     *
     * @param createTime the value for hf_price.create_time
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_price.modify_time
     *
     * @return the value of hf_price.modify_time
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_price.modify_time
     *
     * @param modifyTime the value for hf_price.modify_time
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_price.last_modifier
     *
     * @return the value of hf_price.last_modifier
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public String getLastModifier() {
        return lastModifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_price.last_modifier
     *
     * @param lastModifier the value for hf_price.last_modifier
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier == null ? null : lastModifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_price.is_deleted
     *
     * @return the value of hf_price.is_deleted
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_price.is_deleted
     *
     * @param isDeleted the value for hf_price.is_deleted
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_price.line_price
     *
     * @return the value of hf_price.line_price
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public Integer getLinePrice() {
        return linePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_price.line_price
     *
     * @param linePrice the value for hf_price.line_price
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setLinePrice(Integer linePrice) {
        this.linePrice = linePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_price
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", googsId=").append(googsId);
        sb.append(", priceModeId=").append(priceModeId);
        sb.append(", sellPrice=").append(sellPrice);
        sb.append(", isUsePriceMode=").append(isUsePriceMode);
        sb.append(", hfDesc=").append(hfDesc);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", lastModifier=").append(lastModifier);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", linePrice=").append(linePrice);
        sb.append("]");
        return sb.toString();
    }
}