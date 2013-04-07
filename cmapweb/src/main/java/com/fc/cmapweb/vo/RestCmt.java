package com.fc.cmapweb.vo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "REST_CMT")
public class RestCmt implements Serializable {

	private static final long serialVersionUID = -7039604173086200327L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RC_ID")
    private Integer rcId;
    
	@Column(name = "CMT_CNT")
    private String cmtCnt;
    
    @Column(name = "EVAL_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date evalTime;
    
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restaurant restaurant;

    public RestCmt() {
    }

    public RestCmt(Integer rcId) {
        this.rcId = rcId;
    }

    public RestCmt(Integer rcId, Date evalTime) {
        this.rcId = rcId;
        this.evalTime = evalTime;
    }

	public Integer getRcId() {
    	return rcId;
    }

	public void setRcId(Integer rcId) {
    	this.rcId = rcId;
    }

	public String getCmtCnt() {
    	return cmtCnt;
    }

	public void setCmtCnt(String cmtCnt) {
    	this.cmtCnt = cmtCnt;
    }

	public Date getEvalTime() {
    	return evalTime;
    }

	public void setEvalTime(Date evalTime) {
    	this.evalTime = evalTime;
    }

	public Restaurant getRestaurant() {
    	return restaurant;
    }

	public void setRestaurant(Restaurant restaurant) {
    	this.restaurant = restaurant;
    }
    
}
