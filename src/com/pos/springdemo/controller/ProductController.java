package com.pos.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pos.springdemo.entity.Category;
import com.pos.springdemo.entity.Product;
import com.pos.springdemo.service.CategoryService;
import com.pos.springdemo.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productS;
	
	
	@Autowired
	private CategoryService categoryS;
	
	
	@RequestMapping("/")
	public String products(Model theModel) {
		
		List<Product> theProducts = productS.getProducts();
		List<Category> theCategory = categoryS.getCategories();
		
		theModel.addAttribute("products", theProducts);
		theModel.addAttribute("categories", theCategory);
		
		return "Products/index-products";
	}
	
}
