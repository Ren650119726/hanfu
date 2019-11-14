package com.hanfu.activity.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ActivityVoteRecords implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_vote_records.id
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_vote_records.activity_id
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    private Integer activityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_vote_records.user_id
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_vote_records.vote_times
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    private Integer voteTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_vote_records.elected_user_id
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    private Integer electedUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_vote_records.remarks
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    private String remarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_vote_records.create_time
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_vote_records.modify_time
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_vote_records.is_deleted
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    private Short isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table activity_vote_records
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_vote_records.id
     *
     * @return the value of activity_vote_records.id
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_vote_records.id
     *
     * @param id the value for activity_vote_records.id
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_vote_records.activity_id
     *
     * @return the value of activity_vote_records.activity_id
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_vote_records.activity_id
     *
     * @param activityId the value for activity_vote_records.activity_id
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_vote_records.user_id
     *
     * @return the value of activity_vote_records.user_id
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_vote_records.user_id
     *
     * @param userId the value for activity_vote_records.user_id
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_vote_records.vote_times
     *
     * @return the value of activity_vote_records.vote_times
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public Integer getVoteTimes() {
        return voteTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_vote_records.vote_times
     *
     * @param voteTimes the value for activity_vote_records.vote_times
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public void setVoteTimes(Integer voteTimes) {
        this.voteTimes = voteTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_vote_records.elected_user_id
     *
     * @return the value of activity_vote_records.elected_user_id
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public Integer getElectedUserId() {
        return electedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_vote_records.elected_user_id
     *
     * @param electedUserId the value for activity_vote_records.elected_user_id
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public void setElectedUserId(Integer electedUserId) {
        this.electedUserId = electedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_vote_records.remarks
     *
     * @return the value of activity_vote_records.remarks
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_vote_records.remarks
     *
     * @param remarks the value for activity_vote_records.remarks
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_vote_records.create_time
     *
     * @return the value of activity_vote_records.create_time
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_vote_records.create_time
     *
     * @param createTime the value for activity_vote_records.create_time
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_vote_records.modify_time
     *
     * @return the value of activity_vote_records.modify_time
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_vote_records.modify_time
     *
     * @param modifyTime the value for activity_vote_records.modify_time
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_vote_records.is_deleted
     *
     * @return the value of activity_vote_records.is_deleted
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_vote_records.is_deleted
     *
     * @param isDeleted the value for activity_vote_records.is_deleted
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_vote_records
     *
     * @mbg.generated Fri Nov 15 06:59:35 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", activityId=").append(activityId);
        sb.append(", userId=").append(userId);
        sb.append(", voteTimes=").append(voteTimes);
        sb.append(", electedUserId=").append(electedUserId);
        sb.append(", remarks=").append(remarks);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}