package com.cts.product.dao;

import java.util.List;

import com.cts.product.model.Product;

public interface CrudDao {

	Product save(Product product);

	List<Product> findAll();

	Product findById(int id);

}
