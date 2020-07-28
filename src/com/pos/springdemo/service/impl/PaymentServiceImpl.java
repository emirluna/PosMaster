package com.pos.springdemo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.springdemo.dao.PaymentDAO;
import com.pos.springdemo.entity.Payment;
import com.pos.springdemo.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	private PaymentDAO paymentDao;
	
	@Override
	@Transactional
	public List<Payment> getPaymentsBranch(int branchId) {
		return paymentDao.getPaymentsBranch(branchId);
	}

	@Override
	@Transactional
	public List<Payment> getPaymentsStatus(int status) {
		return paymentDao.getPaymentsStatus(status);
	}

	@Override
	@Transactional
	public List<Payment> getPaymentsCustomer(int customerId) {
		return paymentDao.getPaymentsCustomer(customerId);
	}

	@Override
	@Transactional
	public void savePayment(Payment p) {
		paymentDao.savePayment(p);
	}

	@Override
	@Transactional
	public void updatePayment(Payment p) {
		paymentDao.updatePayment(p);
	}

	@Override
	@Transactional
	public Payment getPayment(int id) {
		return paymentDao.getPayment(id);
	}

	@Override
	@Transactional
	public Payment searchPayment(String name) {
		return paymentDao.searchPayment(name);
	}

	@Override
	@Transactional
	public void deletePayment(Payment p) {
		paymentDao.deletePayment(p);
	}

}
