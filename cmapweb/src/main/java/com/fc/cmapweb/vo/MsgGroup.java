package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "msg_group")
public class MsgGroup implements Serializable {
	
	private static final long serialVersionUID = 2401202717616841351L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MG_ID")
    private Integer mgId;
	
    @Column(name = "MG_NAME")
    private String mgName;
    
    @Column(name = "ENABLED")
    private boolean enabled;

	public Integer getMgId() {
		return mgId;
	}

	public void setMgId(Integer mgId) {
		this.mgId = mgId;
	}

	public String getMgName() {
		return mgName;
	}

	public void setMgName(String mgName) {
		this.mgName = mgName;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
    
}
