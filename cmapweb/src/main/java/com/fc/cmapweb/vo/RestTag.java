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
import com.fc.cmapweb.vo.RestTagType;
import com.fc.cmapweb.vo.Restaurant;

@Entity
@Table(name = "rest_tag")
public class RestTag implements Serializable {

    private static final long serialVersionUID = 4875257356012031719L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RT_ID")
    private Integer rtId;
    
    @JoinColumn(name = "RTT_ID", referencedColumnName = "RTT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RestTagType restTagType;
    
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restaurant restaurant;

	public Integer getRtId() {
		return rtId;
	}

	public void setRtId(Integer rtId) {
		this.rtId = rtId;
	}

	public RestTagType getRestTagType() {
		return restTagType;
	}

	public void setRestTagType(RestTagType restTagType) {
		this.restTagType = restTagType;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
    
}
