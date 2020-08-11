package com.pos.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductDetail")
public class ProductDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="brand")
	private String Brand;
	
	@Column(name="description")
	private String Description;

	@Column(name="weight")
	private float Weight;
	
	@Column(name="spitable")
	private boolean Spitable;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "ProductDetail [Id=" + Id + ", Brand=" + Brand + ", Description=" + Description + "]";
	}

	public ProductDetail(String brand, String description, float weight, boolean spitable) {
		Brand = brand;
		Description = description;
		Weight = weight;
		Spitable = spitable;
	}
	
	public ProductDetail() {}

	public float getWeight() {
		return Weight;
	}

	public void setWeight(float weight) {
		Weight = weight;
	}

	public boolean isSpitable() {
		return Spitable;
	}

	public void setSpitable(boolean spitable) {
		Spitable = spitable;
	}


}
