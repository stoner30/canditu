package com.fc.cmapweb.vo.view;

import com.fc.cmapweb.vo.Restaurant;

public class RestViewVo {


	private Restaurant restaurant;

	//一份起送
	private boolean isOnePart;
	
	//环保餐盒
	private boolean isEP;
	
	//优惠活动
	private boolean isFavorable;
	
	//提供发票
	private boolean isInvoice;

	//价格区间
	private String priceRange;
	
	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public boolean getIsOnePart() {
		return isOnePart;
	}

	public void setOnePart(boolean isOnePart) {
		this.isOnePart = isOnePart;
	}

	public boolean getIsEP() {
		return isEP;
	}

	public void setEP(boolean isEP) {
		this.isEP = isEP;
	}

	public boolean getIsFavorable() {
		return isFavorable;
	}

	public void setFavorable(boolean isFavorable) {
		this.isFavorable = isFavorable;
	}

	public boolean getIsInvoice() {
		return isInvoice;
	}

	public void setInvoice(boolean isInvoice) {
		this.isInvoice = isInvoice;
	}

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}
	
}
