package com.hanfu.product.center.manual.dao;

import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import com.hanfu.product.center.manual.model.AwardInfo;
import com.hanfu.product.center.manual.model.Categories;
import com.hanfu.product.center.manual.model.HfGoodsDisplay;
import com.hanfu.product.center.manual.model.UserInfo;
import com.hanfu.product.center.model.HfGoods;


@Repository
public class HfGoodsDaoImpl implements HfGoodsDao {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<com.hanfu.inner.model.product.center.HfGoodsDisplay> selectAllGoodsInfo() {
        List<com.hanfu.inner.model.product.center.HfGoodsDisplay> result = sqlSessionTemplate.selectList("selectAllGoodsInfo");
        return result;
    }

    @Override
    public List<HfGoodsDisplay> selectAllGoods(Integer stoneId) {
        List<HfGoodsDisplay> result = sqlSessionTemplate.selectList("selectAllGoods", stoneId);
        return result;
    }

    @Override
    public List<HfGoodsDisplay> selectAllGoodsPartInfo(Integer stoneId) {
        List<HfGoodsDisplay> result = sqlSessionTemplate.selectList("selectAllGoodsPartInfo", stoneId);
        return result;
    }

    @Override
    public List<HfGoods> selectByStoneId(Integer stoneId) {
        List<HfGoods> result = sqlSessionTemplate.selectList("selectByStoneId", stoneId);
        return result;
    }

    @Override
    public HfGoodsDisplay selectGoodsInfo(Integer goodsId) {
        HfGoodsDisplay hfGoodsDisplay = sqlSessionTemplate.selectOne("selectGoodsInfo", goodsId);
        return hfGoodsDisplay;
    }

    @Override
    public HfGoodsDisplay selectGoodsPartInfo(Integer goodsId) {
        HfGoodsDisplay hfGoodsDisplay = sqlSessionTemplate.selectOne("selectGoodsPartInfo", goodsId);
        return hfGoodsDisplay;
    }

    @Override
    public Integer updateGoods(HfGoods hfGoods) {
        Integer row = sqlSessionTemplate.update("updateGoods", hfGoods);
        return row;
    }

    @Override
    public List<HfGoodsDisplay> selectProductBycategoryIdOrProductName(HfGoodsDisplay hfGoodsDisplay) {
        List<HfGoodsDisplay> list = sqlSessionTemplate.selectList("selectProductBycategoryIdOrProductName", hfGoodsDisplay);
        return list;
    }

	@Override
	public List<HfGoodsDisplay> selectPrice() {
		 List<HfGoodsDisplay> list = sqlSessionTemplate.selectOne("selectPrice");
		return list;
	}

	@Override
	public List<HfGoodsDisplay> selectPriceDec() {
		 List<HfGoodsDisplay> list = sqlSessionTemplate.selectOne("selectPriceDec");
		return list;
	}

	@Override
	public List<HfGoodsDisplay> selectList(ProductForValue productForValue) {
		 List<HfGoodsDisplay> list = sqlSessionTemplate.selectOne("selectList");
		return list;
	}

//	@Override
//	public Integer insertAwardInfo(AwardInfo awardInfo) {
//		Integer row = sqlSessionTemplate.insert("insertAwardInfo", awardInfo);
//		return null;
//	}

}
