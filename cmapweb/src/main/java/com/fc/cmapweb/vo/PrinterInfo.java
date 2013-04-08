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
import com.fc.cmapweb.vo.Restaurant;

@Entity
@Table(name = "printer_info")
public class PrinterInfo implements Serializable {
	
	private static final long serialVersionUID = 2804800381266605750L;
	
	@Id
    @Column(name = "printer_id")
    private String printerId;
    
    @Column(name = "processing")
    private Boolean processing;

    @Column(name = "online")
    private Boolean online;
    
    @Column(name = "ip_port")
    private String ipPort;
    
    @Column(name = "active_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date activeTime;
    
    @JoinColumn(name = "rest_id", referencedColumnName = "REST_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restaurant restaurant;

	public String getPrinterId() {
    	return printerId;
    }

	public void setPrinterId(String printerId) {
    	this.printerId = printerId;
    }

	public Boolean getProcessing() {
    	return processing;
    }

	public void setProcessing(Boolean processing) {
    	this.processing = processing;
    }

	public Boolean getOnline() {
    	return online;
    }

	public void setOnline(Boolean online) {
    	this.online = online;
    }

	public String getIpPort() {
    	return ipPort;
    }

	public void setIpPort(String ipPort) {
    	this.ipPort = ipPort;
    }

	public Date getActiveTime() {
    	return activeTime;
    }

	public void setActiveTime(Date activeTime) {
    	this.activeTime = activeTime;
    }

	public Restaurant getRestaurant() {
    	return restaurant;
    }

	public void setRestaurant(Restaurant restaurant) {
    	this.restaurant = restaurant;
    }
}
