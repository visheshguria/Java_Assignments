package com.Q5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuelCar obj1= new FuelCar();
		obj1.run();
		obj1.service();
		
		ElectricCar obj2= new ElectricCar();
		
		obj2.run();
		obj2.service();
	}

}
