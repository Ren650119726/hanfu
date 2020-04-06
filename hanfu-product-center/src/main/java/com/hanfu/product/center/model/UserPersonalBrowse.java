package com.hanfu.product.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class UserPersonalBrowse implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_personal_browse.id
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_personal_browse.user_id
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_personal_browse.product_id
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    private Integer productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_personal_browse.count
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    private Integer count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_personal_browse.browse_time
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    private LocalDateTime browseTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_personal_browse.create_time
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_personal_browse.modifiy_time
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    private LocalDateTime modifiyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_personal_browse.is_deleted
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    private Byte isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_personal_browse
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_personal_browse.id
     *
     * @return the value of user_personal_browse.id
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_personal_browse.id
     *
     * @param id the value for user_personal_browse.id
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_personal_browse.user_id
     *
     * @return the value of user_personal_browse.user_id
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_personal_browse.user_id
     *
     * @param userId the value for user_personal_browse.user_id
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_personal_browse.product_id
     *
     * @return the value of user_personal_browse.product_id
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_personal_browse.product_id
     *
     * @param productId the value for user_personal_browse.product_id
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_personal_browse.count
     *
     * @return the value of user_personal_browse.count
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_personal_browse.count
     *
     * @param count the value for user_personal_browse.count
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_personal_browse.browse_time
     *
     * @return the value of user_personal_browse.browse_time
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    public LocalDateTime getBrowseTime() {
        return browseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_personal_browse.browse_time
     *
     * @param browseTime the value for user_personal_browse.browse_time
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    public void setBrowseTime(LocalDateTime browseTime) {
        this.browseTime = browseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_personal_browse.create_time
     *
     * @return the value of user_personal_browse.create_time
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_personal_browse.create_time
     *
     * @param createTime the value for user_personal_browse.create_time
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_personal_browse.modifiy_time
     *
     * @return the value of user_personal_browse.modifiy_time
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    public LocalDateTime getModifiyTime() {
        return modifiyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_personal_browse.modifiy_time
     *
     * @param modifiyTime the value for user_personal_browse.modifiy_time
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    public void setModifiyTime(LocalDateTime modifiyTime) {
        this.modifiyTime = modifiyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_personal_browse.is_deleted
     *
     * @return the value of user_personal_browse.is_deleted
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_personal_browse.is_deleted
     *
     * @param isDeleted the value for user_personal_browse.is_deleted
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_personal_browse
     *
     * @mbg.generated Mon Apr 06 10:37:21 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", productId=").append(productId);
        sb.append(", count=").append(count);
        sb.append(", browseTime=").append(browseTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiyTime=").append(modifiyTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}