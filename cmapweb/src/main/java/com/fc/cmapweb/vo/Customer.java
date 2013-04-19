package com.fc.cmapweb.vo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1659116608349735448L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    private boolean enabled;
    
    @Column(name = "FIRST_ORDER")
    private boolean firstOrder;
    
    @JoinColumn(name = "OAUTH_ID", referencedColumnName = "OAUTH_ID")
    @ManyToOne
    private StubOauthType stubOauthType;

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

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isFirstOrder() {
		return firstOrder;
	}

	public void setFirstOrder(boolean firstOrder) {
		this.firstOrder = firstOrder;
	}

	public StubOauthType getStubOauthType() {
		return stubOauthType;
	}

	public void setStubOauthType(StubOauthType stubOauthType) {
		this.stubOauthType = stubOauthType;
	}

}
