package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DISTRICT")
public class District implements Serializable {

	private static final long serialVersionUID = 7700305131177837022L;
	
	@Id
    @Column(name = "DIST_CODE")
    private String distCode;
	
    @Column(name = "DIST_NAME")
    private String distName;
    
    @Column(name = "ENABLED")
    private Boolean enabled;
    
    @JoinColumn(name = "P_DIST_CODE", referencedColumnName = "DIST_CODE")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private District pDistrict;

    public District() {
    }

    public District(String distCode) {
        this.distCode = distCode;
    }

    public District(String distCode, String distName, boolean enabled) {
        this.distCode = distCode;
        this.distName = distName;
        this.enabled = enabled;
    }

	public String getDistCode() {
    	return distCode;
    }

	public void setDistCode(String distCode) {
    	this.distCode = distCode;
    }

	public String getDistName() {
    	return distName;
    }

	public void setDistName(String distName) {
    	this.distName = distName;
    }

	public Boolean getEnabled() {
    	return enabled;
    }

	public void setEnabled(Boolean enabled) {
    	this.enabled = enabled;
    }

	public District getPDistrict() {
    	return pDistrict;
    }

	public void setPDistrict(District pDistrict) {
    	this.pDistrict = pDistrict;
    }
    
}
