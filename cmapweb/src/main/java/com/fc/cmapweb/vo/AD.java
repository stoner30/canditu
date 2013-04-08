package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ad")
public class AD implements Serializable {

	private static final long serialVersionUID = -115156844860434989L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AD_ID")
    private Integer adId;

    @Column(name = "AD_DESC")
    private String adDesc;
    
    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getAdDesc() {
        return adDesc;
    }

    public void setAdDesc(String adDesc) {
        this.adDesc = adDesc;
    }

}
