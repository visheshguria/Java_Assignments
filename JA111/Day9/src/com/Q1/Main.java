package com.Q1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Parrot();
		//with this b1 reference call the fly method of
		bird.fly();
		
		Parrot parrot=(Parrot)bird;
		parrot.sing();


	}

}
