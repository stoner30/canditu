package com.fc.cmapweb.vo;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "dish")
public class Dish implements Serializable {

	private static final long serialVersionUID = -5587791105722850521L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dish_id")
    private Integer dishId;
	
    @Column(name = "dish_name")
    private String dishName;
    
    @Column(name = "dish_price")
    private BigDecimal dishPrice;
    
    @Column(name = "prmt_price")
    private BigDecimal prmtPrice;
    
    @Column(name = "is_combo")
    private boolean isCombo;
    
    @Column(name = "is_shown")
    private boolean isShown;
    
    @Column(name = "has_options")
    private boolean hasOptions;
    
    @Column(name = "dish_desc")
    private String dishDesc;
    
    @Column(name = "eval_point")
    private int evalPoint;
    
    @Column(name = "eval_cont")
    private int evalCont;
    
    @Column(name = "ms_cont")
    private int msCont;
    
    @Column(name = "ds_cont")
    private int dsCont;
    
    @Column(name = "dr_val")
    private Integer drVal;
    
    @JoinColumn(name = "rest_id", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restaurant restaurant;
    
    @JoinColumn(name = "dr_id", referencedColumnName = "dr_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private StubDishRule stubDishRule;
    
    @JoinColumn(name = "dct_id", referencedColumnName = "dct_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DishCatType dishCatType;

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

    public BigDecimal getPrmtPrice() {
        return prmtPrice;
    }

    public void setPrmtPrice(BigDecimal prmtPrice) {
        this.prmtPrice = prmtPrice;
    }

    public boolean getIsCombo() {
        return isCombo;
    }

    public void setIsCombo(boolean isCombo) {
        this.isCombo = isCombo;
    }

    public boolean getIsShown() {
        return isShown;
    }

    public void setIsShown(boolean isShown) {
        this.isShown = isShown;
    }

    public boolean getHasOptions() {
        return hasOptions;
    }

    public void setHasOptions(boolean hasOptions) {
        this.hasOptions = hasOptions;
    }

    public String getDishDesc() {
        return dishDesc;
    }

    public void setDishDesc(String dishDesc) {
        this.dishDesc = dishDesc;
    }

    public int getEvalPoint() {
        return evalPoint;
    }

    public void setEvalPoint(int evalPoint) {
        this.evalPoint = evalPoint;
    }

    public int getEvalCont() {
        return evalCont;
    }

    public void setEvalCont(int evalCont) {
        this.evalCont = evalCont;
    }

    public int getMsCont() {
        return msCont;
    }

    public void setMsCont(int msCont) {
        this.msCont = msCont;
    }

    public int getDsCont() {
        return dsCont;
    }

    public void setDsCont(int dsCont) {
        this.dsCont = dsCont;
    }

    public Integer getDrVal() {
        return drVal;
    }

    public void setDrVal(Integer drVal) {
        this.drVal = drVal;
    }

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public StubDishRule getStubDishRule() {
		return stubDishRule;
	}

	public void setStubDishRule(StubDishRule stubDishRule) {
		this.stubDishRule = stubDishRule;
	}

	public DishCatType getDishCatType() {
		return dishCatType;
	}

	public void setDishCatType(DishCatType dishCatType) {
		this.dishCatType = dishCatType;
	}

}
