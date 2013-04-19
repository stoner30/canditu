package com.fc.cmapweb.mgr.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fc.cmapweb.dao.IDistrictDao;
import com.fc.cmapweb.mgr.IDistrictMgr;
import com.fc.cmapweb.vo.District;

@Service("districtMgr")
public class DistrictMgrImpl implements IDistrictMgr {

	@Autowired
	private IDistrictDao districtDao;

	public List<District> queryAreaByDistCode(String distCode) {

		List<District> list = districtDao.queryAreaByDistCode(distCode);
		return list;
		
	}

	public District queryDistrictByDistCode(String distCode) {

		District district = districtDao.queryDistrictByDistCode(distCode);
		return district;

	}


}
