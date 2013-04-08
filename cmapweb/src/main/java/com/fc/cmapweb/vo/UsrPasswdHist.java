package com.fc.cmapweb.vo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "usr_passwd_hist")
public class UsrPasswdHist implements Serializable {

	private static final long serialVersionUID = -3910346493679083317L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "HIST_ID")
    private Integer histId;

    @Column(name = "OLD_PASSWD")
    private String oldPasswd;

    @Column(name = "UPDATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    @JoinColumn(name = "USR_ID", referencedColumnName = "USR_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usr usr;

	public Integer getHistId() {
    	return histId;
    }

	public void setHistId(Integer histId) {
    	this.histId = histId;
    }

	public String getOldPasswd() {
    	return oldPasswd;
    }

	public void setOldPasswd(String oldPasswd) {
    	this.oldPasswd = oldPasswd;
    }

	public Date getUpdateTime() {
    	return updateTime;
    }

	public void setUpdateTime(Date updateTime) {
    	this.updateTime = updateTime;
    }

	public Usr getUsr() {
    	return usr;
    }

	public void setUsr(Usr usr) {
    	this.usr = usr;
    }
    
}
