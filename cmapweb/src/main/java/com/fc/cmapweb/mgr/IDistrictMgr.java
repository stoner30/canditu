package com.fc.cmapweb.mgr;

import java.util.List;
import com.fc.cmapweb.vo.District;

public interface IDistrictMgr {

	public List<District> queryAreaByDistCode(String distCode);

	public District queryDistrictByDistCode(String distCode);

}
