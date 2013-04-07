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
@Table(name = "CUSTOMER")
public class Customer implements Serializable {
    
    private static final long serialVersionUID = 562803137798612683L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private Integer customerId;
	
    @Column(name = "EMAIL")
    private String email;
    
    @Column(name = "MOBILE")
    private String mobile;
    
    @Column(name = "NICKNAME")
    private String nickname;
    
    @Column(name = "PASSWD")
    private String passwd;
    
    @Column(name = "OPENID")
    private String openid;
    
    @Column(name = "REG_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date regTime;

    @Column(name = "LAST_LOGIN_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginTime;
    
    @Column(name = "LAST_LOGIN_IP")
    private String lastLoginIp;
    
    @Column(name = "ENABLED")
    private Boolean enabled;
 
    @Column(name = "FIRST_ORDER")
    private Boolean firstOrder;

    @JoinColumn(name = "OAUTH_ID", referencedColumnName = "OAUTH_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private StubOAuthType stubOAuthType;
    
    public Customer() {
    }

    public Customer(Integer customerId) {
        this.customerId = customerId;
    }

    public Customer(Integer customerId, Date regTime, Boolean enabled, Boolean firstOrder) {
        this.customerId = customerId;
        this.regTime = regTime;
        this.enabled = enabled;
        this.firstOrder = firstOrder;
    }

	public Integer getCustomerId() {
    	return customerId;
    }

	public void setCustomerId(Integer customerId) {
    	this.customerId = customerId;
    }

	public String getEmail() {
    	return email;
    }

	public void setEmail(String email) {
    	this.email = email;
    }

	public String getMobile() {
    	return mobile;
    }

	public void setMobile(String mobile) {
    	this.mobile = mobile;
    }

	public String getNickname() {
    	return nickname;
    }

	public void setNickname(String nickname) {
    	this.nickname = nickname;
    }

	public String getPasswd() {
    	return passwd;
    }

	public void setPasswd(String passwd) {
    	this.passwd = passwd;
    }

	public String getOpenid() {
    	return openid;
    }

	public void setOpenid(String openid) {
    	this.openid = openid;
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

	public Boolean getEnabled() {
    	return enabled;
    }

	public void setEnabled(Boolean enabled) {
    	this.enabled = enabled;
    }

	public Boolean getFirstOrder() {
    	return firstOrder;
    }

	public void setFirstOrder(Boolean firstOrder) {
    	this.firstOrder = firstOrder;
    }

	public StubOAuthType getStubOAuthType() {
    	return stubOAuthType;
    }

	public void setStubOAuthType(StubOAuthType stubOAuthType) {
    	this.stubOAuthType = stubOAuthType;
    }
    
}
