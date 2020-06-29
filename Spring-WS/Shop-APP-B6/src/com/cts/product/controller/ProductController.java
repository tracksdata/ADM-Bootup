package com.cts.product.controller;

import com.cts.product.dao.ProductDao;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.service.BillingServiceImpl;

public class ProductController {

	public static void main(String[] args) {

		Integer[] cart1 = { 10, 20, 30, 40 };
		Integer[] cart2 = { 10, 20, 30, 40, 50 };

		// calcukate total items of a given cart
		//-----------------------------------------------------
		
		ProductDao prodDao=new ProductDaoImpl(); // dependency  object
		BillingServiceImpl biller = new BillingServiceImpl(); // dependent object
		biller.setProdDao(prodDao); // Injecting dependency object 'prodDao' to dependent object 'biller' : dependency injection
		
		double total = biller.getTotalPrice(cart1);

		System.out.println("Cart1 Total: " + total);

		total = biller.getTotalPrice(cart2);
		System.out.println("Cart2 Total: " + total);

	}

}
