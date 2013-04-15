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
@Table(name = "my_favor")
public class MyFavor implements Serializable {
    
	private static final long serialVersionUID = -1759132380308720997L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FAVOR_ID")
    private Integer favorId;
	
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false)
    private Restaurant restaurant;

	public Integer getFavorId() {
		return favorId;
	}

	public void setFavorId(Integer favorId) {
		this.favorId = favorId;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

}
