package com.Q4;

public class Rohit extends Thread{
		
	@Override
	public void run() {
		int product=1;
		
		for(int i=1;i<=10;i++) {
			product*=i;
		}
		System.out.println("The product by " +currentThread().getName()+" is ->"+product+" And Given Priority is "+currentThread().getPriority());
	}

}
