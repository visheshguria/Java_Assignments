package com.Q4;

public class Kohli extends Thread{
	@Override
	public void run() {
		int ans=0;
		
		for(int i=1;i<=10;i++) {
			System.out.println("The printing by " +currentThread().getName()+" is ->"+i+" And Default Priority is "+currentThread().getPriority());
		}
		
	}
}	
