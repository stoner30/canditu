package com.fc.cmapweb.vo;

import java.io.Serializable;
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
@Table(name = "ORDER_INFO")
public class OrderInfo implements Serializable {

	private static final long serialVersionUID = 2693534161935241680L;
	
	@Id
    @Column(name = "ORDER_NBR")
    private String orderNbr;
   
    @Column(name = "ORDER_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderTime;

    @Column(name = "ORDER_AMOUNT")
    private Float orderAmount;

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

    @JoinColumn(name = "USR_ID", referencedColumnName = "USR_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usr usr;
    
    @JoinColumn(name = "OS_ID", referencedColumnName = "OS_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private StubOrderStatus stubOrderStatus;
    
    @JoinColumn(name = "REST_ID", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restaurant restaurant;
    
    public OrderInfo() {
    }

    public OrderInfo(String orderNbr) {
        this.orderNbr = orderNbr;
    }

    public OrderInfo(String orderNbr, Date orderTime, Float orderAmount, String dlvyAddr, String cnee, String phone, Date expectTime) {
        this.orderNbr = orderNbr;
        this.orderTime = orderTime;
        this.orderAmount = orderAmount;
        this.dlvyAddr = dlvyAddr;
        this.cnee = cnee;
        this.phone = phone;
        this.expectTime = expectTime;
    }

	public String getOrderNbr() {
    	return orderNbr;
    }

	public void setOrderNbr(String orderNbr) {
    	this.orderNbr = orderNbr;
    }

	public Date getOrderTime() {
    	return orderTime;
    }

	public void setOrderTime(Date orderTime) {
    	this.orderTime = orderTime;
    }

	public Float getOrderAmount() {
    	return orderAmount;
    }

	public void setOrderAmount(Float orderAmount) {
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

	public Usr getUsr() {
    	return usr;
    }

	public void setUsr(Usr usr) {
    	this.usr = usr;
    }

	public StubOrderStatus getStubOrderStatus() {
    	return stubOrderStatus;
    }

	public void setStubOrderStatus(StubOrderStatus stubOrderStatus) {
    	this.stubOrderStatus = stubOrderStatus;
    }

	public Restaurant getRestaurant() {
    	return restaurant;
    }

	public void setRestaurant(Restaurant restaurant) {
    	this.restaurant = restaurant;
    }
    
}
