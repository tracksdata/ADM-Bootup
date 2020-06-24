package com;

import com.cts.product.dao.PriceMatrix;
import com.cts.product.dao.PriceMatrixImpl;
import com.cts.product.service.BillingServiceImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item1", "Item2", "Item3" };
		String[] cart2 = { "Item1", "Item2", "Item3", "Item4" };
		
		
		//----------------------------------
		PriceMatrix price=new PriceMatrixImpl(); // dependency obj

		BillingServiceImpl biller = new BillingServiceImpl();//dependent

		biller.setPrice(price);// DI 
		//-------------------------------------
		double total = biller.getTotalPrice(cart1);

		System.out.println("Total of Cart1 is " + total);

		total = biller.getTotalPrice(cart2);

		System.out.println("Total of Cart2 is " + total);

	}

}
