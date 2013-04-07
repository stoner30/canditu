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

@Entity
@Table(name = "usr_info")
public class UsrInfo implements Serializable {

	private static final long serialVersionUID = -7367259658792513105L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UI_ID")
    private Integer uiId;

    @Column(name = "UI_DATA")
    private String uiData;

    @JoinColumn(name = "USR_ID", referencedColumnName = "USR_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usr usr;
    
    @JoinColumn(name = "UIT_ID", referencedColumnName = "UIT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private StubUsrInfoType stubUsrInfoType;

    public UsrInfo() {
    }

    public UsrInfo(Integer uiId) {
        this.uiId = uiId;
    }

    public UsrInfo(Integer uiId, String uiData) {
        this.uiId = uiId;
        this.uiData = uiData;
    }

	public Integer getUiId() {
    	return uiId;
    }

	public void setUiId(Integer uiId) {
    	this.uiId = uiId;
    }

	public String getUiData() {
    	return uiData;
    }

	public void setUiData(String uiData) {
    	this.uiData = uiData;
    }

	public Usr getUsr() {
    	return usr;
    }

	public void setUsr(Usr usr) {
    	this.usr = usr;
    }

	public StubUsrInfoType getStubUsrInfoType() {
    	return stubUsrInfoType;
    }

	public void setStubUsrInfoType(StubUsrInfoType stubUsrInfoType) {
    	this.stubUsrInfoType = stubUsrInfoType;
    }
    
}
