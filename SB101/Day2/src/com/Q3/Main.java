package com.Q3;

import java.util.LinkedHashMap;
import java.util.Map;
public class Main {
	public static void main(String[] args) {
		Map<String, String> lm=new LinkedHashMap<>();
		lm.put("UP", "Lucknow");
		lm.put("MP", "Bhopal");
		lm.put("HR", "Chandigarh");
		lm.put("UK", "Dehradun");
		lm.put("HP", "Shimla");
		for(Map.Entry<String, String> entry:lm.entrySet()) {
			System.out.println(entry.getKey()+" ************* "+entry.getValue());
			
		}
	}

}