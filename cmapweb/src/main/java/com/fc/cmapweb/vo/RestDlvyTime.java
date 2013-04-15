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
@Table(name = "rest_dlvy_time")
public class RestDlvyTime implements Serializable {
    
	private static final long serialVersionUID = -3024116602608253267L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RDT_ID")
    private Integer rdtId;
    
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false)
    private Restaurant restId;
    
    @JoinColumn(name = "DT_ID", referencedColumnName = "DT_ID")
    @ManyToOne(optional = false)
    private DlvyTime dtId;

	public Integer getRdtId() {
		return rdtId;
	}

	public void setRdtId(Integer rdtId) {
		this.rdtId = rdtId;
	}

	public Restaurant getRestId() {
		return restId;
	}

	public void setRestId(Restaurant restId) {
		this.restId = restId;
	}

	public DlvyTime getDtId() {
		return dtId;
	}

	public void setDtId(DlvyTime dtId) {
		this.dtId = dtId;
	}

}
