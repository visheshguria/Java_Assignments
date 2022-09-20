package com.Q1;
import java.util.*;
public class Main {
	public static List fun(List<? super Integer> list) {
		for(int i=0;i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		return list;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		List<Integer> list=new ArrayList<>();
		
		System.out.println("enter the numbers");
		while(true) {
			int x=sc.nextInt();
			list.add(x);
			System.out.println("Do you want to add another number y/n");
			String y=sc.next();
			if(y.equals("n"))break;
			
		}
		fun(list);

		}

	}

