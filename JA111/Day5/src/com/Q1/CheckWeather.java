package com.Q1;

public class CheckWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isSnowing = false;
		boolean isRaining = false;
		double temperature = 60.0;
		if(isSnowing == true || isRaining==true || temperature<50) {
			System.out.println("Let's Stay Home");
		}else {
			System.out.println("Let's Go Out");
		}

	}


}


