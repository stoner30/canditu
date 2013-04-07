package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stub_rest_eval_type")
public class StubRestEvalType implements Serializable {
    
    private static final long serialVersionUID = -5563850858992273546L;
	
    @Id
    @Column(name = "RET_ID")
    private Short retId;

    @Column(name = "RET_NAME")
    private String retName;
 
    public StubRestEvalType() {
    }

    public StubRestEvalType(Short retId) {
        this.retId = retId;
    }

    public StubRestEvalType(Short retId, String retName) {
        this.retId = retId;
        this.retName = retName;
    }

	public Short getRetId() {
    	return retId;
    }

	public void setRetId(Short retId) {
    	this.retId = retId;
    }

	public String getRetName() {
    	return retName;
    }

	public void setRetName(String retName) {
    	this.retName = retName;
    }
    
}
