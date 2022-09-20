package com.Q2;

import java.util.function.Consumer;

public class ConsumerImpl {
	
	public static void main(String[] args) {
		
		Consumer<Student> st= s->{
			System.out.println(s.id);
			System.out.println(s.name);
		};
	}
	

}
