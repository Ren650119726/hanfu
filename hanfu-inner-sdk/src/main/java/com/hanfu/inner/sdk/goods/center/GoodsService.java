package com.hanfu.inner.sdk.goods.center;

import java.util.List;
import com.hanfu.inner.model.product.center.HfGoodsDisplay;

public interface GoodsService {

	public List<HfGoodsDisplay> findAllGoods();
	
	public Integer[] findAllPicture();
	
//	public void getPicture();
}