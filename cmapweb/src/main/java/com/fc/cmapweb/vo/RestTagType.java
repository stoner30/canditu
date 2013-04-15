package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rest_tag_type")
public class RestTagType implements Serializable {
    
	private static final long serialVersionUID = -3157027937956562875L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RTT_ID")
    private Integer rttId;
    
    @Column(name = "RT_NAME")
    private String rtName;

	public Integer getRttId() {
		return rttId;
	}

	public void setRttId(Integer rttId) {
		this.rttId = rttId;
	}

	public String getRtName() {
		return rtName;
	}

	public void setRtName(String rtName) {
		this.rtName = rtName;
	}

}
