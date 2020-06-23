package com.bill;

import com.pricematrix.PriceMatrix;

//service
//Dependent class
public class BillingImpl {

	private PriceMatrix price;

	public void setPrice(PriceMatrix price) {
		this.price = price;
	}

	public double getTotalPrice(String[] cart) {

		double total = 0.0;

		// PriceMatrixImpl price=new PriceMatrixImpl();

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}
		return total;
	}

}
