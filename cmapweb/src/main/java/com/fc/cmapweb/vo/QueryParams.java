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
@Table(name = "QUERY_PARAMS")
public class QueryParams implements Serializable {
    
    private static final long serialVersionUID = -4727735450578662767L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "QP_ID")
    private Integer qpId;
    
    @Column(name = "PARAMS")
    private String params;
    
    @JoinColumn(name = "USR_ID", referencedColumnName = "USR_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usr usr;
    
    @JoinColumn(name = "MODULE_ID", referencedColumnName = "MODULE_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private StubModule stubModule;

    public QueryParams() {
    }

    public QueryParams(Integer qpId) {
        this.qpId = qpId;
    }

    public Integer getQpId() {
        return qpId;
    }

    public void setQpId(Integer qpId) {
        this.qpId = qpId;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public Usr getUsr() {
        return usr;
    }

    public void setUsr(Usr usr) {
        this.usr = usr;
    }

    public StubModule getStubModule() {
        return stubModule;
    }

    public void setStubModule(StubModule stubModule) {
        this.stubModule = stubModule;
    }
    
}
