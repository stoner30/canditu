package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DISH_TAG_TYPE")
public class DishTagType implements Serializable {

    private static final long serialVersionUID = 7067355060524335437L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DTT_ID")
    private Integer dttId;
    
    @Column(name = "DT_NAME")
    private String dtName;

    @Column(name = "DT_DESC")
    private String dtDesc;

    public DishTagType() {
    }

    public DishTagType(Integer dttId) {
        this.dttId = dttId;
    }

    public DishTagType(Integer dttId, String dtName) {
        this.dttId = dttId;
        this.dtName = dtName;
    }

    public Integer getDttId() {
        return dttId;
    }

    public void setDttId(Integer dttId) {
        this.dttId = dttId;
    }

    public String getDtName() {
        return dtName;
    }

    public void setDtName(String dtName) {
        this.dtName = dtName;
    }

    public String getDtDesc() {
        return dtDesc;
    }

    public void setDtDesc(String dtDesc) {
        this.dtDesc = dtDesc;
    }
    
}
