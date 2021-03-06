package com.hanfu.product.center.manual.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StoneConcernInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5597559531759476351L;
	
	private String name;
	private Integer stoneId;
	private String stoneDesc;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime createTime;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStoneId() {
		return stoneId;
	}
	public void setStoneId(Integer stoneId) {
		this.stoneId = stoneId;
	}
	public String getStoneDesc() {
		return stoneDesc;
	}
	public void setStoneDesc(String stoneDesc) {
		this.stoneDesc = stoneDesc;
	}
	public LocalDateTime getCreateTime() {
		return createTime;
	}
	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}
}
