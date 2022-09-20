package com.Q3;

public class Student {

	int roll;
	String name;
	int marks;

	void displayStudentDetails() {

		System.out.println("Roll no. is: " +roll);
		System.out.println("Name is: " + name);
		System.out.println("Marks is: " + marks);

	}

	public static void main(String[] args) {


		Student obj1= new Student();
		obj1.roll=264;
		obj1.name="vishesh";
		obj1.marks= 99;

		obj1.displayStudentDetails();

		Student obj2= new Student();
		obj2.roll=100;
		obj2.name="Sunil";
		obj2.marks= 67;

		obj2.displayStudentDetails();

		obj1=null;
		obj2=null;

		obj1.displayStudentDetails();


	}

}
