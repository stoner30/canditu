package com.fc.cmapweb.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recommend")
public class Recommend implements Serializable {

	private static final long serialVersionUID = -2619662533084037842L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RECOMMEND_ID")
    private Integer recommendId;
	
    @Column(name = "RECOMMEND_CONTENT")
    private String recommendContent;

	public Integer getRecommendId() {
		return recommendId;
	}

	public void setRecommendId(Integer recommendId) {
		this.recommendId = recommendId;
	}

	public String getRecommendContent() {
		return recommendContent;
	}

	public void setRecommendContent(String recommendContent) {
		this.recommendContent = recommendContent;
	}

}
