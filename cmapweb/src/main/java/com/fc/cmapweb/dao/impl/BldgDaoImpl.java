package com.fc.cmapweb.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.fc.cmapweb.dao.CmapBaseDao;
import com.fc.cmapweb.dao.IBldgDao;
import com.fc.cmapweb.vo.Bldg;

@Repository("bldgDao")
public class BldgDaoImpl extends CmapBaseDao implements IBldgDao {

	public Bldg queryBldgByBldgId(int bldgId) {

		Bldg bldg = em.find(Bldg.class, bldgId);
		return bldg;

	}

	public List<Bldg> queryBldgByDistCode(String distCode) {

		StringBuffer hql = new StringBuffer("FROM Bldg WHERE district.distCode = :distCode");
		
		TypedQuery<Bldg> tq = em.createQuery(hql.toString(), Bldg.class);
		tq.setParameter("distCode", distCode);
		
		return tq.getResultList();

	}

}
