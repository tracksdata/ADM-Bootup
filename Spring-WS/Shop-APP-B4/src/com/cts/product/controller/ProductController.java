package com.cts.product.controller;

import com.cts.product.dao.ProductDao;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.dao.ProductDelete;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;
import com.cts.product.service.ProductServiceImpl;

class ProductController {

	public static void main(String[] args) {
		
		
		Product product=new Product();
		product.setId(10);
		product.setName("Pen");
		product.setDescription("Red Ink");
		product.setPrice(25);
		
		Product product1=new Product();
		product1.setId(11);
		product1.setName("Book");
		product1.setDescription("Whire pages");
		product1.setPrice(150);
		
		
		
		ProductDao prodDao=new ProductDaoImpl(); // dependency 
		ProductDelete prodDelete=new ProductDaoImpl();
		//------------------------------------------------
		
		ProductService ps=new ProductServiceImpl(); // dependent
		
		ps.setProdDao(prodDao); // Injecting dependency object 'prodDao' to dependent object 'ps' -> DI
		
		
		//prodDao.save(product1);
		//prodDao.save(product);
		ps.save(product);
		ps.save(product1);
		
		prodDelete.deleteById(100);
		
		
		
		
		
		
		
		
		
		
		

	}

}
