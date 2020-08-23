package com.pos.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pos.springdemo.entity.Branch;
import com.pos.springdemo.entity.Product;
import com.pos.springdemo.service.BranchService;

@Controller
@RequestMapping("/branches")
public class BranchController {

	@Autowired
	private BranchService branchS;
	
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

	
	@RequestMapping("/saveBranch")
	public String saveProduct(@ModelAttribute("branch") Branch newBranch) {
		
		branchS.saveBranch(newBranch);
		
		return "redirect:/branches/";
	}



}


