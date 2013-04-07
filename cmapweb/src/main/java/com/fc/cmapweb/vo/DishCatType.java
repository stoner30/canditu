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
@Table(name = "DISH_CAT_TYPE")
public class DishCatType implements Serializable {

    private static final long serialVersionUID = 3463693998670622267L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DCT_ID")
    private Integer dctId;

    @Column(name = "DC_NAME")
    private String dcName;

    @Column(name = "DC_ORDER")
    private Integer dcOrder;
    
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restaurant restaurant;

    public DishCatType() {
    }

    public DishCatType(Integer dctId) {
        this.dctId = dctId;
    }

    public DishCatType(Integer dctId, String dcName, Integer dcOrder) {
        this.dctId = dctId;
        this.dcName = dcName;
        this.dcOrder = dcOrder;
    }

	public Integer getDctId() {
    	return dctId;
    }

	public void setDctId(Integer dctId) {
    	this.dctId = dctId;
    }

	public String getDcName() {
    	return dcName;
    }

	public void setDcName(String dcName) {
    	this.dcName = dcName;
    }

	public Integer getDcOrder() {
    	return dcOrder;
    }

	public void setDcOrder(Integer dcOrder) {
    	this.dcOrder = dcOrder;
    }

	public Restaurant getRestaurant() {
    	return restaurant;
    }

	public void setRestaurant(Restaurant restaurant) {
    	this.restaurant = restaurant;
    }
	
}
