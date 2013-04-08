package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stub_usr_type")
public class StubUsrType implements Serializable {
	
    private static final long serialVersionUID = -2408956718940275355L;
	
    @Id
    @Column(name = "USR_TYPE_ID")
    private Integer usrTypeId;

    @Column(name = "USR_TYPE_NAME")
    private String usrTypeName;

	public Integer getUsrTypeId() {
    	return usrTypeId;
    }

	public void setUsrTypeId(Integer usrTypeId) {
    	this.usrTypeId = usrTypeId;
    }

	public String getUsrTypeName() {
    	return usrTypeName;
    }

	public void setUsrTypeName(String usrTypeName) {
    	this.usrTypeName = usrTypeName;
    }
    
}
