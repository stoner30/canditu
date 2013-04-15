package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stub_privilege")
public class StubPrivilege implements Serializable {
    
	private static final long serialVersionUID = 2831670564382407335L;

	@Id
    @Column(name = "PRIV_ID")
    private Integer privId;

    @JoinColumn(name = "OPERATION_ID", referencedColumnName = "OPERATION_ID")
    @ManyToOne(optional = false)
    private StubOperation stubOperation;
    
    @JoinColumn(name = "MODULE_ID", referencedColumnName = "MODULE_ID")
    @ManyToOne(optional = false)
    private StubModule stubModule;

	public Integer getPrivId() {
		return privId;
	}

	public void setPrivId(Integer privId) {
		this.privId = privId;
	}

	public StubOperation getStubOperation() {
		return stubOperation;
	}

	public void setStubOperation(StubOperation stubOperation) {
		this.stubOperation = stubOperation;
	}

	public StubModule getStubModule() {
		return stubModule;
	}

	public void setStubModule(StubModule stubModule) {
		this.stubModule = stubModule;
	}

}
