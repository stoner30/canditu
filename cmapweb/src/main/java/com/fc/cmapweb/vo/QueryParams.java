package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "query_params")
public class QueryParams implements Serializable {
    
	private static final long serialVersionUID = -2674791200215502561L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "QP_ID")
    private Integer qpId;
    
    @Column(name = "PARAMS")
    private String params;
    
    @JoinColumn(name = "USR_ID", referencedColumnName = "USR_ID")
    @ManyToOne(optional = false)
    private Usr usrId;
    
    @JoinColumn(name = "MODULE_ID", referencedColumnName = "MODULE_ID")
    @ManyToOne(optional = false)
    private StubModule moduleId;

	public Integer getQpId() {
		return qpId;
	}

	public void setQpId(Integer qpId) {
		this.qpId = qpId;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public Usr getUsrId() {
		return usrId;
	}

	public void setUsrId(Usr usrId) {
		this.usrId = usrId;
	}

	public StubModule getModuleId() {
		return moduleId;
	}

	public void setModuleId(StubModule moduleId) {
		this.moduleId = moduleId;
	}

}
