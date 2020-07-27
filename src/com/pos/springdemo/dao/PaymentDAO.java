package com.pos.springdemo.dao;

import java.util.List;

import com.pos.springdemo.entity.Payment;

public interface PaymentDAO {

	public List<Payment> getPaymentsBranch(int branchId);
	public List<Payment> getPaymentsStatus(int status);
	public List<Payment> getPaymentsCustomer(int customerId);
	public void savePayment(Payment p);
	public void updatePayment(Payment p);
	public Payment getPayment(int id);
	public Payment searchPayment(String name);
	public void deletePayment(Payment p);
	
}
