package com.hanfu.activity.center.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.hanfu.activity.center.dao.ActivitiRuleInstanceMapper;
import com.hanfu.activity.center.dao.ActivitiStrategyMapper;
import com.hanfu.activity.center.dao.ActivityMapper;
import com.hanfu.activity.center.dao.ActivityStrategyInstanceMapper;
import com.hanfu.activity.center.dao.ActivityVoteRecordsMapper;
import com.hanfu.activity.center.dao.HfUserMapper;
import com.hanfu.activity.center.dao.StrategyRuleMapper;
import com.hanfu.activity.center.dao.StrategyRuleRelateMapper;
import com.hanfu.activity.center.manual.model.ActivityInfo;
import com.hanfu.activity.center.model.ActivitiRuleInstance;
import com.hanfu.activity.center.model.ActivitiRuleInstanceExample;
import com.hanfu.activity.center.model.ActivitiStrategy;
import com.hanfu.activity.center.model.ActivitiStrategyExample;
import com.hanfu.activity.center.model.Activity;
import com.hanfu.activity.center.model.ActivityStrategyInstance;
import com.hanfu.activity.center.model.ActivityStrategyInstanceExample;
import com.hanfu.activity.center.model.ActivityVoteRecords;
import com.hanfu.activity.center.model.ActivityVoteRecordsExample;
import com.hanfu.activity.center.model.HfUser;
import com.hanfu.activity.center.model.StrategyRule;
import com.hanfu.activity.center.model.StrategyRuleExample;
import com.hanfu.activity.center.model.StrategyRuleRelate;
import com.hanfu.activity.center.model.StrategyRuleRelateExample;
import com.hanfu.activity.center.model.Total;
import com.hanfu.activity.center.request.ActivityRequest;
import com.hanfu.activity.center.request.ActivityStrategyInstanceRequest;
import com.hanfu.activity.center.request.ActivityStrategyRequest;
import com.hanfu.activity.center.request.RuleValueDescRequest;
import com.hanfu.activity.center.request.StrategyRuleRequest;
import com.hanfu.utils.response.handler.ResponseEntity;
import com.hanfu.utils.response.handler.ResponseUtils;
import com.hanfu.utils.response.handler.ResponseEntity.BodyBuilder;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/activity")
@Api
public class ActivityController {

	@Autowired
	private ActivityMapper activityMapper;
	
	@Autowired
	private ActivitiStrategyMapper activitiStrategyMapper;
	
	@Autowired
	private ActivityStrategyInstanceMapper activityStrategyInstanceMapper;
	
	@Autowired
	private ActivitiRuleInstanceMapper activitiRuleInstanceMapper;
	
	@Autowired
	private StrategyRuleRelateMapper strategyRuleRelateMapper;
	
	@Autowired
	private HfUserMapper hfUserMapper;
	
	@Autowired
	private ActivityVoteRecordsMapper activityVoteRecordsMapper;
	
	@Autowired
	private StrategyRuleMapper strategyRuleMapper;
	
	@ApiOperation(value = "查询参加该活动人员", notes = "查询参加该活动人员")
	@RequestMapping(value = "/listActivityUser", method = RequestMethod.GET)
	public ResponseEntity<JSONObject> listActivityUser(@RequestParam Integer activityId) throws JSONException {
		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
		ActivitiRuleInstanceExample example = new ActivitiRuleInstanceExample();
		example.createCriteria().andActivityIdEqualTo(activityId).andIsElectedEqualTo(true);
		List<ActivitiRuleInstance> list = activitiRuleInstanceMapper.selectByExample(example);
		List<Total> result = new ArrayList<Total>();
		if (!list.isEmpty()) {
			Integer index = 1;
			for (int j = 0; j < list.size(); j++) {
				Total total = new Total();
				if (list.get(j).getUserScore() == null) {
					total.setSocre(0);
				} else {
					total.setSocre(list.get(j).getUserScore());
				}
				if (list.get(j).getUserTicketCount() == null) {
					total.setVoteCount(0);
				} else {
					total.setVoteCount(list.get(j).getUserTicketCount());
				}
				HfUser hfUser = hfUserMapper.selectByPrimaryKey(list.get(j).getUserId());
				total.setFileId(hfUser.getFileId());
				total.setUsername(hfUser.getUsername());
				total.setPosition(index);
				total.setUserId(list.get(j).getUserId());
				total.setActivityId(list.get(j).getActivityId());
				result.add(total);
				index++;
			}
		}
		return builder.body(ResponseUtils.getResponseBody(result));
	}
	
	@ApiOperation(value = "查询参加该活动投票人员", notes = "查询参加该活动投票人员")
	@RequestMapping(value = "/listActivityVoteUser", method = RequestMethod.GET)
	public ResponseEntity<JSONObject> listActivityVoteUser(@RequestParam Integer activityId) throws JSONException {
		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
		ActivitiRuleInstanceExample example = new ActivitiRuleInstanceExample();
		example.createCriteria().andActivityIdEqualTo(activityId).andIsElectedEqualTo(false);
		return builder.body(ResponseUtils.getResponseBody(activitiRuleInstanceMapper.selectByExample(example)));
	}
	
	@ApiOperation(value = "查询参加活动的所有人员", notes = "查询参加活动的所有人员")
	@RequestMapping(value = "/listAllActivityUser", method = RequestMethod.GET)
	public ResponseEntity<JSONObject> listAllActivityUser(@RequestParam Integer activityId) throws JSONException {
		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
		ActivitiRuleInstanceExample example = new ActivitiRuleInstanceExample();
		example.createCriteria().andActivityIdEqualTo(activityId);
		return builder.body(ResponseUtils.getResponseBody(activitiRuleInstanceMapper.selectByExample(example)));
	}
	
//	@ApiOperation(value = "注册该活动所参加的人员", notes = "注册该活动所参加的人员")
//	@RequestMapping(value = "/addActivityUser", method = RequestMethod.GET)
//	public ResponseEntity<JSONObject> addActivityUser() throws JSONException {
//		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
//		return builder.body(ResponseUtils.getResponseBody(activityMapper.selectByExample(null)));
//	}
//	
//	@ApiOperation(value = "查看参加活动人个人信息", notes = "查看参加活动人个人信息")
//	@RequestMapping(value = "/listActivityUserInfo", method = RequestMethod.GET)
//	public ResponseEntity<JSONObject> listActivityUserInfo() throws JSONException {
//		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
//		return builder.body(ResponseUtils.getResponseBody(activityMapper.selectByExample(null)));
//	}
//	
//	@ApiOperation(value = "修改参加活动人的信息", notes = "参加活动人自己修改自己的信息包括头像")
//	@RequestMapping(value = "/updateActivityUserInfo", method = RequestMethod.GET)
//	public ResponseEntity<JSONObject> updateActivityUserInfo() throws JSONException {
//		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
//		return builder.body(ResponseUtils.getResponseBody(activityMapper.selectByExample(null)));
//	}
//	
//	@ApiOperation(value = "查询此活动的前三名", notes = "查询前三名先比票数，票数相同比分数")
//	@RequestMapping(value = "/listActivityVictory", method = RequestMethod.GET)
//	public ResponseEntity<JSONObject> listActivityVictory() throws JSONException {
//		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
//		return builder.body(ResponseUtils.getResponseBody(activityMapper.selectByExample(null)));
//	}
//	
//	@ApiOperation(value = "此活动开始评委投票", notes = "此活动开始评委投票")
//	@RequestMapping(value = "/addActivityUserVote", method = RequestMethod.GET)
//	public ResponseEntity<JSONObject> addActivityUserVote() throws JSONException {
//		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
//		return builder.body(ResponseUtils.getResponseBody(activityMapper.selectByExample(null)));
//	}
	
	@ApiOperation(value = "查询活动", notes = "公司每次举行活动的获取")
	@RequestMapping(value = "/listActivity", method = RequestMethod.GET)
	public ResponseEntity<JSONObject> listWareHouse() throws JSONException {
		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
		List<Activity> list = activityMapper.selectByExample(null);
		String type = "";
		List<ActivityInfo> activityInfos = new ArrayList<ActivityInfo>(list.size());
		for (int i = 0; i < list.size(); i++) {
			ActivitiStrategy strategy = activitiStrategyMapper.selectByPrimaryKey(list.get(i).getStrategyId());
			ActivityStrategyInstanceExample example = new ActivityStrategyInstanceExample();
			example.createCriteria().andActivityIdEqualTo(list.get(i).getId());
			List<ActivityStrategyInstance> instance = activityStrategyInstanceMapper.selectByExample(example);
			for (int j = 0; j < instance.size(); j++) {
				if(!"user_list".equals(instance.get(j).getRuleValueType()) && instance.get(j).getRuleValueType() != null) {
					type = instance.get(j).getRuleValueType();
				}
			}
			ActivityInfo activityInfo = new ActivityInfo();
			activityInfo.setId(list.get(i).getId());
			activityInfo.setActivityName(list.get(i).getActivityName());
			activityInfo.setActivityDesc(list.get(i).getActivityDesc());
			activityInfo.setActivityResult(list.get(i).getActivityResult());
			activityInfo.setActivityStatus(list.get(i).getActivityStatus());
			activityInfo.setActiviyType(list.get(i).getActiviyType());
			activityInfo.setCreateTime(list.get(i).getCreateTime());
			activityInfo.setEndTime(list.get(i).getEndTime());
			activityInfo.setIsDeleted(list.get(i).getIsDeleted());
			activityInfo.setIsTimingStart(list.get(i).getIsTimingStart());
			activityInfo.setModifyTime(list.get(i).getModifyTime());
			activityInfo.setStrategyId(strategy.getId());
			activityInfo.setUserId(list.get(i).getUserId());
			activityInfo.setStrategyName(strategy.getStrategyName());
			activityInfo.setStartTime(list.get(i).getStartTime());
			activityInfo.setType(type);
			activityInfos.add(activityInfo);
			type = "";
		}
		return builder.body(ResponseUtils.getResponseBody(activityInfos));
	}

//	@ApiOperation(value = "增加活动", notes = "公司每次举行活动的添加")
//	@RequestMapping(value = "/addActivity", method = RequestMethod.POST)
//	public ResponseEntity<JSONObject> addActivity(ActivityRequest request) throws JSONException {
//		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
//		Activity activity = new Activity();
//		activity.setActivityName(request.getActivityName());
//		activity.setActivityDesc(request.getActivityDesc());
//		activity.setActivityStatus(request.getActivityStatus());
//		activity.setActiviyType(request.getActiviyType());
//		activity.setStrategyId(request.getStrategyId());
//		activity.setCreateTime(LocalDateTime.now());
//		activity.setModifyTime(LocalDateTime.now());
//		activity.setIsDeleted((short) 0);
//		return builder.body(ResponseUtils.getResponseBody(activityMapper.insert(activity)));
//	}

	@ApiOperation(value = "删除活动", notes = "公司每次举行活动的删除")
	@RequestMapping(value = "/deleteActivity", method = RequestMethod.POST)
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "activityId", value = "活动id", required = true, type = "Integer") })
	public ResponseEntity<JSONObject> deleteActivity(@RequestParam Integer activityId) throws JSONException {
		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
		return builder.body(ResponseUtils.getResponseBody(activityMapper.deleteByPrimaryKey(activityId)));
	}

	@ApiOperation(value = "修改活动", notes = "公司每次举行活动的修改")
	@RequestMapping(value = "/updateActivity", method = RequestMethod.POST)
	public ResponseEntity<JSONObject> updateActivity(ActivityRequest request) throws Exception {
		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
		Activity activity = activityMapper.selectByPrimaryKey(request.getId());
		if (activity == null) {
			throw new Exception("活动不存在");
		}
		if (!StringUtils.isEmpty(request.getActivityName())) {
			activity.setActivityName(request.getActivityName());
		}
		if (!StringUtils.isEmpty(request.getActivityDesc())) {
			activity.setActivityDesc(request.getActivityDesc());
		}
		if (!StringUtils.isEmpty(request.getActivityStatus())) {
			activity.setActivityStatus(request.getActivityStatus());
		}
		if (!StringUtils.isEmpty(request.getActiviyType())) {
			activity.setActiviyType(request.getActiviyType());
		}
		if (!StringUtils.isEmpty(request.getStrategyId())) {
			activity.setStrategyId(request.getStrategyId());
		}
			activity.setModifyTime(LocalDateTime.now());
		return builder.body(ResponseUtils.getResponseBody(activityMapper.updateByPrimaryKey(activity)));
	}
	
	
	@ApiOperation(value = "查询活动策略", notes = "公司每次举行活动的活动策略")
	@RequestMapping(value = "/listActivityStrategy", method = RequestMethod.GET)
	public ResponseEntity<JSONObject> listActivityStrategy() throws JSONException {
		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
		return builder.body(ResponseUtils.getResponseBody(activitiStrategyMapper.selectByExample(null)));
	}
	
//	@ApiOperation(value = "增加活动策略", notes = "公司每次举行活动的策略添加")
//	@RequestMapping(value = "/addActivityStrategy", method = RequestMethod.POST)
//	public ResponseEntity<JSONObject> addActivityStrategy(ActivityStrategyRequest request) throws JSONException {
//		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
//		ActivitiStrategy activitiStrategy = new ActivitiStrategy();
//		activitiStrategy.setStrategyName(request.getStrategyName());
//		activitiStrategy.setStrategyDesc(request.getStrategyDesc());
//		activitiStrategy.setStrategyType(request.getStrategyType());
//		activitiStrategy.setCreateTime(LocalDateTime.now());
//		activitiStrategy.setModifyTime(LocalDateTime.now());
//		activitiStrategy.setIsDeleted((short) 0);
//		return builder.body(ResponseUtils.getResponseBody(activitiStrategyMapper.insert(activitiStrategy)));
//	}

	@ApiOperation(value = "删除活动策略", notes = "公司每次举行活动策略的删除")
	@RequestMapping(value = "/deleteActivityStrategy", method = RequestMethod.POST)
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "activityStrategyId", value = "活动策略id", required = true, type = "Integer") })
	public ResponseEntity<JSONObject> deleteActivityStrategy(@RequestParam Integer activityStrategyId) throws JSONException {
		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
		return builder.body(ResponseUtils.getResponseBody(activitiStrategyMapper.deleteByPrimaryKey(activityStrategyId)));
	}

//	@ApiOperation(value = "修改活动策略", notes = "公司每次举行活动策略的修改")
//	@RequestMapping(value = "/updateActivityStrategy", method = RequestMethod.POST)
//	public ResponseEntity<JSONObject> updateActivityStrategy(ActivityStrategyRequest request) throws Exception {
//		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
//		ActivitiStrategy activitiStrategy = activitiStrategyMapper.selectByPrimaryKey(request.getId());
//		if (activitiStrategy == null) {
//			throw new Exception("此活动策略不存在");
//		}
//		if (!StringUtils.isEmpty(request.getStrategyName())) {
//			activitiStrategy.setStrategyName(request.getStrategyName());
//		}
//		if (!StringUtils.isEmpty(request.getStrategyDesc())) {
//			activitiStrategy.setStrategyDesc(request.getStrategyDesc());
//		}
//		if (!StringUtils.isEmpty(request.getStrategyStatus())) {
//			activitiStrategy.setStrategyStatus(request.getStrategyStatus());
//		}
//		if (!StringUtils.isEmpty(request.getStrategyType())) {
//			activitiStrategy.setStrategyType(request.getStrategyType());
//		}
//		activitiStrategy.setModifyTime(LocalDateTime.now());
//		return builder.body(ResponseUtils.getResponseBody(activitiStrategyMapper.updateByPrimaryKey(activitiStrategy)));
//	}
	
	
	@ApiOperation(value = "查询活动策略实体", notes = "公司每次举行活动的活动策略实体")
	@RequestMapping(value = "/listActivityStrategyInstance", method = RequestMethod.GET)
	public ResponseEntity<JSONObject> listActivityStrategyInstance(@RequestParam Integer activityId) throws JSONException {
		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
		ActivityStrategyInstanceExample example = new ActivityStrategyInstanceExample();
		example.createCriteria().andActivityIdEqualTo(activityId);
		return builder.body(ResponseUtils.getResponseBody(activityStrategyInstanceMapper.selectByExample(example)));
	}
	
//	@ApiOperation(value = "增加活动策略实体", notes = "公司每次举行活动的策略实体添加")
//	@RequestMapping(value = "/addActivityStrategyInstance", method = RequestMethod.POST)
//	public ResponseEntity<JSONObject> addActivityStrategyInstance(ActivityStrategyInstanceRequest request) throws JSONException {
//		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
//		ActivityStrategyInstance activityStrategyInstance = new ActivityStrategyInstance();
//		activityStrategyInstance.setRuleName(request.getRuleName());
//		activityStrategyInstance.setRuleDesc(request.getRuleDesc());
//		activityStrategyInstance.setRuleStatus(request.getRuleStatus());
//		activityStrategyInstance.setRuleValue(request.getRuleValue());
//		activityStrategyInstance.setRuleValueType(request.getRuleValueType());
//		activityStrategyInstance.setActivityId(request.getActivityId());
//		activityStrategyInstance.setRuleId(request.getRuleId());
//		activityStrategyInstance.setCreateTime(LocalDateTime.now());
//		activityStrategyInstance.setModifyTime(LocalDateTime.now());
//		activityStrategyInstance.setIsDeleted((short) 0);
//		return builder.body(ResponseUtils.getResponseBody(activityStrategyInstanceMapper.insert(activityStrategyInstance)));
//	}

	@ApiOperation(value = "删除活动策略实体", notes = "公司每次举行活动策略实体的删除")
	@RequestMapping(value = "/deleteActivityStrategyInstance", method = RequestMethod.POST)
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "query", name = "activityStrategyInstanceId", value = "活动策略实体id", required = true, type = "Integer") })
	public ResponseEntity<JSONObject> deleteActivityStrategyInstance(@RequestParam Integer activityStrategyInstanceId) throws JSONException {
		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
		return builder.body(ResponseUtils.getResponseBody(activityStrategyInstanceMapper.deleteByPrimaryKey(activityStrategyInstanceId)));
	}

	@ApiOperation(value = "修改活动策略实体", notes = "公司每次举行活动策略实体的修改")
	@RequestMapping(value = "/updateActivityStrategyInstance", method = RequestMethod.POST)
	public ResponseEntity<JSONObject> updateActivityStrategyInstance(ActivityStrategyInstanceRequest request) throws Exception {
		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
		ActivityStrategyInstance activityStrategyInstance = activityStrategyInstanceMapper.selectByPrimaryKey(request.getId());
		if (activityStrategyInstance == null) {
			throw new Exception("此活动策略实体不存在");
		}
		if (!StringUtils.isEmpty(request.getRuleName())) {
			activityStrategyInstance.setRuleName(request.getRuleName());
		}
		if (!StringUtils.isEmpty(request.getRuleDesc())) {
			activityStrategyInstance.setRuleDesc(request.getRuleDesc());
		}
		if (!StringUtils.isEmpty(request.getRuleStatus())) {
			activityStrategyInstance.setRuleStatus(request.getRuleStatus());
		}
		if (!StringUtils.isEmpty(request.getRuleValue())) {
			activityStrategyInstance.setRuleValue(request.getRuleValue());
		}
		if (!StringUtils.isEmpty(request.getRuleValueType())) {
			activityStrategyInstance.setRuleValueType(request.getRuleValueType());
		}
		if (!StringUtils.isEmpty(request.getActivityId())) {
			activityStrategyInstance.setActivityId(request.getActivityId());
		}
		if (!StringUtils.isEmpty(request.getRuleId())) {
			activityStrategyInstance.setRuleId(request.getRuleId());
		}
		activityStrategyInstance.setModifyTime(LocalDateTime.now());
		return builder.body(ResponseUtils.getResponseBody(activityStrategyInstanceMapper.updateByPrimaryKey(activityStrategyInstance)));
	}
	
	
	
//	@ApiOperation(value = "查询活动规则值描述", notes = "公司每次举行活动的活动规则值描述")
//	@RequestMapping(value = "/listActivityRuleValueDesc", method = RequestMethod.GET)
//	public ResponseEntity<JSONObject> listActivityRuleValueDesc() throws JSONException {
//		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
//		return builder.body(ResponseUtils.getResponseBody(activitiRuleInstanceMapper.selectByExample(null)));
//	}
//	
//	@ApiOperation(value = "增加活动规则值描述", notes = "公司每次举行活动规则值描述增加")
//	@RequestMapping(value = "/addActivityRuleValueDesc", method = RequestMethod.POST)
//	public ResponseEntity<JSONObject> addActivityRuleValueDesc(RuleValueDescRequest request) throws JSONException {
//		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
//		ActivitiRuleInstance ruleValueDesc = new ActivitiRuleInstance();
//		ruleValueDesc.setActivityId(request.getActivityId());
//		ruleValueDesc.setRuleId(request.getRuleId());
//		ruleValueDesc.setRuleInstanceId(request.getRuleInstanceId());
//		ruleValueDesc.setIsRelateUser(request.isRelateUser());
//		ruleValueDesc.setUserId(request.getUserId());
//		ruleValueDesc.setRuleInstanceValue(request.getRuleInstanceValue());
//		ruleValueDesc.setRemarks(request.getRemarks());
//		ruleValueDesc.setCreateTime(LocalDateTime.now());
//		ruleValueDesc.setModifyTime(LocalDateTime.now());
//		ruleValueDesc.setIsDeleted((short) 0);
//		activitiRuleInstanceMapper.insert(ruleValueDesc);
//		return builder.body(ResponseUtils.getResponseBody(ruleValueDesc.getId()));
//	}
//
//	@ApiOperation(value = "删除活动规则值描述", notes = "公司每次举行活动规则值描述的删除")
//	@RequestMapping(value = "/deleteActivityRuleValueDesc", method = RequestMethod.POST)
//	@ApiImplicitParams({
//			@ApiImplicitParam(paramType = "query", name = "activityRuleValueDescId", value = "活动策略实体id", required = true, type = "Integer") })
//	public ResponseEntity<JSONObject> deleteActivityRuleValueDesc(@RequestParam Integer activityRuleValueDescId) throws JSONException {
//		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
//		return builder.body(ResponseUtils.getResponseBody(activitiRuleInstanceMapper.deleteByPrimaryKey(activityRuleValueDescId)));
//	}
//
//	@ApiOperation(value = "修改活动规则值描述", notes = "公司每次举行活动规则值描述的修改")
//	@RequestMapping(value = "/updateActivityRuleValueDesc", method = RequestMethod.POST)
//	public ResponseEntity<JSONObject> updateActivityRuleValueDesc(RuleValueDescRequest request) throws Exception {
//		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
//		ActivitiRuleInstance ruleValueDesc = activitiRuleInstanceMapper.selectByPrimaryKey(request.getId());
//		if (ruleValueDesc == null) {
//			throw new Exception("规则值描述不存在");
//		}
//		if (!StringUtils.isEmpty(request.getActivityId())) {
//			ruleValueDesc.setActivityId(request.getActivityId());
//		}
//		if (!StringUtils.isEmpty(request.getRuleId())) {
//			ruleValueDesc.setRuleId(request.getRuleId());
//		}
//		if (!StringUtils.isEmpty(request.getRuleInstanceId())) {
//			ruleValueDesc.setRuleInstanceId(request.getRuleInstanceId());
//		}
//		if (!StringUtils.isEmpty(request.isRelateUser())) {
//			ruleValueDesc.setIsRelateUser(request.isRelateUser());
//		}
//		if (!StringUtils.isEmpty(request.getUserId())) {
//			ruleValueDesc.setUserId(request.getUserId());
//		}
//		if (!StringUtils.isEmpty(request.getRuleInstanceValue())) {
//			ruleValueDesc.setRuleInstanceValue(request.getRuleInstanceValue());
//		}
//		if (!StringUtils.isEmpty(request.getRemarks())) {
//			ruleValueDesc.setRemarks(request.getRemarks());
//		}
//		ruleValueDesc.setModifyTime(LocalDateTime.now());
//		return builder.body(ResponseUtils.getResponseBody(activitiRuleInstanceMapper.updateByPrimaryKey(ruleValueDesc)));
//	}
	
//	@ApiOperation(value = "生成活动码", notes = "生成活动码")
//	@RequestMapping(value = "/createActivityCode", method = RequestMethod.GET)
//	public ResponseEntity<JSONObject> createActivityCode(@RequestParam Integer activityId,@RequestParam Boolean flag,@RequestParam Integer[] userId,
//			@RequestParam Integer len,StrategyRuleRequest request,
//			@RequestParam String remarks) throws JSONException {
//		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
//		String arr = "";
//		String str = "";
//		String id = ":";
//		Activity activity = activityMapper.selectByPrimaryKey(activityId);
//		StrategyRuleRelateExample example = new StrategyRuleRelateExample();
//		example.clear();
//		example.createCriteria().andStrategyIdEqualTo(activity.getStrategyId()).andStrategyRuleIdEqualTo(request.getId());
//		List<StrategyRuleRelate> list = strategyRuleRelateMapper.selectByExample(example);
//		if(list.isEmpty()) {
//			StrategyRuleRelate strategyRuleRelate = new StrategyRuleRelate();
//			strategyRuleRelate.setStrategyId(activity.getStrategyId());
//			strategyRuleRelate.setStrategyRuleId(request.getId());
//			strategyRuleRelate.setIsUsed(flag);
//			strategyRuleRelate.setCreateTime(LocalDateTime.now());
//			strategyRuleRelate.setModifyTime(LocalDateTime.now());
//			strategyRuleRelate.setIsDeleted((short) 0);
//			strategyRuleRelateMapper.insert(strategyRuleRelate);
//		}
//		for(int i=0;i<len;i++) {
//			arr = create();
//			ActivityStrategyInstanceExample example2 = new ActivityStrategyInstanceExample();
//			example2.createCriteria().andActivityIdEqualTo(activityId).andRuleIdEqualTo(request.getId());
//			List<ActivityStrategyInstance> list2 = activityStrategyInstanceMapper.selectByExample(example2);
//			Integer ruleInstanceId = 0;
//			if(list2.isEmpty()) {
//				ActivityStrategyInstance activityStrategyInstance = new ActivityStrategyInstance();
//				activityStrategyInstance.setRuleName(request.getRuleName());
//				activityStrategyInstance.setRuleDesc(request.getRuleDesc());
//				activityStrategyInstance.setRuleStatus(request.getRuleStatus());
//				activityStrategyInstance.setRuleValue(request.getRuleType());
//				activityStrategyInstance.setRuleValueType(request.getRuleValueType());
//				activityStrategyInstance.setActivityId(activityId);
//				activityStrategyInstance.setRuleId(request.getId());
//				activityStrategyInstance.setCreateTime(LocalDateTime.now());
//				activityStrategyInstance.setModifyTime(LocalDateTime.now());
//				activityStrategyInstance.setIsDeleted((short) 0);
//				activityStrategyInstanceMapper.insert(activityStrategyInstance);
//				ruleInstanceId = activityStrategyInstance.getActivityId();
//			}else {
//				ruleInstanceId = list2.get(0).getId();
//			}
//			ActivitiRuleInstanceExample example3 = new ActivitiRuleInstanceExample();
//			System.out.println(userId[i]+ruleInstanceId);
//			example3.createCriteria().andActivityIdEqualTo(activityId).andUserIdEqualTo(userId[i]);
//			List<ActivitiRuleInstance> list3 = activitiRuleInstanceMapper.selectByExample(example3);
//			if(list3.isEmpty()) {
//				ActivitiRuleInstance ruleValueDesc = new ActivitiRuleInstance();
//				ruleValueDesc.setActivityId(activityId);
//				ruleValueDesc.setRuleId(request.getId());
//				ruleValueDesc.setRuleInstanceId(ruleInstanceId);
//				ruleValueDesc.setIsElected(flag);
//				ruleValueDesc.setUserId(userId[i]);
//				ruleValueDesc.setRuleInstanceValue(arr);
//				ruleValueDesc.setRemarks(remarks);
//				ruleValueDesc.setCreateTime(LocalDateTime.now());
//				ruleValueDesc.setModifyTime(LocalDateTime.now());
//				ruleValueDesc.setIsDeleted((short) 0);
//				activitiRuleInstanceMapper.insert(ruleValueDesc);
//			}else {
//				id = id + list3.get(0).getUserId() + ",";
//			}
//			arr = arr+",";
//			str = arr + str;
//		}
//		str = str + id;
//		return builder.body(ResponseUtils.getResponseBody(str));
//	}
//	
//	public static String create() {
//		String code = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIZXCVBNM";
//		String str = "";
//		for (int i = 1; i <= 4; i++) {
//			String num = String.valueOf(code.charAt((int) Math.floor(Math.random() * code.length())));
//			str += num;
//			code = code.replaceAll(num, "");
//		}
//		return str;
//	}
	
	@ApiOperation(value = "查询活动码", notes = "查询活动码")
	@RequestMapping(value = "/listActivityCode", method = RequestMethod.POST)
	public ResponseEntity<JSONObject> listActivityCode(@RequestParam String code,@RequestParam Integer activityId) throws JSONException {
		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
		boolean flag = true;
		ActivitiRuleInstanceExample example = new ActivitiRuleInstanceExample();
		example.createCriteria().andRuleInstanceValueEqualTo(code).andActivityIdEqualTo(activityId);
		List<ActivitiRuleInstance> list = activitiRuleInstanceMapper.selectByExample(example);
		if(list.isEmpty() || list.get(0).getIsElected() == true) {
			flag = false;
		}
		return builder.body(ResponseUtils.getResponseBody(flag));
	}
	
	@ApiOperation(value = "根据活动查询活动结果", notes = "根据活动查询活动结果")
	@RequestMapping(value = "/findActivityResult", method = RequestMethod.GET)
	public ResponseEntity<JSONObject> findActivityResult(@RequestParam Integer activityId) throws JSONException {
		BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
		ActivityStrategyInstanceExample activityStrategyInstanceExample = new ActivityStrategyInstanceExample();
		activityStrategyInstanceExample.createCriteria().andActivityIdEqualTo(activityId)
				.andRuleValueTypeEqualTo("ticket_count");
		ActivitiRuleInstanceExample activitiRuleInstanceExample = new ActivitiRuleInstanceExample();
		activitiRuleInstanceExample.createCriteria().andActivityIdEqualTo(activityId)
				.andIsElectedEqualTo(false);
		List<ActivitiRuleInstance> list = activitiRuleInstanceMapper.selectByExample(activitiRuleInstanceExample);
		for (int j = 0; j < list.size(); j++) {
			ActivityVoteRecordsExample activityVoteRecordsExample = new ActivityVoteRecordsExample();
			activityVoteRecordsExample.createCriteria().andUserIdEqualTo(list.get(j).getUserId());
			List<ActivityVoteRecords> activityVoteRecords = activityVoteRecordsMapper
					.selectByExample(activityVoteRecordsExample);
			if (!activityVoteRecords.isEmpty()) {
				if (activityVoteRecords.size() < Integer.valueOf(activityStrategyInstanceMapper
						.selectByExample(activityStrategyInstanceExample).get(0).getRuleValue())) {
					for (int k = 0; k < activityVoteRecords.size(); k++) {
						ActivitiRuleInstanceExample activitiRuleInstanceExample2 = new ActivitiRuleInstanceExample();
						activitiRuleInstanceExample2.createCriteria().andActivityIdEqualTo(activityId)
								.andUserIdEqualTo(activityVoteRecords.get(k).getElectedUserId());
						List<ActivitiRuleInstance> activitiRuleInstance = activitiRuleInstanceMapper
								.selectByExample(activitiRuleInstanceExample2);
						ActivitiRuleInstance instance = activitiRuleInstance.get(0);
						instance.setUserTicketCount(instance.getUserTicketCount() - 1);
						instance.setUserScore(
								instance.getUserScore() - Integer.valueOf(activityVoteRecords.get(k).getRemarks()));
						activitiRuleInstanceMapper.updateByPrimaryKey(instance);
					}
					for (int k = 0; k < Integer.valueOf(activityStrategyInstanceMapper
							.selectByExample(activityStrategyInstanceExample).get(0).getRuleValue())
							- activityVoteRecords.size(); k++) {
						ActivityVoteRecords records = new ActivityVoteRecords();
						records.setUserId(activityVoteRecords.get(0).getUserId());
						activityVoteRecordsMapper.insert(records);
					}
				}
			}
		}
		ActivitiRuleInstanceExample example = new ActivitiRuleInstanceExample();
		example.createCriteria().andActivityIdEqualTo(activityId).andIsElectedEqualTo(true);
		example.setOrderByClause("user_ticket_count DESC,user_score DESC");
		List<ActivitiRuleInstance> list1 = activitiRuleInstanceMapper.selectByExample(example);
		List<Total> result = new ArrayList<Total>();
		if (!list1.isEmpty()) {
			Integer index = 1;
			for (int j = 0; j < list1.size(); j++) {
				Total total = new Total();
				if (list1.get(j).getUserScore() == null) {
					total.setSocre(0);
				} else {
					total.setSocre(list1.get(j).getUserScore());
				}
				if (list1.get(j).getUserTicketCount() == null) {
					total.setVoteCount(0);
				} else {
					total.setVoteCount(list1.get(j).getUserTicketCount());
				}
				HfUser hfUser = hfUserMapper.selectByPrimaryKey(list1.get(j).getUserId());
				total.setFileId(hfUser.getFileId());
				total.setUsername(hfUser.getUsername());
				total.setPosition(index);
				total.setUserId(list1.get(j).getUserId());
				total.setActivityId(list1.get(j).getActivityId());
				result.add(total);
				index++;
			}
		}
		return builder.body(ResponseUtils.getResponseBody(result));
	}
	
}
