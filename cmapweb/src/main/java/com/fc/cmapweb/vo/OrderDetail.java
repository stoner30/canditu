package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fc.cmapweb.vo.OrderInfo;

@Entity
@Table(name = "order_detail")
public class OrderDetail implements Serializable {
	
	private static final long serialVersionUID = 2440862321574420200L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OD_ID")
    private Integer odId;

    @Column(name = "DISH_NAME")
    private String dishName;

    @Column(name = "DISH_CFG")
    private String dishCfg;

    @Column(name = "DISH_DETAIL")
    private String dishDetail;

    @Column(name = "DISH_CONT")
    private Integer dishCont;

    @Column(name = "DISH_PRICE")
    private Float dishPrice;
    
    @Column(name = "UPDATE_REASON")
    private String updateReason;
    
    @JoinColumn(name = "ORDER_NBR", referencedColumnName = "ORDER_NBR")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OrderInfo orderInfo;

	public Integer getOdId() {
    	return odId;
    }

	public void setOdId(Integer odId) {
    	this.odId = odId;
    }

	public String getDishName() {
    	return dishName;
    }

	public void setDishName(String dishName) {
    	this.dishName = dishName;
    }

	public String getDishCfg() {
    	return dishCfg;
    }

	public void setDishCfg(String dishCfg) {
    	this.dishCfg = dishCfg;
    }

	public String getDishDetail() {
    	return dishDetail;
    }

	public void setDishDetail(String dishDetail) {
    	this.dishDetail = dishDetail;
    }

	public Integer getDishCont() {
    	return dishCont;
    }

	public void setDishCont(Integer dishCont) {
    	this.dishCont = dishCont;
    }

	public Float getDishPrice() {
    	return dishPrice;
    }

	public void setDishPrice(Float dishPrice) {
    	this.dishPrice = dishPrice;
    }

	public String getUpdateReason() {
    	return updateReason;
    }

	public void setUpdateReason(String updateReason) {
    	this.updateReason = updateReason;
    }

	public OrderInfo getOrderInfo() {
    	return orderInfo;
    }

	public void setOrderInfo(OrderInfo orderInfo) {
    	this.orderInfo = orderInfo;
    }

}
