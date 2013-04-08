package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stub_usr_info_type")
public class StubUsrInfoType implements Serializable {

	private static final long serialVersionUID = -3897890598671601222L;
	
	@Id
    @Column(name = "UIT_ID")
    private Integer uitId;

    @Column(name = "UIT_NAME")
    private String uitName;

	public Integer getUitId() {
    	return uitId;
    }

	public void setUitId(Integer uitId) {
    	this.uitId = uitId;
    }

	public String getUitName() {
    	return uitName;
    }

	public void setUitName(String uitName) {
    	this.uitName = uitName;
    }
    
}
