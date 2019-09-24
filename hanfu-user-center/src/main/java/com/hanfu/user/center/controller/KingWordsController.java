package com.hanfu.user.center.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.hanfu.user.center.dao.UsersMapper;
import com.hanfu.user.center.model.Users;
import com.hanfu.user.center.model.UsersExample;
import com.hanfu.user.center.request.LoginReuqest;
import com.hanfu.user.center.response.handler.ResponseUtils;
import com.hanfu.user.center.service.CommonService;

@RestController
@RequestMapping("/user")
public class KingWordsController {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CommonService commonService;
	@Autowired
	private UsersMapper usersMapper;

	/**
	 * 展示所有用户
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/users")
	public ResponseEntity<JSONObject> listUsers(HttpServletRequest request) throws Exception {
		BodyBuilder builder = ResponseUtils.getBodyBuilder();
		List<Users> list = commonService.getUserList();
		return builder.body(ResponseUtils.getResponseBody(list));
	}
	
	@RequestMapping("/login")
	public ResponseEntity<JSONObject> loginUser(@RequestBody LoginReuqest request) throws Exception {
		BodyBuilder builder = ResponseUtils.getBodyBuilder();
		Map<String, String> list = commonService.loginUser(request);
		return builder.body(ResponseUtils.getResponseBody(list));
	}
	
	@RequestMapping("/")
	public ResponseEntity<JSONObject> list() throws JSONException {
		BodyBuilder builder = ResponseUtils.getBodyBuilder();
		UsersExample example = new UsersExample();
		return builder.body(ResponseUtils.getResponseBody(usersMapper.selectByExample(example)));
	}

	
}
