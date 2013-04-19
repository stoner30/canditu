package com.fc.cmapweb.dao.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.fc.cmapweb.constant.DigitalConstant;
import com.fc.cmapweb.dao.CmapBaseDao;
import com.fc.cmapweb.dao.IRestaurantDao;
import com.fc.cmapweb.vo.Restaurant;

@Repository("restaurantDao")
public class RestaurantDaoImpl extends CmapBaseDao implements IRestaurantDao {

	public List<Restaurant> queryNewlyOpenedRestaurantByBldgId(int bldgId) {

		StringBuffer hql = new StringBuffer("FROM Restaurant WHERE isNewly = true");
		TypedQuery<Restaurant> tq = em.createQuery(hql.toString(), Restaurant.class);
		
		return tq.getResultList();

	}

	@SuppressWarnings("unchecked")
	public List<Restaurant> querySalesOfGoodListByBldgId(int bldgId) {

		String sql = "SELECT count(oi.ORDER_NBR) AS amount ,oi.REST_ID AS REST_ID from order_info oi " +
				"WHERE oi.BLDG_ID = " + bldgId + " 	AND oi.ORDER_TIME >= DATE_SUB(NOW(), INTERVAL 31 DAY) GROUP BY oi.REST_ID ORDER BY amount desc";
		Query query = em.createNativeQuery(sql);

		List<Object[]> list = query.getResultList();
		List<Restaurant> restList = new ArrayList<>();

		Restaurant restaurant = null;
		for(Object[] array : list) {
			restaurant = em.find(Restaurant.class, (Integer)array[DigitalConstant.ONE]);
			restaurant.setSalesVolume(Integer.valueOf(array[DigitalConstant.ZERO].toString()));
			restList.add(restaurant);
		}

		return restList;

	}
	
}
