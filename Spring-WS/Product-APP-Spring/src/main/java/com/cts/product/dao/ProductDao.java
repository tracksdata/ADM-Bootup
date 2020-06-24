package com.cts.product.dao;

import java.util.Iterator;
import java.util.List;

import com.cts.product.entity.Product;

public interface ProductDao {

	// load any io related file, and read data
	Iterator<Product> importFromFile(String filaPath);

	// save product
	Product save(Product product);

	// list all products
	List<Product> findAll();

	// find by id
	Product findById(int id);

	// find by Name
	List<Product> findByName(String name);

	// delete product by id
	void deleteById(int id);

}