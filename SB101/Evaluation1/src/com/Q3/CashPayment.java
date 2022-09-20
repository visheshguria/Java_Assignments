package com.Q3;

public class CashPayment implements Payment{
		
	private int amount;
	
	
	
	
	public CashPayment(int amount) {
		super();
		this.amount = amount;
	}




	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment done using Cash" + amount);
	}
		
}
