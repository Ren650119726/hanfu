package com.hanfu.activity.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ActivityUserEvaluate implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_user_evaluate.id
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_user_evaluate.user_id
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_user_evaluate.evaluate_template_id
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    private Integer evaluateTemplateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_user_evaluate.evaluate_content
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    private String evaluateContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_user_evaluate.evaluate_result
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    private String evaluateResult;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_user_evaluate.remarks
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    private String remarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_user_evaluate.create_time
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_user_evaluate.modify_time
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_user_evaluate.is_deleted
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    private Short isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table activity_user_evaluate
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_user_evaluate.id
     *
     * @return the value of activity_user_evaluate.id
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_user_evaluate.id
     *
     * @param id the value for activity_user_evaluate.id
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_user_evaluate.user_id
     *
     * @return the value of activity_user_evaluate.user_id
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_user_evaluate.user_id
     *
     * @param userId the value for activity_user_evaluate.user_id
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_user_evaluate.evaluate_template_id
     *
     * @return the value of activity_user_evaluate.evaluate_template_id
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public Integer getEvaluateTemplateId() {
        return evaluateTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_user_evaluate.evaluate_template_id
     *
     * @param evaluateTemplateId the value for activity_user_evaluate.evaluate_template_id
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public void setEvaluateTemplateId(Integer evaluateTemplateId) {
        this.evaluateTemplateId = evaluateTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_user_evaluate.evaluate_content
     *
     * @return the value of activity_user_evaluate.evaluate_content
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public String getEvaluateContent() {
        return evaluateContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_user_evaluate.evaluate_content
     *
     * @param evaluateContent the value for activity_user_evaluate.evaluate_content
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public void setEvaluateContent(String evaluateContent) {
        this.evaluateContent = evaluateContent == null ? null : evaluateContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_user_evaluate.evaluate_result
     *
     * @return the value of activity_user_evaluate.evaluate_result
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public String getEvaluateResult() {
        return evaluateResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_user_evaluate.evaluate_result
     *
     * @param evaluateResult the value for activity_user_evaluate.evaluate_result
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public void setEvaluateResult(String evaluateResult) {
        this.evaluateResult = evaluateResult == null ? null : evaluateResult.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_user_evaluate.remarks
     *
     * @return the value of activity_user_evaluate.remarks
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_user_evaluate.remarks
     *
     * @param remarks the value for activity_user_evaluate.remarks
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_user_evaluate.create_time
     *
     * @return the value of activity_user_evaluate.create_time
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_user_evaluate.create_time
     *
     * @param createTime the value for activity_user_evaluate.create_time
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_user_evaluate.modify_time
     *
     * @return the value of activity_user_evaluate.modify_time
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_user_evaluate.modify_time
     *
     * @param modifyTime the value for activity_user_evaluate.modify_time
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_user_evaluate.is_deleted
     *
     * @return the value of activity_user_evaluate.is_deleted
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_user_evaluate.is_deleted
     *
     * @param isDeleted the value for activity_user_evaluate.is_deleted
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_user_evaluate
     *
     * @mbg.generated Tue Dec 31 15:51:59 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", evaluateTemplateId=").append(evaluateTemplateId);
        sb.append(", evaluateContent=").append(evaluateContent);
        sb.append(", evaluateResult=").append(evaluateResult);
        sb.append(", remarks=").append(remarks);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}