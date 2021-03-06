package com.pos.springdemo.controller;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pos.springdemo.entity.Account;
import com.pos.springdemo.entity.Branch;
import com.pos.springdemo.entity.Customer;
import com.pos.springdemo.service.AccountService;
import com.pos.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerS;
	
	@Autowired
	private AccountService accountS;
	
	
	@RequestMapping("/")
	public String indexCustomers(Model theModel) {
		
		List<Customer> theCustomers = customerS.getCustomers();
		
		theModel.addAttribute("customers", theCustomers);
		
		return "Customers/index-customer";
	}
	
	
	@RequestMapping("/customer-list")
		public String customersList(Model theModel) {
		
		List<Customer> theCustomers = customerS.getCustomers();
		
		theModel.addAttribute("customers", theCustomers);
		
		return "Customers/customers-list";
	}
	
	
	
	
	@RequestMapping("/customer-form")
	public String customerForm(Model theModel) {
		
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer", theCustomer);
		
		return "Customers/customer-form";
	}
	
	
	@RequestMapping("/customer-edit-form")
	public String customerEditForm(@RequestParam("id") int id, Model theModel) {
		
		Customer theCustomer = customerS.getCustomer(id);
		
		theModel.addAttribute("customer", theCustomer);
		
		return "Customers/customer-form";
	}
	
	@RequestMapping("/customer-save")
	public String customerSave(@ModelAttribute("customer") Customer newCustomer) {
	
		customerS.updateCustomer(newCustomer);
		
		Account newAccount = new Account(0, "claveTest", 0, 0);
		
		accountS.saveAccount(newAccount);
		
		newCustomer.setAccount_(newAccount);
		
		customerS.updateCustomer(newCustomer);
		
		return "redirect:/customers/";
	}
	
	
	@RequestMapping("/customer-details")
	public String customerDetails(@RequestParam("id") int id, Model theModel) {
		
		Customer theCustomer = customerS.getCustomer(id);
		
		theModel.addAttribute("customer", theCustomer);
		
	return "Customers/customer-details";
	}
	
	
	
	
	
}
