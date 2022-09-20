package com.Q4;

public class Product {
		
	String name;
	double price;
	String company;
	int count;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product { name :- " + name + " Price :- " + price + " Company :- " + company + " Count :- " + count + "}"; 
	}


	public Product(String name, double price, String company, int count) {
		super();
		this.name = name;
		this.price = price;
		this.company = company;
		this.count = count;
	}
	
}
