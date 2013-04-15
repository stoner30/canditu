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
@Table(name = "ad_bldg")
public class AdBldg implements Serializable {

	private static final long serialVersionUID = 7660253649437401469L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AB_ID")
    private Integer abId;

    @Column(name = "AD_ORDER")
    private int adOrder;
    
    @JoinColumn(name = "BLDG_ID", referencedColumnName = "BLDG_ID")
    @ManyToOne(optional = false)
    private Bldg bldgId;
    
    @JoinColumn(name = "AD_ID", referencedColumnName = "AD_ID")
    @ManyToOne(optional = false)
    private Ad adId;

    public Integer getAbId() {
        return abId;
    }

    public void setAbId(Integer abId) {
        this.abId = abId;
    }

    public int getAdOrder() {
        return adOrder;
    }

    public void setAdOrder(int adOrder) {
        this.adOrder = adOrder;
    }

    public Bldg getBldgId() {
        return bldgId;
    }

    public void setBldgId(Bldg bldgId) {
        this.bldgId = bldgId;
    }

    public Ad getAdId() {
        return adId;
    }

    public void setAdId(Ad adId) {
        this.adId = adId;
    }

}
