package com.pos.springdemo.dao;

import java.util.List;

import com.pos.springdemo.entity.Category;

public interface CategoryDAO {

	public List<Category> getCategories();
	public void saveCategory(Category c);
	public void updateCategory(Category c);
	public Category getCategory(int id);
	public List<Category> searchCategory(String name);
	public void deleteCategory(Category C);
}
