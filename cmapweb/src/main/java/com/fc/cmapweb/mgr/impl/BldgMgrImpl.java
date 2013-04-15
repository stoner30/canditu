package com.fc.cmapweb.mgr.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fc.cmapweb.dao.IBldgDao;
import com.fc.cmapweb.mgr.IBldgMgr;
import com.fc.cmapweb.utils.PinYinUtil;
import com.fc.cmapweb.vo.Bldg;

@Service("bldgMgr")
public class BldgMgrImpl implements IBldgMgr {

	@Autowired
	private IBldgDao bldgDao;

	public Bldg queryBldgByBldgId(int bldgId) {

		Bldg bldg = bldgDao.queryBldgByBldgId(bldgId);
		return bldg;

	}

	public List<Bldg> queryBldgByDistCode(String distCode) {

		List<Bldg> list = bldgDao.queryBldgByDistCode(distCode);

		for(int i = 0; i< list.size(); i++) {
			list.get(i).setPinYin(PinYinUtil.getPinYin(list.get(i).getBldgName()));
		}

		return list;

	}

}
