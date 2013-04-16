package com.fc.cmapweb.mgr.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fc.cmapweb.dao.INoticeBldgDao;
import com.fc.cmapweb.mgr.INoticeBldgMgr;
import com.fc.cmapweb.vo.NoticeBldg;

@Service("noticeBldgMgr")
public class NoticeBldgMgrImpl implements INoticeBldgMgr {

	@Autowired
	private INoticeBldgDao noticeBldgDao;

	public List<NoticeBldg> queryNoticeBldgByBldgId(int bldgId) {

		List<NoticeBldg> list = noticeBldgDao.queryNoticeBldgByBldgId(bldgId);
		return list;

	}
	
}
