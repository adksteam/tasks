package com.example.objects;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;

@Entity
@Table
public class Product {
	Product(){}
	@Id
	@Column
	private int ProductID;
	@Column
	private String ProductName;
	@Column
	private int Price;
	@Column
	private String ProductCompany;
	
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		this.ProductID = productID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		this.ProductName = productName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		this.Price = price;
	}
	public String getProductCompany() {
		return ProductCompany;
	}
	public void setProductCompany(String productCompany) {
		this.ProductCompany = productCompany;
	}	
}
