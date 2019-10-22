package com.hanfu.product.center.manual.dao;

import java.util.List;

import com.hanfu.product.center.manual.model.Categories;
import com.hanfu.product.center.manual.model.HfGoodsDisplay;
import com.hanfu.product.center.manual.model.UserInfo;
import com.hanfu.product.center.model.HfGoods;

public interface HfGoodsDao {
	
	public List<HfGoodsDisplay> selectAllGoods(Integer stoneId);
	
	public List<HfGoodsDisplay> selectAllGoodsPartInfo(Integer stoneId);
	
	public List<HfGoods> selectByStoneId(Integer stoneId);
	
	public HfGoodsDisplay selectGoodsInfo(Integer goodsId);
	
	public HfGoodsDisplay selectGoodsPartInfo(Integer goodsId);
	
	public Integer updateGoods(HfGoods hfGoods);
	
}