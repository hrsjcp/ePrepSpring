package com.hrsjp.ePrepSpring.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrsjp.ePrepSpring.entities.Category;
import com.hrsjp.ePrepSpring.repos.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> getAllCategories() {
		return this.categoryRepository.findAll();
	}
	
	public Category addNewCategory(Category category) {
		return this.categoryRepository.save(category);
	}
}
