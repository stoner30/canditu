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
@Table(name = "combo_dish")
public class ComboDish implements Serializable {
	
	private static final long serialVersionUID = -6693083469266964181L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CD_ID")
    private Integer cdId;

    @JoinColumn(name = "p_dish_id", referencedColumnName = "dish_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Dish pDishId;
 
    @JoinColumn(name = "dish_id", referencedColumnName = "dish_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Dish dishId;

    @JoinColumn(name = "cds_id", referencedColumnName = "cds_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ComboDishSubcat cdsId;

    public ComboDish(Integer cdId) {
        this.cdId = cdId;
    }

    public Integer getCdId() {
        return cdId;
    }

    public void setCdId(Integer cdId) {
        this.cdId = cdId;
    }

    public Dish getPDishId() {
        return pDishId;
    }

    public void setPDishId(Dish pDishId) {
        this.pDishId = pDishId;
    }

    public Dish getDishId() {
        return dishId;
    }

    public void setDishId(Dish dishId) {
        this.dishId = dishId;
    }

    public ComboDishSubcat getCdsId() {
        return cdsId;
    }

    public void setCdsId(ComboDishSubcat cdsId) {
        this.cdsId = cdsId;
    }

}
