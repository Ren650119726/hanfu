package com.hanfu.activity.center.request;

import io.swagger.annotations.ApiModelProperty;

@SuppressWarnings("serial")
public class UpdateActivityRuleRequest extends CommonRequest{
    @ApiModelProperty(required = true, value = "活动id")
    private Integer activityId;
    @ApiModelProperty(required = true, value = "活动策略里的规则id")
    private String ruleId;
    @ApiModelProperty(required = false, value = "活动策略里的规则名称")
    private String ruleName;
    @ApiModelProperty(required = false, value = "活动策略里的规则描述")
    private String ruleSDesc;
    @ApiModelProperty(required = true, value = "活动策略里的规则值")
    private String ruleValue;

    public Integer getActivityId() {
        return activityId;
    }
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }
    public String getRuleId() {
        return ruleId;
    }
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }
    public String getRuleName() {
        return ruleName;
    }
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
    public String getRuleSDesc() {
        return ruleSDesc;
    }
    public void setRuleSDesc(String ruleSDesc) {
        this.ruleSDesc = ruleSDesc;
    }
    public String getRuleValue() {
        return ruleValue;
    }
    public void setRuleValue(String ruleValue) {
        this.ruleValue = ruleValue;
    }

}