package com.hrsjp.ePrepSpring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrsjp.ePrepSpring.entities.Category;
import com.hrsjp.ePrepSpring.services.impl.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	@GetMapping("/all-category")
	public ResponseEntity<?> getAllCategoryNames() {
		List<Category> categories = this.categoryService.getAllCategories();
		return new ResponseEntity<>(categories, HttpStatus.OK);
	}
	
	@PostMapping("/add-category")
	public ResponseEntity<?> addNewCategory(@RequestBody Category category) {
		Category newCategory = this.categoryService.addNewCategory(category);
		return new ResponseEntity<>(newCategory, HttpStatus.OK);
	}
}
