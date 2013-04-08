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
@Table(name = "rest_usr")
public class RestUsr implements Serializable {
    
    private static final long serialVersionUID = 7860127630439307082L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RU_ID")
    private Integer ruId;
    
    @JoinColumn(name = "USR_ID", referencedColumnName = "USR_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usr usr;
    
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restaurant restaurant;

    public Integer getRuId() {
        return ruId;
    }

    public void setRuId(Integer ruId) {
        this.ruId = ruId;
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
    
}
