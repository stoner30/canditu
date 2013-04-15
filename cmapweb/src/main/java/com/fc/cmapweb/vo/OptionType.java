package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "option_type")
public class OptionType implements Serializable {
    
	private static final long serialVersionUID = 1556376786980921481L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OPTION_TYPE_ID")
    private Integer optionTypeId;
    
    @Column(name = "OPTION_TYPE_NAME")
    private String optionTypeName;
    
    @Column(name = "ORDER")
    private Integer order;
    
    @Column(name = "VALID_TYPE")
    private String validType;
    
    @JoinColumn(name = "DISH_ID", referencedColumnName = "DISH_ID")
    @ManyToOne(optional = false)
    private Dish dishId;

	public Integer getOptionTypeId() {
		return optionTypeId;
	}

	public void setOptionTypeId(Integer optionTypeId) {
		this.optionTypeId = optionTypeId;
	}

	public String getOptionTypeName() {
		return optionTypeName;
	}

	public void setOptionTypeName(String optionTypeName) {
		this.optionTypeName = optionTypeName;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public String getValidType() {
		return validType;
	}

	public void setValidType(String validType) {
		this.validType = validType;
	}

	public Dish getDishId() {
		return dishId;
	}

	public void setDishId(Dish dishId) {
		this.dishId = dishId;
	}

}
