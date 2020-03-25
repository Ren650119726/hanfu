package com.hanfu.user.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class HfUserMember implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_member.id
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_member.start_tme
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    private LocalDateTime startTme;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_member.end_time
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    private LocalDateTime endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_member.use_state
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    private Integer useState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_member.user_id
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_member.level_id
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    private Integer levelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_member.create_time
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_member.modify_time
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_member.is_deleted
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    private Byte isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_user_member
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_member.id
     *
     * @return the value of hf_user_member.id
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_member.id
     *
     * @param id the value for hf_user_member.id
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_member.start_tme
     *
     * @return the value of hf_user_member.start_tme
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public LocalDateTime getStartTme() {
        return startTme;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_member.start_tme
     *
     * @param startTme the value for hf_user_member.start_tme
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public void setStartTme(LocalDateTime startTme) {
        this.startTme = startTme;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_member.end_time
     *
     * @return the value of hf_user_member.end_time
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_member.end_time
     *
     * @param endTime the value for hf_user_member.end_time
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_member.use_state
     *
     * @return the value of hf_user_member.use_state
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public Integer getUseState() {
        return useState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_member.use_state
     *
     * @param useState the value for hf_user_member.use_state
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public void setUseState(Integer useState) {
        this.useState = useState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_member.user_id
     *
     * @return the value of hf_user_member.user_id
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_member.user_id
     *
     * @param userId the value for hf_user_member.user_id
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_member.level_id
     *
     * @return the value of hf_user_member.level_id
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public Integer getLevelId() {
        return levelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_member.level_id
     *
     * @param levelId the value for hf_user_member.level_id
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_member.create_time
     *
     * @return the value of hf_user_member.create_time
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_member.create_time
     *
     * @param createTime the value for hf_user_member.create_time
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_member.modify_time
     *
     * @return the value of hf_user_member.modify_time
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_member.modify_time
     *
     * @param modifyTime the value for hf_user_member.modify_time
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_member.is_deleted
     *
     * @return the value of hf_user_member.is_deleted
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_member.is_deleted
     *
     * @param isDeleted the value for hf_user_member.is_deleted
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_member
     *
     * @mbg.generated Wed Mar 25 13:39:43 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", startTme=").append(startTme);
        sb.append(", endTime=").append(endTime);
        sb.append(", useState=").append(useState);
        sb.append(", userId=").append(userId);
        sb.append(", levelId=").append(levelId);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}