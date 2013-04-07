package com.fc.cmapweb.vo;

import java.io.Serializable;
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
@Table(name = "DISH_OPTIONS")
public class DishOptions implements Serializable {
    
	private static final long serialVersionUID = -5581152377301199212L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DO_ID")
    private Integer doId;
	
    @Column(name = "DO_VAL1")
    private String doVal1;
    
    @Column(name = "DO_VAL2")
    private String doVal2;
    
    @Column(name = "DO_VAL3")
    private String doVal3;
    
    @Column(name = "DR_VAL1")
    private String drVal1;
    
    @Column(name = "DR_VAL2")
    private String drVal2;
    
    @JoinColumn(name = "DR_ID", referencedColumnName = "DR_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private StubDishRule stubDishRule;
    
    @JoinColumn(name = "DISH_ID", referencedColumnName = "DISH_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Dish dish;

    public DishOptions() {
    }

    public DishOptions(Integer doId) {
        this.doId = doId;
    }

    public Integer getDoId() {
        return doId;
    }

    public void setDoId(Integer doId) {
        this.doId = doId;
    }

    public String getDoVal1() {
        return doVal1;
    }

    public void setDoVal1(String doVal1) {
        this.doVal1 = doVal1;
    }

    public String getDoVal2() {
        return doVal2;
    }

    public void setDoVal2(String doVal2) {
        this.doVal2 = doVal2;
    }

    public String getDoVal3() {
        return doVal3;
    }

    public void setDoVal3(String doVal3) {
        this.doVal3 = doVal3;
    }

    public String getDrVal1() {
        return drVal1;
    }

    public void setDrVal1(String drVal1) {
        this.drVal1 = drVal1;
    }

    public String getDrVal2() {
        return drVal2;
    }

    public void setDrVal2(String drVal2) {
        this.drVal2 = drVal2;
    }

    public StubDishRule getStubDishRule() {
        return stubDishRule;
    }

    public void setStubDishRule(StubDishRule stubDishRule) {
        this.stubDishRule = stubDishRule;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }
    
}
