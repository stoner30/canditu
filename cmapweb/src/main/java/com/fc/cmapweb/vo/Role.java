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
@Table(name = "role")
public class Role implements Serializable {
    
	private static final long serialVersionUID = 3824926125406797284L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROLE_ID")
    private Integer roleId;
    
    @Column(name = "ROLE_NAME")
    private String roleName;
    
    @Column(name = "ROLE_DESC")
    private String roleDesc;
    
    @Column(name = "ENABLED")
    private boolean enabled;
    
    @JoinColumn(name = "USR_TYPE_ID", referencedColumnName = "USR_TYPE_ID")
    @ManyToOne(optional = false)
    private StubUsrType stubUsrType;
    
    @JoinColumn(name = "P_ROLE_ID", referencedColumnName = "ROLE_ID")
    @ManyToOne(optional = false)
    private Role role;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public StubUsrType getStubUsrType() {
		return stubUsrType;
	}

	public void setStubUsrType(StubUsrType stubUsrType) {
		this.stubUsrType = stubUsrType;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
