package com.nimap.nimapinfotech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nimap.nimapinfotech.entity.Product;
import com.nimap.nimapinfotech.repository.ProductRepository;



@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product)
	{
		return repository.save(product);
	}
	
	public List<Product> getProducts()
	{
		return repository.findAll();
	}
	
	public Product getProductById(int id)
	{
		return repository.findById(id).get();
	}
	
	public boolean deleteProduct(int id)
	{
		repository.deleteById(id);
		return true;
	}

}
