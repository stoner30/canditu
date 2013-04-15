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
@Table(name = "activity_bldg")
public class ActivityBldg implements Serializable {
	
	private static final long serialVersionUID = -3811194970726814585L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AB_ID")
    private Integer abId;
    
    @JoinColumn(name = "ACTIVITY_ID", referencedColumnName = "ACTIVITY_ID")
    @ManyToOne(optional = false)
    private Activity activity;
    
    @JoinColumn(name = "BLDG_ID", referencedColumnName = "BLDG_ID")
    @ManyToOne(optional = false)
    private Bldg bldg;

    public Integer getAbId() {
        return abId;
    }

    public void setAbId(Integer abId) {
        this.abId = abId;
    }

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public Bldg getBldg() {
		return bldg;
	}

	public void setBldg(Bldg bldg) {
		this.bldg = bldg;
	}

}
