package com.Q2;

import java.util.Map;
import java.util.TreeMap;

public class Student {
	int roll;
	String name;
	double marks;

	public Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	
	Student(){

	}	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	

	public static void main(String[] args) {
		
		TreeMap<Student, String> tm= new TreeMap < > (new StudentComp());


		tm.put(new Student(01,"Vishesh",140), "PB");
		tm.put(new Student(02,"Raman",680), "MP");
		tm.put(new Student(03,"Raghav",580), "HR");
		for(Map.Entry<Student, String>
		entry : tm.entrySet()) {
			System.out.println(entry.getKey()+"****"+entry.getValue());

		}
	}

}
