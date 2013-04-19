package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notice")
public class Notice implements Serializable {
    
	private static final long serialVersionUID = 656530713456542141L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "NOTICE_ID")
    private Integer noticeId;
    
    @Column(name = "NOTICE_CONTENT")
    private String noticeContent;
    
    @Column(name = "NOTICE_ORDER")
    private Integer noticeOrder;

	public Integer getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(Integer noticeId) {
		this.noticeId = noticeId;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public Integer getNoticeOrder() {
		return noticeOrder;
	}

	public void setNoticeOrder(Integer noticeOrder) {
		this.noticeOrder = noticeOrder;
	}
    
}
