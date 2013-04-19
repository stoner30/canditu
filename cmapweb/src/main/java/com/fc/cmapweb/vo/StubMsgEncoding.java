package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stub_msg_encoding")
public class StubMsgEncoding implements Serializable {
    
	private static final long serialVersionUID = 3854908992249333855L;

	@Id
    @Column(name = "SME_ID")
    private Integer smeId;
    
    @Column(name = "SME_NAME")
    private String smeName;

	public Integer getSmeId() {
		return smeId;
	}

	public void setSmeId(Integer smeId) {
		this.smeId = smeId;
	}

	public String getSmeName() {
		return smeName;
	}

	public void setSmeName(String smeName) {
		this.smeName = smeName;
	}

}
