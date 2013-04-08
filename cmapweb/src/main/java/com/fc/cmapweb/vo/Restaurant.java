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
@Table(name = "restaurant")
public class Restaurant implements Serializable {

	private static final long serialVersionUID = 4280329115764204312L;

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
    private boolean signed;
    
    @Column(name = "ENABLED")
    private boolean enabled;
    
    @Column(name = "MS_CONT")
    private int msCont;
    
    @Column(name = "DS_CONT")
    private int dsCont;
    
    @Column(name = "REST_SUB_NAME")
    private String restSubName;
    
    @JoinColumn(name = "RS_ID", referencedColumnName = "RS_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private StubRestStatus stubRestStatus;

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

	public boolean isSigned() {
		return signed;
	}

	public void setSigned(boolean signed) {
		this.signed = signed;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public int getMsCont() {
		return msCont;
	}

	public void setMsCont(int msCont) {
		this.msCont = msCont;
	}

	public int getDsCont() {
		return dsCont;
	}

	public void setDsCont(int dsCont) {
		this.dsCont = dsCont;
	}

	public String getRestSubName() {
		return restSubName;
	}

	public void setRestSubName(String restSubName) {
		this.restSubName = restSubName;
	}

	public StubRestStatus getStubRestStatus() {
		return stubRestStatus;
	}

	public void setStubRestStatus(StubRestStatus stubRestStatus) {
		this.stubRestStatus = stubRestStatus;
	}

}
