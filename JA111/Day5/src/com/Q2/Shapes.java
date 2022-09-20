package com.Q2;

public class Shapes {
	public void area(int radius) {
		System.out.println("inside circle");
	}

	public void area(int length, int breadth) {
		System.out.println("inside ractangle");
	}

	public void area(int side, String a) {
		System.out.println("inside square");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes obj = new Shapes();
		obj.area(3, 3);
		obj.area(6);
		obj.area(10,"side");

	}

}
