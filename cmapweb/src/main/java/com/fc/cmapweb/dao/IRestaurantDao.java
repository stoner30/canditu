package com.fc.cmapweb.dao;

import java.util.List;
import com.fc.cmapweb.vo.Restaurant;
import com.fc.cmapweb.vo.view.RestViewVo;

public interface IRestaurantDao {

	//新开张的list
	public List<Restaurant> queryNewlyOpenedRestaurantByBldgId(int bldgId);
	
	//销量不错的餐馆list
	public List<Restaurant> querySalesOfGoodListByBldgId(int bldgId);

	//根据分类查询餐馆list
	public List<RestViewVo> queryRestaurantByRestCatTypeId(int restCatTypeId, int bldgId);

	//点击更多按钮后显示按销量排序的所有餐馆
	public List<RestViewVo> queryALLSalesOfGoodListByBldgId_Return_RestViewVo(int bldgId);

}
