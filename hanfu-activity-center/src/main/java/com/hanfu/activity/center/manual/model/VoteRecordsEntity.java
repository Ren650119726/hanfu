package com.hanfu.activity.center.manual.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class VoteRecordsEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4746650606978736939L;
	
	private Integer activityId;
	private Integer userId;
	private String voteName;
	private String eceltedName;
	private String voteTimes;
	public Integer getActivityId() {
		return activityId;
	}
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getVoteName() {
		return voteName;
	}
	public void setVoteName(String voteName) {
		this.voteName = voteName;
	}
	public String getEceltedName() {
		return eceltedName;
	}
	public void setEceltedName(String eceltedName) {
		this.eceltedName = eceltedName;
	}
	public String getVoteTimes() {
		return voteTimes;
	}
	public void setVoteTimes(String voteTimes) {
		this.voteTimes = voteTimes;
	}
}
