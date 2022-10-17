package com.nimap.nimapinfotech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nimap.nimapinfotech.entity.Category;
import com.nimap.nimapinfotech.repository.CategoryRepository;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public Category saveCategory(Category category)
	{
		return repository.save(category);
	}
	
	public List<Category> getCategory()
	{
		return repository.findAll();
	}
	
	public Category getCategoryById(int id)
	{
		return repository.findById(id).get();
	}
	
	public boolean deleteCategory(int id)
	{
		repository.deleteById(id);
		return true;
	}

}


