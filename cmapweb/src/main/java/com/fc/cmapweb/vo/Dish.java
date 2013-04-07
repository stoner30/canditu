package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DISH")
public class Dish implements Serializable {

	private static final long serialVersionUID = -7442884768910779514L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DISH_ID")
    private Integer dishId;
	
    @Column(name = "DISH_NAME")
    private String dishName;
    
    @Column(name = "DISH_PRICE")
    private Float dishPrice;
    
    @Column(name = "PRMT_PRICE")
    private Float prmtPrice;
    
    @Column(name = "IS_COMBO")
    private Boolean isCombo;
    
    @Column(name = "IS_SHOWN")
    private Boolean isShown;
    
    @Column(name = "HAS_OPTIONS")
    private Boolean hasOptions;
    
    @Column(name = "EVAL_POINT")
    private Integer evalPoint;
    
    @Column(name = "EVAL_CONT")
    private Integer evalCont;
    
    @Column(name = "MS_CONT")
    private Integer msCont;
    
    @Column(name = "DS_CONT")
    private Integer dsCont;
    
    @Column(name = "DR_VAL1")
    private String drVal1;
    
    @Column(name = "DR_VAL2")
    private String drVal2;
    
    @JoinColumn(name = "DR_ID", referencedColumnName = "DR_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private StubDishRule stubDishRule;
    
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restaurant restaurant;
    
    @JoinColumn(name = "DCT_ID", referencedColumnName = "DCT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DishCatType dishCatType;
    
    public Dish() {
    }

    public Dish(Integer dishId) {
        this.dishId = dishId;
    }

    public Dish(Integer dishId, String dishName, Float dishPrice, Float prmtPrice, Boolean isCombo, Boolean isShown, Boolean hasOptions, Integer evalPoint, Integer evalCont, Integer msCont, Integer dsCont) {
        this.dishId = dishId;
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        this.prmtPrice = prmtPrice;
        this.isCombo = isCombo;
        this.isShown = isShown;
        this.hasOptions = hasOptions;
        this.evalPoint = evalPoint;
        this.evalCont = evalCont;
        this.msCont = msCont;
        this.dsCont = dsCont;
    }

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

	public Float getDishPrice() {
    	return dishPrice;
    }

	public void setDishPrice(Float dishPrice) {
    	this.dishPrice = dishPrice;
    }

	public Float getPrmtPrice() {
    	return prmtPrice;
    }

	public void setPrmtPrice(Float prmtPrice) {
    	this.prmtPrice = prmtPrice;
    }

	public Boolean getIsCombo() {
    	return isCombo;
    }

	public void setIsCombo(Boolean isCombo) {
    	this.isCombo = isCombo;
    }

	public Boolean getIsShown() {
    	return isShown;
    }

	public void setIsShown(Boolean isShown) {
    	this.isShown = isShown;
    }

	public Boolean getHasOptions() {
    	return hasOptions;
    }

	public void setHasOptions(Boolean hasOptions) {
    	this.hasOptions = hasOptions;
    }

	public Integer getEvalPoint() {
    	return evalPoint;
    }

	public void setEvalPoint(Integer evalPoint) {
    	this.evalPoint = evalPoint;
    }

	public Integer getEvalCont() {
    	return evalCont;
    }

	public void setEvalCont(Integer evalCont) {
    	this.evalCont = evalCont;
    }

	public Integer getMsCont() {
    	return msCont;
    }

	public void setMsCont(Integer msCont) {
    	this.msCont = msCont;
    }

	public Integer getDsCont() {
    	return dsCont;
    }

	public void setDsCont(Integer dsCont) {
    	this.dsCont = dsCont;
    }

	public String getDrVal1() {
    	return drVal1;
    }

	public void setDrVal1(String drVal1) {
    	this.drVal1 = drVal1;
    }

	public String getDrVal2() {
    	return drVal2;
    }

	public void setDrVal2(String drVal2) {
    	this.drVal2 = drVal2;
    }

	public StubDishRule getStubDishRule() {
    	return stubDishRule;
    }

	public void setStubDishRule(StubDishRule stubDishRule) {
    	this.stubDishRule = stubDishRule;
    }

	public Restaurant getRestaurant() {
    	return restaurant;
    }

	public void setRestaurant(Restaurant restaurant) {
    	this.restaurant = restaurant;
    }

	public DishCatType getDishCatType() {
    	return dishCatType;
    }

	public void setDishCatType(DishCatType dishCatType) {
    	this.dishCatType = dishCatType;
    }
    
}
