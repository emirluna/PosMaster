package com.pos.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Order")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="amount")
	private float Amount;
	
	@Column(name="price")
	private float Price;
	
	@Column(name="subtotal")
	private float Subtotal;
	
	/** Many to One relation **/
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="stock_id")
	private Stock Stock_;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="sale_id")
	private Sale Sale_;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public float getAmount() {
		return Amount;
	}

	public void setAmount(float amount) {
		Amount = amount;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public float getSubtotal() {
		return Subtotal;
	}

	public void setSubtotal(float subtotal) {
		Subtotal = subtotal;
	}

	public Stock getStock_() {
		return Stock_;
	}

	public void setStock_(Stock stock_) {
		Stock_ = stock_;
	}

	public Sale getSale_() {
		return Sale_;
	}

	public void setSale_(Sale sale_) {
		Sale_ = sale_;
	}

	public Order(float amount, float price, float subtotal, Stock stock_, Sale sale_) {
		Amount = amount;
		Price = price;
		Subtotal = subtotal;
		Stock_ = stock_;
		Sale_ = sale_;
	}

	public Order() {
	}

	@Override
	public String toString() {
		return "Order [Id=" + Id + ", Amount=" + Amount + ", Price=" + Price + ", Subtotal=" + Subtotal + ", Stock_="
				+ Stock_ + ", Sale_=" + Sale_ + "]";
	}
	
	
	
	
	
	
}
