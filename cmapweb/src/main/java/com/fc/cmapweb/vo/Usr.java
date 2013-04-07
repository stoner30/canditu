package com.fc.cmapweb.vo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "usr")
public class Usr implements Serializable {

	private static final long serialVersionUID = 5296468648790077207L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USR_ID")
    private Integer usrId;

    @Column(name = "USRNAME")
    private String usrname;

    @Column(name = "PASSWD")
    private String passwd;

    @Column(name = "REG_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date regTime;

    @Column(name = "LAST_LOGIN_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginTime;
    
    @Column(name = "LAST_LOGIN_IP")
    private String lastLoginIp;

    @Column(name = "BAD_PWD_COUNT")
    private Integer badPwdCount;

    @Column(name = "ENABLED")
    private Boolean enabled;

    public Usr() {
    }

    public Usr(Integer usrId) {
        this.usrId = usrId;
    }

    public Usr(Integer usrId, String usrname, String passwd, Date regTime, Integer badPwdCount, Boolean enabled) {
        this.usrId = usrId;
        this.usrname = usrname;
        this.passwd = passwd;
        this.regTime = regTime;
        this.badPwdCount = badPwdCount;
        this.enabled = enabled;
    }

	public Integer getUsrId() {
    	return usrId;
    }

	public void setUsrId(Integer usrId) {
    	this.usrId = usrId;
    }

	public String getUsrname() {
    	return usrname;
    }

	public void setUsrname(String usrname) {
    	this.usrname = usrname;
    }

	public String getPasswd() {
    	return passwd;
    }

	public void setPasswd(String passwd) {
    	this.passwd = passwd;
    }

	public Date getRegTime() {
    	return regTime;
    }

	public void setRegTime(Date regTime) {
    	this.regTime = regTime;
    }

	public Date getLastLoginTime() {
    	return lastLoginTime;
    }

	public void setLastLoginTime(Date lastLoginTime) {
    	this.lastLoginTime = lastLoginTime;
    }

	public String getLastLoginIp() {
    	return lastLoginIp;
    }

	public void setLastLoginIp(String lastLoginIp) {
    	this.lastLoginIp = lastLoginIp;
    }

	public Integer getBadPwdCount() {
    	return badPwdCount;
    }

	public void setBadPwdCount(Integer badPwdCount) {
    	this.badPwdCount = badPwdCount;
    }

	public Boolean getEnabled() {
    	return enabled;
    }

	public void setEnabled(Boolean enabled) {
    	this.enabled = enabled;
    }
    
}
