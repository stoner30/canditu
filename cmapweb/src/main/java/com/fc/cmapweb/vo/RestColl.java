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
@Table(name = "rest_coll")
public class RestColl implements Serializable {
    
    private static final long serialVersionUID = 3218313072349536106L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RC_ID")
    private Integer rcId;

    @JoinColumn(name = "USR_ID", referencedColumnName = "USR_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usr usr;
    
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restaurant restaurant;
    
    @JoinColumn(name = "BLDG_ID", referencedColumnName = "BLDG_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Bldg bldg;

    public RestColl() {
    }

    public RestColl(Integer rcId) {
        this.rcId = rcId;
    }

    public Integer getRcId() {
        return rcId;
    }

    public void setRcId(Integer rcId) {
        this.rcId = rcId;
    }

    public Usr getUsr() {
        return usr;
    }

    public void setUsr(Usr usr) {
        this.usr = usr;
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
