package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stub_order_status")
public class StubOrderStatus implements Serializable {
    
	private static final long serialVersionUID = 4516490162123336943L;

	@Id
    @Column(name = "OS_ID")
    private Integer osId;
    
    @Column(name = "OS_NAME")
    private String osName;

	public Integer getOsId() {
		return osId;
	}

	public void setOsId(Integer osId) {
		this.osId = osId;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

}
