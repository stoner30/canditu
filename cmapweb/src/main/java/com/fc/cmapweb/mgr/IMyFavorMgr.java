package com.fc.cmapweb.mgr;

import java.util.List;
import com.fc.cmapweb.vo.MyFavor;

public interface IMyFavorMgr {

	public List<MyFavor> queryMyFavorByCustomerId(int customerId);

}
