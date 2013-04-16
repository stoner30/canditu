package com.fc.cmapweb.mgr;

import java.util.List;
import com.fc.cmapweb.vo.Restaurant;

public interface IRestaurantMgr {
	
	//新开张的
	public List<Restaurant> queryNewlyOpenedRestaurantByBldgId(int bldgId);
	
	//销量不错的
	public List<Restaurant> querySalesOfGoodListByBldgId(int bldgId);

}
