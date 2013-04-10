package com.fc.cmapweb.mgr;

import java.util.List;
import com.fc.cmapweb.vo.Bldg;

public interface IBldgMgr {

	public Bldg queryBldgByBldgId(int bldgId);
	
	public List<Bldg> queryBldgByDistCode(String distCode);

}
