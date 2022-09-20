package com.Q7;

public class Threading implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name +" is running"+" priority is "+Thread.currentThread().getPriority());
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Threading obj= new Threading();
		
		Thread o1= new Thread(obj);
		Thread o2= new Thread(obj);
		
		o1.setPriority(8);
		o2.setPriority(10);
		
		o1.setName("Dhoni");
		o2.setName("Kohli");
		
		
		o1.start();
		o2.start();
	}

}
