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
@Table(name = "PRINT_DATA")
public class PrintData implements Serializable {

    private static final long serialVersionUID = -4921853003523253350L;
	
    @Id
    @Column(name = "data_id")
    private String dataId;
   
    @Column(name = "orderNbr")
    private String orderNbr;
    
    @Column(name = "orderTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderTime;

    @Column(name = "pageNbr")
    private Integer pageNbr;
    
    @Column(name = "pkgNbr")
    private Integer pkgNbr;
    
    @JoinColumn(name = "printer_id", referencedColumnName = "printer_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PrinterInfo printerInfo;

    public PrintData() {
    }

    public PrintData(String dataId) {
        this.dataId = dataId;
    }

    public PrintData(String dataId, String orderNbr, Date orderTime, Integer pageNbr, Integer pkgNbr) {
        this.dataId = dataId;
        this.orderNbr = orderNbr;
        this.orderTime = orderTime;
        this.pageNbr = pageNbr;
        this.pkgNbr = pkgNbr;
    }

	public String getDataId() {
    	return dataId;
    }

	public void setDataId(String dataId) {
    	this.dataId = dataId;
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

	public Integer getPageNbr() {
    	return pageNbr;
    }

	public void setPageNbr(Integer pageNbr) {
    	this.pageNbr = pageNbr;
    }

	public Integer getPkgNbr() {
    	return pkgNbr;
    }

	public void setPkgNbr(Integer pkgNbr) {
    	this.pkgNbr = pkgNbr;
    }

	public PrinterInfo getPrinterInfo() {
    	return printerInfo;
    }

	public void setPrinterInfo(PrinterInfo printerInfo) {
    	this.printerInfo = printerInfo;
    }
    
}