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

@Entity
@Table(name = "DLVY_ADDR")
public class DlvyAddr implements Serializable {
    
    private static final long serialVersionUID = 3493643267821851150L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ADDR_ID")
    private Integer addrId;

    @Column(name = "CNEE")
    private String cnee;

    @Column(name = "ADDR_DET")
    private String addrDet;
    
    @Column(name = "MOBILE")
    private String mobile;

    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Customer customer;
    
    @JoinColumn(name = "BLDG_ID", referencedColumnName = "BLDG_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Bldg bldg;

    public DlvyAddr() {
    }

    public DlvyAddr(Integer addrId) {
        this.addrId = addrId;
    }

    public DlvyAddr(Integer addrId, String cnee, String addrDet, String mobile) {
        this.addrId = addrId;
        this.cnee = cnee;
        this.addrDet = addrDet;
        this.mobile = mobile;
    }

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    public String getCnee() {
        return cnee;
    }

    public void setCnee(String cnee) {
        this.cnee = cnee;
    }

    public String getAddrDet() {
        return addrDet;
    }

    public void setAddrDet(String addrDet) {
        this.addrDet = addrDet;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Bldg getBldg() {
        return bldg;
    }

    public void setBldg(Bldg bldg) {
        this.bldg = bldg;
    }
    
}
