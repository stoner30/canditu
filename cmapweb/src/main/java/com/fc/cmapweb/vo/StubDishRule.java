package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stub_dish_rule")
public class StubDishRule implements Serializable {
    
	private static final long serialVersionUID = -4257074294915460225L;
	
	@Id
    @Column(name = "DR_ID")
    private Integer drId;

    @Column(name = "DR_NAME")
    private String drName;
  
	public Integer getDrId() {
    	return drId;
    }

	public void setDrId(Integer drId) {
    	this.drId = drId;
    }

	public String getDrName() {
    	return drName;
    }

	public void setDrName(String drName) {
    	this.drName = drName;
    }
    
}
