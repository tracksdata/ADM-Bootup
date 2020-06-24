package com.cts.product.dao;

import java.util.Iterator;
import java.util.List;

import com.cts.product.entity.Product;

//Dependency class
public class ProductDaoImpl implements ProductDao {

	// load any io related file, and read data
	@Override
	public Iterator<Product> importFromFile(String filaPath) {
		return null;
	}

	// save product
	@Override
	public Product save(Product product) {
		System.out.println("===> Saving " + product.getName() + " to DB");
		return product;
	}

	// list all products
	@Override
	public List<Product> findAll() {
		return null;
	}

	// find by id
	@Override
	public Product findById(int id) {
		return null;
	}

	// find by Name
	@Override
	public List<Product> findByName(String name) {
		return null;
	}

	// delete product by id
	@Override
	public void deleteById(int id) {

	}

}
