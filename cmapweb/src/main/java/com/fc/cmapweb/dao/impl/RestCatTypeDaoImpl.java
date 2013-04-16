package com.fc.cmapweb.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.fc.cmapweb.dao.CmapBaseDao;
import com.fc.cmapweb.dao.IRestCatTypeDao;
import com.fc.cmapweb.vo.RestCatType;

@Repository("restCatTypeDao")
public class RestCatTypeDaoImpl extends CmapBaseDao implements IRestCatTypeDao {

	public List<RestCatType> queryAllRestCatType() {

		StringBuffer hql = new StringBuffer("FROM RestCatType ORDER BY rctOrder ASC");
		
		TypedQuery<RestCatType> tq = em.createQuery(hql.toString(), RestCatType.class);

		return tq.getResultList();

	}

}
