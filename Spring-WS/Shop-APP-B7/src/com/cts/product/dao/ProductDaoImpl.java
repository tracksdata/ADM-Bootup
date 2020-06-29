package com.cts.product.dao;

import java.util.List;

import com.cts.product.model.Product;

// repository / database
// dependency class
public class ProductDaoImpl implements ProductDao, CrudDao {

	public ProductDaoImpl() {
		System.out.println("--- ProductDaoImpl object created..");
	}

	@Override
	public double getItemPrice(Integer itemCode) {
		// code to fetch price of given itemcode from database
		return 100.00;

	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return product;
	}

	@Override
	public List<Product> findAll() {
		System.out.println("-- Listing all products");
		return null;
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
