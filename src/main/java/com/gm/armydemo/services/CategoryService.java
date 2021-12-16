package com.gm.armydemo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gm.armydemo.domain.Category;
import com.gm.armydemo.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public Category find(Integer id) {
		Optional<Category> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
}
