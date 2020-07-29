package com.pos.springdemo.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Payment")
public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="amount")
	private float Amount;

	@Column(name="method")
	private int Method;
	
	@Column(name="date_of_payment")
	private Date Date;

	@OneToOne(fetch=FetchType.EAGER, 
			cascade=CascadeType.ALL)
	@JoinColumn(name="branch_id")
	private Branch Branch_;
	
	@OneToOne(fetch=FetchType.EAGER, 
			cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private Users User_;

	/*@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="account_id")
	private Account Account_;
*/
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

	public int getMethod() {
		return Method;
	}

	public void setMethod(int method) {
		Method = method;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
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

	/*public Account getAccount_() {
		return Account_;
	}

	public void setAccount_(Account account_) {
		Account_ = account_;
	}
*/
	public Payment(float amount, int method, java.sql.Date date, com.pos.springdemo.entity.Branch branch_, Users user_,
			Account account_) {
		Amount = amount;
		Method = method;
		Date = date;
		Branch_ = branch_;
		User_ = user_;
		//Account_ = account_;
	}

	public Payment() {
	}

	@Override
	public String toString() {
		return "Payment [Id=" + Id + ", Amount=" + Amount + ", Method=" + Method + ", Date=" + Date + ", Branch_="
				+ Branch_ + ", User_=" + User_ + "]";
	}
	
	
	
	
}
