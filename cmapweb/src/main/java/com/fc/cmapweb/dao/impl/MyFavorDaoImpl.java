package com.fc.cmapweb.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.fc.cmapweb.dao.CmapBaseDao;
import com.fc.cmapweb.dao.IMyFavorDao;
import com.fc.cmapweb.vo.MyFavor;

@Repository("myFavorDao")
public class MyFavorDaoImpl extends CmapBaseDao implements IMyFavorDao {

	public List<MyFavor> queryMyFavorByCustomerId(int customerId) {

		StringBuffer hql = new StringBuffer("FROM MyFavor WHERE customer.customerId = :customerId");
		TypedQuery<MyFavor> tq = em.createQuery(hql.toString(), MyFavor.class);
		tq.setParameter("customerId", customerId);
		
		return tq.getResultList();

	}

}
