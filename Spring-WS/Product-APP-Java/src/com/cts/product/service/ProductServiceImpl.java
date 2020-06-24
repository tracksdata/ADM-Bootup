package com.cts.product.service;

import java.util.Iterator;
import java.util.List;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

//Dependent
public class ProductServiceImpl implements ProductService {

	private ProductDao prodDao;

	public void setProdDao(ProductDao prodDao) {
		this.prodDao = prodDao;
	}

	@Override
	public Iterator<Product> importFromFile(String filaPath) {
		// TODO Auto-generated method stub
		return prodDao.importFromFile(filaPath);
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return prodDao.save(product);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return prodDao.findAll();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return prodDao.findById(id);
	}

	@Override
	public List<Product> findByName(String name) {
		// TODO Auto-generated method stub
		return prodDao.findByName(name);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		prodDao.deleteById(id);

	}

}
