package com.Q2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		A t1= new A();
		t1.start();
		
		synchronized (t1) {
			
			
			try {
				System.out.println("The Thread Is Waiting.......");
				t1.wait();
				System.out.println("The Thread is notified...... Answer is Down below :) 😊 ");
				t1.notify();
			    }
			
			catch (InterruptedException ex)
				{
				ex.printStackTrace();
				}
			

		}
		System.out.println("The Expected Answer is here :------> "+ t1.product);	
	}

}
