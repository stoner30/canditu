package com.fc.cmapweb.vo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "order_info")
public class OrderInfo implements Serializable {
    
	private static final long serialVersionUID = -6436969650598946634L;

	@Id
    @Column(name = "ORDER_NBR")
    private String orderNbr;
    
    @Column(name = "USR_ID")
    private Integer usrId;
    
    @Column(name = "ORDER_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderTime;
    
    @Column(name = "REST_ID")
    private Integer restId;
    
    @Column(name = "ORIGIN_AMOUNT")
    private Double originAmount;
    
    @Column(name = "FINAL_AMOUNT")
    private Double finalAmount;
    
    @Column(name = "BLDG_ID")
    private Integer bldgId;
    
    @Column(name = "DLVY_ADDR")
    private String dlvyAddr;
    
    @Column(name = "CNEE")
    private String cnee;
    
    @Column(name = "PHONE")
    private String phone;
    
    @Column(name = "ORDER_MEMO")
    private String orderMemo;
    
    @Column(name = "EXPECT_TIME")
    @Temporal(TemporalType.TIME)
    private Date expectTime;
    
    @Column(name = "ACTIVITY_ID")
    private Integer activityId;
    
    @JoinColumn(name = "OS_ID", referencedColumnName = "OS_ID")
    @ManyToOne(optional = false)
    private StubOrderStatus osId;

	public String getOrderNbr() {
		return orderNbr;
	}

	public void setOrderNbr(String orderNbr) {
		this.orderNbr = orderNbr;
	}

	public Integer getUsrId() {
		return usrId;
	}

	public void setUsrId(Integer usrId) {
		this.usrId = usrId;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Integer getRestId() {
		return restId;
	}

	public void setRestId(Integer restId) {
		this.restId = restId;
	}

	public Double getOriginAmount() {
		return originAmount;
	}

	public void setOriginAmount(Double originAmount) {
		this.originAmount = originAmount;
	}

	public Double getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(Double finalAmount) {
		this.finalAmount = finalAmount;
	}

	public Integer getBldgId() {
		return bldgId;
	}

	public void setBldgId(Integer bldgId) {
		this.bldgId = bldgId;
	}

	public String getDlvyAddr() {
		return dlvyAddr;
	}

	public void setDlvyAddr(String dlvyAddr) {
		this.dlvyAddr = dlvyAddr;
	}

	public String getCnee() {
		return cnee;
	}

	public void setCnee(String cnee) {
		this.cnee = cnee;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOrderMemo() {
		return orderMemo;
	}

	public void setOrderMemo(String orderMemo) {
		this.orderMemo = orderMemo;
	}

	public Date getExpectTime() {
		return expectTime;
	}

	public void setExpectTime(Date expectTime) {
		this.expectTime = expectTime;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public StubOrderStatus getOsId() {
		return osId;
	}

	public void setOsId(StubOrderStatus osId) {
		this.osId = osId;
	}

}
