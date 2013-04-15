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
@Table(name = "rest_dpr")
public class RestDpr implements Serializable {

	private static final long serialVersionUID = -3349562398981065440L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RD_ID")
    private Integer rdId;
	
    @JoinColumn(name = "DPR_ID", referencedColumnName = "DPR_ID")
    @ManyToOne(optional = false)
    private StubDlvyPrRge dprId;
    
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false)
    private Restaurant restId;

	public Integer getRdId() {
		return rdId;
	}

	public void setRdId(Integer rdId) {
		this.rdId = rdId;
	}

	public StubDlvyPrRge getDprId() {
		return dprId;
	}

	public void setDprId(StubDlvyPrRge dprId) {
		this.dprId = dprId;
	}

	public Restaurant getRestId() {
		return restId;
	}

	public void setRestId(Restaurant restId) {
		this.restId = restId;
	}

}
