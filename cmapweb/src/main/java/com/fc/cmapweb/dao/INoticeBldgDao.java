package com.fc.cmapweb.dao;

import java.util.List;
import com.fc.cmapweb.vo.NoticeBldg;

public interface INoticeBldgDao {

	public List<NoticeBldg> queryNoticeBldgByBldgId(int bldgId);

}
