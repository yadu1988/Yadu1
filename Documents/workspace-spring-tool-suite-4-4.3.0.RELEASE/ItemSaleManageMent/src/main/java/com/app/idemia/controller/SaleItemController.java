package com.app.idemia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.idemia.model.SaleItem;
import com.app.idemia.service.SaleItemService;

@RestController
public class SaleItemController {
	
	@Autowired
	private SaleItemService saleItemService;

	public SaleItemController(SaleItemService saleItemService) {
		super();
		this.saleItemService = saleItemService;
	}
	
	
	@GetMapping("/allItem")
   public List<SaleItem>  getAllSaleItem(){
	   
	   return saleItemService.findAll();
   }
	
	@PostMapping("/addSaleItem")
	public  List<SaleItem> addSaleItem(@RequestBody List<SaleItem> saleItem){
		
		saleItemService.addSaleItem(saleItem);
		return saleItemService.findAll();
		
	}
	
	@PutMapping("/updateSaleItem")
	public SaleItem updateSaleItem(@RequestBody SaleItem saleItem) {
		
		return saleItemService.update(saleItem);
	
	}
	
	@DeleteMapping("/delSaleItem/{id}")
	public void deleteSaleItem(@PathVariable ("id") int saleItemId) {
		saleItemService.deleteSaleItem(saleItemId);
		 
	}

}
