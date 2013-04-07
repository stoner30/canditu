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
@Table(name = "DISH_INFO")
public class DishInfo implements Serializable {

	private static final long serialVersionUID = 336789113338201768L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DI_ID")
    private Integer diId;
	
    @Column(name = "DISH_ID")
    private Integer dishId;
    
    @Column(name = "DI_VAL")
    private String diVal;
    
    @JoinColumn(name = "DIT_ID", referencedColumnName = "DIT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private StubDishInfoType stubDishInfoType;

    public DishInfo() {
    }

    public DishInfo(Integer diId) {
        this.diId = diId;
    }

    public DishInfo(Integer diId, int dishId, String diVal) {
        this.diId = diId;
        this.dishId = dishId;
        this.diVal = diVal;
    }

	public Integer getDiId() {
    	return diId;
    }

	public void setDiId(Integer diId) {
    	this.diId = diId;
    }

	public Integer getDishId() {
    	return dishId;
    }

	public void setDishId(Integer dishId) {
    	this.dishId = dishId;
    }

	public String getDiVal() {
    	return diVal;
    }

	public void setDiVal(String diVal) {
    	this.diVal = diVal;
    }

	public StubDishInfoType getStubDishInfoType() {
    	return stubDishInfoType;
    }

	public void setStubDishInfoType(StubDishInfoType stubDishInfoType) {
    	this.stubDishInfoType = stubDishInfoType;
    }
    
}
