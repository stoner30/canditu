package com.fc.cmapweb.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "bldg")
public class Bldg implements Serializable {

	private static final long serialVersionUID = 5486040586468707016L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BLDG_ID")
    private Integer bldgId;
	
    @Column(name = "BLDG_NAME")
    private String bldgName;
    
    @Column(name = "BLDG_ADDR")
    private String bldgAddr;
    
    @Column(name = "BLDG_LON")
    private BigDecimal bldgLon;
    
    @Column(name = "BLDG_LAT")
    private BigDecimal bldgLat;
    
    @Column(name = "ENABLED")
    private boolean enabled;
    
    @JoinColumn(name = "DIST_CODE", referencedColumnName = "DIST_CODE")
    @ManyToOne(optional = false)
    private District distCode;

    @Transient
    private String pinYin;

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

	public BigDecimal getBldgLon() {
		return bldgLon;
	}

	public void setBldgLon(BigDecimal bldgLon) {
		this.bldgLon = bldgLon;
	}

	public BigDecimal getBldgLat() {
		return bldgLat;
	}

	public void setBldgLat(BigDecimal bldgLat) {
		this.bldgLat = bldgLat;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public District getDistCode() {
		return distCode;
	}

	public void setDistCode(District distCode) {
		this.distCode = distCode;
	}

	public String getPinYin() {
		return pinYin;
	}

	public void setPinYin(String pinYin) {
		this.pinYin = pinYin;
	}

}