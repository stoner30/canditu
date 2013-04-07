package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stub_dish_info_type")
public class StubDishInfoType implements Serializable {
    
    private static final long serialVersionUID = 6644234557740921540L;
	
    @Id
    @Column(name = "DIT_ID")
    private Integer ditId;
    
    @Column(name = "DIT_NAME")
    private String ditName;
    
    public StubDishInfoType() {
    }

    public StubDishInfoType(Integer ditId) {
        this.ditId = ditId;
    }

    public StubDishInfoType(Integer ditId, String ditName) {
        this.ditId = ditId;
        this.ditName = ditName;
    }

	public Integer getDitId() {
    	return ditId;
    }

	public void setDitId(Integer ditId) {
    	this.ditId = ditId;
    }

	public String getDitName() {
    	return ditName;
    }

	public void setDitName(String ditName) {
    	this.ditName = ditName;
    }
    
}
