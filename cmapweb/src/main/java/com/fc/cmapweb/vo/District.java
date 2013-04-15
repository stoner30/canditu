package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "district")
public class District implements Serializable {
    
	private static final long serialVersionUID = -3692534047860674017L;

	@Id
    @Column(name = "DIST_CODE")
    private String distCode;
    
    @Column(name = "DIST_NAME")
    private String distName;
    
    @Column(name = "ENABLED")
    private boolean enabled;
    
    @JoinColumn(name = "P_DIST_CODE", referencedColumnName = "DIST_CODE")
    @ManyToOne(optional = false)
    private District pDistCode;

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

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public District getpDistCode() {
		return pDistCode;
	}

	public void setpDistCode(District pDistCode) {
		this.pDistCode = pDistCode;
	}
    
}
