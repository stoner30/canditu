package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stub_usr_type_privilege")
public class StubUsrTypePrivilege implements Serializable {
    
	private static final long serialVersionUID = -6413007205878802215L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UTP_ID")
    private Integer utpId;
	
    @JoinColumn(name = "USR_TYPE_ID", referencedColumnName = "USR_TYPE_ID")
    @ManyToOne(optional = false)
    private StubUsrType stubUsrType;
    
    @JoinColumn(name = "PRIV_ID", referencedColumnName = "PRIV_ID")
    @ManyToOne(optional = false)
    private StubPrivilege stubPrivilege;

	public Integer getUtpId() {
		return utpId;
	}

	public void setUtpId(Integer utpId) {
		this.utpId = utpId;
	}

	public StubUsrType getStubUsrType() {
		return stubUsrType;
	}

	public void setStubUsrType(StubUsrType stubUsrType) {
		this.stubUsrType = stubUsrType;
	}

	public StubPrivilege getStubPrivilege() {
		return stubPrivilege;
	}

	public void setStubPrivilege(StubPrivilege stubPrivilege) {
		this.stubPrivilege = stubPrivilege;
	}

}
