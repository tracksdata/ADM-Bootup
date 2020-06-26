package com.cts.product.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.service.BillingService;

public class ProductController {

	public static void main(String[] args) {

		String[] cart1 = { "Item1", "Item2", "Item3" };
		String[] cart2 = { "Item1", "Item2", "Item3", "Item4" };
		
		
		/*

		// -----------------------------------------------------
		PriceMatrix price = new PriceMatrixImpl(); // dependency

		BillingService biller = new BillingServiceImpl();

		biller.setPrice(price); // Injecting dependency obj 'price' to dependent obj 'biller' : DI
		// -----------------------------------------------------
		 * 
		 * 
		 */

		AbstractApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		BillingService biller = ac.getBean(BillingService.class);
		
		
		double total = biller.getTotalPrice(cart1);

		System.out.println("Spring:: Cart1 Total: " + total);

		total = biller.getTotalPrice(cart2);

		System.out.println("Spring:: Cart2 Total: " + total);
		
		ac.close();

	}

}
