package com.pos.springdemo.service;

import java.util.List;

import com.pos.springdemo.entity.Branch;

public interface BranchService {
	
	public List<Branch> getBranches();
	public void saveBranch(Branch B);
	public void updateBranch(Branch B);
	public void deleteBrnahc(Branch B);
	public Branch getBranch(int b);
	
}
