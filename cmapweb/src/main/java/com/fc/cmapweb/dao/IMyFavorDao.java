package com.fc.cmapweb.dao;

import java.util.List;
import com.fc.cmapweb.vo.MyFavor;

public interface IMyFavorDao {

	public List<MyFavor> queryMyFavorByCustomerId(int customerId);

}
