package com.pos.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pos.springdemo.entity.Address;
import com.pos.springdemo.entity.Branch;
import com.pos.springdemo.entity.Product;
import com.pos.springdemo.service.AddressService;
import com.pos.springdemo.service.BranchService;

@Controller
@RequestMapping("/branches")
public class BranchController {

	@Autowired
	private BranchService branchS;
	
	@Autowired
	private AddressService addressS;
	
	
	
	@RequestMapping("/")
	public String indexBranches(Model theModel) {
		
		List<Branch> theBranches = branchS.getBranches();
		
		theModel.addAttribute("branches", theBranches);
		
		return "Branchs/index-branch";
	}
	
	@RequestMapping("/list")
	public String branchList(Model theModel) {
	
		List<Branch> theBranches = branchS.getBranches();
		
		theModel.addAttribute("branches", theBranches);
		
		return "Branchs/list-branches";
	}
	
	
	@RequestMapping("/branch-form")
	public String branchForm(Model theModel) {
		
		Branch theBranch = new Branch();
		
		theModel.addAttribute("branch", theBranch);
		
		return "Branchs/branch-form";
	}

	@GetMapping("/branch-address-form")
	public String branchAddressForm(@RequestParam("id") int id, Model theModel) {
		
		Address theAddress = new Address();
		
		theModel.addAttribute("branchId", id);
		theModel.addAttribute("address", theAddress);
		
		return "Branchs/branch-address-form";
	}

	
	
	@RequestMapping("/saveBranch")
	public String saveBranch(@ModelAttribute("branch") Branch newBranch) {
		
		branchS.saveBranch(newBranch);
		
		return "redirect:/branches/";
	}

	@RequestMapping("/saveBranchAddress/{id}")
	public String saveBranchAddress(@PathVariable("id") int id, @ModelAttribute("address") Address newAddress) {

		addressS.saveAddress(newAddress);
		
		Branch theBranch = branchS.getBranch(id);
		
		theBranch.setAddress_(newAddress);
		
		branchS.updateBranch(theBranch);
		
		return "redirect:/branches/list";
	}


}


