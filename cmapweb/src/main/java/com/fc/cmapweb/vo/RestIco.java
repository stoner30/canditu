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
@Table(name = "REST_ICO")
public class RestIco implements Serializable {

	private static final long serialVersionUID = 217834179212383417L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RI_ID")
    private Integer riId;
    
    @Column(name = "RIT_ID")
    private String ritId;
    
    @Column(name = "IS_ALL")
    private Boolean isAll;
    
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restaurant restaurant;

    public RestIco() {
    }

    public RestIco(Integer riId) {
        this.riId = riId;
    }

    public RestIco(Integer riId, String ritId, Boolean isAll) {
        this.riId = riId;
        this.ritId = ritId;
        this.isAll = isAll;
    }

	public Integer getRiId() {
    	return riId;
    }

	public void setRiId(Integer riId) {
    	this.riId = riId;
    }

	public String getRitId() {
    	return ritId;
    }

	public void setRitId(String ritId) {
    	this.ritId = ritId;
    }

	public Boolean getIsAll() {
    	return isAll;
    }

	public void setIsAll(Boolean isAll) {
    	this.isAll = isAll;
    }

	public Restaurant getRestaurant() {
    	return restaurant;
    }

	public void setRestaurant(Restaurant restaurant) {
    	this.restaurant = restaurant;
    }
    
}
