package com.fc.cmapweb.dao;

import java.util.List;
import com.fc.cmapweb.vo.Restaurant;

public interface IRestaurantDao {

	//新开张的
	public List<Restaurant> queryNewlyOpenedRestaurantByBldgId(int bldgId);
	
	//销量不错的
	public List<Restaurant> querySalesOfGoodListByBldgId(int bldgId);

}
