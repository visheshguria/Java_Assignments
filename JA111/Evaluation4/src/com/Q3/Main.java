package com.Q3;
import java.util.TreeSet;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Student> obj1= new TreeSet<> ( new Compare());
		
		obj1.add(new Student (12, "vishesh", 20,30,50));
		obj1.add(new Student (18, "Raghav",  10,60,90));
		obj1.add(new Student (21, "Suresh",  45,38,64));
		obj1.add(new Student (55, "ramesh",  34,87,90));
	
	
	for(Student a: obj1) {
		System.out.println(a);
	  }
	
	}
}
