package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stub_rest_ico_type")
public class StubRestIcoType implements Serializable {

	private static final long serialVersionUID = -3734794357493859160L;
	
	@Id
    @Column(name = "RIT_ID")
    private Integer ritId;
	
    @Column(name = "RIT_NAME")
    private String ritName;

    @Column(name = "RIT_DESC")
    private String ritDesc;

    public StubRestIcoType() {
    }

    public StubRestIcoType(Integer ritId) {
        this.ritId = ritId;
    }

    public StubRestIcoType(Integer ritId, String ritName, String ritDesc) {
        this.ritId = ritId;
        this.ritName = ritName;
        this.ritDesc = ritDesc;
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

	public String getRitDesc() {
    	return ritDesc;
    }

	public void setRitDesc(String ritDesc) {
    	this.ritDesc = ritDesc;
    }
    
}
