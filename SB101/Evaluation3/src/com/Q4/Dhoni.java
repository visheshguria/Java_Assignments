package com.Q4;

public class Dhoni extends Thread {
		
	@Override
	public void run() {
		int ans=0;
		
		for(int i=1;i<=20;i++) {
			ans+=i;
		}
		System.out.println("The addition by " +currentThread().getName()+" is ->"+ans+" And Given Priority is "+currentThread().getPriority());	}
}
