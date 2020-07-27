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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="name")
	private String Name;
	
	@Column(name="last_name")
	private String LastName;
	
	@Column(name="phone")
	private String Phone;
	
	@Column(name="email")
	private String Email;
	
	@Column(name="status")
	private boolean Status;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="customer_detail_id")
	private CustomerDetail Customer_Detail;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="account_id")
	private Account Account_;

	@OneToMany(fetch= FetchType.LAZY,
			mappedBy="Customer_",
			cascade= CascadeType.ALL)
	private List<Sale> sales;
	
	public void add(Sale tempSale) {
		
		if(sales == null) {
			sales = new ArrayList<>();
		}		
		sales.add(tempSale);	
		tempSale.setCustomer_(this);
	}
	

	public List<Sale> getSales() {
		return sales;
	}


	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public CustomerDetail getCustomer_Detail() {
		return Customer_Detail;
	}

	public void setCustomer_Detail(CustomerDetail customer_Detail) {
		Customer_Detail = customer_Detail;
	}

	public Account getAccount_() {
		return Account_;
	}

	public void setAccount_(Account account_) {
		Account_ = account_;
	}

	public Customer(int id, String name, String lastName, String phone, String email, boolean status) {
		Id = id;
		Name = name;
		LastName = lastName;
		Phone = phone;
		Email = email;
		Status = status;
	}

	public Customer() {
	}

	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", Name=" + Name + ", LastName=" + LastName + ", Phone=" + Phone + ", Email="
				+ Email + ", Status=" + Status + ", Customer_Detail=" + Customer_Detail + ", Account_=" + Account_
				+ "]";
	}
	
	
	
	
	
}
