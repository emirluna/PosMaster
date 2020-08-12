package com.pos.springdemo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.springdemo.dao.CategoryDAO;
import com.pos.springdemo.entity.Category;
import com.pos.springdemo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDAO categoryDAO;
	
	
	@Override
	@Transactional
	public List<Category> getCategories() {
		return categoryDAO.getCategories();
	}

	@Override
	@Transactional
	public void saveCategory(Category c) {
		categoryDAO.saveCategory(c);
	}

	@Override
	@Transactional
	public void updateCategory(Category c) { 
		categoryDAO.updateCategory(c);
	}

	@Override
	@Transactional
	public Category getCategory(int id) {
		return categoryDAO.getCategory(id);
	}

	@Override
	@Transactional
	public List<Category> searchCategory(String name) {
		return categoryDAO.searchCategory(name);
	}

	@Override
	@Transactional
	public void deleteCategory(Category C) {
		categoryDAO.deleteCategory(C);
	}

}
