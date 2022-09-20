package com.Q3;
import java.util.Scanner;
public class Course {
	int courseId;
	String courseName;
	int courseFee;

	void displayCourseDetails(int courseId, String courseName, int courseFee) {
		System.out.println("The course Id is: " + courseId);
		System.out.println("The course Name is: " + courseName);
		System.out.println("The course Fee is: " + courseFee);
	}

	static void authenticate(String username, String password) {
		if(username.contentEquals("Admin") && password.contentEquals("1234")) {

			Scanner sc= new Scanner(System.in);

			System.out.println("Enter Course Id");
			int id= sc.nextInt();

			System.out.println("Enter Course Name");
			String name= sc.next();

			System.out.println("Enter Course Fee");
			int fee= sc.nextInt();

			Course obj= new Course();
			obj.displayCourseDetails(id, name, fee);

		}

		else
		{

			System.out.println("Invalid Username or password");
		}
	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Username");
		String username=sc.nextLine();

		System.out.println("Enter Password");
		String password=sc.nextLine();

		Course.authenticate(username, password);
	}

}
