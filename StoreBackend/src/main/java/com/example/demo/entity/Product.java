package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private Long id;
	private String codeProduct;
	private String description;	
	
	public Product(String codeProduct, String description) {
		this.codeProduct = codeProduct;
		this.description = description;
	}
	
	public Product() {
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodeProduct() {
		return codeProduct;
	}
	public void setCodeProduct(String codeProduct) {
		this.codeProduct = codeProduct;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
