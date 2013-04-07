package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stub_trans_type")
public class StubTransType implements Serializable {

	private static final long serialVersionUID = 2009226135420263164L;
	
	@Id
    @Column(name = "TRANS_TYPE_ID")
    private Integer transTypeId;
	
    @Column(name = "TRANS_TYPE_NAME")
    private String transTypeName;

    public StubTransType() {
    }

    public StubTransType(Integer transTypeId) {
        this.transTypeId = transTypeId;
    }

    public StubTransType(Integer transTypeId, String transTypeName) {
        this.transTypeId = transTypeId;
        this.transTypeName = transTypeName;
    }

	public Integer getTransTypeId() {
    	return transTypeId;
    }

	public void setTransTypeId(Integer transTypeId) {
    	this.transTypeId = transTypeId;
    }

	public String getTransTypeName() {
    	return transTypeName;
    }

	public void setTransTypeName(String transTypeName) {
    	this.transTypeName = transTypeName;
    }
    
}
