package com.pricematrix;

//database/persistence
//Dependency class
public class PriceMatrixImpl implements PriceMatrix {

	public PriceMatrixImpl() {
		System.out.println("-- PriceMatrixImpl class created...");
	}

	@Override
	public double getItemPrice(String itemCode) {
		// code to connect to the database and fetch price of given itemCode
		return 100.00;

	}

}
