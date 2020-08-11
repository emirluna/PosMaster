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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Sale")
public class Sale {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="total_items")
	private float Items;
	
	@Column(name="total_cost")
	private float Cost;
	
	@Column(name="sale_status")
	private boolean Status;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="branch_id")
	private Branch Branch_;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private Users User_;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private Customer Customer_;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="account_id")
	private Account Account_;

	
/**Many to many relation block with sales start **/
	
	@OneToMany(fetch= FetchType.LAZY,
			mappedBy="Sale_",
			cascade= CascadeType.ALL)
	private List<Order> orders;
	
	
	public void add(Order tempOrder) {
		
		if(orders == null) {
			orders = new ArrayList<>();
		}		
		orders.add(tempOrder);	
		tempOrder.setSale_(this);
	}
	

	public List<Order> getOrders() {
		return orders;
	}


	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	/** End of block for sales relation  **/
	
	
	
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public float getItems() {
		return Items;
	}

	public void setItems(float items) {
		Items = items;
	}

	public float getCost() {
		return Cost;
	}

	public void setCost(float cost) {
		Cost = cost;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public Branch getBranch_() {
		return Branch_;
	}

	public void setBranch_(Branch branch_) {
		Branch_ = branch_;
	}

	public Users getUser_() {
		return User_;
	}

	public void setUser_(Users user_) {
		User_ = user_;
	}

	public Customer getCustomer_() {
		return Customer_;
	}

	public void setCustomer_(Customer customer_) {
		Customer_ = customer_;
	}

	public Account getAccount_() {
		return Account_;
	}

	public void setAccount_(Account account_) {
		Account_ = account_;
	}

	public Sale(float items, float cost, boolean status, Branch branch_, Users user_, Customer customer_,
			Account account_) {
		Items = items;
		Cost = cost;
		Status = status;
		Branch_ = branch_;
		User_ = user_;
		Customer_ = customer_;
		Account_ = account_;
	}

	public Sale() {
	}

	@Override
	public String toString() {
		return "Sale [Id=" + Id + ", Items=" + Items + ", Cost=" + Cost + ", Status=" + Status + ", Branch_=" + Branch_
				+ ", User_=" + User_ + ", Customer_=" + Customer_ + ", Account_=" + Account_ + "]";
	}
	
	
	
	
}
