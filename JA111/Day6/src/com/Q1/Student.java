package com.Q1;

public class Student {
	private int roll;
	private String name;
	private int age;
	private int marks;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 18 && age < 60) {
			this.age = age;
		}else {
			throw new IllegalArgumentException("age should be greater than 18 and less than 60");
		}

	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		if (marks > 0 && marks < 500) {
			this.marks = marks;
		}else {
			throw new IllegalArgumentException("marks should be greater than 0 and less than 500");
		}

	}

	public Student(int roll, String name, int age, int marks) {
		if (age > 18 && age < 60) {
			this.age = age;
		}else {
			throw new IllegalArgumentException("age should be greater than 18 and less than 60");
		}
		this.roll = roll;
		this.name = name;
		if (marks > 0 && marks < 500) {
			this.marks = marks;
		}else {
			throw new IllegalArgumentException("marks should be greater than 0 and less than 500");
		}
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.setAge(30);
		s1.setMarks(300);
		s1.setName("satyam");
		s1.setRoll(11);
		System.out.println(s1.getAge());

	}

	
}
