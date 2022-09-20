package com.Q1;

import java.util.ArrayList;

	public class Main {
		
		static void printList(ArrayList<String> args) {
			for(int i=0; i<args.size(); i++) {
				System.out.println(args.get(i));
			}
			
			for (String i: args) {
			     System.out.println(i);
			}
		}
		

		public static void main(String[] args) {

			ArrayList<String> arr = new ArrayList<String>();
			
			arr.add("Krishna");
			arr.add("Keshav");
			arr.add("Raj");
			arr.add("Lion");
			
			printList(arr);
					
		}
	}
