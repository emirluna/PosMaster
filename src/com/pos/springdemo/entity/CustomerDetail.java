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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class CustomerDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="birth_date")
	private Date BirthDate;

	@Column(name="registration_date")
	private Date RegistrationDate;

	@Column(name="last_operation")
	private Date LastOperation;
	
	@Column(name="last_buy")
	private int LastBuy;

	@Column(name="username")
	private String Username;

	@Column(name="password")
	private String Password;

	@Column(name="verification_code")
	private String VerificationCode;

	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address Address_;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Date getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}

	public Date getRegistrationDate() {
		return RegistrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		RegistrationDate = registrationDate;
	}

	public Date getLastOperation() {
		return LastOperation;
	}

	public void setLastOperation(Date lastOperation) {
		LastOperation = lastOperation;
	}

	public int getLastBuy() {
		return LastBuy;
	}

	public void setLastBuy(int lastBuy) {
		LastBuy = lastBuy;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getVerificationCode() {
		return VerificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		VerificationCode = verificationCode;
	}

	public Address getAddress_() {
		return Address_;
	}

	public void setAddress_(Address address_) {
		Address_ = address_;
	}

	public CustomerDetail(Date birthDate, Date registrationDate, Date lastOperation, int lastBuy, String username,
			String password, String verificationCode) {
		BirthDate = birthDate;
		RegistrationDate = registrationDate;
		LastOperation = lastOperation;
		LastBuy = lastBuy;
		Username = username;
		Password = password;
		VerificationCode = verificationCode;
	}

	public CustomerDetail() {
	}

	@Override
	public String toString() {
		return "CustomerDetail [Id=" + Id + ", BirthDate=" + BirthDate + ", RegistrationDate=" + RegistrationDate
				+ ", LastOperation=" + LastOperation + ", LastBuy=" + LastBuy + ", Username=" + Username + ", Password="
				+ Password + ", VerificationCode=" + VerificationCode + ", Address_=" + Address_ + "]";
	}
	
	
	
	
	
	
}
