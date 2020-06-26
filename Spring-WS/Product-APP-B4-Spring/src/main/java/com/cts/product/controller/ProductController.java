package com.cts.product.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

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
	
		
		AbstractApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		ProductService ps = ac.getBean(ProductService.class);
		 
		ps.save(product);
		ps.save(product1);
		
		ac.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
