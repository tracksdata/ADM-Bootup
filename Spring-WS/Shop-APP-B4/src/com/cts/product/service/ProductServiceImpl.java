package com.cts.product.service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

//service layer
//dependent 
public class ProductServiceImpl implements ProductService {
	
	private ProductDao prodDao;
	
	
	@Override
	public void setProdDao(ProductDao prodDao) {
		this.prodDao = prodDao;
	}


	@Override
	public Product save(Product product) {

		//ProductDaoImpl prodDao = new ProductDaoImpl();

		return prodDao.save(product);
	}

}
