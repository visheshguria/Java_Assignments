package com.Q1;

public class Tiger extends Animal{
	
	@Override
	public void eat() throws AnimalException {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj= new Tiger();
		try
		{
			obj.eat();
		}
		catch (AnimalException ae){
			ae.printStackTrace();
		}
		
	}

}
