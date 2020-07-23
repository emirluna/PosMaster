package com.pos.springdemo.entity;

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
@Table(name="Configuration")
public class Configuration {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="company_name")
	private String CompanyName;

	@Column(name="description")
	private String Description;
	
	@Column(name="owner_name")
	private String OwnerName;

	@Column(name="main_email")
	private String MainEmail;
	
	@Column(name="main_phone")
	private String MainPhone;
	
	@OneToOne(fetch= FetchType.LAZY,
			cascade=CascadeType.ALL)
	@JoinColumn(name="main_address")
	private Address address;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	public String getMainEmail() {
		return MainEmail;
	}

	public void setMainEmail(String mainEmail) {
		MainEmail = mainEmail;
	}

	public String getMainPhone() {
		return MainPhone;
	}

	public void setMainPhone(String mainPhone) {
		MainPhone = mainPhone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Configuration(String companyName, String description, String ownerName, String mainEmail, String mainPhone) {
		CompanyName = companyName;
		Description = description;
		OwnerName = ownerName;
		MainEmail = mainEmail;
		MainPhone = mainPhone;
	}

	public Configuration() {
	}
	
	
	
	
}
