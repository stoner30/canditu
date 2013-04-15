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
@Table(name = "option")
public class Option implements Serializable {
    
	private static final long serialVersionUID = -3914070668401080441L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OPTION_ID")
    private Integer optionId;
    
    @Column(name = "OPTION_VALUE")
    private String optionValue;
    
    @JoinColumn(name = "OPTION_TYPE_ID", referencedColumnName = "OPTION_TYPE_ID")
    @ManyToOne(optional = false)
    private OptionType optionType;

	public Integer getOptionId() {
		return optionId;
	}

	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

	public String getOptionValue() {
		return optionValue;
	}

	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

	public OptionType getOptionType() {
		return optionType;
	}

	public void setOptionType(OptionType optionType) {
		this.optionType = optionType;
	}

}
