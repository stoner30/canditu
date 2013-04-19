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
@Table(name = "recommend_bldg")
public class RecommendBldg implements Serializable {

	private static final long serialVersionUID = -1257589562089871913L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RB_ID")
    private Integer rbId;
	
    @JoinColumn(name = "RECOMMEND_ID", referencedColumnName = "RECOMMEND_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Recommend recommend;
    
    @JoinColumn(name = "BLDG_ID", referencedColumnName = "BLDG_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Bldg bldg;

	public Integer getRbId() {
		return rbId;
	}

	public void setRbId(Integer rbId) {
		this.rbId = rbId;
	}

	public Recommend getRecommend() {
		return recommend;
	}

	public void setRecommend(Recommend recommend) {
		this.recommend = recommend;
	}

	public Bldg getBldg() {
		return bldg;
	}

	public void setBldg(Bldg bldg) {
		this.bldg = bldg;
	}

}
