package com.fc.cmapweb.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.fc.cmapweb.dao.CmapBaseDao;
import com.fc.cmapweb.dao.IRecommendBldgDao;
import com.fc.cmapweb.vo.RecommendBldg;

@Repository("recommendBldgDao")
public class RecommendBldgDaoImpl extends CmapBaseDao implements IRecommendBldgDao {

	public List<RecommendBldg> queryRecommendBldgByBldgId(int bldgId) {

		StringBuffer hql = new StringBuffer("FROM RecommendBldg WHERE bldg.bldgId = :bldgId");
		
		TypedQuery<RecommendBldg> tq = em.createQuery(hql.toString(), RecommendBldg.class);
		tq.setParameter("bldgId", bldgId);
		
		return tq.getResultList();

	}

}
