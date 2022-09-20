package com.Q1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(10, "satyam", 51, 300);
		Student s1 = new Student();
		s1.setRoll(11);
		s1.setName("shivam");
		s1.setAge(41);
		s1.setMarks(467);
		
		//System.out.println(s);
		System.out.println("age is :" + s.getAge());
		System.out.println("marks is :" + s.getMarks());
		System.out.println("name is :" + s.getName());
		System.out.println("roll is :" + s.getRoll());

		System.out.println("age is :" + s1.getAge());
		System.out.println("marks is :" + s1.getMarks());
		System.out.println("name is :" + s1.getName());
		System.out.println("roll is :" + s1.getRoll());

	}

	}


