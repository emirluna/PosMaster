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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Stocks")
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "stock")
	private int stock;

	@Column(name = "min_stock")
	private int minStock;

	@Column(name = "max_stock")
	private int maxStock;

	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="product_id")
	private Product products;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="branch_id")
	private Branch branches;
	
	
/**Many to many relation block with sales start **/
	
	@OneToMany(fetch= FetchType.LAZY,
			mappedBy="Stock_",
			cascade= CascadeType.ALL)
	private List<Order> orders;
	
	
	public void add(Order tempOrder) {
		
		if(orders == null) {
			orders = new ArrayList<>();
		}		
		orders.add(tempOrder);	
		tempOrder.setStock_(this);
	}
	

	public List<Order> getOrders() {
		return orders;
	}


	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	/** End of block for sales relation  **/
	
	
	
	
	/*
	@ManyToMany(fetch = FetchType.LAZY, 
			cascade = { CascadeType.PERSIST, 
					CascadeType.DETACH, 
					CascadeType.REFRESH,
					CascadeType.MERGE })
	@JoinTable(name = "BranchProduct", 
	joinColumns = @JoinColumn(name = "id_stock"), 
	inverseJoinColumns = @JoinColumn(name = "id_product"))
	private List<Product> products;

	public void add(Product tempProduct) {

		if (products == null) {
			products = new ArrayList<>();
		}

		products.add(tempProduct);
	}

	*/
	/*
	@ManyToMany(fetch = FetchType.LAZY, 
			cascade = { CascadeType.PERSIST, 
					CascadeType.DETACH, 
					CascadeType.REFRESH,
					CascadeType.MERGE })
	@JoinTable(name = "BranchProduct", 
	joinColumns = @JoinColumn(name = "id_stock"), 
	inverseJoinColumns = @JoinColumn(name = "id_branch"))
	private List<Branch> branches;

	public void add(Branch tempBranch) {

		if (branches == null) {
			branches = new ArrayList<>();
		}

		branches.add(tempBranch);

	}

	
	*/
	
	public Product getProducts() {
		return products;
	}

	public void setProducts(Product products) {
		this.products = products;
	}

	public Branch getBranches() {
		return branches;
	}

	public void setBranches(Branch branches) {
		this.branches = branches;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
/*
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}


	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}

*/
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getMinStock() {
		return minStock;
	}

	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}

	public int getMaxStock() {
		return maxStock;
	}

	public void setMaxStock(int maxStock) {
		this.maxStock = maxStock;
	}

	public Stock(int stock, int minStock, int maxStock) {
		
		this.stock = stock;
		this.minStock = minStock;
		this.maxStock = maxStock;
	}

	public Stock() {
	}

}
