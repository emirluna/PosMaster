package com.pos.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pos.springdemo.entity.Address;
import com.pos.springdemo.entity.Enterprise;
import com.pos.springdemo.service.AddressService;
import com.pos.springdemo.service.EnterpriseService;

@Controller
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private EnterpriseService enterpriseService;
	
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/enterprise/{id}/{id_e}")
	public String enterpriseAddress(@PathVariable("id") int id, @PathVariable("id_e") int id_e, Model theModel) {
		
		if(id==0) {
			theModel.addAttribute("address", null);
			theModel.addAttribute("enterpriseId", id_e);
		}else {
			List<Address> theAddress = addressService.getEnterpriseAddress(id);
		
			theModel.addAttribute("address", theAddress);
			theModel.addAttribute("enterpriseId", id_e);
		}
		
		return "list-address";
	}
	
	@GetMapping("/enterprise/showFormAdd/{id_e}")
	public String showFormforAdd(@PathVariable("id_e") int id_e, Model theModel) {
		
		Address theAddress = new Address();
		
		theModel.addAttribute("address", theAddress);
		theModel.addAttribute("id_e", id_e);
		
		return "address-form";
	}
	
	@RequestMapping("/enterprise/saveAddress/{id_e}")
	public String saveAddress(@PathVariable("id_e") int id, @ModelAttribute("address") Address newAddress) {
		
		Enterprise tempEnterprise = enterpriseService.getEnterprise(id);
		
		addressService.saveAddress(newAddress);
		
		tempEnterprise.setAddress(newAddress);
		
		enterpriseService.updateEnterprise(tempEnterprise);
		
		return "redirect:/list";
	}
	
}
