package com.fc.cmapweb.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.fc.cmapweb.dao.CmapBaseDao;
import com.fc.cmapweb.dao.INoticeBldgDao;
import com.fc.cmapweb.vo.NoticeBldg;

@Repository("noticeBldgDao")
public class NoticeBldgDaoImpl extends CmapBaseDao implements INoticeBldgDao {

	public List<NoticeBldg> queryNoticeBldgByBldgId(int bldgId) {

		StringBuffer hql = new StringBuffer("FROM NoticeBldg WHERE bldg.bldgId = :bldgId ORDER BY notice.noticeOrder");

		TypedQuery<NoticeBldg> tq = em.createQuery(hql.toString(), NoticeBldg.class);
		tq.setParameter("bldgId", bldgId);
		
		return tq.getResultList();

	}

}
