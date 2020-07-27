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
	public List<Branch> getBranches(int E) {
		return branchDAO.getBranches(E);
	}

	@Override
	@Transactional
	public void saveBranch(Branch B) {
		branchDAO.saveBranch(B);
	}

}
