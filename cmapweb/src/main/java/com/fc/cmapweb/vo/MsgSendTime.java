package com.fc.cmapweb.vo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "msg_send_time")
public class MsgSendTime implements Serializable {
    
	private static final long serialVersionUID = -9053786652846565705L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MST_ID")
    private Integer mstId;
    
    @Column(name = "MST_START_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mstStartTime;
    
    @Column(name = "MST_END_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mstEndTime;
    
    @JoinColumn(name = "MT_ID", referencedColumnName = "MT_ID")
    @ManyToOne(optional = false)
    private MsgTemplate mtId;
    
    @JoinColumn(name = "MG_ID", referencedColumnName = "MG_ID")
    @ManyToOne(optional = false)
    private MsgGroup mgId;

	public Integer getMstId() {
		return mstId;
	}

	public void setMstId(Integer mstId) {
		this.mstId = mstId;
	}

	public Date getMstStartTime() {
		return mstStartTime;
	}

	public void setMstStartTime(Date mstStartTime) {
		this.mstStartTime = mstStartTime;
	}

	public Date getMstEndTime() {
		return mstEndTime;
	}

	public void setMstEndTime(Date mstEndTime) {
		this.mstEndTime = mstEndTime;
	}

	public MsgTemplate getMtId() {
		return mtId;
	}

	public void setMtId(MsgTemplate mtId) {
		this.mtId = mtId;
	}

	public MsgGroup getMgId() {
		return mgId;
	}

	public void setMgId(MsgGroup mgId) {
		this.mgId = mgId;
	}

}
