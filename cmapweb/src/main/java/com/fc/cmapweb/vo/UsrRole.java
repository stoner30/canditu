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
@Table(name = "usr_role")
public class UsrRole implements Serializable {
    
	private static final long serialVersionUID = -5152244597297908223L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UR_ID")
    private Integer urId;
    
    @JoinColumn(name = "USR_ID", referencedColumnName = "USR_ID")
    @ManyToOne(optional = false)
    private Usr usr;
    
    @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID")
    @ManyToOne(optional = false)
    private Role role;

	public Integer getUrId() {
		return urId;
	}

	public void setUrId(Integer urId) {
		this.urId = urId;
	}

	public Usr getUsr() {
		return usr;
	}

	public void setUsr(Usr usr) {
		this.usr = usr;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
