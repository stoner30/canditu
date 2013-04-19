package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rest_cat_type")
public class RestCatType implements Serializable {
    
	private static final long serialVersionUID = -189821190607860925L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RCT_ID")
    private Integer rctId;
    
    @Column(name = "RCT_NAME")
    private String rctName;
    
    @Column(name = "RCT_ORDER")
    private Integer rctOrder;

	public Integer getRctId() {
		return rctId;
	}

	public void setRctId(Integer rctId) {
		this.rctId = rctId;
	}

	public String getRctName() {
		return rctName;
	}

	public void setRctName(String rctName) {
		this.rctName = rctName;
	}

	public Integer getRctOrder() {
		return rctOrder;
	}

	public void setRctOrder(Integer rctOrder) {
		this.rctOrder = rctOrder;
	}
    
}
