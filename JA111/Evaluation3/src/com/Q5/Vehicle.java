package com.Q5;

public interface Vehicle {
	public void run();
	
	public default  void service() {
		System.out.println("Car need Service");
	}
}
