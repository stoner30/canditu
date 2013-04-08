package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "msg_gateway_config")
public class MsgGatewayConfig implements Serializable {
	
	private static final long serialVersionUID = 3053200663506281247L;

	@Id
    @Column(name = "MGC_ID")
    private Integer mgcId;
	
    @Column(name = "MGC_ADDR")
    private String mgcAddr;
    
    @Column(name = "MGC_ACCOUNT")
    private String mgcAccount;
    
    @Column(name = "MGC_PWD")
    private String mgcPwd;
    
    @Column(name = "SME_ID")
    private Integer smeId;
    
    @Column(name = "MGC_RECIPIENT")
    private String mgcRecipient;
    
    @Column(name = "MGC_LOWER_LIMIT")
    private Integer mgcLowerLimit;
    
    @Column(name = "ENABLED")
    private boolean enabled;

    public Integer getMgcId() {
        return mgcId;
    }

    public void setMgcId(Integer mgcId) {
        this.mgcId = mgcId;
    }

    public String getMgcAddr() {
        return mgcAddr;
    }

    public void setMgcAddr(String mgcAddr) {
        this.mgcAddr = mgcAddr;
    }

    public String getMgcAccount() {
        return mgcAccount;
    }

    public void setMgcAccount(String mgcAccount) {
        this.mgcAccount = mgcAccount;
    }

    public String getMgcPwd() {
        return mgcPwd;
    }

    public void setMgcPwd(String mgcPwd) {
        this.mgcPwd = mgcPwd;
    }

    public Integer getSmeId() {
        return smeId;
    }

    public void setSmeId(Integer smeId) {
        this.smeId = smeId;
    }

    public String getMgcRecipient() {
        return mgcRecipient;
    }

    public void setMgcRecipient(String mgcRecipient) {
        this.mgcRecipient = mgcRecipient;
    }

    public Integer getMgcLowerLimit() {
        return mgcLowerLimit;
    }

    public void setMgcLowerLimit(Integer mgcLowerLimit) {
        this.mgcLowerLimit = mgcLowerLimit;
    }

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
