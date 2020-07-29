package com.pos.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pos.springdemo.service.AddressService;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model theModel) {
		return "index";
	}
	
	@RequestMapping("/configuration/")
	public String conf(Model theModel) {
		return "Configurations/index-config";
	}
	
	@RequestMapping("/products")
	public String products(Model theModel) {
		return "Products/index-products";
	}
	
	@RequestMapping("/customers")
	public String customers(Model theModel) {
		return "Customers/index-customer";
	}
	
	@RequestMapping("/users")
	public String users(Model theModel) {
		return "Users/index-users";
	}
	

}
