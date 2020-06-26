package com.cts.product.dao;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.entity.Product;

//Dependency class
@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sf;

	// load any io related file, and read data
	@Override
	public Iterator<Product> importFromFile(String filaPath) {
		return null;
	}

	// save product
	@Override

	public Product save(Product product) {
		System.out.println("===> Spring:: Saving " + product.getName() + " to DB");

		sf.getCurrentSession().save(product);

		return product;
	}

	// list all products
	@Override
	public List<Product> findAll() {
		String qry="from Product";
		return sf.getCurrentSession().createQuery(qry).list();
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
