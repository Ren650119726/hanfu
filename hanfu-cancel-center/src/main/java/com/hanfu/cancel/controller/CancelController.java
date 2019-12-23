package com.hanfu.cancel.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hanfu.cancel.dao.*;

import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.InvalidKeyException;

import com.hanfu.cancel.model.*;
import com.hanfu.cancel.service.CancelService;
import com.hanfu.utils.response.handler.ResponseEntity;
import com.hanfu.utils.response.handler.ResponseUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.crypto.Cipher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.WebRequest;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.spec.InvalidParameterSpecException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

@RestController
@Api
@RequestMapping("/cancel")
@CrossOrigin
public class CancelController {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private CancelService cancelService;
    @Autowired
    private HfUserMapper hfUserMapper;
    @Autowired
    private CancelsMapper cancelsMapper;
    @Autowired
    private HfOrdersDetailMapper hfOrdersDetailMapper;
    @Autowired
    private HfLogMapper hfLogMapper;
    @Autowired
    private HfGoodsMapper hfGoodsMapper;
    @Autowired
    private CancelRecordMapper cancelRecordMapper;
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value = "/selectCancel", method = RequestMethod.GET)
    @ApiOperation(value = "核销员信息", notes = "核销员信息")
    public ResponseEntity<JSONObject> selectCancel() throws Exception {
        ResponseEntity.BodyBuilder builder = ResponseUtils.getBodyBuilder();
        return builder.body(ResponseUtils.getResponseBody(cancelService.select()));
    }

    @RequestMapping(value = "/selectCancelRecord", method = RequestMethod.GET)
    @ApiOperation(value = "核销记录", notes = "核销记录")
    public ResponseEntity<JSONObject> selectCancelRecord(Integer Id) throws Exception {
        ResponseEntity.BodyBuilder builder = ResponseUtils.getBodyBuilder();
        Example example = new Example(CancelRecord.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo("cancelId",Id);
        return builder.body(ResponseUtils.getResponseBody(cancelRecordMapper.selectByExample(example)));
    }

    @RequestMapping(value = "/deleteEmpty", method = RequestMethod.GET)
    @ApiOperation(value = "清空", notes = "清空")
    public ResponseEntity<JSONObject> deleteEmpty(int id) throws Exception {
        ResponseEntity.BodyBuilder builder = ResponseUtils.getBodyBuilder();
        cancel cancel = new cancel();
        cancel.setId(id);
        cancel.setPresentMoney(0);
        cancelsMapper.updateByPrimaryKeySelective(cancel);
        return builder.body(ResponseUtils.getResponseBody("成功"));
    }

    @RequestMapping(value = "/selectCancelId", method = RequestMethod.GET)
    @ApiOperation(value = "核销员Id查询", notes = "核销员Id查询")
    public ResponseEntity<JSONObject> selectCancelId(int cancelId) throws Exception {
        ResponseEntity.BodyBuilder builder = ResponseUtils.getBodyBuilder();
        return builder.body(ResponseUtils.getResponseBody(cancelService.selectCancelId(cancelId)));
    }

    @RequestMapping(value = "/selectDate", method = RequestMethod.GET)
    @ApiOperation(value = "核销时间筛选", notes = "核销时间筛选")
    public ResponseEntity<JSONObject> selectDate(Date createData,Date createDate1) throws Exception {
        ResponseEntity.BodyBuilder builder = ResponseUtils.getBodyBuilder();
        return builder.body(ResponseUtils.getResponseBody(cancelService.selectDate(createData,createDate1)));
    }
    @RequestMapping(value = "/selectRegion", method = RequestMethod.GET)
    @ApiOperation(value = "地区筛选", notes = "地区筛选")
    public ResponseEntity<JSONObject> selectRegion(String site) throws Exception {
        ResponseEntity.BodyBuilder builder = ResponseUtils.getBodyBuilder();
        return builder.body(ResponseUtils.getResponseBody(cancelService.selectRegion(site)));
    }
    //转换时间格式
    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }

    @RequestMapping(value = "/deleterecord", method = RequestMethod.GET)
    @ApiOperation(value = "删除记录", notes = "删除记录")
    public ResponseEntity<JSONObject> deleterecord(int id) throws Exception {
        ResponseEntity.BodyBuilder builder = ResponseUtils.getBodyBuilder();
        return builder.body(ResponseUtils.getResponseBody(hfLogMapper.deleteByPrimaryKey(id)));
    }
    @RequestMapping(value = "/deleteCancel", method = RequestMethod.GET)
    @ApiOperation(value = "删除核销员", notes = "删除核销员")
    public ResponseEntity<JSONObject> deleteCancel(int id) throws Exception {
        ResponseEntity.BodyBuilder builder = ResponseUtils.getBodyBuilder();
        cancel cancel=cancelsMapper.selectByPrimaryKey(id);
        System.out.println(id);
        if (cancel==null){
            return builder.body(ResponseUtils.getResponseBody("核销员不存在"));
        }
        HfUser hfUser = new HfUser();
        hfUser.setId(cancel.getUserId());
        hfUser.setCancelId(0);
        hfUserMapper.updateByPrimaryKeySelective(hfUser);
        cancelsMapper.deleteByPrimaryKey(id);
        return builder.body(ResponseUtils.getResponseBody("成功"));
    }

    @RequestMapping(value = "/deleteBatchCancel", method = RequestMethod.GET)
    @ApiOperation(value = "批量删除核销员", notes = "批量删除核销员")
    public ResponseEntity<JSONObject> deleteBatchCancel(@RequestParam("id") List id) throws Exception {
        ResponseEntity.BodyBuilder builder = ResponseUtils.getBodyBuilder();
        System.out.println(id);
        if (id==null){
            builder.body(ResponseUtils.getResponseBody("请选择核销员"));
        }
        for(int i=0;i<id.size();i++){
            int cancelID=Integer.parseInt(id.get(i).toString());
            System.out.println(cancelID);
            cancel cancel=cancelsMapper.selectByPrimaryKey(cancelID);
            System.out.println(cancel);
            HfUser hfUser = new HfUser();
            hfUser.setId(cancel.getUserId());
            hfUser.setCancelId(0);
            hfUserMapper.updateByPrimaryKeySelective(hfUser);
            cancelsMapper.deleteByPrimaryKey(cancelID);
        }
        return builder.body(ResponseUtils.getResponseBody("成功"));
    }


    @RequestMapping(value = "/insertCancel", method = RequestMethod.GET)
    @ApiOperation(value = "增加核销员", notes = "增加核销员")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "UserId", value = "用戶id", required = true, type = "Integer"),
            @ApiImplicitParam(paramType = "query", name = "site", value = "核销地点", required = false, type = "String"),
            @ApiImplicitParam(paramType = "query", name = "RealName", value = "核销员姓名", required = false, type = "String")
    })
    public ResponseEntity<JSONObject> insertCancel(Integer UserId,String site,String RealName) throws Exception {
        System.out.println(UserId);
        System.out.println(site);
        ResponseEntity.BodyBuilder builder = ResponseUtils.getBodyBuilder();
        HfUser hfUser = new HfUser();
        hfUser.setId(UserId);

        HfUser hfUser1 = hfUserMapper.selectByPrimaryKey(hfUser);
        if (hfUser1==null){
            return builder.body(ResponseUtils.getResponseBody("用户不存在"));
        }
        Integer cancel = hfUser1.getCancelId();
        System.out.println(hfUser1.getCancelId());
        if (cancel==1){
            return builder.body(ResponseUtils.getResponseBody("该人员已经是核销员"));
        }
        hfUser.setCancelId(1);
        hfUser.setRealName(RealName);
        hfUser.setModifyDate(LocalDateTime.now());
        hfUserMapper.updateByPrimaryKeySelective(hfUser);
        cancel cancel1=new cancel();
        cancel1.setCreateDate(LocalDateTime.now());
        cancel1.setModifyDate(LocalDateTime.now());
        cancel1.setUserId(UserId);
        cancel1.setSite(site);
        cancelsMapper.insertSelective(cancel1);
        return builder.body(ResponseUtils.getResponseBody("成功"));
    }
    @RequestMapping(value = "/updateCancelUser", method = RequestMethod.GET)
    @ApiOperation(value = "根据核销id修改核销员信息", notes = "根据核销id修改核销员信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "Id", value = "核销id", required = true, type = "Integer"),
            @ApiImplicitParam(paramType = "query", name = "site", value = "核销地点", required = false, type = "String"),
            @ApiImplicitParam(paramType = "query", name = "RealName", value = "核销员姓名", required = false, type = "String"),
            @ApiImplicitParam(paramType = "query", name = "cancel2", value = "是否为核销员0否默认0,1是", required = true, type = "Integer")
    })
    public ResponseEntity<JSONObject> updateCancelUser(int Id,String site,Integer cancel2,String RealName) throws Exception {
        ResponseEntity.BodyBuilder builder = ResponseUtils.getBodyBuilder();
        cancel cancel= cancelsMapper.selectByPrimaryKey(Id);
        cancel cancel1 = new cancel();
        cancel1.setSite(site);
        cancel1.setModifyDate(LocalDateTime.now());
        cancel1.setId(Id);
        cancelsMapper.updateByPrimaryKeySelective(cancel1);
        HfUser hfUser = new HfUser();
        hfUser.setModifyDate(LocalDateTime.now());
        hfUser.setCancelId(cancel2);
        hfUser.setRealName(RealName);
        hfUser.setId(cancel.getUserId());
        hfUserMapper.updateByPrimaryKeySelective(hfUser);
        if (cancel2==0){
            cancelsMapper.deleteByPrimaryKey(Id);
            return builder.body(ResponseUtils.getResponseBody("已经取消此人的核销资格"));
        }
        return builder.body(ResponseUtils.getResponseBody("成功"));
    }


    @RequestMapping(value = "/updateCancel", method = RequestMethod.GET)
    @ApiOperation(value = "修改核销员信息", notes = "修改核销员信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "UserId", value = "用戶id", required = true, type = "Integer"),
            @ApiImplicitParam(paramType = "query", name = "site", value = "核销地点", required = false, type = "String"),
            @ApiImplicitParam(paramType = "query", name = "RealName", value = "核销员姓名", required = true, type = "String"),
            @ApiImplicitParam(paramType = "query", name = "cancel2", value = "是否为核销员0否默认0,1是", required = true, type = "Integer")
    })
    public ResponseEntity<JSONObject> updateCancel(int UserId,String site,int cancel2,String RealName) throws Exception {
        ResponseEntity.BodyBuilder builder = ResponseUtils.getBodyBuilder();
        HfUser hfUser = new HfUser();
        hfUser.setId(UserId);
        hfUser.setCancelId(cancel2);
        hfUser.setRealName(RealName);
        hfUserMapper.updateByPrimaryKeySelective(hfUser);
        cancel cancel1 = new cancel();
        cancel1.setSite(site);
        cancel1.setUserId(UserId);
        cancel1.setCreateDate(LocalDateTime.now());
        cancel1.setModifyDate(LocalDateTime.now());
        Example example = new Example(cancel.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId",UserId);
        cancelsMapper.updateByExampleSelective(cancel1,example);
        if(cancel2==0){
            criteria.andEqualTo("userId",UserId);
            cancelsMapper.deleteByExample(example);
            return builder.body(ResponseUtils.getResponseBody("已取消此人的核销资格"));
        }
        return builder.body(ResponseUtils.getResponseBody(cancelService.select()));
    }

    @RequestMapping(path = "/wxLogin",  method = RequestMethod.GET)
    @ApiOperation(value = "授权核销", notes = "授权核销")
    public ResponseEntity<JSONObject> wxLogin(
            @RequestParam(value = "code",required = false) String code,
            @RequestParam(value = "rawData",required = false) String rawData,
            @RequestParam(value = "signature",required = false) String signature,
            @RequestParam(value = "goodsId商品Id",required = false) Integer goodsId,
            @RequestParam(value = "orderId订单Id",required = false) Integer orderId,
            @RequestParam(value = "encryptedData",required = false) String encryptedData,
            @RequestParam(value = "iv",required = false) String iv
    ) throws Exception{
        if (code.equals("")){
            ResponseEntity.BodyBuilder builder = ResponseUtils.getBodyBuilder();
            return builder.body(ResponseUtils.getResponseBody("扫描获取失败"));
        }
        logger.info( "Start get SessionKey" );
        Integer userId = null;
        Map<String,Object> map = new HashMap<String, Object>();
        //JSONObject rawDataJson = JSON.parseObject( rawData );
        JSONObject SessionKeyOpenId = getSessionKeyOrOpenId( code );
        String openid = (String) SessionKeyOpenId.get("openid");
        String sessionKey = (String) SessionKeyOpenId.get( "session_key" );
        //uuid生成唯一key
        String skey = UUID.randomUUID().toString();
        //根据openid查询skey是否存在
        String skey_redis =(String) redisTemplate.opsForValue().get( openid );
        if(!StringUtils.isEmpty(skey_redis)){
            //存在 删除 skey 重新生成skey 将skey返回
            redisTemplate.delete( skey_redis );
            skey = UUID.randomUUID().toString();
        }
        //  缓存一份新的
        JSONObject sessionObj = new JSONObject();
        sessionObj.put( "openId",openid );
        sessionObj.put( "sessionKey",sessionKey );
        redisTemplate.opsForValue().set( skey,sessionObj.toJSONString() );
        redisTemplate.opsForValue().set( openid.toString(),skey );
        //把新的sessionKey和oppenid返回给小程序
        map.put( "skey",skey );
        map.put( "result","0" );
        JSONObject userInfo = getUserInfo( encryptedData, sessionKey, iv );
        String unionId = "";
        String nickName = "";
        String avatarUrl = "";
        if(userInfo != null) {
            if(userInfo.get("unionId") != null) {
                unionId = (String) userInfo.get("unionId");
            }
            nickName = 	userInfo.getString("nickName");
            avatarUrl = userInfo.getString("avatarUrl");
        }
        ResponseEntity.BodyBuilder builder = ResponseUtils.getBodyBuilder();
        HfUser hfUser = new HfUser();
        Example example = new Example(HfUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username",unionId);
        List<HfUser> hfUserList= hfUserMapper.selectByExample(example);
        System.out.println(hfUserList+"根据用户唯一标识查出的数据");
        if (hfUserList.size()==0){
            return builder.body(ResponseUtils.getResponseBody("请登录后操作"));
        }
        HfUser hfUser1=hfUserMapper.selectByPrimaryKey(hfUserList.get(0));
        if (hfUser1.getCancelId()==0){
            return builder.body(ResponseUtils.getResponseBody("对不起你不是核销员无法核销商品"));
        }
        System.out.println(hfUser1.getCancelId()+"是否为核销员0否");
        //判断核销员是否为该商品的核销员
        Example example1 = new Example(cancel.class);
        Example.Criteria criteria1 = example1.createCriteria();
        criteria1.andEqualTo("userId",hfUserList.get(0));
        List<cancel> cancelList= cancelsMapper.selectByExample(example1);
        HfGoods hfGoods = hfGoodsMapper.selectByPrimaryKey(goodsId);
        cancel cancel1= cancelsMapper.selectByPrimaryKey(cancelList.get(0));
        System.out.println(cancel1+"cancelList.get(0)");
        if (!hfGoods.getCancelId().equals(cancel1.getId())){
            return builder.body(ResponseUtils.getResponseBody("你不是该商品的核销员"));
        }
        //判断核销的商品是否为自提商品
        if (hfGoodsMapper.selectByPrimaryKey(goodsId).getClaim().equals(0)){
            return builder.body(ResponseUtils.getResponseBody("该商品不是自提商品"));
        }
        //价格，根据订单id，设置订单状态
        Example example2 = new Example(HfOrdersDetail.class);
        Example.Criteria criteria2 = example2.createCriteria();
        criteria2.andEqualTo("ordersId",orderId);
        List<HfOrdersDetail> hfPriceList= hfOrdersDetailMapper.selectByExample(example2);
        HfOrdersDetail hfPrice = hfOrdersDetailMapper.selectByPrimaryKey(hfPriceList.get(0));
        if (hfPrice.getOrderDetailStatus().equals("已完成")){
            return builder.body(ResponseUtils.getResponseBody("该订单已被核销"));
        }
        HfOrdersDetail hfOrdersDetail = new HfOrdersDetail();
        hfOrdersDetail.setId(hfPrice.getId());
        hfOrdersDetail.setOrderDetailStatus("已完成");
        hfOrdersDetailMapper.updateByPrimaryKeySelective(hfOrdersDetail);
        //添加核销记录
        CancelRecord cancelRecord = new CancelRecord();
        cancelRecord.setCreateDate(LocalDateTime.now());
        cancelRecord.setModifyDate(LocalDateTime.now());
        cancelRecord.setGoodsId(goodsId);
        cancelRecord.setCancelId(cancel1.getId());
        cancelRecord.setAmount(hfPrice.getPurchasePrice()*hfPrice.getPurchaseQuantity());
        hfLogMapper.insert(cancelRecord);
        //添加核销员核销额记录
        cancel cancel = new cancel();
        cancel.setId(cancel1.getId());
        cancel.setMoney(hfPrice.getPurchasePrice()*hfPrice.getPurchaseQuantity()+cancel1.getMoney());
        cancel.setPresentMoney(hfPrice.getPurchasePrice()*hfPrice.getPurchaseQuantity()+cancel1.getPresentMoney());
        cancelsMapper.updateByPrimaryKeySelective(cancel);
//        HfUserExample example = new HfUserExample();
//        example.createCriteria().andUsernameEqualTo(unionId);
//        List<HfUser> list = hfUserMapper.selectByExample(example);
//        if(list.isEmpty()) {
//            HfUser hfUser = new HfUser();
//            hfUser.setAddress(avatarUrl);
//            hfUser.setNickName(nickName);
//            hfUser.setUsername(unionId);
//            hfUser.setCreateDate(LocalDateTime.now());
//            hfUser.setModifyDate(LocalDateTime.now());
//            hfUser.setIdDeleted((byte) 0);
//            hfUserMapper.insert(hfUser);
//            userId = hfUser.getId();
//        }else {
//            HfUser hfUser = list.get(0);
//            hfUser.setAddress(avatarUrl);
//            hfUser.setNickName(nickName);
//            hfUserMapper.updateByPrimaryKey(hfUser);
//            userId = hfUser.getId();
//        }
        map.put("userId", userId);
        map.put( "userInfo",userInfo );

        return builder.body(ResponseUtils.getResponseBody(map));
    }

    private JSONObject getUserInfo(String encryptedData, String sessionKey, String iv) {
        // 被加密的数据
        byte[] dataByte = Base64.getDecoder().decode(encryptedData);
        // 加密秘钥
        byte[] keyByte = Base64.getDecoder().decode(sessionKey);
        // 偏移量
        byte[] ivByte = Base64.getDecoder().decode(iv);
        try {
            // 如果密钥不足16位，那么就补足.  这个if 中的内容很重要
            int base = 16;
            if (keyByte.length % base != 0) {
                int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);
                byte[] temp = new byte[groups * base];
                Arrays.fill(temp, (byte) 0);
                System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
                keyByte = temp;
            }
            // 初始化
            Security.addProvider(new BouncyCastleProvider());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding","BC");
            SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");
            AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
            parameters.init(new IvParameterSpec(ivByte));
            cipher.init( Cipher.DECRYPT_MODE, spec, parameters);// 初始化
            byte[] resultByte = cipher.doFinal(dataByte);
            if (null != resultByte && resultByte.length > 0) {
                String result = new String(resultByte, "UTF-8");
                return JSON.parseObject(result);
            }
        } catch (NoSuchAlgorithmException e) {
            logger.error(e.getMessage(), e);
        } catch (NoSuchPaddingException e) {
            logger.error(e.getMessage(), e);
        } catch (InvalidParameterSpecException e) {
            logger.error(e.getMessage(), e);
        } catch (IllegalBlockSizeException e) {
            logger.error(e.getMessage(), e);
        } catch (BadPaddingException e) {
            logger.error(e.getMessage(), e);
        } catch (UnsupportedEncodingException e) {
            logger.error(e.getMessage(), e);
        } catch (InvalidKeyException e) {
            logger.error(e.getMessage(), e);
        } catch (InvalidAlgorithmParameterException e) {
            logger.error(e.getMessage(), e);
        } catch (NoSuchProviderException e) {
            logger.error(e.getMessage(), e);
        }
        return null;

    }




    private JSONObject getSessionKeyOrOpenId(String code) {
        //微信端登录code
        String wxCode = code;
        String requestUrl = "https://api.weixin.qq.com/sns/jscode2session?appid=wxfa188a42d843a0b0&secret=0433593dd1887ea5381e6d01308f81ba&js_code="+code+"&grant_type=authorization_code";
        Map<String,String> requestUrlParam = new HashMap<String, String>(  );
//		requestUrlParam.put( "appid","wx16159fcc93b0400c" );//小程序appId
//		requestUrlParam.put( "secret","1403f2e207dfa2f1f348910626f5aa42" );
//		requestUrlParam.put( "js_code",wxCode );//小程序端返回的code
//		requestUrlParam.put( "grant_type","authorization_code" );//默认参数
//		//发送post请求读取调用微信接口获取openid用户唯一标识
//		String str = UrlUtil.sendPost( requestUrl,requestUrlParam );
//		JSONObject jsonObject = JSON.parseObject(UrlUtil.sendPost( requestUrl,requestUrlParam ));
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet(requestUrl);
        JSONObject jsonObject = null;

        try {
            HttpResponse response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            if(entity != null) {
                String result = EntityUtils.toString(entity,"UTF-8");
                jsonObject = JSONObject.parseObject(result);
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonObject;
    }

    @RequestMapping(value = "/testCancel", method = RequestMethod.GET)
    @ApiOperation(value = "核销逻辑测试", notes = "核销逻辑测试")
    public ResponseEntity<JSONObject> testCancel(
                                                 @RequestParam(value = "用户唯一标识",required = false) String unionId,
                                                 @RequestParam(value = "goodsId商品Id",required = false) Integer goodsId,
                                                 @RequestParam(value = "orderId订单Id",required = false) Integer orderId
    ) throws Exception {
        System.out.println(unionId+goodsId+orderId);
        ResponseEntity.BodyBuilder builder = ResponseUtils.getBodyBuilder();
        Example example = new Example(HfUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username",unionId);
        List<HfUser> hfUserList= hfUserMapper.selectByExample(example);
        if (hfUserList.size()==0){
            return builder.body(ResponseUtils.getResponseBody("请登录后操作"));
        }
        HfUser hfUser1=hfUserMapper.selectByPrimaryKey(hfUserList.get(0));
        System.out.println(hfUser1);
        if (hfUser1.getCancelId()==0){
            return builder.body(ResponseUtils.getResponseBody("对不起你不是核销员无法核销商品"));
        }
        System.out.println(hfUser1.getCancelId()+"hfUser1.getCancelId()");
        //判断核销的商品是否为自提商品
        if (hfGoodsMapper.selectByPrimaryKey(goodsId).getClaim().equals(0)){
            return builder.body(ResponseUtils.getResponseBody("该商品不是自提商品"));
        }
        //判断核销员是否为该商品的核销员
        Example example1 = new Example(cancel.class);
        Example.Criteria criteria1 = example1.createCriteria();
        criteria1.andEqualTo("userId",hfUserList.get(0).getId());
        List<cancel> cancelList= cancelsMapper.selectByExample(example1);
        HfGoods hfGoods = hfGoodsMapper.selectByPrimaryKey(goodsId);
        cancel cancel1= cancelsMapper.selectByPrimaryKey(cancelList.get(0));
        if (!hfGoods.getCancelId().equals(cancel1.getId())){
            return builder.body(ResponseUtils.getResponseBody("你不是该商品的核销员"));
        }

        //价格，根据订单id，设置订单状态
        Example example2 = new Example(HfOrdersDetail.class);
        Example.Criteria criteria2 = example2.createCriteria();
        System.out.println(1);
        criteria2.andEqualTo("ordersId",orderId);
        System.out.println(12);
        List<HfOrdersDetail> hfPriceList= hfOrdersDetailMapper.selectByExample(example2);
        System.out.println(123);
        HfOrdersDetail hfPrice = hfOrdersDetailMapper.selectByPrimaryKey(hfPriceList.get(0));
        System.out.println(hfPrice.getOrderDetailStatus());
        if (hfPrice.getOrderDetailStatus().equals("已完成")){
            return builder.body(ResponseUtils.getResponseBody("该订单已被核销"));
        }
        HfOrdersDetail hfOrdersDetail = new HfOrdersDetail();
        hfOrdersDetail.setId(hfPrice.getId());
        hfOrdersDetail.setOrderDetailStatus("已完成");
        hfOrdersDetailMapper.updateByPrimaryKeySelective(hfOrdersDetail);
        //添加核销记录
        CancelRecord cancelRecord = new CancelRecord();
        cancelRecord.setCreateDate(LocalDateTime.now());
        cancelRecord.setModifyDate(LocalDateTime.now());
        cancelRecord.setGoodsId(goodsId);
        cancelRecord.setCancelId(cancel1.getId());
        cancelRecord.setAmount(hfPrice.getPurchasePrice()*hfPrice.getPurchaseQuantity());
        hfLogMapper.insert(cancelRecord);
        //添加核销员核销额记录
        cancel cancel = new cancel();
        cancel.setId(cancel1.getId());
        cancel.setMoney(hfPrice.getPurchasePrice()*hfPrice.getPurchaseQuantity()+cancel1.getMoney());
        cancel.setPresentMoney(hfPrice.getPurchasePrice()*hfPrice.getPurchaseQuantity()+cancel1.getPresentMoney());
        cancelsMapper.updateByPrimaryKeySelective(cancel);
        return builder.body(ResponseUtils.getResponseBody("成功"));
    }
}