package com.Q2;

import java.util.ArrayList;
import java.util.Collections;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<>();
		
		al.add("chandigarh");
		al.add("delhi");
		al.add("mumbai");
		al.add("punjab");
		al.add("mysore");
		al.add("banglore");
		al.add("haryana");
		
		System.out.println(al.get(0).compareTo(al.get(1)));
		
		System.out.println("Before--------------"+ al);
		
		Collections.sort(al, (a,b)->a.compareTo(b));
		
		System.out.println("After----------------"+al);
	
	
	
	
	}

}
