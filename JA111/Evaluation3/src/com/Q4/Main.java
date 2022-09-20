package com.Q4;
import java.util.*;
public class Main {
	
	public char giveCharFunction(String x, int a) {
		
		char [] arr= x.toCharArray();
		char r = 0;
		for(int i=0;i<arr.length;i++) {
			if(a==i) {
				r=arr[i];
			}
		}
		
		return r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter String");
		String str= sc.nextLine();
		
		System.out.println("Enter Position");
		int a= sc.nextInt();
		
		Main obj= new Main();
		
		int i=1;
		while(i>0) {
			if(a<str.length()) {
				System.out.println("Character at the position " + a + " => " + obj.giveCharFunction(str,a)); 
			}
			else {
				System.out.println("Invalid position, Please enter a valid position");
			}
			a=sc.nextInt();
			i++;
		}
		
		
	
	}

}
