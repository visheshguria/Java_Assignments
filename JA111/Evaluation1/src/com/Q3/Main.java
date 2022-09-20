package com.Q3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 64;
		int b = 70;
		byte c = (byte)(a+b);  // TYPECASTING
		System.out.println(c);

	}

}


//EXPLAINATION:

//here, the conversion from int to byte is not possible directly. So we need to typecaste the 
// a+b into byte. So to typecaste into byte we need to put (byte) in front of the (a+b) of int type

