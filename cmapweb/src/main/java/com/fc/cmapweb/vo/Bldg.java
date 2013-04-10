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
import javax.persistence.Transient;

import com.fc.cmapweb.utils.PinYinUtil;
import com.fc.cmapweb.vo.District;

@Entity
@Table(name = "bldg")
public class Bldg implements Serializable {
	
	private static final long serialVersionUID = 1631866032632256712L;

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
    private boolean enabled;
    
    @JoinColumn(name = "DIST_CODE", referencedColumnName = "DIST_CODE")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private District district;

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

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public String getPinYin() {
		return pinYin;
	}

	public void setPinYin(String pinYin) {
		this.pinYin = pinYin;
	}

}
