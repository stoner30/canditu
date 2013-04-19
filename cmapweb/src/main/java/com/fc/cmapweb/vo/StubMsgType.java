package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stub_msg_type")
public class StubMsgType implements Serializable {
    
	private static final long serialVersionUID = -1471472460509667984L;

	@Id
    @Column(name = "SMT_ID")
    private Integer smtId;
    
    @Column(name = "SMT_NAME")
    private String smtName;

	public Integer getSmtId() {
		return smtId;
	}

	public void setSmtId(Integer smtId) {
		this.smtId = smtId;
	}

	public String getSmtName() {
		return smtName;
	}

	public void setSmtName(String smtName) {
		this.smtName = smtName;
	}
    
}
