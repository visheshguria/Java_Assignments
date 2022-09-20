package com.Q4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
	
	List<Product> productList = new ArrayList<> ();
	
	void addProductToList(Product product) {
		for( Product a : productList) {
			if(a.name.equals(product.name)  && a.company.equals(product.company)) {
				a.count= a.count + product.count;
				System.out.println("Count updated Product already exists");
				return;
			}
		}
		
		productList.add(product);
		System.out.println("Product added successfully");
	}
		
	List<Product>showAllProduct(){
		return productList;
	}
}
