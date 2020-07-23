package com.pos.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pos.springdemo.entity.Enterprise;
import com.pos.springdemo.entity.Product;
import com.pos.springdemo.service.EnterpriseService;
import com.pos.springdemo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productservice;
	
	@Autowired
	private EnterpriseService enterpriseService;
	
	@GetMapping("/{id}")
	public String getProdutcs(@PathVariable("id") int id, Model theModel) {
		
		List<Product> products = productservice.getProducts(id);
		
		theModel.addAttribute("products", products);
		theModel.addAttribute("enterpriseId", id);
		
		return "enterprise-list-products";
	}
	
	
	@GetMapping("/showFormAdd/{id}")
	public String showFormAdd(@PathVariable("id") int id, Model theModel) {
		
		Product theProduct = new Product();
		
		theModel.addAttribute("product", theProduct);
		theModel.addAttribute("enterpriseId", id);
		
		return "enterprise-product-form";
	}
	
	
	@RequestMapping("/saveProduct/{id}")
	public String saveProduct(@PathVariable("id") int id, @ModelAttribute("product") Product newProduct) {
		
		Enterprise tempEnterprise = enterpriseService.getEnterprise(id);
		
		productservice.saveProduct(newProduct);
		
		tempEnterprise.add(newProduct);
		
		enterpriseService.updateEnterprise(tempEnterprise);
		
		return "redirect:/product/"+id;
	}
	
	
	
}
