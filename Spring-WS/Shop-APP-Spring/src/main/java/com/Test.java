package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.service.BillingServiceImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item1", "Item2", "Item3" };
		String[] cart2 = { "Item4", "Item5" };

		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		BillingServiceImpl biller = ac.getBean(BillingServiceImpl.class);

		double total = biller.getTotalPrice(cart1);

		System.out.println("Cart1 Total: " + total);

		total = biller.getTotalPrice(cart2);
		
		System.out.println("cart2 Total: " + total);

	}

}
