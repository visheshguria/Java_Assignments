package com.Q5;

public class Product {
	private int productid;
	private String productName;
	private int quantity;
	private int price;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int productid, String productName, int quantity, int price) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}

}
