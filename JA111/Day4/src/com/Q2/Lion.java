package com.Q2;

public class Lion {

	String name;

	boolean isHungry;

	int age;

	static int totalDeaths;

	static void printKillings() {
		System.out.println("Total killings by lions in jungle = " + totalDeaths);
	}

	void thinking() {
		if(isHungry== false) {
			System.out.println(name+" is Sleeping");
		}

		else if(isHungry==true && age>12) {
			totalDeaths= totalDeaths+2;
			System.out.println(name+" has eaten two animal");
		}
		else if(isHungry==true && age<=12 && age >=2) {
			totalDeaths= totalDeaths+1;
			System.out.println(name+" has eaten one animal");
		}

		else if(isHungry=true && age<2) {
			System.out.println(name+" is calling MOM");
		}

	}
	public static void main(String[] args) {
		totalDeaths= 1;

		Lion lion1= new Lion(); //object1
		Lion lion2= new Lion(); //object2
		Lion lion3= new Lion(); //object3

		lion1.name="lion1";
		lion1.age=8;
		lion1.isHungry=true;
		lion1.thinking();

		lion2.name="lion2";
		lion2.age=13;
		lion2.isHungry=true;
		lion2.thinking();

		lion3.name="lion1";
		lion3.age=8;
		lion3.isHungry=false;
		lion3.thinking();

		printKillings();

	}

}
