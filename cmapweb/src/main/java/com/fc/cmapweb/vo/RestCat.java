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
@Table(name = "REST_CAT")
public class RestCat implements Serializable {

	private static final long serialVersionUID = 6009710575122618202L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RC_ID")
    private Integer rcId;
	
    @JoinColumn(name = "RCT_ID", referencedColumnName = "RCT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RestCatType restCatType;
    
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restaurant restaurant;

    public RestCat() {
    }

    public RestCat(Integer rcId) {
        this.rcId = rcId;
    }

	public Integer getRcId() {
    	return rcId;
    }

	public void setRcId(Integer rcId) {
    	this.rcId = rcId;
    }

	public RestCatType getRestCatType() {
    	return restCatType;
    }

	public void setRestCatType(RestCatType restCatType) {
    	this.restCatType = restCatType;
    }

	public Restaurant getRestaurant() {
    	return restaurant;
    }

	public void setRestaurant(Restaurant restaurant) {
    	this.restaurant = restaurant;
    }
    
}
