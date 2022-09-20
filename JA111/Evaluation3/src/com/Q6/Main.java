package com.Q6;
import java.util.*;
public class Main {
	
	public static double getStudent(int choice) {
		if (choice==1) {
			ArtStudent obj= new ArtStudent();
			double a= obj.findPercentage();
			return a;
		}
		else if(choice==2) {
			ScienceStudent obj= new ScienceStudent();
			double a=obj.findPercentage();
			return a;
			
		}
		else if(choice==3) {
			CommerceStudent obj= new CommerceStudent();
			double a= obj.findPercentage();
			return a;
		
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Which Student Percentage do you Want to find? \n 1. ArtStudent \n 2. ScienceStudent \n 3. CommerceStudent" );
		int choice= sc.nextInt();
		
		Main obj=new Main();
		double a= obj.getStudent(choice);
			System.out.println("The percentage is " +a);
		
	}
}
