package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;

//service
//dependent
@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private ProductDao prodDao;

	@Override
	public double getTotalPrice(Integer[] cart) {

		double total = 0.0;

		// ProductDaoImpl prodDao = new ProductDaoImpl(); // dependency
		// JNDI loc , find the obj and get it
		// prodDao=https://abc.com/jndi/c1

		for (int itemCode : cart) {
			total = total + prodDao.getItemPrice(itemCode);
		}

		return total;

	}

}
