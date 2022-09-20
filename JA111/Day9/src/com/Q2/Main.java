package com.Q2;

public class Main {
public static void main(String[] args) {
		
		Animal[] animals= new Animal[3];
		
		animals[0]= new Dog();
		animals[1]= new Cat();
		animals[2]= new Tiger();
		
		int i=0;
		while(i<animals.length) {
			
			animals[i].eat();
			animals[i].walk();
			animals[i].makeNoise();
			i++;
			
		}

	}

}
