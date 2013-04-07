package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stub_rest_info_type")
public class StubRestInfoType implements Serializable {
    
    private static final long serialVersionUID = -788089234778446928L;
	
    @Id
    @Column(name = "RIT_ID")
    private Integer ritId;

    @Column(name = "RIT_NAME")
    private String ritName;

    public StubRestInfoType() {
    }

    public StubRestInfoType(Integer ritId) {
        this.ritId = ritId;
    }

    public StubRestInfoType(Integer ritId, String ritName) {
        this.ritId = ritId;
        this.ritName = ritName;
    }

	public Integer getRitId() {
    	return ritId;
    }

	public void setRitId(Integer ritId) {
    	this.ritId = ritId;
    }

	public String getRitName() {
    	return ritName;
    }

	public void setRitName(String ritName) {
    	this.ritName = ritName;
    }
    
}
