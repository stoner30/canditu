package com.fc.cmapweb.dao;

import java.util.List;
import com.fc.cmapweb.vo.Bldg;

public interface IBldgDao {

	public Bldg queryBldgByBldgId(int bldgId);
	
	public List<Bldg> queryBldgByDistCode(String distCode);

}
