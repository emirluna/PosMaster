package com.pos.springdemo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;

	@Column(name="balance")
	private float Balance;

	@Column(name="payment_code")
	private String PaymentCode;

	@Column(name="min_available")
	private float Min;

	@Column(name="max_available")
	private float Max;

	@OneToMany(mappedBy="account",
			cascade= CascadeType.ALL)
	private List<Payment> payments;

	
	public void add(Payment tempPayment) {
		
		if(payments == null) {
			payments = new ArrayList<>();
		}
		
		payments.add(tempPayment);
		
		tempPayment.setAccount_(this);
	}
	
	public List<Payment> getPayment() {
		return payments;
	}

	
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	
/**Many to many relation block with sales start **/
	
	@OneToMany(fetch= FetchType.LAZY,
			mappedBy="Account_",
			cascade= CascadeType.ALL)
	private List<Sale> sales;
	
	
	public void add(Sale tempSale) {
		
		if(sales == null) {
			sales = new ArrayList<>();
		}		
		sales.add(tempSale);	
		tempSale.setAccount_(this);
	}
	

	public List<Sale> getSales() {
		return sales;
	}


	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}
	
	/** End of block for sales relation  **/
	
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public float getBalance() {
		return Balance;
	}

	public void setBalance(float balance) {
		Balance = balance;
	}

	public String getPaymentCode() {
		return PaymentCode;
	}

	public void setPaymentCode(String paymentCode) {
		PaymentCode = paymentCode;
	}

	public float getMin() {
		return Min;
	}

	public void setMin(float min) {
		Min = min;
	}

	public float getMax() {
		return Max;
	}

	public void setMax(float max) {
		Max = max;
	}

	public Account(float balance, String paymentCode, float min, float max) {
		Balance = balance;
		PaymentCode = paymentCode;
		Min = min;
		Max = max;
	}

	public Account() {
	}

	@Override
	public String toString() {
		return "Account [Id=" + Id + ", Balance=" + Balance + ", PaymentCode=" + PaymentCode + ", Min=" + Min + ", Max="
				+ Max + "]";
	}
	
	
	
	
}
