package com.fc.cmapweb.vo;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "BLDG")
public class Bldg implements Serializable {

	private static final long serialVersionUID = 4535510359757141923L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BLDG_ID")
    private Integer bldgId;
    
    @Column(name = "BLDG_NAME")
    private String bldgName;
    
    @Column(name = "BLDG_ADDR")
    private String bldgAddr;
    
    @Column(name = "BLDG_LON")
    private Float bldgLon;
    
    @Column(name = "BLDG_LAT")
    private Float bldgLat;
    
    @Column(name = "ENABLED")
    private Boolean enabled;
    
    @JoinColumn(name = "DIST_CODE", referencedColumnName = "DIST_CODE")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private District district;
    
    public Bldg() {
    }

    public Bldg(Integer bldgId) {
        this.bldgId = bldgId;
    }

    public Bldg(Integer bldgId, String bldgName, String bldgAddr, BigDecimal bldgLon, BigDecimal bldgLat, boolean enabled) {
        this.bldgId = bldgId;
        this.bldgName = bldgName;
        this.bldgAddr = bldgAddr;
        this.enabled = enabled;
    }

	public Integer getBldgId() {
    	return bldgId;
    }

	public void setBldgId(Integer bldgId) {
    	this.bldgId = bldgId;
    }

	public String getBldgName() {
    	return bldgName;
    }

	public void setBldgName(String bldgName) {
    	this.bldgName = bldgName;
    }

	public String getBldgAddr() {
    	return bldgAddr;
    }

	public void setBldgAddr(String bldgAddr) {
    	this.bldgAddr = bldgAddr;
    }

	public Float getBldgLon() {
    	return bldgLon;
    }

	public void setBldgLon(Float bldgLon) {
    	this.bldgLon = bldgLon;
    }

	public Float getBldgLat() {
    	return bldgLat;
    }

	public void setBldgLat(Float bldgLat) {
    	this.bldgLat = bldgLat;
    }

	public Boolean getEnabled() {
    	return enabled;
    }

	public void setEnabled(Boolean enabled) {
    	this.enabled = enabled;
    }

	public District getDistrict() {
    	return district;
    }

	public void setDistrict(District district) {
    	this.district = district;
    }
    
}
