package com.Q2;

import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;
public class Main {

	public static void main(String[] args) {
		
		//predicate example
		Predicate<Student> p = s-> s.getMarks()>500;
		System.out.println(p.test(new Student(2, "vishesh", 640)));
		
		//consumer example
		
		Consumer <Student> c = s-> {
				
			System.out.println("Name: " + s.getName());
			System.out.println("Roll: " + s.getRollno());
			System.out.println("Marks: " + s.getMarks());
		};
		c.accept(new Student (3,"Raman", 280));
		
		//Supplier Example
		Supplier <Student> sp= ()-> new Student(4,"raghav", 267);
		System.out.println(sp.get());
		
		
		//function example
		Function <String, Integer> f= s->{
			return Integer.parseInt(s)+10;
		};
		
		System.out.println(f.apply("25"));
		
	}

}
