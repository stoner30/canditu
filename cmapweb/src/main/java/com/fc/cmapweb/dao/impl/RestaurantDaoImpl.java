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
import com.fc.cmapweb.vo.view.RestViewVo;

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

	@SuppressWarnings("unchecked")
	public List<RestViewVo> queryRestaurantByRestCatTypeId(int restCatTypeId, int bldgId) {
		
		String sql = "SELECT rest.REST_ID" + 
				" FROM restaurant rest" +
				" LEFT JOIN rest_cat rc ON rest.REST_ID = rc.REST_ID" +
				" LEFT JOIN rest_cat_type rct ON rc.RCT_ID = rct.RCT_ID" +
				" LEFT JOIN rest_bldg rb ON rest.REST_ID = rb.REST_ID" +
				" WHERE rb.BLDG_ID  = " + bldgId +
				" AND rc.RCT_ID = " + restCatTypeId;
		Query query = em.createNativeQuery(sql);
		List<Integer> restIdlist = query.getResultList();
		
		List<RestViewVo> list = new ArrayList<RestViewVo>();
		RestViewVo restViewVo = null;
		for(Integer restId : restIdlist) {
			
			restViewVo = new RestViewVo();
			restViewVo.setRestaurant(em.find(Restaurant.class, restId));
			priceRange(restViewVo, restViewVo.getRestaurant().getMinDlvyPr());
			
			sql = "SELECT count(oi.ORDER_NBR) AS amount FROM order_info oi" +
					" WHERE oi.ORDER_TIME >= DATE_SUB(NOW(), INTERVAL 31 DAY)" +
					" AND oi.REST_ID = " + restId;
			query = em.createNativeQuery(sql);
			Integer amount = Integer.valueOf(query.getSingleResult().toString());
			restViewVo.getRestaurant().setSalesVolume(amount);

			sql = "SELECT rt.RTT_ID" +
					" FROM rest_tag rt " +
					" LEFT JOIN rest_tag_type rtt ON rt.RTT_ID = rtt.RTT_ID" +
					" WHERE rt.REST_ID = " + restId;
			query = em.createNativeQuery(sql);
			List<Integer> restTagTypeIdList = query.getResultList();
			for(Integer restTagTypeId : restTagTypeIdList) {
				assignmentRestViewVo(restViewVo, restTagTypeId);
			}
			list.add(restViewVo);

		}
		
		return list;

	}

	private void assignmentRestViewVo(RestViewVo restViewVo, int restTagTypeId) {
		
		switch (restTagTypeId) {
		case DigitalConstant.ONE:
			restViewVo.setOnePart(true);
			break;
		case DigitalConstant.TWO:
			restViewVo.setEP(true);
			break;
		case DigitalConstant.THREE:
			restViewVo.setFavorable(true);
			break;
		case DigitalConstant.FOUR:
			restViewVo.setInvoice(true);
			break;
		default:
			break;
		}
		
	}
	
	private void priceRange(RestViewVo restViewVo, double price) {
		
		if(price < DigitalConstant.TEN) {
			restViewVo.setPriceRange("lt10");
		}
		else if(DigitalConstant.TEN <= price && price <= DigitalConstant.FIFTEEN) {
			restViewVo.setPriceRange("10to15");
		}
		else if(DigitalConstant.FIFTEEN <= price && price <= DigitalConstant.TWENTY) {
			restViewVo.setPriceRange("15to20");
		}
		else if(DigitalConstant.TWENTY <= price ) {
			restViewVo.setPriceRange("20more");
		}
	}

}
