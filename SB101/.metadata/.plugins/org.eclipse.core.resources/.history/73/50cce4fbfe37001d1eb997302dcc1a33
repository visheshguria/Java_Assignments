package com.Q2;

public class A extends Thread{
	int product=1;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this) {
			for(int i=1;i<11;i++) {
				product*=i;
			}
			this.notify();
		}
	} 
}

