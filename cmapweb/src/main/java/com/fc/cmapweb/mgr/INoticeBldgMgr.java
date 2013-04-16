package com.fc.cmapweb.mgr;

import java.util.List;
import com.fc.cmapweb.vo.NoticeBldg;

public interface INoticeBldgMgr {

	public List<NoticeBldg> queryNoticeBldgByBldgId(int bldgId);
}
