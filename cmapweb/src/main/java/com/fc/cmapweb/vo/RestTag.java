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
@Table(name = "rest_tag")
public class RestTag implements Serializable {
    
	private static final long serialVersionUID = -6462836632062938978L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RT_ID")
    private Integer rtId;
	
    @JoinColumn(name = "RTT_ID", referencedColumnName = "RTT_ID")
    @ManyToOne(optional = false)
    private RestTagType rttId;
    
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false)
    private Restaurant restId;

	public Integer getRtId() {
		return rtId;
	}

	public void setRtId(Integer rtId) {
		this.rtId = rtId;
	}

	public RestTagType getRttId() {
		return rttId;
	}

	public void setRttId(RestTagType rttId) {
		this.rttId = rttId;
	}

	public Restaurant getRestId() {
		return restId;
	}

	public void setRestId(Restaurant restId) {
		this.restId = restId;
	}

}
