package com.fc.cmapweb.mgr.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fc.cmapweb.dao.IMyFavorDao;
import com.fc.cmapweb.mgr.IMyFavorMgr;
import com.fc.cmapweb.vo.MyFavor;

@Service("myFavorMgr")
public class MyFavorMgrImpl implements IMyFavorMgr {

	@Autowired
	private IMyFavorDao myFavorDao;

	public List<MyFavor> queryMyFavorByCustomerId(int customerId) {

		List<MyFavor> list = myFavorDao.queryMyFavorByCustomerId(customerId);
		return list;

	}

}
