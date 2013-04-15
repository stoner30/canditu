package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_detail")
public class OrderDetail implements Serializable {
    
	private static final long serialVersionUID = -3289003292014843916L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OD_ID")
    private Integer odId;
    
    @Column(name = "DISH_ID")
    private Integer dishId;
    
    @Column(name = "DISH_NAME")
    private String dishName;
    
    @Lob
    @Column(name = "DISH_CFG")
    private String dishCfg;
    
    @Column(name = "DISH_DETAIL")
    private String dishDetail;
    
    @Column(name = "DISH_MEMO")
    private String dishMemo;
    
    @Column(name = "DISH_CONT")
    private Integer dishCont;
    
    @Column(name = "DISH_ORIGIN_PRICE")
    private Double dishOriginPrice;
    
    @Column(name = "DISH_FINAL_PRICE")
    private Double dishFinalPrice;
    
    @Column(name = "IS_DEL")
    private Integer isDel;
    
    @JoinColumn(name = "ORDER_NBR", referencedColumnName = "ORDER_NBR")
    @ManyToOne(optional = false)
    private OrderInfo orderNbr;

	public Integer getOdId() {
		return odId;
	}

	public void setOdId(Integer odId) {
		this.odId = odId;
	}

	public Integer getDishId() {
		return dishId;
	}

	public void setDishId(Integer dishId) {
		this.dishId = dishId;
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

	public String getDishMemo() {
		return dishMemo;
	}

	public void setDishMemo(String dishMemo) {
		this.dishMemo = dishMemo;
	}

	public Integer getDishCont() {
		return dishCont;
	}

	public void setDishCont(Integer dishCont) {
		this.dishCont = dishCont;
	}

	public Double getDishOriginPrice() {
		return dishOriginPrice;
	}

	public void setDishOriginPrice(Double dishOriginPrice) {
		this.dishOriginPrice = dishOriginPrice;
	}

	public Double getDishFinalPrice() {
		return dishFinalPrice;
	}

	public void setDishFinalPrice(Double dishFinalPrice) {
		this.dishFinalPrice = dishFinalPrice;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	public OrderInfo getOrderNbr() {
		return orderNbr;
	}

	public void setOrderNbr(OrderInfo orderNbr) {
		this.orderNbr = orderNbr;
	}

}
