package com.cts.product.service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

public interface ProductService {

	void setProdDao(ProductDao prodDao);

	Product save(Product product);

}