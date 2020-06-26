package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.PriceMatrix;

//dependent'
@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private PriceMatrix price;

	@Override
	public double getTotalPrice(String[] cart) {

		double total = 0.0;

		// PriceMatrixImpl price = new PriceMatrixImpl();

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;
	}

}
