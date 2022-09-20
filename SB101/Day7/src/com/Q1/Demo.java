package com.Q1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products=new ArrayList<>();
		products.add(new Product(1,"p1",1200,21));
		products.add(new Product(2,"p2",1500,3));
		products.add(new Product(3,"p3",1250,12));
		products.add(new Product(4,"p4",1290,9));
		products.add(new Product(5,"p5",1450,11));
		Stream<Product> ps = products.stream().filter(p->p.getQuantity()>10);
		Stream <Product> p=ps.sorted((o1,o2)->o1.getPrice()>o2.getPrice()?1:-1);
		
		System.out.println(p.collect(Collectors.toList()));

	}

}
