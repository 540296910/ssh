package com.toceansoft.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.fenye.Fenye;
import com.toceansoft.dao.PurchaseDao;
import com.toceansoft.entity.Purchase_order;


public class PurchaseDaoImpl implements PurchaseDao {
	private Logger log = Logger.getLogger(UserDaoImpl.class);
	private HibernateTemplate ht;
	
	public void setMySessionFactory(SessionFactory mySessionFactory) {
		this.ht = new HibernateTemplate(mySessionFactory);
	}
	public List<Purchase_order> findbypono(String pono){
		List<Purchase_order> po =(List<Purchase_order>) ht.find("from Purchase_order po where po.po_no=?",pono);
 		return po;
	}
	@Override
	public List<Purchase_order> findall(int pagesize,int currentpage) {
		// TODO Auto-generated method stub
		Session session=ht.getSessionFactory().openSession();
		Query query=session.createQuery("from Purchase_order");
		query.setFirstResult((currentpage-1)*pagesize+1); 
		query.setMaxResults(pagesize); 
		List<Purchase_order> po=(List<Purchase_order>)query.list();
 		return po;
	}
	@Override
	public int findall() {
		// TODO Auto-generated method stub
		List<Purchase_order> po=(List<Purchase_order>)ht.find("from Purchase_order");
		return po.size();
	}
}
