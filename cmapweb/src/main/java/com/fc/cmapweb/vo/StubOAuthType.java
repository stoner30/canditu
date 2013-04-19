package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stub_oauth_type")
public class StubOauthType implements Serializable {
    
	private static final long serialVersionUID = -3288309051038110863L;

	@Id
    @Column(name = "OAUTH_ID")
    private Integer oauthId;
    
    @Column(name = "OAUTH_TYPE_NAME")
    private String oauthTypeName;

	public Integer getOauthId() {
		return oauthId;
	}

	public void setOauthId(Integer oauthId) {
		this.oauthId = oauthId;
	}

	public String getOauthTypeName() {
		return oauthTypeName;
	}

	public void setOauthTypeName(String oauthTypeName) {
		this.oauthTypeName = oauthTypeName;
	}

}
