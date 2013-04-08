package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Basic;
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
@Table(name = "dish_cat_type")
public class DishCatType implements Serializable {

	private static final long serialVersionUID = -6205645444777297193L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dct_id")
    private Integer dctId;
	
    @Basic(optional = false)
    @Column(name = "dc_name")
    private String dcName;
    
    @Basic(optional = false)
    @Column(name = "is_shown")
    private boolean isShown;
    
    @Basic(optional = false)
    @Column(name = "dc_order")
    private Integer dcOrder;
    
    @Basic(optional = false)
    @Column(name = "enabled")
    private boolean enabled;
    
    @JoinColumn(name = "rest_id", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restaurant restaurant;

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

	public boolean isShown() {
		return isShown;
	}

	public void setShown(boolean isShown) {
		this.isShown = isShown;
	}

	public Integer getDcOrder() {
		return dcOrder;
	}

	public void setDcOrder(Integer dcOrder) {
		this.dcOrder = dcOrder;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
    
}
