package com.Q2;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Mobile {
	
static HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	



public static String addMobile(String company, String model) {
		
		ArrayList<String> arLst= new ArrayList<>();
		
		company= company.toLowerCase();
		
		if(mobiles.containsKey(company)) {
			ArrayList<String> al= mobiles.get(company);
			al.add(model);
		}
		else {
			arLst.add(model);
			mobiles.put(company, arLst);
		}
		
		return "Mobile Added SuccessFully";
	}	





public static List<String> getModels(String company){
		
	company= company.toLowerCase();
	
	 if(mobiles.containsKey(company)) {
		 return mobiles.get(company);
	 }
	 
	 List<String> lst= new ArrayList();
	 
	 return lst;
}



public static void main(String[] args) {
		
		addMobile("Samsung", "s22");
		addMobile("Asus", "zenfone");
		addMobile("Vivo", "y71");
		addMobile("Apple", "iphone13");
		addMobile("Samsung", "s21 ultra");
		addMobile("Samsung", "s21");
		
		
		
		List<String> lst= getModels("Samsung");
		if(lst.size()>0) {
			System.out.println(lst);
		}
		else {
			System.out.println("Invalid Company Supplied.");
		}
		
		
	}

}
