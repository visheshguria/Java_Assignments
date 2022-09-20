package com.Q5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List<Product> lst=  Arrays.asList(
				new Product(1, "p1", 5, 400),
				new Product(3, "p3", 10, 800),
				new Product(4, "p4", 15, 100),
				new Product(5, "p5", 13, 600),
				new Product(6, "p6", 30, 700)				
				);
				
		
		Collections.sort(lst,(a,b)->a.getPrice()<b.getPrice()?1:-1);
		
		
		for(Product p : lst) {
			System.out.println("product id is :-->"+" "+p.getProductid());
			System.out.println("product name is :-->"+" "+p.getProductName());
			System.out.println("product quantity is--> :"+" "+p.getQuantity());
			System.out.println("product price :-->"+" "+p.getPrice());
			System.out.println("--------------------");
		}

				
	}

}
