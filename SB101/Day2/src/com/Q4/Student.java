package com.Q4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {

	private int roll;
	private String name;
	private double marks;
	
	

	public int getRoll() {
		return roll;
	}



	public void setRoll(int roll) {
		this.roll = roll;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getMarks() {
		return marks;
	}



	public void setMarks(double marks) {
		this.marks = marks;
	}
	

	public Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {
		
		HashMap <String,Student> hm= new LinkedHashMap<>();
		
		hm.put("Punjab", new Student(10,"vishesh", 400));
		hm.put("Haryana", new Student(20,"dileep", 320));
		hm.put("Delhi", new Student(15,"deepak", 420));
		hm.put("Asam", new Student(12,"aman", 510));
		hm.put("Gujrat", new Student(10,"raghav", 400));
	
	
		Set <Map.Entry<String, Student>> st = hm.entrySet();
		

	}
	 
	
	
}
