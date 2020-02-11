package com.app.idemia.dao;

import java.util.List;


import javax.persistence.EntityManager;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.idemia.model.SaleItem;

@Repository
public class SaleItemDaoImpl implements SaleItemDao {
	
	
	@Autowired
	private EntityManager entityManager;
	
	
	public SaleItemDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	

	@Override
	@Transactional
	public List<SaleItem> findAll() {
		
		
		Session session= entityManager.unwrap(Session.class);
		Query<SaleItem> query=session.createQuery("from SaleItem",SaleItem.class);

		return query.getResultList() ;
	}

	@Override
	@Transactional
	public void delete(int saleItemId) {
		Session session= entityManager.unwrap(Session.class);
		SaleItem saleItem=session.get(SaleItem.class, saleItemId);
		session.delete(saleItem);
		
		
	}

	@Override
	public SaleItem update(SaleItem saleItem) {
		Session session= entityManager.unwrap(Session.class);
		session.saveOrUpdate(saleItem);
		return session.get(SaleItem.class, saleItem.getSaleItemId());
	}

	@Override
	public void addSaleItem(List<SaleItem> saleItem) {
		Session session= entityManager.unwrap(Session.class);
		for(SaleItem saleItems :saleItem) {
			
			session.save(saleItems);
		}
		
	}

}
