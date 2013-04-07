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
@Table(name = "rest_dlvy_time")
public class RestDlvyTime implements Serializable {

	private static final long serialVersionUID = -8439023457744007688L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RDT_ID")
    private Integer rdtId;
    
	@JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restaurant restaurant;
    
	@JoinColumn(name = "DT_ID", referencedColumnName = "DT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DlvyTime dlvyTime;

    public RestDlvyTime() {
    }

    public RestDlvyTime(Integer rdtId) {
        this.rdtId = rdtId;
    }

    public Integer getRdtId() {
        return rdtId;
    }

    public void setRdtId(Integer rdtId) {
        this.rdtId = rdtId;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public DlvyTime getDlvyTime() {
        return dlvyTime;
    }

    public void setDlvyTime(DlvyTime dlvyTime) {
        this.dlvyTime = dlvyTime;
    }
    
}
