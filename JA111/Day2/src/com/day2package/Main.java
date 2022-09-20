package com.day2package;

public class Main {

	public static void main(String[] args) {
		
		String city="Delhi";
		
		switch(city) {
			
		case "Mumbai": System.out.println("Financial city");
		break;
		
		case "Kolkata": System.out.println("City Of Joy");
		break; 
		
		case "Delhi": System.out.println("Capital Of Country");
		break;
		
		case "Banglore": System.out.println("Cyber City");
		break;
		
		default: System.out.println("Maybe Other City in India");
		break;
		}
		
	}
	
}
