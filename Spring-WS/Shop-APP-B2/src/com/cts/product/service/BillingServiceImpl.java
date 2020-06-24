package com.cts.product.service;

import com.cts.product.dao.PriceMatrix;

// service
// Dependent class
public class BillingServiceImpl {

	private PriceMatrix price;

	public void setPrice(PriceMatrix price) {
		this.price = price;
	}

	public double getTotalPrice(String[] cart) {

		double total = 0.0;

		// PriceMatrixImpl price = new PriceMatrixImpl();

		for (String itemCode : cart) {
			total = total + price.getItemTotal(itemCode);
		}

		return total;
	}

}
