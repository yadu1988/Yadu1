package com.app.idemia.dao;

import java.util.List;

import com.app.idemia.model.SaleItem;

public interface SaleItemDao {
	
	
	public List<SaleItem> findAll();
	public void delete(int saleItemId);
	public SaleItem update(SaleItem saleItem);
	public void addSaleItem(List<SaleItem> saleItem);
	

}
