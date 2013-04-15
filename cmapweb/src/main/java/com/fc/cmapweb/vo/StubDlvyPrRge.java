package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stub_dlvy_pr_rge")
public class StubDlvyPrRge implements Serializable {
    
	private static final long serialVersionUID = -9167202930439040731L;

	@Id
    @Column(name = "DPR_ID")
    private Integer dprId;
    
    @Column(name = "DPR_MIN")
    private Integer dprMin;
    
    @Column(name = "DPR_MAX")
    private Integer dprMax;

	public Integer getDprId() {
		return dprId;
	}

	public void setDprId(Integer dprId) {
		this.dprId = dprId;
	}

	public Integer getDprMin() {
		return dprMin;
	}

	public void setDprMin(Integer dprMin) {
		this.dprMin = dprMin;
	}

	public Integer getDprMax() {
		return dprMax;
	}

	public void setDprMax(Integer dprMax) {
		this.dprMax = dprMax;
	}
    
}
