package com.cts.product.controller;

import com.cts.product.dao.PriceMatrix;
import com.cts.product.dao.PriceMatrixImpl;
import com.cts.product.service.BillingServiceImpl;

public class ProductController {

	public static void main(String[] args) {

		String[] cart1 = { "Item1", "Item2", "Item3" };
		String[] cart2 = { "Item1", "Item2", "Item3", "Item4" };

		// -----------------------------------------------------
		PriceMatrix price = new PriceMatrixImpl(); // dependency

		BillingServiceImpl biller = new BillingServiceImpl();

		biller.setPrice(price); // Injecting dependency obj 'price' to dependent obj 'biller' : DI
		// -----------------------------------------------------

		double total = biller.getTotalPrice(cart1);

		System.out.println("Cart1 Total: " + total);

		total = biller.getTotalPrice(cart2);

		System.out.println("Cart2 Total: " + total);

	}

}
