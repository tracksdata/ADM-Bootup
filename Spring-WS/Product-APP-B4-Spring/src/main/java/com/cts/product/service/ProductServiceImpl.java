package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

//service layer
//dependent 
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao prodDao;
	



	@Override
	public Product save(Product product) {

		//ProductDaoImpl prodDao = new ProductDaoImpl();

		return prodDao.save(product);
	}

}
