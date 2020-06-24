package com.cts.product.dao;

//dao class
//Dependency class
public class PriceMatrixImpl implements PriceMatrix {

	public PriceMatrixImpl() {
		System.out.println("-- PriceMatricImpl obj created..");
	}

	@Override
	public double getItemTotal(String itemCode) {
		// code to fetch itemProice from database
		return 100.00;
	}

}
