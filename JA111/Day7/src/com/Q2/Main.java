/*Write a Java program to get the character at the given index within the String.Take 
       the input with the help of Scanner class*/

package com.Q2;
import java.util.Scanner;
public class Main {
	
	public char function1(String x, int a) {
		char [] arr = x.toCharArray();
		char r = 0;
		for(int i=0;i<arr.length;i++) {
			if(a==i) {
				 r= arr[i];
			}
		}
		return r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		
		System.out.println("Enter the index");
		int a= sc.nextInt();
		
		Main obj= new Main();
		if(a<str.length()) {
			System.out.println("The char at "+a+" is:-- "+obj.function1(str, a));
		}
		else {
			System.out.println("Enter Valid Index");
		}
		
	}

}
