package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stub_module")
public class StubModule implements Serializable {
    
	private static final long serialVersionUID = 549155290327596966L;

	@Id
    @Column(name = "MODULE_ID")
    private Integer moduleId;
    
    @Column(name = "MODULE_NAME")
    private String moduleName;

	public Integer getModuleId() {
		return moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
    
}
