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
@Table(name = "role_privilege")
public class RolePrivilege implements Serializable {
    
	private static final long serialVersionUID = 3958438224563360725L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RP_ID")
    private Integer rpId;
	
    @JoinColumn(name = "PRIV_ID", referencedColumnName = "PRIV_ID")
    @ManyToOne(optional = false)
    private StubPrivilege privId;
    
    @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID")
    @ManyToOne(optional = false)
    private Role roleId;

	public Integer getRpId() {
		return rpId;
	}

	public void setRpId(Integer rpId) {
		this.rpId = rpId;
	}

	public StubPrivilege getPrivId() {
		return privId;
	}

	public void setPrivId(StubPrivilege privId) {
		this.privId = privId;
	}

	public Role getRoleId() {
		return roleId;
	}

	public void setRoleId(Role roleId) {
		this.roleId = roleId;
	}

}
