package com.Q1;

public class OLA{

	public
	Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger<=3 ) {
			HatchBack hatchobj= new HatchBack(numberOfPassenger, numberOfKMs);
			
			return hatchobj;
		}
		else {
			Sedan sedanobj= new Sedan(numberOfPassenger, numberOfKMs);
			return sedanobj;
		}		
	}
	
	public int calculateBill(Car car) {
		if(car instanceof HatchBack) {
			HatchBack obj= (HatchBack) car;
			int TotalFare= obj.farePerKm*obj.getNumberOfKms();
		return TotalFare;
		}
		else {
			Sedan sedanobj= (Sedan) car;
			int TotalFare= sedanobj.farePerKm* sedanobj.getNumberOfKms();
			return TotalFare;
		}
	}
	
	
	
}
