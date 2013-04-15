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
@Table(name = "rest_usr")
public class RestUsr implements Serializable {
    
	private static final long serialVersionUID = -2905425552547908353L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RU_ID")
    private Integer ruId;
    
    @JoinColumn(name = "USR_ID", referencedColumnName = "USR_ID")
    @ManyToOne(optional = false)
    private Usr usrId;
    
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false)
    private Restaurant restId;

	public Integer getRuId() {
		return ruId;
	}

	public void setRuId(Integer ruId) {
		this.ruId = ruId;
	}

	public Usr getUsrId() {
		return usrId;
	}

	public void setUsrId(Usr usrId) {
		this.usrId = usrId;
	}

	public Restaurant getRestId() {
		return restId;
	}

	public void setRestId(Restaurant restId) {
		this.restId = restId;
	}

}
