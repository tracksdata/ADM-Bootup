package com.cts.product.service;

import com.cts.product.dao.ProductDao;

// service
// dependent
public class BillingServiceImpl {

	private ProductDao prodDao;

	public void setProdDao(ProductDao prodDao) {
		this.prodDao = prodDao;
	}

	public double getTotalPrice(Integer[] cart) {

		double total = 0.0;

		// ProductDaoImpl prodDao = new ProductDaoImpl(); // dependency class
		// prodDao=https://abc.com/jndi/c1/101023

		for (Integer itemCode : cart) {
			total = total + prodDao.getItemPrice(itemCode);
		}

		return total;
	}

}
