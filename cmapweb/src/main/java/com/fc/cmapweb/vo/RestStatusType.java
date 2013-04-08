package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rest_status_type")
public class RestStatusType implements Serializable {
    
    private static final long serialVersionUID = 7819021177717355765L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STATUS_ID")
    private Integer statusId;

    @Column(name = "STATUS_NAME")
    private String statusName;

    @Column(name = "STATUS_CODE")
    private String statusCode;

	public Integer getStatusId() {
    	return statusId;
    }

	public void setStatusId(Integer statusId) {
    	this.statusId = statusId;
    }

	public String getStatusName() {
    	return statusName;
    }

	public void setStatusName(String statusName) {
    	this.statusName = statusName;
    }

	public String getStatusCode() {
    	return statusCode;
    }

	public void setStatusCode(String statusCode) {
    	this.statusCode = statusCode;
    }
    
}
