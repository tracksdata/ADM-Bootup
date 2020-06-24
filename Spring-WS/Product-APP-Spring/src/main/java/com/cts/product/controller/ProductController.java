package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.product.config.AppConfig;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService ps;
	
	@RequestMapping("/save")
	public String save() {
		Product product = new Product();
		product.setId(10);
		product.setName("Pen");
		product.setDescription("Red Ink");
		product.setPrice(45.75);

		ps.save(product);

		return null;
	}

}
