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
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Branch")
public class Branch {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="name")
	private String BranchName;


	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address Address_;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private Users User_;
	

	@OneToMany(fetch= FetchType.LAZY,
			mappedBy="branches",
			cascade= CascadeType.ALL)
	private List<Stock> stocks;
	
	@OneToMany(fetch= FetchType.LAZY,
			mappedBy="Branch_",
			cascade= CascadeType.ALL)
	private List<Sale> sales;
	
	public void add(Stock tempStock) {
		
		if(stocks == null) {
			stocks = new ArrayList<>();
		}		
		stocks.add(tempStock);	
		tempStock.setBranches(this);
	}
	
	
	public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	
	public void add(Sale tempSale) {
		
		if(sales == null) {
			sales = new ArrayList<>();
		}		
		sales.add(tempSale);	
		tempSale.setBranch_(this);
	}
	

	public List<Sale> getSales() {
		return sales;
	}


	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}


	public Branch() {}
	

	public Branch(String branchName) {
		BranchName = branchName;
	}
	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getBranchName() {
		return BranchName;
	}

	public void setBranchName(String branchName) {
		BranchName = branchName;
	}

	
	public Address getAddress_() {
		return Address_;
	}

	public void setAddress_(Address address_) {
		this.Address_ = address_;
	}
	

	public Users getUser_() {
		return User_;
	}


	public void setUser_(Users user_) {
		User_ = user_;
	}


	@Override
	public String toString() {
		return "Branch [Id=" + Id + ", BranchName=" + BranchName + "]";
	}
	
	
	
}





/*
@ManyToMany(fetch=FetchType.LAZY, 
		cascade= {CascadeType.PERSIST, CascadeType.DETACH,
				CascadeType.REFRESH, CascadeType.MERGE})	
@JoinTable(
		name="BranchProduct",
		joinColumns=@JoinColumn(name="id_branch"),
		inverseJoinColumns=@JoinColumn(name="id_stock"))
private List<Stock> stock;


public void add(Stock tempStock) {
	
	if(stock == null) {
		stock = new ArrayList<>();
	}		
	stock.add(tempStock);		
}
	
public List<Stock> getStock() {
	return stock;
}

public void setStock(List<Stock> stock) {
	this.stock = stock;
}



@ManyToMany(fetch=FetchType.LAZY, 
		cascade= {CascadeType.PERSIST, CascadeType.DETACH,
				CascadeType.REFRESH, CascadeType.MERGE})
@JoinTable(
		name="BranchProduct",
		joinColumns=@JoinColumn(name="id_branch"),
		inverseJoinColumns=@JoinColumn(name="id_product"))
private List<Product> products;


public void add(Product tempProduct) {
	
	if(products == null) {
		products = new ArrayList<>();
	}
	
	products.add(tempProduct);
}

public List<Product> getProducts() {
	return products;
}

public void setProducts(List<Product> products) {
	this.products = products;
}
*/
/*public Enterprise getEnterprise() {
	return enterprise;
}

public void setEnterprise(Enterprise enterprise) {
	this.enterprise = enterprise;
}
*/

