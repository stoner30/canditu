package com.fc.cmapweb.mgr;

import java.util.List;
import com.fc.cmapweb.vo.Restaurant;
import com.fc.cmapweb.vo.view.RestViewVo;

public interface IRestaurantMgr {
	
	//新开张的
	public List<Restaurant> queryNewlyOpenedRestaurantByBldgId(int bldgId);
	
	//销量不错的
	public List<Restaurant> querySalesOfGoodListByBldgId(int bldgId);

	//根据分类查询餐馆list
	public List<RestViewVo> queryRestaurantByRestCatTypeId(int restCatTypeId, int bldgId);

}
