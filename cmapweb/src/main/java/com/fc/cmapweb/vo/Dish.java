package com.fc.cmapweb.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dish")
public class Dish implements Serializable {

	private static final long serialVersionUID = 8151310717863288757L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DISH_ID")
    private Integer dishId;
    
    @Column(name = "DISH_NAME")
    private String dishName;
    
    @Column(name = "DISH_PRICE")
    private BigDecimal dishPrice;
    
    @Column(name = "IS_PROMOTION")
    private boolean isPromotion;
    
    @Column(name = "DISH_PROMOTION_PRICE")
    private BigDecimal dishPromotionPrice;
    
    @Column(name = "DISH_DESC")
    private String dishDesc;
    
    @Column(name = "ENABLED")
    private boolean enabled;
    
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false)
    private Restaurant restId;
    
    @JoinColumn(name = "DISH_TYPE_ID", referencedColumnName = "DISH_TYPE_ID")
    @ManyToOne(optional = false)
    private DishType dishTypeId;

	public Integer getDishId() {
		return dishId;
	}

	public void setDishId(Integer dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public BigDecimal getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(BigDecimal dishPrice) {
		this.dishPrice = dishPrice;
	}

	public boolean isPromotion() {
		return isPromotion;
	}

	public void setPromotion(boolean isPromotion) {
		this.isPromotion = isPromotion;
	}

	public BigDecimal getDishPromotionPrice() {
		return dishPromotionPrice;
	}

	public void setDishPromotionPrice(BigDecimal dishPromotionPrice) {
		this.dishPromotionPrice = dishPromotionPrice;
	}

	public String getDishDesc() {
		return dishDesc;
	}

	public void setDishDesc(String dishDesc) {
		this.dishDesc = dishDesc;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Restaurant getRestId() {
		return restId;
	}

	public void setRestId(Restaurant restId) {
		this.restId = restId;
	}

	public DishType getDishTypeId() {
		return dishTypeId;
	}

	public void setDishTypeId(DishType dishTypeId) {
		this.dishTypeId = dishTypeId;
	}
    
}
