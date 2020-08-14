package com.pos.springdemo.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
//	private LinkedHashMap<String, String> categoryOptions;
	
	@RequestMapping("/")
	public String indexProducts(Model theModel) {
		
		//List<Product> theProducts = productS.getProducts();
		List<Category> theCategory = categoryS.getCategories();
		
		//theModel.addAttribute("products", theProducts);
		theModel.addAttribute("categories", theCategory);
		
		return "Products/index-products";
	}
	
	
	
	@RequestMapping("/categories")
	public String categoryList(Model theModel) {
	
		List<Category> theCategory = categoryS.getCategories();
		
		theModel.addAttribute("categories", theCategory);
		
		return "Products/list-categories";
	}
	
	@RequestMapping("/products")
	public String productList(Model theModel) {
	
		List<Product> theProducts = productS.getProducts();
		
		theModel.addAttribute("products", theProducts);
		
		return "Products/list-products";
	}
	
	
	
	@RequestMapping("/category-form")
	public String showCategoryForm(Model theModel) {
		
		Category theCategory = new Category();
		
		theModel.addAttribute("Category", theCategory);
		
		return "Products/category-form";
	}
	
	
	

	@RequestMapping("/product-form")
	public String showProductForm(Model theModel) {
		
		List<Category> theCategories = 
				categoryS.getCategories();
		
		//categoryOptions = new LinkedHashMap<>();
		
		
		
		Product theProduct = new Product();
		
		theModel.addAttribute("product", theProduct);
		theModel.addAttribute("categories", theCategories);
		
		return "Products/product-form";
	}
	
	
	@RequestMapping("/save-category")
	public String saveCategory(@ModelAttribute("category") Category newCategory) {
		
		categoryS.saveCategory(newCategory);
		
		return "redirect:/products/categories";
	}
	
	@RequestMapping("/save-product")
	public String saveProduct(@ModelAttribute("product") Product newProduct) {
		
		productS.saveProduct(newProduct);
		
		return "redirect:/products/products";
	}
	
	
	@GetMapping("/categories/edit")
	public String editCategory(@RequestParam("id") int id, Model theModel) {
		Category theCategory = categoryS.getCategory(id);
		
		theModel.addAttribute("category", theCategory);
		
		return "Products/category-form";
	}
	
	
	@GetMapping("/products/edit")
	public String editProduct(@RequestParam("id") int id, Model theModel) {
		Product theProduct = productS.getProduct(id);
		
		theModel.addAttribute("product", theProduct);
		
		return "Products/product-form";
	}
	
	
	@RequestMapping("/categories/delete/{id}")
	public String deleateCategory(@PathVariable("id") int id, Model theModel) {

		Category theCategory = categoryS.getCategory(id);
		
		categoryS.deleteCategory(theCategory);
		
		return "redirect:/categories/";
	}
	
	
	@RequestMapping("/products/delete/{id}")
	public String deleateProduct(@PathVariable("id") int id, Model theModel) {

		Product theProduct = productS.getProduct(id);
		
		productS.deleteProduct(theProduct);
		
		return "redirect:/products/";
	}

}
