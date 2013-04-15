package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "activity")
public class Activity implements Serializable {

	private static final long serialVersionUID = 6030052344822294610L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ACTIVITY_ID")
    private Integer activityId;

    @Column(name = "ACTIVITY_AMOUNT_OFFSET")
    private int activityAmountOffset;

    @Column(name = "ACTIVITY_NAME")
    private String activityName;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public int getActivityAmountOffset() {
        return activityAmountOffset;
    }

    public void setActivityAmountOffset(int activityAmountOffset) {
        this.activityAmountOffset = activityAmountOffset;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

}
