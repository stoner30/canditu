package com.fc.cmapweb.vo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "dlvy_time")
public class DlvyTime implements Serializable {
    
	private static final long serialVersionUID = 5716666259889200490L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DT_ID")
    private Integer dtId;
    
    @Column(name = "START_TIME")
    @Temporal(TemporalType.TIME)
    private Date startTime;
    
    @Column(name = "END_TIME")
    @Temporal(TemporalType.TIME)
    private Date endTime;

	public Integer getDtId() {
		return dtId;
	}

	public void setDtId(Integer dtId) {
		this.dtId = dtId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
    
}
