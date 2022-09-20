package com.Q4;
import java.util.Scanner;

public class Child extends Parent{

	public Child(int number) {
		super(number);	
	}

	void method4() {

		System.out.println("Inside method4 of Child Class");
	}

	public static void main(String[] args) {

		Scanner Sc=new Scanner(System.in);
		System.out.println("Give Input");

		
		int n=Sc.nextInt();
		if(n >= 1 && n <= 10) {
			Child childobj=new Child(n);
			Parent parentobj=new Parent(n);

			parentobj.method1();
			parentobj.method3();		

		}else {
			System.out.println("Invalid number");
		}
	}
}


