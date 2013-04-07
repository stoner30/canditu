package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stub_oauth_type")
public class StubOAuthType implements Serializable {

	private static final long serialVersionUID = 6439242054785388537L;
	
	@Id
    @Column(name = "OAUTH_ID")
    private Integer oAuthId;
    
    @Column(name = "OAUTH_TYPE_NAME")
    private String oAuthTypeName;
    
    public StubOAuthType() {
    }

    public StubOAuthType(Integer oAuthId) {
        this.oAuthId = oAuthId;
    }

    public StubOAuthType(Integer oAuthId, String oAuthTypeName) {
        this.oAuthId = oAuthId;
        this.oAuthTypeName = oAuthTypeName;
    }

	public Integer getoAuthId() {
    	return oAuthId;
    }

	public void setoAuthId(Integer oAuthId) {
    	this.oAuthId = oAuthId;
    }

	public String getoAuthTypeName() {
    	return oAuthTypeName;
    }

	public void setoAuthTypeName(String oAuthTypeName) {
    	this.oAuthTypeName = oAuthTypeName;
    }
    
}
