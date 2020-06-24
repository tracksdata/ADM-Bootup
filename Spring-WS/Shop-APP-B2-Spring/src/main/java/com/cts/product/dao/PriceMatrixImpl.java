package com.cts.product.dao;

import org.springframework.stereotype.Repository;

//dao class
//Dependency class
@Repository
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
