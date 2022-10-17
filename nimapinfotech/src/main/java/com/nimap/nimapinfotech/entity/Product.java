package com.nimap.nimapinfotech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Entity
@Table(name="Product_Details")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Product implements Serializable {
	
	
	@Id
	private int id;
	
	@Column(name = "Products")
	private String name;
	
	@Column(name="Price")
	private int price;
	
	@Column(name="Quatity")
	private int quatity;
		
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cp_fk", insertable = false, updatable = false, nullable = false)
	private Category category;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	
}
