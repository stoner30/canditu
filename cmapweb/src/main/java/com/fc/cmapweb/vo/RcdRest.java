package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RCD_REST")
public class RcdRest implements Serializable {

	private static final long serialVersionUID = -6097358541073304642L;
	
	@Id
    @Column(name = "RR_ID")
    private Integer rrId;
    
    @Column(name = "RR_ORDER")
    private int rrOrder;

    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restaurant restaurant;

    public RcdRest() {
    }

    public RcdRest(Integer rrId) {
        this.rrId = rrId;
    }

    public RcdRest(Integer rrId, int rrOrder) {
        this.rrId = rrId;
        this.rrOrder = rrOrder;
    }

    public Integer getRrId() {
        return rrId;
    }

    public void setRrId(Integer rrId) {
        this.rrId = rrId;
    }

    public int getRrOrder() {
        return rrOrder;
    }

    public void setRrOrder(int rrOrder) {
        this.rrOrder = rrOrder;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    
}
