package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.PriceMatrix;

// service
// Dependent class
@Service
public class BillingServiceImpl {

	@Autowired
	private PriceMatrix price;

	
	public double getTotalPrice(String[] cart) {

		double total = 0.0;

		// PriceMatrixImpl price = new PriceMatrixImpl();

		for (String itemCode : cart) {
			total = total + price.getItemTotal(itemCode);
		}

		return total;
	}

}
