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
@Table(name = "notice_bldg")
public class NoticeBldg implements Serializable {
    
	private static final long serialVersionUID = -5344350169913254183L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "NB_ID")
    private Integer nbId;
    
    @JoinColumn(name = "BLDG_ID", referencedColumnName = "BLDG_ID")
    @ManyToOne(optional = false)
    private Bldg bldgId;
    
    @JoinColumn(name = "NOTICE_ID", referencedColumnName = "NOTICE_ID")
    @ManyToOne(optional = false)
    private Notice noticeId;

	public Integer getNbId() {
		return nbId;
	}

	public void setNbId(Integer nbId) {
		this.nbId = nbId;
	}

	public Bldg getBldgId() {
		return bldgId;
	}

	public void setBldgId(Bldg bldgId) {
		this.bldgId = bldgId;
	}

	public Notice getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(Notice noticeId) {
		this.noticeId = noticeId;
	}

}
