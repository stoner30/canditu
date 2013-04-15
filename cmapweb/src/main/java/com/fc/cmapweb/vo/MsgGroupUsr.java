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
@Table(name = "msg_group_usr")
public class MsgGroupUsr implements Serializable {
    
	private static final long serialVersionUID = -4682952042392888849L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MGU_ID")
    private Integer mguId;
    
    @JoinColumn(name = "USR_ID", referencedColumnName = "USR_ID")
    @ManyToOne(optional = false)
    private Usr usrId;
    
    @JoinColumn(name = "MG_ID", referencedColumnName = "MG_ID")
    @ManyToOne(optional = false)
    private MsgGroup mgId;

	public Integer getMguId() {
		return mguId;
	}

	public void setMguId(Integer mguId) {
		this.mguId = mguId;
	}

	public Usr getUsrId() {
		return usrId;
	}

	public void setUsrId(Usr usrId) {
		this.usrId = usrId;
	}

	public MsgGroup getMgId() {
		return mgId;
	}

	public void setMgId(MsgGroup mgId) {
		this.mgId = mgId;
	}

}
