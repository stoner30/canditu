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
@Table(name = "AD_BLDG")
public class ADBldg implements Serializable {

	private static final long serialVersionUID = -6402978670591577027L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AB_ID")
    private Integer abId;
    
    @Column(name = "START_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    
    @Column(name = "END_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    
    @Column(name = "AD_ORDER")
    private Integer adOrder;
    
    @JoinColumn(name = "DIST_CODE", referencedColumnName = "DIST_CODE")
    @ManyToOne(fetch = FetchType.LAZY)
    private District district;
    
    @JoinColumn(name = "BLDG_ID", referencedColumnName = "BLDG_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Bldg bldg;
    
    @JoinColumn(name = "AD_ID", referencedColumnName = "AD_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private AD ad;

    public ADBldg() {
    }

    public ADBldg(Integer abId) {
        this.abId = abId;
    }

    public ADBldg(Integer abId, Date startTime, Date endTime, int adOrder) {
        this.abId = abId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.adOrder = adOrder;
    }

	public Integer getAbId() {
    	return abId;
    }

	public void setAbId(Integer abId) {
    	this.abId = abId;
    }

	public Date getStartTime() {
    	return startTime;
    }

	public void setStartTime(Date startTime) {
    	this.startTime = startTime;
    }

	public Date getEndTime() {
    	return endTime;
    }

	public void setEndTime(Date endTime) {
    	this.endTime = endTime;
    }

	public Integer getAdOrder() {
    	return adOrder;
    }

	public void setAdOrder(Integer adOrder) {
    	this.adOrder = adOrder;
    }

	public District getDistrict() {
    	return district;
    }

	public void setDistrict(District district) {
    	this.district = district;
    }

	public Bldg getBldg() {
    	return bldg;
    }

	public void setBldg(Bldg bldg) {
    	this.bldg = bldg;
    }

	public AD getAd() {
    	return ad;
    }

	public void setAd(AD ad) {
    	this.ad = ad;
    }
	
}
