package com.fc.cmapweb.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.fc.cmapweb.dao.CmapBaseDao;
import com.fc.cmapweb.dao.IDistrictDao;
import com.fc.cmapweb.vo.District;

@Repository("districtDao")
public class DistrictDaoImpl extends CmapBaseDao implements IDistrictDao {

	public List<District> queryAreaByDistCode(String distCode) {

		StringBuffer hql = new StringBuffer("FROM District WHERE pDistrict.distCode = :distCode AND enabled = true");

		TypedQuery<District> tq = em.createQuery(hql.toString(), District.class);
		tq.setParameter("distCode", distCode);

		return tq.getResultList();

	}

	public District queryDistrictByDistCode(String distCode) {
		
		District district = em.find(District.class, distCode);
		return district;

	}

}
