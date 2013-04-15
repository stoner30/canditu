package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "msg_template")
public class MsgTemplate implements Serializable {
    
	private static final long serialVersionUID = -3250504526492876235L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MT_ID")
    private Integer mtId;
    
    @Lob
    @Column(name = "MT_CONTENT")
    private String mtContent;
    
    @Column(name = "ENABLED")
    private boolean enabled;
    
    @JoinColumn(name = "SMT_ID", referencedColumnName = "SMT_ID")
    @ManyToOne(optional = false)
    private StubMsgType smtId;

	public Integer getMtId() {
		return mtId;
	}

	public void setMtId(Integer mtId) {
		this.mtId = mtId;
	}

	public String getMtContent() {
		return mtContent;
	}

	public void setMtContent(String mtContent) {
		this.mtContent = mtContent;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public StubMsgType getSmtId() {
		return smtId;
	}

	public void setSmtId(StubMsgType smtId) {
		this.smtId = smtId;
	}

}
