package com.Q3;

public class Bank {
	
	private Bank(){
	      System.out. println("Inside private constructor of Bank method");
	}
	
	public static Bank getBank() {
		Bank obj= new Bank();
		
		return obj;
	}
	
	

}
