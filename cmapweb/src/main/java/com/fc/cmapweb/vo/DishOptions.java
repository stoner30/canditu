package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dish_options")
public class DishOptions implements Serializable {
	
	private static final long serialVersionUID = -4007222951580141560L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "do_id")
    private Integer doId;

    @Basic(optional = false)
    @Column(name = "do_val")
    private String doVal;

    @JoinColumn(name = "dish_id", referencedColumnName = "dish_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Dish dish;

    public DishOptions() {
    }

    public DishOptions(Integer doId) {
        this.doId = doId;
    }

    public DishOptions(Integer doId, String doVal) {
        this.doId = doId;
        this.doVal = doVal;
    }

    public Integer getDoId() {
        return doId;
    }

    public void setDoId(Integer doId) {
        this.doId = doId;
    }

    public String getDoVal() {
        return doVal;
    }

    public void setDoVal(String doVal) {
        this.doVal = doVal;
    }

	public Dish getDish() {
		return dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

}
