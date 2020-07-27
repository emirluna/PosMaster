package com.pos.springdemo.dao;

import java.util.List;

import com.pos.springdemo.entity.Branch;

public interface BranchDAO {
	
	public List<Branch> getBranches();
	public void saveBranch(Branch B);
	public void updateBranch(Branch B);
	public void deleteBrnahc(Branch B);
	public Branch getBranch(int b);
	
}
