package com.Q3;

public class Area extends Shape{
	@Override
	public int rectangleArea(int length, int breadth) {

		int Area=length*breadth;
		System.out.println("Area of Rectangle is "+Area);
		return 0;
	}

	@Override
	public int squareArea(int side) {

		int Area = side*side;
		System.out.println("Area of Square is "+Area);
		return 0;
	}

	@Override
	public int circleArea(int radius) {

		float Area = (22/7)*(radius*radius);
		System.out.printf("Area of circle is "+Area);
		return 0;
	}



}
