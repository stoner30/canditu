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
@Table(name = "RESTAURANT")
public class Restaurant implements Serializable {
    
    private static final long serialVersionUID = 3890300853478623979L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "REST_ID")
    private Integer restId;

    @Column(name = "REST_NAME")
    private String restName;

    @Column(name = "REST_ADDR")
    private String restAddr;

    @Column(name = "REST_LON")
    private Float restLon;

    @Column(name = "REST_LAT")
    private Float restLat;

    @Column(name = "OPEN_TIME")
    @Temporal(TemporalType.TIME)
    private Date openTime;
    
    @Column(name = "CLOSE_TIME")
    @Temporal(TemporalType.TIME)
    private Date closeTime;

    @Column(name = "MIN_DLVY_PR")
    private Float minDlvyPr;
    
    @Column(name = "DLVY_FEE")
    private Float dlvyFee;
    
    @Column(name = "VALID_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date validTime;

    @Column(name = "INVALID_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date invalidTime;
    
    @Column(name = "SIGNED")
    private Boolean signed;

    @Column(name = "ENABLED")
    private Boolean enabled;

    @Column(name = "MS_CONT")
    private Integer msCont;
    
    @Column(name = "DS_CONT")
    private Integer dsCont;
    
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RestStatusType restStatusType;
    
    public Restaurant() {
    }

    public Restaurant(Integer restId) {
        this.restId = restId;
    }

    public Restaurant(Integer restId, String restName, String restAddr, Float restLon, Float restLat, Date openTime, Date closeTime, Float minDlvyPr, Float dlvyFee, Date validTime, Date invalidTime, Boolean signed, Boolean enabled, Integer msCont, Integer dsCont) {
        this.restId = restId;
        this.restName = restName;
        this.restAddr = restAddr;
        this.restLon = restLon;
        this.restLat = restLat;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.minDlvyPr = minDlvyPr;
        this.dlvyFee = dlvyFee;
        this.validTime = validTime;
        this.invalidTime = invalidTime;
        this.signed = signed;
        this.enabled = enabled;
        this.msCont = msCont;
        this.dsCont = dsCont;
    }

	public Integer getRestId() {
    	return restId;
    }

	public void setRestId(Integer restId) {
    	this.restId = restId;
    }

	public String getRestName() {
    	return restName;
    }

	public void setRestName(String restName) {
    	this.restName = restName;
    }

	public String getRestAddr() {
    	return restAddr;
    }

	public void setRestAddr(String restAddr) {
    	this.restAddr = restAddr;
    }

	public Float getRestLon() {
    	return restLon;
    }

	public void setRestLon(Float restLon) {
    	this.restLon = restLon;
    }

	public Float getRestLat() {
    	return restLat;
    }

	public void setRestLat(Float restLat) {
    	this.restLat = restLat;
    }

	public Date getOpenTime() {
    	return openTime;
    }

	public void setOpenTime(Date openTime) {
    	this.openTime = openTime;
    }

	public Date getCloseTime() {
    	return closeTime;
    }

	public void setCloseTime(Date closeTime) {
    	this.closeTime = closeTime;
    }

	public Float getMinDlvyPr() {
    	return minDlvyPr;
    }

	public void setMinDlvyPr(Float minDlvyPr) {
    	this.minDlvyPr = minDlvyPr;
    }

	public Float getDlvyFee() {
    	return dlvyFee;
    }

	public void setDlvyFee(Float dlvyFee) {
    	this.dlvyFee = dlvyFee;
    }

	public Date getValidTime() {
    	return validTime;
    }

	public void setValidTime(Date validTime) {
    	this.validTime = validTime;
    }

	public Date getInvalidTime() {
    	return invalidTime;
    }

	public void setInvalidTime(Date invalidTime) {
    	this.invalidTime = invalidTime;
    }

	public Boolean getSigned() {
    	return signed;
    }

	public void setSigned(Boolean signed) {
    	this.signed = signed;
    }

	public Boolean getEnabled() {
    	return enabled;
    }

	public void setEnabled(Boolean enabled) {
    	this.enabled = enabled;
    }

	public Integer getMsCont() {
    	return msCont;
    }

	public void setMsCont(Integer msCont) {
    	this.msCont = msCont;
    }

	public Integer getDsCont() {
    	return dsCont;
    }

	public void setDsCont(Integer dsCont) {
    	this.dsCont = dsCont;
    }

	public RestStatusType getRestStatusType() {
    	return restStatusType;
    }

	public void setRestStatusType(RestStatusType restStatusType) {
    	this.restStatusType = restStatusType;
    }
    
}
