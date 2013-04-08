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
@Table(name = "combo_dish_subcat")
public class ComboDishSubcat implements Serializable {
	
	private static final long serialVersionUID = -1023182955943253656L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cds_id")
    private Integer cdsId;

    @Column(name = "dr_val")
    private Integer drVal;
    
    @JoinColumn(name = "dr_id", referencedColumnName = "dr_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private StubDishRule drId;
    
    @JoinColumn(name = "dct_id", referencedColumnName = "dct_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DishCatType dctId;

    public ComboDishSubcat(Integer cdsId) {
        this.cdsId = cdsId;
    }

    public Integer getCdsId() {
        return cdsId;
    }

    public void setCdsId(Integer cdsId) {
        this.cdsId = cdsId;
    }

    public Integer getDrVal() {
        return drVal;
    }

    public void setDrVal(Integer drVal) {
        this.drVal = drVal;
    }

    public StubDishRule getDrId() {
        return drId;
    }

    public void setDrId(StubDishRule drId) {
        this.drId = drId;
    }

    public DishCatType getDctId() {
        return dctId;
    }

    public void setDctId(DishCatType dctId) {
        this.dctId = dctId;
    }

}
