package com;

import com.bill.BillingImpl;
import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item1", "Item2", "Item3" };

		String[] cart2 = { "Item1", "Item2", "Item3", "Item4" };

		PriceMatrix price = new PriceMatrixImpl(); // dependency class object
		// ---------------------------------

		BillingImpl biller = new BillingImpl(); // dependent class object

		biller.setPrice(price); // Injecting dependency object to the dependent (DI)
		// -----------------------------------

		double total = biller.getTotalPrice(cart1);
		System.out.println("Cart1 Total: " + total);

		total = biller.getTotalPrice(cart2);
		System.out.println("Cart2 Total: " + total);

	}

}
