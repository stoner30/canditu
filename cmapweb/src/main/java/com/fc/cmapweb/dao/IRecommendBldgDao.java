package com.fc.cmapweb.dao;

import java.util.List;
import com.fc.cmapweb.vo.RecommendBldg;

public interface IRecommendBldgDao {

	public List<RecommendBldg> queryRecommendBldgByBldgId(int bldgId);

}
