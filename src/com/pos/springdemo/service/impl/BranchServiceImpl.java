package com.pos.springdemo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.springdemo.dao.BranchDAO;
import com.pos.springdemo.entity.Branch;
import com.pos.springdemo.service.BranchService;

@Service
public class BranchServiceImpl implements BranchService {

	@Autowired
	private BranchDAO branchDAO;
	

	@Override
	@Transactional
	public void saveBranch(Branch B) {
		branchDAO.saveBranch(B);
	}

	@Override
	@Transactional
	public List<Branch> getBranches() {
		return branchDAO.getBranches();
	}

	@Override
	@Transactional
	public void updateBranch(Branch B) {
		branchDAO.updateBranch(B);
	}

	@Override
	@Transactional
	public void deleteBrnahc(Branch B) {
		branchDAO.deleteBrnahc(B);
	}

	@Override
	@Transactional
	public Branch getBranch(int b) {
		return branchDAO.getBranch(b);
	}

}
