package com.cts.product.dao;

import org.springframework.stereotype.Repository;

//dependency
@Repository
public class PriceMatrixImpl implements PriceMatrix {

	public PriceMatrixImpl() {
		System.out.println("-- Spring: PriceMatrixImpl obj created...");
	}

	@Override
	public double getItemPrice(String itemCode) {
		// code to fetch price of given itemCode from database.
		return 100.00;

	}

}
