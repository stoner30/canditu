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
@Table(name = "REST_INFO")
public class RestInfo implements Serializable {

	private static final long serialVersionUID = 4246828716661182545L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RI_ID")
    private Integer riId;
    
    @Column(name = "RI_DATA1")
    private String riData1;
    
	@Column(name = "RI_DATA2")
    private String riData2;

	@Column(name = "RI_DATA3")
    private String riData3;
    
	@Column(name = "RI_DATA4")
    private String riData4;
    
	@JoinColumn(name = "RIT_ID", referencedColumnName = "RIT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private StubRestInfoType stubRestInfoType;
    
	@JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restaurant restaurant;

    public RestInfo() {
    }

    public RestInfo(Integer riId) {
        this.riId = riId;
    }

    public RestInfo(Integer riId, String riData1) {
        this.riId = riId;
        this.riData1 = riData1;
    }

    public Integer getRiId() {
        return riId;
    }

    public void setRiId(Integer riId) {
        this.riId = riId;
    }

    public String getRiData1() {
        return riData1;
    }

    public void setRiData1(String riData1) {
        this.riData1 = riData1;
    }

    public String getRiData2() {
        return riData2;
    }

    public void setRiData2(String riData2) {
        this.riData2 = riData2;
    }

    public String getRiData3() {
        return riData3;
    }

    public void setRiData3(String riData3) {
        this.riData3 = riData3;
    }

    public String getRiData4() {
        return riData4;
    }

    public void setRiData4(String riData4) {
        this.riData4 = riData4;
    }

    public StubRestInfoType getStubRestInfoType() {
        return stubRestInfoType;
    }

    public void setStubRestInfoType(StubRestInfoType stubRestInfoType) {
        this.stubRestInfoType = stubRestInfoType;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    
}
