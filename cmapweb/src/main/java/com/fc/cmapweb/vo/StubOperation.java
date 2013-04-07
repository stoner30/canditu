package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stub_operation")
public class StubOperation implements Serializable {

	private static final long serialVersionUID = 2569165487798522589L;
	
	@Id
    @Column(name = "OPERATION_ID")
    private Integer operationId;
	
    @Column(name = "OPERATION_NAME")
    private String operationName;

    public StubOperation() {
    }

    public StubOperation(Integer operationId) {
        this.operationId = operationId;
    }

    public StubOperation(Integer operationId, String operationName) {
        this.operationId = operationId;
        this.operationName = operationName;
    }

	public Integer getOperationId() {
    	return operationId;
    }

	public void setOperationId(Integer operationId) {
    	this.operationId = operationId;
    }

	public String getOperationName() {
    	return operationName;
    }

	public void setOperationName(String operationName) {
    	this.operationName = operationName;
    }
    
}
