package com.fc.cmapweb.mgr.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fc.cmapweb.dao.IRestCatTypeDao;
import com.fc.cmapweb.mgr.IRestCatTypeMgr;
import com.fc.cmapweb.vo.RestCatType;

@Service("restCatTypeMgr")
public class RestCatTypeMgrImpl implements IRestCatTypeMgr {

	@Autowired
	private IRestCatTypeDao restCatTypeDao;

	public List<RestCatType> queryAllRestCatType() {

		List<RestCatType> list = restCatTypeDao.queryAllRestCatType();
		return list;

	}

}
