package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stub_rest_status")
public class StubRestStatus implements Serializable {

	private static final long serialVersionUID = -9116119957681001624L;

	@Id
    @Column(name = "RS_ID")
    private Short rsId;
	
    @Column(name = "RS_NAME")
    private String rsName;

	public Short getRsId() {
		return rsId;
	}

	public void setRsId(Short rsId) {
		this.rsId = rsId;
	}

	public String getRsName() {
		return rsName;
	}

	public void setRsName(String rsName) {
		this.rsName = rsName;
	}

}
