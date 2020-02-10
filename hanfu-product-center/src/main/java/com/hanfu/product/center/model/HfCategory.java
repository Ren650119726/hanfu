package com.hanfu.product.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class HfCategory implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_category.id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_category.hf_name
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private String hfName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_category.parent_category_id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private Integer parentCategoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_category.level_id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private Integer levelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_category.create_time
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_category.modify_time
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_category.is_deleted
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private Short isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_category.file_id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private Integer fileId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_category
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_category.id
     *
     * @return the value of hf_category.id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_category.id
     *
     * @param id the value for hf_category.id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_category.hf_name
     *
     * @return the value of hf_category.hf_name
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public String getHfName() {
        return hfName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_category.hf_name
     *
     * @param hfName the value for hf_category.hf_name
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setHfName(String hfName) {
        this.hfName = hfName == null ? null : hfName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_category.parent_category_id
     *
     * @return the value of hf_category.parent_category_id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public Integer getParentCategoryId() {
        return parentCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_category.parent_category_id
     *
     * @param parentCategoryId the value for hf_category.parent_category_id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setParentCategoryId(Integer parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_category.level_id
     *
     * @return the value of hf_category.level_id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public Integer getLevelId() {
        return levelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_category.level_id
     *
     * @param levelId the value for hf_category.level_id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_category.create_time
     *
     * @return the value of hf_category.create_time
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_category.create_time
     *
     * @param createTime the value for hf_category.create_time
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_category.modify_time
     *
     * @return the value of hf_category.modify_time
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_category.modify_time
     *
     * @param modifyTime the value for hf_category.modify_time
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_category.is_deleted
     *
     * @return the value of hf_category.is_deleted
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_category.is_deleted
     *
     * @param isDeleted the value for hf_category.is_deleted
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_category.file_id
     *
     * @return the value of hf_category.file_id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_category.file_id
     *
     * @param fileId the value for hf_category.file_id
     *
     * @mbg.generated Mon Feb 10 20:57:48 CST 2020
     */
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_category
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
        sb.append(", hfName=").append(hfName);
        sb.append(", parentCategoryId=").append(parentCategoryId);
        sb.append(", levelId=").append(levelId);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", fileId=").append(fileId);
        sb.append("]");
        return sb.toString();
    }
}