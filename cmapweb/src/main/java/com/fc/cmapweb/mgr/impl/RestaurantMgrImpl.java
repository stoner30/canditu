package com.fc.cmapweb.mgr.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fc.cmapweb.dao.IRestaurantDao;
import com.fc.cmapweb.mgr.IRestaurantMgr;
import com.fc.cmapweb.vo.Restaurant;
import com.fc.cmapweb.vo.view.RestViewVo;

@Service("restaurantMgr")
public class RestaurantMgrImpl implements IRestaurantMgr {

	@Autowired
	private IRestaurantDao restaurantDao;

	public List<Restaurant> queryNewlyOpenedRestaurantByBldgId(int bldgId) {

		List<Restaurant> list = restaurantDao.queryNewlyOpenedRestaurantByBldgId(bldgId);
		return list;

	}

	public List<Restaurant> querySalesOfGoodListByBldgId(int bldgId) {

		List<Restaurant> list = restaurantDao.querySalesOfGoodListByBldgId(bldgId);
		return list;

	}

	public List<RestViewVo> queryRestaurantByRestCatTypeId(int restCatTypeId,
			int bldgId) {

		List<RestViewVo> list = restaurantDao.queryRestaurantByRestCatTypeId(restCatTypeId, bldgId);
		return list;

	}

	
}
