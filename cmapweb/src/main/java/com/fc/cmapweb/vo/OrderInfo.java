package com.fc.cmapweb.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "order_info")
public class OrderInfo implements Serializable {

	private static final long serialVersionUID = -2659702142396491052L;
	
	@Id
    @Column(name = "ORDER_NBR")
    private String orderNbr;

    @Column(name = "USR_ID")
    private int usrId;
    
    @Column(name = "ORDER_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderTime;
    
    @Column(name = "REST_ID")
    private int restId;

    @Column(name = "ORDER_AMOUNT")
    private BigDecimal orderAmount;
    
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
    
    @JoinColumn(name = "OS_ID", referencedColumnName = "OS_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private StubOrderStatus stubOrderStatus;
    
    @JoinColumn(name = "BLDG_ID", referencedColumnName = "BLDG_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Bldg bldg;

	public String getOrderNbr() {
		return orderNbr;
	}

	public void setOrderNbr(String orderNbr) {
		this.orderNbr = orderNbr;
	}

	public int getUsrId() {
		return usrId;
	}

	public void setUsrId(int usrId) {
		this.usrId = usrId;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public int getRestId() {
		return restId;
	}

	public void setRestId(int restId) {
		this.restId = restId;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
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

	public StubOrderStatus getStubOrderStatus() {
		return stubOrderStatus;
	}

	public void setStubOrderStatus(StubOrderStatus stubOrderStatus) {
		this.stubOrderStatus = stubOrderStatus;
	}

	public Bldg getBldg() {
		return bldg;
	}

	public void setBldg(Bldg bldg) {
		this.bldg = bldg;
	}
    
}
