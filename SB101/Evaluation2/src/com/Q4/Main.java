package com.Q4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst= Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten");
		
		System.out.println("Old list is:"+"\n"+lst+"\n");
		
		List<String> newlist = lst.stream().filter((el)-> el.length()%2==0 ).map((el)-> el.toUpperCase()).collect(Collectors.toList());
		System.out.println("New List of even length is:" +"\n"+newlist+"\n");
		
		newlist.sort((a,b)-> a.compareTo(b));
		System.out.println("New List of decending order is:" +"\n"+newlist+"\n");
	}

}
