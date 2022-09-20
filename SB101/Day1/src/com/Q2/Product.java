package com.Q2;
import java.util.*;
public class Product implements Comparable<Product> {
	int productId;
	String productName;
	double productPrice;
	
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

	@Override
	public int compareTo(Product p) {
		// TODO Auto-generated method stub
		return this.productPrice<p.productPrice?1:-1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue<Product> pq=new PriorityQueue<>();
		int i=0;
		while(true) {
			i++;
			System.out.println("Enter the detail of Product : "+ i);
			
			System.out.println("Enter the Product id");
			int id=sc.nextInt();
			System.out.println("Enter the Product Name");
			String name=sc.next();
			System.out.println("Enter the Product Price");
			int price=sc.nextInt();
			Product p=new Product(id,name,price);
			pq.offer(p);
			System.out.println("Still want to add another detail of product y/n-------");
			String dec=sc.next();
			if((!dec.equals("y"))) {
				System.out.println("******Thank you********");
				break;
			}else System.out.println("******************************");
			
		}
		Iterator<Product> itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
