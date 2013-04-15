package com.fc.cmapweb.vo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
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
    
	private static final long serialVersionUID = 7515139990712028081L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "REST_ID")
    private Integer restId;
    
    @Column(name = "REST_NAME")
    private String restName;
    
    @Column(name = "REST_ADDR")
    private String restAddr;
    
    @Column(name = "REST_LON")
    private Double restLon;
    
    @Column(name = "REST_LAT")
    private Double restLat;
    
    @Column(name = "OPEN_TIME")
    @Temporal(TemporalType.TIME)
    private Date openTime;
    
    @Column(name = "CLOSE_TIME")
    @Temporal(TemporalType.TIME)
    private Date closeTime;
    
    @Column(name = "MIN_DLVY_PR")
    private Double minDlvyPr;
    
    @Column(name = "DLVY_FEE")
    private Double dlvyFee;
    
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
    
    @Column(name = "REST_SUB_NAME")
    private String restSubName;
    
    @Column(name = "REST_TEL")
    private String restTel;
    
    @Column(name = "REST_EMAIL")
    private String restEmail;
    
    @Column(name = "SCORE")
    private Integer score;
    
    @Column(name = "COUNT")
    private Integer count;
    
    @Column(name = "GRADE")
    private Double grade;
    
    @JoinColumn(name = "RS_ID", referencedColumnName = "RS_ID")
    @ManyToOne(optional = false)
    private StubRestStatus rsId;
    
    @JoinColumn(name = "TRANS_TYPE_ID", referencedColumnName = "TRANS_TYPE_ID")
    @ManyToOne
    private StubTransType transTypeId;

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

	public Double getRestLon() {
		return restLon;
	}

	public void setRestLon(Double restLon) {
		this.restLon = restLon;
	}

	public Double getRestLat() {
		return restLat;
	}

	public void setRestLat(Double restLat) {
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

	public Double getMinDlvyPr() {
		return minDlvyPr;
	}

	public void setMinDlvyPr(Double minDlvyPr) {
		this.minDlvyPr = minDlvyPr;
	}

	public Double getDlvyFee() {
		return dlvyFee;
	}

	public void setDlvyFee(Double dlvyFee) {
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

	public String getRestSubName() {
		return restSubName;
	}

	public void setRestSubName(String restSubName) {
		this.restSubName = restSubName;
	}

	public String getRestTel() {
		return restTel;
	}

	public void setRestTel(String restTel) {
		this.restTel = restTel;
	}

	public String getRestEmail() {
		return restEmail;
	}

	public void setRestEmail(String restEmail) {
		this.restEmail = restEmail;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}

	public StubRestStatus getRsId() {
		return rsId;
	}

	public void setRsId(StubRestStatus rsId) {
		this.rsId = rsId;
	}

	public StubTransType getTransTypeId() {
		return transTypeId;
	}

	public void setTransTypeId(StubTransType transTypeId) {
		this.transTypeId = transTypeId;
	}
    
}
