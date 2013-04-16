package com.fc.cmapweb.mgr.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fc.cmapweb.dao.IRecommendBldgDao;
import com.fc.cmapweb.mgr.IRecommendBldgMgr;
import com.fc.cmapweb.vo.RecommendBldg;

@Service("recommendBldgMgr")
public class RecommendBldgMgrImpl implements IRecommendBldgMgr {

	@Autowired
	private IRecommendBldgDao recommendBldgDao;

	public List<RecommendBldg> queryRecommendBldgByBldgId(int bldgId) {

		List<RecommendBldg> list = recommendBldgDao.queryRecommendBldgByBldgId(bldgId);
		return list;

	}

}
