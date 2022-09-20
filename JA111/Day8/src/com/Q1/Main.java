//reverse the String given in the parameter

package com.Q1;
import java.util.Scanner;
public class Main {

	public static String reverseString(String input) {

		char[] arr= input.toCharArray();
		String bag="";

		for(int i=arr.length-1;i>=0;i--) {
			bag=bag+arr[i];
		}	
		return bag;
	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);		
		System.out.println("enter string");
		String inp= sc.next();


		String x= Main.reverseString(inp);
		System.out.print(x);
	}
}
