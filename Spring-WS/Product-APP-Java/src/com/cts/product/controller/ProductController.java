package com.cts.product.controller;

import com.cts.product.dao.ProductDao;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;
import com.cts.product.service.ProductServiceImpl;

public class ProductController {
	
	
	public static void main(String[] args) {
		
		
		Product product=new Product();
		product.setId(10);
		product.setName("Pen");
		product.setDescription("Red Ink");
		product.setPrice(45.75);
		
		// save product to database
		
		// DI
		
		ProductDao prodDao=new ProductDaoImpl(); // Dependency
		ProductService ps=new ProductServiceImpl(); // Dependent 
		ps.setProdDao(prodDao); // Injecting dependency prodDao to dependent object ps: DI 
		ps.save(product);
		
		
		
		
		
		
	}

}
