package com.Q2;

public class Demo {
		
	Demo(){
		this("Typed String");
		System.out.println("Inside Demo");
	}
	
	Demo(String S){
		this(20);
		System.out.println("Inside String Constructor and string is "+ S);
	}
	
	Demo (int i){
		this(2.5f);
		System.out.println("Inside Integer Constructor and value is "  + i);
		
	}

	Demo (float f){
		System.out.println("Inside float Constructor and value of float is " + f );
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1= new Demo();
	}

}
