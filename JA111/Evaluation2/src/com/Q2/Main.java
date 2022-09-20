package com.Q2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no. of students you want to add");
		int stu= sc.nextInt();
		
		for(int i=0;i<stu;i++) {
			System.out.println("Enter Roll number");
			int roll=sc.nextInt();

			System.out.println("Enter name");
			String name=sc.next();

			System.out.println("Enter marks");
			int marks=sc.nextInt();

			Student object= new Student(roll,name,marks);

			System.out.println("Student details " + i+1);
			System.out.println("Student Roll Number " + object.getRollNumber());
			System.out.println("Student Name " + object.getStudentName());
			System.out.println("Student Mark " + object.getMarks());

		}
	}
}
