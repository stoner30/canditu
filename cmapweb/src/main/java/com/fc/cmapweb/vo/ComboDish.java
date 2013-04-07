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
@Table(name = "COMBO_DISH")
public class ComboDish implements Serializable {

	private static final long serialVersionUID = 271842945164775581L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CD_ID")
    private Integer cdId;
	
    @Column(name = "CD_PRICE")
    private Float cdPrice;
    
    @Column(name = "DR_ID")
    private Short drId;
    
    @Column(name = "DR_VAL1")
    private String drVal1;
    
    @Column(name = "DR_VAL2")
    private String drVal2;
    
    @Column(name = "DISH_NODE")
    private String dishNode;
    
    @JoinColumn(name = "P_DISH_ID", referencedColumnName = "DISH_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Dish pDish;
    
    @JoinColumn(name = "DISH_ID", referencedColumnName = "DISH_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Dish dish;

    public ComboDish() {
    }

    public ComboDish(Integer cdId) {
        this.cdId = cdId;
    }

    public ComboDish(Integer cdId, Float cdPrice, short drId) {
        this.cdId = cdId;
        this.cdPrice = cdPrice;
        this.drId = drId;
    }

	public Integer getCdId() {
    	return cdId;
    }

	public void setCdId(Integer cdId) {
    	this.cdId = cdId;
    }

	public Float getCdPrice() {
    	return cdPrice;
    }

	public void setCdPrice(Float cdPrice) {
    	this.cdPrice = cdPrice;
    }

	public Short getDrId() {
    	return drId;
    }

	public void setDrId(Short drId) {
    	this.drId = drId;
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

	public String getDishNode() {
    	return dishNode;
    }

	public void setDishNode(String dishNode) {
    	this.dishNode = dishNode;
    }

	public Dish getPDish() {
    	return pDish;
    }

	public void setPDish(Dish pDish) {
    	this.pDish = pDish;
    }

	public Dish getDish() {
    	return dish;
    }

	public void setDish(Dish dish) {
    	this.dish = dish;
    }

}
