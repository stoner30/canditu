package com.fc.cmapweb.mgr;

import java.util.List;
import com.fc.cmapweb.vo.RecommendBldg;

public interface IRecommendBldgMgr {

	public List<RecommendBldg> queryRecommendBldgByBldgId(int bldgId);
}
