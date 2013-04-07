package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "REST_EVAL")
public class RestEval implements Serializable {

	private static final long serialVersionUID = -7654259084615760800L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RE_ID")
    private Integer reId;

	@Basic(optional = false)
    @Column(name = "RE_CONT")
    private Integer reCont;
	
    @Column(name = "RE_VAL")
    private Integer reVal;
    
    @JoinColumn(name = "RET_ID", referencedColumnName = "RET_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private StubRestEvalType stubRestEvalType;
    
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restaurant restaurant;

    public RestEval() {
    }

    public RestEval(Integer reId) {
        this.reId = reId;
    }

    public RestEval(Integer reId, Integer reCont, Integer reVal) {
        this.reId = reId;
        this.reCont = reCont;
        this.reVal = reVal;
    }

    public Integer getReId() {
        return reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    public int getReCont() {
        return reCont;
    }

    public void setReCont(int reCont) {
        this.reCont = reCont;
    }

    public int getReVal() {
        return reVal;
    }

    public void setReVal(int reVal) {
        this.reVal = reVal;
    }

    public StubRestEvalType getStubRestEvalType() {
        return stubRestEvalType;
    }

    public void setStubRestEvalType(StubRestEvalType stubRestEvalType) {
        this.stubRestEvalType = stubRestEvalType;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    
}
