package com.fc.cmapweb.mgr.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fc.cmapweb.dao.IADDao;
import com.fc.cmapweb.mgr.IADMgr;
import com.fc.cmapweb.vo.AdBldg;

@Service("aDMgr")
public class ADMgrImpl implements IADMgr {

	@Autowired
	private IADDao aDDao;

	public List<AdBldg> getADBldgByBldgId(int bldgId) {

		List<AdBldg> list = aDDao.getADBldgByBldgId(bldgId);
		return list;

	}

}
