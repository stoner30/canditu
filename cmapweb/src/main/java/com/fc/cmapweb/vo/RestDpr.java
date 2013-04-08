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
@Table(name = "rest_dpr")
public class RestDpr implements Serializable {
	
	private static final long serialVersionUID = -3349562398981065440L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RD_ID")
    private Integer rdId;
	
    @JoinColumn(name = "DPR_ID", referencedColumnName = "DPR_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private StubDlvyPrRge stubDlvyPrRge;
    
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restaurant restaurant;

	public Integer getRdId() {
		return rdId;
	}

	public void setRdId(Integer rdId) {
		this.rdId = rdId;
	}

	public StubDlvyPrRge getStubDlvyPrRge() {
		return stubDlvyPrRge;
	}

	public void setStubDlvyPrRge(StubDlvyPrRge stubDlvyPrRge) {
		this.stubDlvyPrRge = stubDlvyPrRge;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

}
