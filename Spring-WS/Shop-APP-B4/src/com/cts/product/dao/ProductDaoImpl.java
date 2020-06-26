package com.cts.product.dao;

import java.util.List;

import com.cts.product.entity.Product;

//repository / persisting class'
// dependency class
public class ProductDaoImpl implements ProductDao, ProductDelete {

	public ProductDaoImpl() {
		System.out.println("--- ProductDaoImpl object created...");
	}
	
	
	@Override
	public void deleteById(int id) {
		System.out.println("--- deleting "+id+" id product from db");
	}

	@Override
	public Product save(Product product) {
		System.out.println("Dao: " + product.getName() + " saved to DB");
		return product;
	}

	@Override
	public List<Product> findAll() {
		return null;
	}

}
