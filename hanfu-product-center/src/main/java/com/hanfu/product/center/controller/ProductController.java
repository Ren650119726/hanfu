package com.hanfu.product.center.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.hanfu.product.center.dao.HfCategoryMapper;
import com.hanfu.product.center.dao.HfGoodsMapper;
import com.hanfu.product.center.dao.ProductInfoMapper;
import com.hanfu.product.center.dao.ProductInstanceMapper;
import com.hanfu.product.center.dao.ProductMapper;
import com.hanfu.product.center.dao.ProductSpecMapper;
import com.hanfu.product.center.manual.dao.ManualDao;
import com.hanfu.product.center.model.HfCategory;
import com.hanfu.product.center.model.HfCategoryExample;
import com.hanfu.product.center.model.HfGoodsExample;
import com.hanfu.product.center.model.Product;
import com.hanfu.product.center.model.ProductExample;
import com.hanfu.product.center.model.ProductInfo;
import com.hanfu.product.center.model.ProductInfoExample;
import com.hanfu.product.center.model.ProductInstance;
import com.hanfu.product.center.model.ProductInstanceExample;
import com.hanfu.product.center.model.ProductSpec;
import com.hanfu.product.center.model.ProductSpecExample;
import com.hanfu.product.center.request.CategoryRequest;
import com.hanfu.product.center.request.ProductInfoRequest;
import com.hanfu.product.center.request.ProductInstanceRequest;
import com.hanfu.product.center.request.ProductRequest;
import com.hanfu.product.center.request.ProductSpecRequest;
import com.hanfu.utils.response.handler.ResponseEntity;
import com.hanfu.utils.response.handler.ResponseEntity.BodyBuilder;
import com.hanfu.utils.response.handler.ResponseUtils;
import com.hanfu.product.center.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/product")
@Api
public class ProductController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private HfCategoryMapper hfCategoryMapper;

    @Autowired
    private ProductMapper productMapper;
    
    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Autowired
    private ProductSpecMapper productSpecMapper;

    @Autowired
    private ProductInstanceMapper productInstanceMapper;
    
    @Autowired
    private ProductService productService;

    @Autowired
    private ManualDao manualDao;
    
    @Autowired
    private HfGoodsMapper hfGoodsMapper;

    
    @ApiOperation(value = "获取类目列表", notes = "获取系统支持的商品类目")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "parentCategoryId", value = "上级的类目id", required = false,
                    type = "Integer"),
            @ApiImplicitParam(paramType = "query", name = "categoryId", value = "类目id", required = false,
            type = "Integer"),
            @ApiImplicitParam(paramType = "query", name = "levelId", value = "类目级别", required = false,
                    type = "Integer") })
    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public ResponseEntity<JSONObject> listCategory(
            @RequestParam(name = "parentCategoryId", required = false, defaultValue = "-1") Integer parentCategoryId,            
            @RequestParam(name = "categoryId", required = false) Integer categoryId,
            @RequestParam(name = "levelId", required = false, defaultValue = "0") Integer levelId) throws JSONException {
        BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
        HfCategoryExample example = new HfCategoryExample();
        example.createCriteria().andParentCategoryIdEqualTo(parentCategoryId);
        if (categoryId != null) {
            example.clear();
            example.createCriteria().andIdEqualTo(categoryId);
        }
        return builder.body(ResponseUtils.getResponseBody(manualDao.selectCategories()));
    }
    
    @ApiOperation(value = "添加类目", notes = "添加系统支持的商品类目")
    @RequestMapping(value = "/addCategory", method = RequestMethod.POST)
    public ResponseEntity<JSONObject> AddCategory(CategoryRequest request) throws JSONException {
        BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
        HfCategory category = new HfCategory();
        category.setLevelId(request.getLevelId());
        category.setHfName(request.getCategory());
        category.setParentCategoryId(request.getParentCategoryId());
        return builder.body(ResponseUtils.getResponseBody(hfCategoryMapper.insert(category)));
    }
    
    
    @ApiOperation(value = "获取商品列表", notes = "根据类目id查询商品列表")
    @RequestMapping(value = "/categoryId", method = RequestMethod.GET)
    @ApiImplicitParams({ @ApiImplicitParam(paramType = "query", name = "categoryId", value = "类目ID", required = true,
            type = "Integer") })
    public ResponseEntity<JSONObject> listProductBycategoryId(@RequestParam(name = "categoryId") Integer categoryId) throws JSONException {
        BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
        ProductInfoExample e = new ProductInfoExample();
        e.createCriteria().andCategoryIdEqualTo(categoryId);
        return builder.body(ResponseUtils.getResponseBody(productInfoMapper.selectByExample(e)));
    }

    @ApiOperation(value = "获取商品列表", notes = "根据商家获取商家录入的商品列表")
    @RequestMapping(value = "/byBossId", method = RequestMethod.GET)
    @ApiImplicitParams({ @ApiImplicitParam(paramType = "query", name = "bossId", value = "商家ID", required = true,
            type = "Integer") })
    public ResponseEntity<JSONObject> listProduct(@RequestParam(name = "bossId") Integer bossId) throws JSONException {
        BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
        ProductExample example = new ProductExample();
        example.createCriteria().andBossIdEqualTo(bossId);
        return builder.body(ResponseUtils.getResponseBody(productMapper.selectByExample(example)));
    }
    
    @ApiOperation(value = "添加商品列表", notes = "根据商家录入的商品")
    @RequestMapping(value = "/addproduct", method = RequestMethod.POST)
    public ResponseEntity<JSONObject> addProduct(ProductRequest request) throws JSONException {
        BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
        Product product = new Product();
        product.setBossId(request.getBossId());
        product.setBrandId(request.getBrandId());
        product.setCategoryId(request.getCategoryId());
        product.setHfName(request.getHfName());
        product.setLastModifier(request.getLastModifier());
        product.setProductDesc(request.getProductDesc());
        return builder.body(ResponseUtils.getResponseBody(productMapper.insert(product)));
    }
    
    @ApiOperation(value = "删除商品列表", notes = "根据商品id删除商品列表")
    @RequestMapping(value = "/deleteProductId", method = RequestMethod.GET)
    @ApiImplicitParams({ @ApiImplicitParam(paramType = "query", name = "productId", value = "商品ID", required = true,
            type = "Integer") })
    public ResponseEntity<JSONObject> deleteProduct(@RequestParam(name = "productId") Integer productId) throws JSONException {
        BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
        ProductExample example = new ProductExample();
        return builder.body(ResponseUtils.getResponseBody(productMapper.deleteByPrimaryKey(productId)));
    }
    
    @ApiOperation(value = "选中删除商品列表", notes = "根据商品id删除商品列表")
    @RequestMapping(value = "/deleteSelectProductId", method = RequestMethod.POST)
    @ApiImplicitParams({ @ApiImplicitParam(paramType = "query", name = "productId", value = "商品ID", required = true,
            type = "Integer") })
    public ResponseEntity<JSONObject> deleteAllProduct(@RequestParam(name = "productId") Integer productId) throws JSONException {
        BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
        
        return builder.body(ResponseUtils.getResponseBody(productMapper.deleteByPrimaryKey(productId)));
    }
  
    
    @ApiOperation(value = "获取商品属性", notes = "根据商品id获取商品的属性值")
    @RequestMapping(value = "/attributes", method = RequestMethod.GET)
    @ApiImplicitParams({ @ApiImplicitParam(paramType = "query", name = "productId", value = "商家ID", required = true,
            type = "Integer") })
    public ResponseEntity<JSONObject> getProductInfo(@RequestParam(name = "productId") Integer productId)
            throws JSONException {
        BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
        ProductInfoExample example = new ProductInfoExample();
        example.createCriteria().andProductIdEqualTo(productId);
        return builder.body(ResponseUtils.getResponseBody(productInfoMapper.selectByExample(example)));
    }

    @ApiOperation(value = "添加商品属性", notes = "为某一个商品添加属性")
    @RequestMapping(value = "/addAttribute", method = RequestMethod.POST)
    public ResponseEntity<JSONObject> addProductInfo(ProductInfoRequest request) throws JSONException {
        BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
        ProductInfo item = new ProductInfo();
        item.setHfName(request.getHfName());
        item.setHfRemark(request.getHfRemark());
        item.setHfValue(request.getInfoValue());
        item.setLastModifier(request.getLastModifier());
        item.setProductId(request.getProductId());
        return builder.body(ResponseUtils.getResponseBody(productInfoMapper.insert(item)));
    }

    @ApiOperation(value = "获取商品规格", notes = "根据商品id获取商品的规格描述")
    @RequestMapping(value = "/specifies", method = RequestMethod.GET)
    @ApiImplicitParams({ @ApiImplicitParam(paramType = "query", name = "productId", value = "商品ID", required = true,
            type = "Integer") })
    public ResponseEntity<JSONObject> getProductSpec(@RequestParam(name = "productId") Integer productId)
            throws JSONException {
        BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
        ProductSpecExample example = new ProductSpecExample();
        example.createCriteria().andProductIdEqualTo(productId);
        return builder.body(ResponseUtils.getResponseBody(productSpecMapper.selectByExample(example)));
    }

    @ApiOperation(value = "添加商品规格", notes = "为某一个商品添加规格")
    @RequestMapping(value = "/addSpecify", method = RequestMethod.POST)
    public ResponseEntity<JSONObject> addProductSpec(ProductSpecRequest request) throws JSONException {
        BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
        ProductSpec item = new ProductSpec();
        item.setProductId(request.getProductId());
        item.setHfName(request.getHfName());
        item.setSpecType(request.getSpecType());
        item.setSpecUnit(request.getSpecUnit());
        item.setSpecValue(request.getSpecValue());
        item.setCategorySpecId(request.getCategorySpecId());
        return builder.body(ResponseUtils.getResponseBody(productSpecMapper.insert(item)));
    }

    @ApiOperation(value = "获取商品所在店铺的信息", notes = "根据商品获取商品所在的店铺信息")
    @RequestMapping(value = "/stones", method = RequestMethod.GET)
    @ApiImplicitParams({ @ApiImplicitParam(paramType = "query", name = "productId", value = "商家ID", required = true,
            type = "Integer") })
    public ResponseEntity<JSONObject> getStones(@RequestParam(name = "productId") Integer productId)
            throws JSONException {
        BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
        ProductSpecExample example = new ProductSpecExample();
        example.createCriteria().andProductIdEqualTo(productId);
//        TODO @sun 店鋪裏的商品列別哦 在manuldao裏頂一個方法 然後使用 一個複雜sql實現該功能
//        return builder.body(ResponseUtils.getResponseBody(storeDao.selectStoreById(productId)));
        return null;
    }

    @ApiOperation(value = "获取店铺所有商品", notes = "根據商鋪id獲取商鋪的所有商品")
    @RequestMapping(value = "/byStoneId", method = RequestMethod.GET)
    @ApiImplicitParams({ @ApiImplicitParam(paramType = "query", name = "stoneId", value = "商鋪id", required = true,
            type = "Integer") })
    public ResponseEntity<JSONObject> getStoneProduct(@RequestParam(name = "stoneId") Integer stoneId)
            throws JSONException {
        BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
        ProductInstanceExample example = new ProductInstanceExample();
        example.createCriteria().andStoneIdEqualTo(stoneId);
//        TODO @sun 這個之前給你説過的啊  在manuldao中寫一個複雜sql實現功能
//        return builder.body(ResponseUtils.getResponseBody(productDao.selectProductById(stoneId)));
        return null;
    }

    @ApiOperation(value = "商品添加到店铺", notes = "将商品添加到某一个店铺")
    @RequestMapping(value = "/addToStone", method = RequestMethod.POST)
    public ResponseEntity<JSONObject> addStone(ProductInstanceRequest request) throws JSONException {
        BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
        ProductInstance item = new ProductInstance();
        item.setProductId(request.getProductId());
        item.setStoneId(request.getStoneId());
        item.setLastModifier(request.getLastModifier());
        return builder.body(ResponseUtils.getResponseBody(productInstanceMapper.insert(item)));
    }
    
    @ApiOperation(value = "删除店铺内的物品", notes = "将店铺内的一个物品删除")
    @RequestMapping(value = "/deleteStone", method = RequestMethod.GET)
    public ResponseEntity<JSONObject> deleteStone(ProductInstanceRequest request) throws JSONException {
        BodyBuilder builder = ResponseUtils.getBodyBuilder(HttpStatus.OK);
        HfGoodsExample e = new HfGoodsExample();
        e.createCriteria().andStoneIdEqualTo(request.getStoneId()).andProductIdEqualTo(request.getProductId());
        return builder.body(ResponseUtils.getResponseBody(hfGoodsMapper.deleteByExample(e)));
    }

}
