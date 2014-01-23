package com.toceansoft.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.toceansoft.dao.CdsgusDao;
import com.toceansoft.entity.Cdsgus;
import com.toceansoft.entity.Purchase_order;

public class CdsgusDaoImpl implements CdsgusDao {
	private HibernateTemplate ht;
	
	public void setMySessionFactory(SessionFactory mySessionFactory) {
		this.ht = new HibernateTemplate(mySessionFactory);
	}
	@Override
	public long findall() {
		// TODO Auto-generated method stub
		Session session=ht.getSessionFactory().openSession();
		Query query=session.createQuery("select count(*) from Cdsgus");
		List po=query.list();
		return (Long)po.get(0);
	}

	@Override
	public List<Cdsgus> findall(int pagesize, int currentpage) {
		// TODO Auto-generated method stub
		Session session=ht.getSessionFactory().openSession();
		Query query=session.createQuery("from Cdsgus");
		query.setFirstResult((currentpage-1)*pagesize+1); 
		query.setMaxResults(pagesize); 
		List<Cdsgus> po=(List<Cdsgus>)query.list();
 		return po;
		
	}
	@Override
	public Cdsgus find(Cdsgus cd) {
		// TODO Auto-generated method stub
	List<Cdsgus> l=	ht.find("from Cdsgus c where c.ctfid = ?",cd.getCtfid());
		return l.get(0);
	}

}
