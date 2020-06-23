package com.cts.product.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PriceMatrixImpl implements PriceMatrix {

	public PriceMatrixImpl() {
		System.out.println("-- PrioceMatrixImpl object created...");
	}

	public double getItemPrice(String itemCode) {

		return 100.00;
	}

}
