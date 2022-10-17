package com.nimap.nimapinfotech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nimap.nimapinfotech.entity.Product;
import com.nimap.nimapinfotech.service.ProductService;


@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/addProduct")
	private Product addProduct(@RequestBody Product product)
	{
		return service.saveProduct(product);
	}
	
	@GetMapping("/products")
	private List<Product> getAllData()
	{
		return service.getProducts();
	}
	
	@GetMapping("/product/{id}")
	private Product findProductId(@PathVariable int id)
	{
		return service.getProductById(id);
	}
	
	@DeleteMapping("/delproduct/{id}")
	private void deleteProduct(@PathVariable int id)
	{
		 service.deleteProduct(id);
	}
	
	@PutMapping("/uproduct/{id}")
	private Product updateProduct(@PathVariable int id,@RequestBody Product product)
	{
		product.setId(id);
		return service.saveProduct(product);
	}
	
	

}
