package com.fc.cmapweb.mgr;

import java.util.List;
import com.fc.cmapweb.vo.AdBldg;

public interface IADMgr {

	public List<AdBldg> getADBldgByBldgId(int bldgId);
}
