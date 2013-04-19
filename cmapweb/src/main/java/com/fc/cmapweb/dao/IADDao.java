package com.fc.cmapweb.dao;

import java.util.List;
import com.fc.cmapweb.vo.AdBldg;

public interface IADDao {

	public List<AdBldg> getADBldgByBldgId(int bldgId);

}
