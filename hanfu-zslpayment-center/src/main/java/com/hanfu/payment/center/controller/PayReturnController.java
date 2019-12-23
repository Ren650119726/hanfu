package com.hanfu.payment.center.controller;

import com.alibaba.fastjson.JSONObject;
import com.hanfu.payment.center.returnutil.WXPayConstants;
import com.hanfu.payment.center.returnutil.WXPayUtil;
import com.hanfu.payment.center.service.PayReturnService;
import com.hanfu.utils.response.handler.ResponseEntity;
import com.hanfu.utils.response.handler.ResponseUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.net.ssl.SSLContext;
import java.io.*;
import java.security.KeyStore;
import java.util.Map;

/**
 * @ClassName PayReturnController
 * @Date 2019/12/19 16:04
 * @Author CONSAK
 **/
@Api
@CrossOrigin
@RestController
@RequestMapping("/payReturn")
public class PayReturnController {

    @Autowired
    private PayReturnService payReturnService;

    @ApiOperation(value = "申请退款",notes = "申请退款")
    @RequestMapping(value = "/refund",method = RequestMethod.GET)
    @ApiImplicitParams({                                                   //商户单号和微信单号  选择其一
            @ApiImplicitParam(paramType = "query", name = "out_trade_no", value = "商户订单号", required = false),
            @ApiImplicitParam(paramType = "query", name = "transaction_id", value = "微信订单号", required = false),
            @ApiImplicitParam(paramType = "query", name = "total_fee", value = "总额", required = true)
    })
    public ResponseEntity<JSONObject> refund(String out_trade_no,String transaction_id,int total_fee) throws Exception {

        ResponseEntity.BodyBuilder builder = ResponseUtils.getBodyBuilder();

        ResponseEntity<JSONObject> result = payReturnService.refund(out_trade_no,transaction_id,total_fee);

        return result;
    }
}