package com.fc.cmapweb.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.fc.cmapweb.dao.CmapBaseDao;
import com.fc.cmapweb.dao.IADDao;
import com.fc.cmapweb.vo.AdBldg;

@Repository("aDDao")
public class ADDaoImpl extends CmapBaseDao implements IADDao {

	public List<AdBldg> getADBldgByBldgId(int bldgId) {

		StringBuffer hql = new StringBuffer("FROM AdBldg WHERE bldg.bldgId = :bldgId ORDER BY adOrder ASC");
		
		TypedQuery<AdBldg> tq = em.createQuery(hql.toString(), AdBldg.class);
		tq.setParameter("bldgId", bldgId);

		return tq.getResultList();

	}

}
