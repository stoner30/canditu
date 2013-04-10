package com.fc.cmapweb.dao;

import java.util.List;
import com.fc.cmapweb.vo.District;

public interface IDistrictDao {

	public List<District> queryAreaByDistCode(String distCode);
	
	public District queryDistrictByDistCode(String distCode);

}
