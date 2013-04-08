package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "PRINT_DATA_DETAIL")
public class PrintDataDetail implements Serializable {

	private static final long serialVersionUID = -6389096812358040211L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "detail_id")
    private Integer detailId;

    @Column(name = "print_data_id")
    private Integer printDataId;
    
    @Lob
    @Column(name = "detail_content")
    private String detailContent;

    public PrintDataDetail() {
    }

    public PrintDataDetail(Integer detailId) {
        this.detailId = detailId;
    }

    public PrintDataDetail(Integer detailId, Integer printDataId, String detailContent) {
        this.detailId = detailId;
        this.printDataId = printDataId;
        this.detailContent = detailContent;
    }

	public Integer getDetailId() {
    	return detailId;
    }

	public void setDetailId(Integer detailId) {
    	this.detailId = detailId;
    }

	public Integer getPrintDataId() {
    	return printDataId;
    }

	public void setPrintDataId(Integer printDataId) {
    	this.printDataId = printDataId;
    }

	public String getDetailContent() {
    	return detailContent;
    }

	public void setDetailContent(String detailContent) {
    	this.detailContent = detailContent;
    }
    
}