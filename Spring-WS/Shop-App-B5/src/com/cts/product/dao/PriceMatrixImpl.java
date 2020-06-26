package com.cts.product.dao;

//dependency 
public class PriceMatrixImpl implements PriceMatrix {

	public PriceMatrixImpl() {
		System.out.println("-- PriceMatrixImpl obj created...");
	}

	@Override
	public double getItemPrice(String itemCode) {
		// code to fetch price of given itemCode from database.
		return 100.00;

	}

}
