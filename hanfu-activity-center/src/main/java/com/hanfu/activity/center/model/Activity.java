package com.hanfu.activity.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Activity implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.id
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_name
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private String activityName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_desc
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private String activityDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activiy_type
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private String activiyType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_status
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private String activityStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_result
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private String activityResult;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.strategy_id
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private Integer strategyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.user_id
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.is_timing_start
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private Short isTimingStart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.start_time
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private LocalDateTime startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.end_time
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private LocalDateTime endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.create_time
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.modify_time
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.is_deleted
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private Short isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table activity
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.id
     *
     * @return the value of activity.id
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.id
     *
     * @param id the value for activity.id
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_name
     *
     * @return the value of activity.activity_name
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_name
     *
     * @param activityName the value for activity.activity_name
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_desc
     *
     * @return the value of activity.activity_desc
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public String getActivityDesc() {
        return activityDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_desc
     *
     * @param activityDesc the value for activity.activity_desc
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc == null ? null : activityDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activiy_type
     *
     * @return the value of activity.activiy_type
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public String getActiviyType() {
        return activiyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activiy_type
     *
     * @param activiyType the value for activity.activiy_type
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setActiviyType(String activiyType) {
        this.activiyType = activiyType == null ? null : activiyType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_status
     *
     * @return the value of activity.activity_status
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public String getActivityStatus() {
        return activityStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_status
     *
     * @param activityStatus the value for activity.activity_status
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus == null ? null : activityStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_result
     *
     * @return the value of activity.activity_result
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public String getActivityResult() {
        return activityResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_result
     *
     * @param activityResult the value for activity.activity_result
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setActivityResult(String activityResult) {
        this.activityResult = activityResult == null ? null : activityResult.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.strategy_id
     *
     * @return the value of activity.strategy_id
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public Integer getStrategyId() {
        return strategyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.strategy_id
     *
     * @param strategyId the value for activity.strategy_id
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setStrategyId(Integer strategyId) {
        this.strategyId = strategyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.user_id
     *
     * @return the value of activity.user_id
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.user_id
     *
     * @param userId the value for activity.user_id
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.is_timing_start
     *
     * @return the value of activity.is_timing_start
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public Short getIsTimingStart() {
        return isTimingStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.is_timing_start
     *
     * @param isTimingStart the value for activity.is_timing_start
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setIsTimingStart(Short isTimingStart) {
        this.isTimingStart = isTimingStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.start_time
     *
     * @return the value of activity.start_time
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.start_time
     *
     * @param startTime the value for activity.start_time
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.end_time
     *
     * @return the value of activity.end_time
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.end_time
     *
     * @param endTime the value for activity.end_time
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.create_time
     *
     * @return the value of activity.create_time
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.create_time
     *
     * @param createTime the value for activity.create_time
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.modify_time
     *
     * @return the value of activity.modify_time
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.modify_time
     *
     * @param modifyTime the value for activity.modify_time
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.is_deleted
     *
     * @return the value of activity.is_deleted
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.is_deleted
     *
     * @param isDeleted the value for activity.is_deleted
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", activityName=").append(activityName);
        sb.append(", activityDesc=").append(activityDesc);
        sb.append(", activiyType=").append(activiyType);
        sb.append(", activityStatus=").append(activityStatus);
        sb.append(", activityResult=").append(activityResult);
        sb.append(", strategyId=").append(strategyId);
        sb.append(", userId=").append(userId);
        sb.append(", isTimingStart=").append(isTimingStart);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}