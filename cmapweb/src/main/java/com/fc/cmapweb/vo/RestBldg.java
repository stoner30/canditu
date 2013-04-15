package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rest_bldg")
public class RestBldg implements Serializable {
    
	private static final long serialVersionUID = 6049747022417247496L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RC_ID")
    private Integer rcId;
    
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false)
    private Restaurant restaurant;
    
    @JoinColumn(name = "BLDG_ID", referencedColumnName = "BLDG_ID")
    @ManyToOne(optional = false)
    private Bldg bldg;

	public Integer getRcId() {
		return rcId;
	}

	public void setRcId(Integer rcId) {
		this.rcId = rcId;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Bldg getBldg() {
		return bldg;
	}

	public void setBldg(Bldg bldg) {
		this.bldg = bldg;
	}

}
