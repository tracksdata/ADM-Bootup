package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;

// service
// dependent
@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private ProductDao prodDao;
	

	/*
	@Autowired
	public BillingServiceImpl(ProductDao prodDao) {
		this.prodDao = prodDao;
	}
	
	*/

	@Override
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
